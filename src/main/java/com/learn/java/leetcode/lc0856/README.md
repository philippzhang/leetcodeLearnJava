# [856. Score of Parentheses][enTitle]

**Medium**

Given a balanced parentheses string  *S* , compute the score of the string based on the following rule:

-  *()*  has score 1 
-  *AB*  has score  *A + B* , where A and B are balanced parentheses strings. 
-  *(A)*  has score  *2 * A* , where A is a balanced parentheses string.




**Example 1:** 

```
Input:"()"
Output: 1
```


**Example 2:** 

```
Input:"(())"
Output: 2
```


**Example 3:** 

```
Input:"()()"
Output: 2
```


**Example 4:** 

```
Input:"(()(()))"
Output: 6
```



**Note:** 

1.  *S*  is a balanced parentheses string, containing only  *(*  and  *)* . 
2.  *2 <= S.length <= 50* 










# [856. 括号的分数][cnTitle]

**中等**

给定一个平衡括号字符串  *S* ，按下述规则计算该字符串的分数：

-  *()*  得 1 分。 
-  *AB*  得  *A + B*  分，其中 A 和 B 是平衡括号字符串。 
-  *(A)*  得  *2 * A*  分，其中 A 是平衡括号字符串。



**示例 1：** 

```
输入："()"
输出：1

```

**示例 2：** 

```
输入："(())"
输出：2

```

**示例 3：** 

```
输入："()()"
输出：2

```

**示例 4：** 

```
输入："(()(()))"
输出：6

```



**提示：** 

1.  *S*  是平衡括号字符串，且只含有  *(*  和  *)*  。 
2.  *2 <= S.length <= 50* 




# 算法思路

# 测试用例
```
856. Score of Parentheses 856. 括号的分数 Medium
Solution.scoreOfParentheses
---
"()"

=1
---
"(())"

=2
---
"()()"

=2
---
"(()(()))"

=6
```

[enTitle]: https://leetcode.com/problems/score-of-parentheses/
[cnTitle]: https://leetcode-cn.com/problems/score-of-parentheses/
