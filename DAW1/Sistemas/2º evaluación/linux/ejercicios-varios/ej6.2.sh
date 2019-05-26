#!/bin/bash

users=$*

for i in $users ; do
cut -d: -f1,4 /etc/passwd | grep -w "$i"
done
