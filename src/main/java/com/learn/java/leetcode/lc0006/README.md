# [6. ZigZag Conversion][enTitle]

**Medium**

The string  *"PAYPALISHIRING"*  is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R

```

And then read line by line:  *"PAHNAPLSIIGYIR"* 

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

**Example 1:** 

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

```

**Example 2:** 

```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
```
# [6. Z 字形变换][cnTitle]

**中等**

将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为  *"LEETCODEISHIRING"*  行数为 3 时，排列如下：

```
L   C   I   R
E T O E S I I G
E   D   H   N

```

之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如： *"LCIRETOESIIGEDHN"* 。

请你实现这个将字符串进行指定行数变换的函数：

```
string convert(string s, int numRows);
```

**示例 1:** 

```
输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"

```

**示例 2:** 

```
输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:

L     D     R
E   O E   I I
E C   I H   N
T     S     G
```


# 算法思路

# 测试用例
```
6. ZigZag Conversion 6. Z 字形变换 Medium
Solution.convert
Solution.convert2
---
"LEETCODEISHIRING"
3

="LCIRETOESIIGEDHN"
---
"LEETCODEISHIRING"
4

="LDREOEIIECIHNTSG"
---
"A"
3

="A"
---
"ABC"
2

="ACB"
---
"ABCDE"
3

="AEBDC"
```

[enTitle]: https://leetcode.com/problems/zigzag-conversion/
[cnTitle]: https://leetcode-cn.com/problems/zigzag-conversion/
