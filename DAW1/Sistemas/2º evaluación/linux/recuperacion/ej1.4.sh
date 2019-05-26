#!/bin/bash


key=$2
char=$(echo $key | grep -o .)
echo "$key:${#key}"
word=$(echo $1 | grep -o [A-Z] | tr -d '\n')
echo $word

while [ true ] ; do
    echo $word | tr -d ' ' | cut -c1-${#key}
    word=$(echo ${word:${#key}:${#word}})
    word2=$(echo $word | cut -c7-)
    echo $word
    echo $word2
    if [ -z $word ] ; then
        break
    fi
done | xargs -I{} bash -c "echo {} | grep -o . | nl" | tr -d ' ' | tr '\t' ':'
