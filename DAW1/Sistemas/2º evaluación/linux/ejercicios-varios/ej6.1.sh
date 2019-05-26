#!/bin/bash

path=$*

for i in $path; do
    if [ -d $i ]; then 
        echo "$i is a directory"
    elif [ -f $i ]; then 
        echo $i: $(ls -l $i | cut -d ' ' -f3,5)
    else
        echo "$i: no exist"
    fi
shift
done
