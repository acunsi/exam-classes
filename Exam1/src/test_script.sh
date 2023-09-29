#!/bin/bash
for i in {100..200}
do
   java Main "$i" > ../output_samples/test-$i.txt
done