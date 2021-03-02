# [482. License Key Formatting][enTitle]

**Easy**

You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.

Example 1:

```
Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.

```



Example 2:

```
Input: S = "2-5g-3-J", K = 2

Output: "2-5G-3J"

Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.

```



Note:

1. The length of string S will not exceed 12,000, and K is a positive integer. 
2. String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-). 
3. String S is non-empty.




# [482. 密钥格式化][cnTitle]

**简单**

有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。

给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。

给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。



**示例 1：** 

```
输入：S = "5F3Z-2e-9-w", K = 4
输出："5F3Z-2E9W"
解释：字符串 S 被分成了两个部分，每部分 4 个字符；
     注意，两个额外的破折号需要删掉。

```

**示例 2：** 

```
输入：S = "2-5g-3-J", K = 2
输出："2-5G-3J"
解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。

```



**提示:** 

1. S 的长度可能很长，请按需分配大小。K 为正整数。 
2. S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-' 
3. S 非空






# 算法思路

# 测试用例
```
482. License Key Formatting 482. 密钥格式化 Easy
```

[enTitle]: https://leetcode.com/problems/license-key-formatting/
[cnTitle]: https://leetcode-cn.com/problems/license-key-formatting/
