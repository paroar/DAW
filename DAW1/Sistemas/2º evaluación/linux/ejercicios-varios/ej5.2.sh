#!/bin/bash

args=$*
echo $args | tr ' ' '\n' | rev | sort | rev
