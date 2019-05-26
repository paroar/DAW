#!/bin/bash

key=$2
char=$(echo $key | grep -o .)
order_chars=$(echo $key | grep -o . | sort | nl | tr -d ' ' | tr '\t' ':')

order=$(for i in $char ; do
    echo -e "$order_chars" | grep $i
done | nl | tr -d ' ' | tr '\t' ':' | sort -k3 -t: | cut -c1)


word=$(echo $1 | grep -o [A-Z] | tr -d '\n')
all_words=$(while [ true ] ; do
    echo $word | tr -d ' ' | cut -c1-${#key}
    word=$(echo ${word:${#key}:${#word}})
    if [ -z $word ] ; then
        break
    fi
done | xargs -I{} bash -c "echo {} | grep -o . | nl" | tr -d ' ' | tr '\t' ':')

 
for chars in $order ; do
    echo "$all_words" | grep -o "$chars.*"
done | cut -c3 | tr -d '\n'
echo
