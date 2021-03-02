# [679. 24 Game][enTitle]

**Hard**

You have 4 cards each containing a number from 1 to 9. You need to judge whether they could operated through  *** ,  */* ,  *+* ,  *-* ,  *(* ,  *)*  to get the value of 24.

Example 1:

```
Input: [4, 1, 8, 7]
Output: True
Explanation: (8-4) * (7-1) = 24

```



Example 2:

```
Input: [1, 2, 1, 2]
Output: False

```



Note:

1. The division operator  */*  represents real division, not integer division. For example, 4 / (1 - 2/3) = 12. 
2. Every operation done is between two numbers. In particular, we cannot use  *-*  as a unary operator. For example, with  *[1, 1, 1, 1]*  as input, the expression  *-1 - 1 - 1 - 1*  is not allowed. 
3. You cannot concatenate numbers together. For example, if the input is  *[1, 2, 1, 2]* , we cannot write this as 12 + 12.






# [679. 24 点游戏][cnTitle]

**困难**

你有 4 张写有 1 到 9 数字的牌。你需要判断是否能通过  *** ， */* ， *+* ， *-* ， *(* ， *)*  的运算得到 24。

**示例 1:** 

```
输入: [4, 1, 8, 7]
输出: True
解释: (8-4) * (7-1) = 24

```

**示例 2:** 

```
输入: [1, 2, 1, 2]
输出: False

```

**注意:** 

1. 除法运算符  */*  表示实数除法，而不是整数除法。例如 4 / (1 - 2/3) = 12 。 
2. 每个运算符对两个数进行运算。特别是我们不能用  *-*  作为一元运算符。例如， *[1, 1, 1, 1]*  作为输入时，表达式  *-1 - 1 - 1 - 1*  是不允许的。 
3. 你不能将数字连接在一起。例如，输入为  *[1, 2, 1, 2]*  时，不能写成 12 + 12 。




# 算法思路

# 测试用例
```
679. 24 Game 679. 24 点游戏 Hard
```

[enTitle]: https://leetcode.com/problems/24-game/
[cnTitle]: https://leetcode-cn.com/problems/24-game/
