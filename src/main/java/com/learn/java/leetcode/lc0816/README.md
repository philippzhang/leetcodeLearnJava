# [816. Ambiguous Coordinates][enTitle]

**Medium**

We had some 2-dimensional coordinates, like  *"(1, 3)"*  or  *"(2, 0.5)"* . Then, we removed all commas, decimal points, and spaces, and ended up with the string  *S* . Return a list of strings representing all possibilities for what our original coordinates could have been.

Our original representation never had extraneous zeroes, so we never started with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other number that can be represented with less digits. Also, a decimal point within a number never occurs without at least one digit occuring before it, so we never started with numbers like ".1".

The final answer list can be returned in any order. Also note that all coordinates in the final answer have exactly one space between them (occurring after the comma.)

```
Example 1:
Input: "(123)"
Output: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]

```

```
Example 2:
Input: "(00011)"
Output:  ["(0.001, 1)", "(0, 0.011)"]
Explanation: 
0.0, 00, 0001 or 00.01 are not allowed.

```

```
Example 3:
Input: "(0123)"
Output: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]

```

```
Example 4:
Input: "(100)"
Output: [(10, 0)]
Explanation: 
1.0 is not allowed.

```



**Note:** 

-  *4 <= S.length <= 12* . 
-  *S[0]*  = "(",  *S[S.length - 1]*  = ")", and the other elements in  *S*  are digits.




# [816. 模糊坐标][cnTitle]

**中等**

我们有一些二维坐标，如  *"(1, 3)"*  或  *"(2, 0.5)"* ，然后我们移除所有逗号，小数点和空格，得到一个字符串 *S* 。返回所有可能的原始字符串到一个列表中。

原始的坐标表示法不会存在多余的零，所以不会出现类似于"00", "0.0", "0.00", "1.0", "001", "00.01"或一些其他更小的数来表示坐标。此外，一个小数点前至少存在一个数，所以也不会出现“.1”形式的数字。

最后返回的列表可以是任意顺序的。而且注意返回的两个数字中间（逗号之后）都有一个空格。



```
示例 1:
输入: "(123)"
输出: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]

```

```
示例 2:
输入: "(00011)"
输出:  ["(0.001, 1)", "(0, 0.011)"]
解释: 
0.0, 00, 0001 或 00.01 是不被允许的。

```

```
示例 3:
输入: "(0123)"
输出: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]

```

```
示例 4:
输入: "(100)"
输出: [(10, 0)]
解释: 
1.0 是不被允许的。

```



**提示:** 

-  *4 <= S.length <= 12* . 
-  *S[0]*  = "(",  *S[S.length - 1]*  = ")", 且字符串  *S*  中的其他元素都是数字。






# 算法思路

# 测试用例
```
816. Ambiguous Coordinates 816. 模糊坐标 Medium
```

[enTitle]: https://leetcode.com/problems/ambiguous-coordinates/
[cnTitle]: https://leetcode-cn.com/problems/ambiguous-coordinates/
