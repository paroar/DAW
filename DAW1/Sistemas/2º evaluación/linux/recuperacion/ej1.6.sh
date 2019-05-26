#!/bin/bash

text=$1
key=$2
num_rows=$((${#text}/${#key}))
mod=$((${#text}%${#key}))
pos=$(echo $key | grep -Eo . | nl | tr -s ' \t' ':' | sort -k3 -t: | cut -f2 -d:)

ciph_rows=$(for i in $pos ; do
                if [ $i -le $mod ] ; then
                    echo $text | cut -c1-$(($num_rows+1))
                    text=$(echo $text | cut -c$(($num_rows+2))-)
                else
                    echo $text | cut -c1-$num_rows
                    text=$(echo $text | cut -c$(($num_rows+1))-)
                fi
            done)

ordered=$(paste -d: <(echo -e "$pos") <(echo -e "$ciph_rows") | sort -k1 -t: | cut -c3-)
for i in $(seq $(($num_rows+$mod))) ; do
    echo -e "$ordered" | cut -c$i
done | tr -d ' ' | tr -d '\n'
echo

