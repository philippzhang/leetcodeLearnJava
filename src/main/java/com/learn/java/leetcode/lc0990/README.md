# [990. Satisfiability of Equality Equations][enTitle]

**Medium**

Given an array equations of strings that represent relationships between variables, each string  *equations[i]*  has length  *4*  and takes one of two different forms:  *"a==b"*  or  *"a!=b"* . Here,  *a*  and  *b*  are lowercase letters (not necessarily different) that represent one-letter variable names.

Return  *true*  if and only if it is possible to assign integers to variable names so as to satisfy all the given equations.






**Example 1:** 

```
Input:["a==b","b!=a"]
Output: false
Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.  There is no way to assign the variables to satisfy both equations.
```


**Example 2:** 

```
Input:["b==a","a==b"]
Output: true
Explanation: We could assign a = 1 and b = 1 to satisfy both equations.
```


**Example 3:** 

```
Input:["a==b","b==c","a==c"]
Output: true
```


**Example 4:** 

```
Input:["a==b","b!=c","c==a"]
Output: false
```


**Example 5:** 

```
Input:["c==c","b==d","x!=z"]
Output: true
```



**Note:** 

1.  *1 <= equations.length <= 500*  
2.  *equations[i].length == 4*  
3.  *equations[i][0]*  and  *equations[i][3]*  are lowercase letters 
4.  *equations[i][1]*  is either  *'='*  or  *'!'*  
5.  *equations[i][2]*  is  *'='* 












# [990. 等式方程的可满足性][cnTitle]

**中等**

给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程  *equations[i]*  的长度为  *4* ，并采用两种不同的形式之一： *"a==b"*  或  *"a!=b"* 。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。

只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回  *true* ，否则返回  *false* 。





**示例 1：** 

```
输入：["a==b","b!=a"]
输出：false
解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。

```

**示例 2：** 

```
输入：["b==a","a==b"]
输出：true
解释：我们可以指定 a = 1 且 b = 1 以满足满足这两个方程。

```

**示例 3：** 

```
输入：["a==b","b==c","a==c"]
输出：true

```

**示例 4：** 

```
输入：["a==b","b!=c","c==a"]
输出：false

```

**示例 5：** 

```
输入：["c==c","b==d","x!=z"]
输出：true

```



**提示：** 

1.  *1 <= equations.length <= 500*  
2.  *equations[i].length == 4*  
3.  *equations[i][0]*  和  *equations[i][3]*  是小写字母 
4.  *equations[i][1]*  要么是  *'='* ，要么是  *'!'*  
5.  *equations[i][2]*  是  *'='* 




# 算法思路

# 测试用例
```
990. Satisfiability of Equality Equations 990. 等式方程的可满足性 Medium
```

[enTitle]: https://leetcode.com/problems/satisfiability-of-equality-equations/
[cnTitle]: https://leetcode-cn.com/problems/satisfiability-of-equality-equations/
