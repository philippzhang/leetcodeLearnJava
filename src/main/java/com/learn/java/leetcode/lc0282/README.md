# [282. Expression Add Operators][enTitle]

**Hard**

Given a string that contains only digits  *0-9*  and a target value, return all possibilities to add binary operators (not unary)  *+* ,  *-* , or  ***  between the digits so they evaluate to the target value.

Example 1:

```
Input: num ="123", target = 6
Output:["1+2+3", "1*2*3"] 

```

Example 2:

```
Input: num ="232", target = 8
Output:["2*3+2", "2+3*2"]
```

Example 3:

```
Input: num ="105", target = 5
Output:["1*0+5","10-5"]
```

Example 4:

```
Input: num ="00", target = 0
Output:["0+0", "0-0", "0*0"]

```

Example 5:

```
Input: num ="3456237490", target = 9191
Output:[]

```


# [282. 给表达式添加运算符][cnTitle]

**困难**

给定一个仅包含数字  *0-9*  的字符串和一个目标值，在数字之间添加**二元** 运算符（不是一元） *+* 、 *-*  或  ***  ，返回所有能够得到目标值的表达式。

**示例 1:** 

```
输入: num ="123", target = 6
输出:["1+2+3", "1*2*3"] 

```

**示例 2:** 

```
输入: num ="232", target = 8
输出:["2*3+2", "2+3*2"]
```

**示例 3:** 

```
输入: num ="105", target = 5
输出:["1*0+5","10-5"]
```

**示例 4:** 

```
输入: num ="00", target = 0
输出:["0+0", "0-0", "0*0"]

```

**示例 5:** 

```
输入: num ="3456237490", target = 9191
输出:[]

```




# 算法思路

# 测试用例
```
282. Expression Add Operators 282. 给表达式添加运算符 Hard
Solution.addOperators
---
"123"
6

=["1+2+3","1*2*3"]
$disorder
---
"232"
8

=["2*3+2","2+3*2"]
$disorder
---
"105"
5

=["1*0+5","10-5"]
$disorder
---
"00"
0

=["0+0","0-0","0*0"]
$disorder
---
"3456237490"
9191

=[]
---
"123"
123

=["123"]
```

[enTitle]: https://leetcode.com/problems/expression-add-operators/
[cnTitle]: https://leetcode-cn.com/problems/expression-add-operators/
