#!/bin/bash

echo $1 | grep -o [A-Z] | tr -d '\n'
echo 
