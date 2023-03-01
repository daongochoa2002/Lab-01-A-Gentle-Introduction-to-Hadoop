# Extended Word Count: Unhealthy relationships

## Problem

Our GenZ have an old quote “Trà đổ vào sữa hay sữa đổ vào trà đều như nhau, thế anh đổ em sao em không đổ anh?”. According to science, you should you must pour the milk into the cup first before the tea to keep the milk’s protein structure and prevent it from unwanted transformations due to the high temperature of the tea. But in practice, The Royal Butler of Buckingham said that tea should go in first. So “sữa” and “trà” is a quite complicated relationship. Let us take a simpler relationship,

## 4.1.1 Input
A list of lines, each line has two words separated by a space. For example, “a b” indicates the relationship aRb.

## 4.1.2 Output
A list of lines, each line has two elements n l, in which n is the name of the node and l is the label of the node.

## Solution

Mapper: read the raw rating data which is in the format of the pair of characters, “a b” indicates the relationship aRb for instance.

input: <offset, pair<a, b>>

output: <a, 1> and <b, -1> (<key,value>)

Reducer: aggregate the data by the key character, then find the sum of their values. if the final value is greater than 0, that is positive relationship, if is equal to 0, that  is equal, then is negative.

input: <key, (value1, value2, ...)> output: <key, value>

follow commands below:

$ ~/hadoop/bin/hadoop com.sun.tools.javac.Main *.java

$ jar cf dr.jar *.class

$ ~/hadoop/bin/hadoop jar dr.jar Driver input intermediate final
