#!/bin/bash

pid=$1

ppids=$(ps -eo ppid,pid --no-headers | sort -k1n -k2n | tr -s ' ' ':' | cut -d: -f2)
ppids_version=$(echo $ppids | tr ' ' ':')
for i in $ppids ; do
    if [ $i -gt $pid ]; then
        ppids_version=$(echo $ppids_version | cut -d: -f2-)        
        echo $i    
    fi
done | xargs -I{} bash -c "echo {}" | wc -l
