#!/bin/bash

names=$*

for i in $names; do
echo $i
shift
done | grep -E "[a-z]{4}[aeiou]$"

