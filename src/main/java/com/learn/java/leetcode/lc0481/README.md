# [481. Magical String][enTitle]

**Medium**

A magical string S consists of only '1' and '2' and obeys the following rules:

The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.

The first few elements of string S is the following: S = "1221121221221121122……"

If we group the consecutive '1's and '2's in S, it will be:

1 22 11 2 1 22 1 22 11 2 11 22 ......

and the occurrences of '1's or '2's in each group are:

1 2 2 1 1 2 1 2 2 1 2 2 ......

You can see that the occurrence sequence above is the S itself.

Given an integer N as input, return the number of '1's in the first N number in the magical string S.

Note: N will not exceed 100,000.

Example 1:

```
Input: 6
Output: 3
Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.

```




# [481. 神奇字符串][cnTitle]

**中等**

神奇的字符串 **S** 只包含 '1' 和 '2'，并遵守以下规则：

字符串 **S**  是神奇的，因为串联字符 '1' 和 '2' 的连续出现次数会生成字符串 **S**  本身。

字符串 **S** 的前几个元素如下：**S** = “1221121221221121122 ......”

如果我们将 **S**  中连续的 1 和 2 进行分组，它将变成：

1 22 11 2 1 22 1 22 11 2 11 22 ......

并且每个组中 '1' 或 '2' 的出现次数分别是：

1 2 2 1 1 2 1 2 2 1 2 2 ......

你可以看到上面的出现次数就是 **S**  本身。

给定一个整数 N 作为输入，返回神奇字符串 **S** 中前 N 个数字中的 '1' 的数目。

**注意：** N 不会超过 100,000。

**示例：** 

```
输入：6
输出：3
解释：神奇字符串 S 的前 6 个元素是 “12211”，它包含三个 1，因此返回 3。

```






# 算法思路

# 测试用例
```
481. Magical String 481. 神奇字符串 Medium
```

[enTitle]: https://leetcode.com/problems/magical-string/
[cnTitle]: https://leetcode-cn.com/problems/magical-string/
