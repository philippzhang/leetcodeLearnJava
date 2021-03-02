# [696. Count Binary Substrings][enTitle]

**Easy**

Give a string  *s* , count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Example 1:

```
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

```



Example 2:

```
Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

```



Note:






# [696. 计数二进制子串][cnTitle]

**简单**

给定一个字符串  *s* ，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是连续的。

重复出现的子串要计算它们出现的次数。



**示例 1 :** 

```
输入: "00110011"
输出: 6
解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。

请注意，一些重复出现的子串要计算它们出现的次数。

另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。

```

**示例 2 :** 

```
输入: "10101"
输出: 4
解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。

```



**提示：** 

-  *s.length*  在1到50,000之间。 
-  *s*  只包含“0”或“1”字符。




# 算法思路

# 测试用例
```
696. Count Binary Substrings 696. 计数二进制子串 Easy
```

[enTitle]: https://leetcode.com/problems/count-binary-substrings/
[cnTitle]: https://leetcode-cn.com/problems/count-binary-substrings/
