# [964. Least Operators to Express Number][enTitle]

**Hard**

Given a single positive integer  *x* , we will write an expression of the form  *x (op1) x (op2) x (op3) x ...*  where each operator  *op1* ,  *op2* , etc. is either addition, subtraction, multiplication, or division ( *+* ,  *-* ,  *** , or  */)* . For example, with  *x = 3* , we might write  *3 * 3 / 3 + 3 - 3*  which is a value of 3.

When writing such an expression, we adhere to the following conventions:

- The division operator ( */* ) returns rational numbers. 
- There are no parentheses placed anywhere. 
- We use the usual order of operations: multiplication and division happen before addition and subtraction. 
- It is not allowed to use the unary negation operator ( *-* ). For example, " *x - x* " is a valid expression as it only uses subtraction, but " *-x + x* " is not because it uses negation.

We would like to write an expression with the least number of operators such that the expression equals the given  *target* . Return the least number of operators used.



**Example 1:** 

```
Input: x = 3, target = 19
Output: 5
Explanation: 3 * 3 + 3 * 3 + 3 / 3.
The expression contains 5 operations.

```

**Example 2:** 

```
Input: x = 5, target = 501
Output: 8
Explanation: 5 * 5 * 5 * 5 - 5 * 5 * 5 + 5 / 5.
The expression contains 8 operations.

```

**Example 3:** 

```
Input: x = 100, target = 100000000
Output: 3
Explanation: 100 * 100 * 100 * 100.
The expression contains 3 operations.

```



**Constraints:** 

-  *2 <= x <= 100*  
-  *1 <= target <= 2 * 108* 


# [964. 表示数字的最少运算符][cnTitle]

**困难**

给定一个正整数  *x* ，我们将会写出一个形如  *x (op1) x (op2) x (op3) x ...*  的表达式，其中每个运算符  *op1* ， *op2* ，… 可以是加、减、乘、除（ *+* ， *-* ， *** ，或是  */* ）之一。例如，对于  *x = 3* ，我们可以写出表达式  *3 * 3 / 3 + 3 - 3* ，该式的值为 3 。

在写这样的表达式时，我们需要遵守下面的惯例：

1. 除运算符（ */* ）返回有理数。 
2. 任何地方都没有括号。 
3. 我们使用通常的操作顺序：乘法和除法发生在加法和减法之前。 
4. 不允许使用一元否定运算符（ *-* ）。例如，“ *x - x* ” 是一个有效的表达式，因为它只使用减法，但是 “ *-x + x* ” 不是，因为它使用了否定运算符。 

我们希望编写一个能使表达式等于给定的目标值  *target*  且运算符最少的表达式。返回所用运算符的最少数量。



**示例 1：** 

```
输入：x = 3, target = 19
输出：5
解释：3 * 3 + 3 * 3 + 3 / 3 。表达式包含 5 个运算符。

```

**示例 2：** 

```
输入：x = 5, target = 501
输出：8
解释：5 * 5 * 5 * 5 - 5 * 5 * 5 + 5 / 5 。表达式包含 8 个运算符。

```

**示例 3：** 

```
输入：x = 100, target = 100000000
输出：3
解释：100 * 100 * 100 * 100 。表达式包含 3 个运算符。
```



**提示：** 

-  *2 <= x <= 100*  
-  *1 <= target <= 2 * 10^8* 






# 算法思路

# 测试用例
```
964. Least Operators to Express Number 964. 表示数字的最少运算符 Hard
```

[enTitle]: https://leetcode.com/problems/least-operators-to-express-number/
[cnTitle]: https://leetcode-cn.com/problems/least-operators-to-express-number/
