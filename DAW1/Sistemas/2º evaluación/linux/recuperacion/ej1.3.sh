#!/bin/bash

key=$1
char=$(echo $key | grep -o .)
order_chars=$(echo $key | grep -o . | sort | nl | tr -d ' ' | tr '\t' ':')

for i in $char ; do
    echo -e "$order_chars" | grep $i
done | nl | tr -d ' ' | tr '\t' ':' | sort -k3 -t: | cut -c1
