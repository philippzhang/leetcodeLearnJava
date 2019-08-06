# [241. Different Ways to Add Parentheses][enTitle]

**Medium**

Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are  *+* ,  *-*  and  *** .

Example 1:

```
Input: "2-1-1"
Output: [0, 2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2
```

Example 2:

```
Input:"2*3-4*5"
Output: [-34, -14, -10, -10, 10]
Explanation:(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
```


# [241. 为运算表达式设计优先级][cnTitle]

**中等**

给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含  *+* ,  *-*  以及  ***  。

**示例 1:** 

```
输入: "2-1-1"
输出: [0, 2]
解释:
((2-1)-1) = 0 
(2-(1-1)) = 2
```

**示例 2:** 

```
输入:"2*3-4*5"
输出: [-34, -14, -10, -10, 10]
解释:(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
```




# 算法思路

# 测试用例
```
241. Different Ways to Add Parentheses 241. 为运算表达式设计优先级 Medium
```

[enTitle]: https://leetcode.com/problems/different-ways-to-add-parentheses/
[cnTitle]: https://leetcode-cn.com/problems/different-ways-to-add-parentheses/
