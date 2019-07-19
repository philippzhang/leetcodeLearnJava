# [399. Evaluate Division][enTitle]

**Medium**

Equations are given in the format  *A / B = k* , where  *A*  and  *B*  are variables represented as strings, and  *k*  is a real number (floating point number). Given some queries, return the answers. If the answer does not exist, return  *-1.0* .

Example: Given  *a / b = 2.0, b / c = 3.0.*  queries are:  *a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .*  return  *[6.0, 0.5, -1.0, 1.0, -1.0 ].* 

The input is:  *vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries* , where  *equations.size() == values.size()* , and the values are positive. This represents the equations. Return  *vector<double>* .

According to the example above:

```
equations = [ ["a", "b"], ["b", "c"] ],
values = [2.0, 3.0],
queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ]. 
```



The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.


# [399. 除法求值][cnTitle]

**中等**

给出方程式  *A / B = k* , 其中  *A*  和  *B*  均为代表字符串的变量，  *k*  是一个浮点型数字。根据已知方程式求解问题，并返回计算结果。如果结果不存在，则返回  *-1.0* 。

**示例 :**  给定  *a / b = 2.0, b / c = 3.0*  问题:  *a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?*  返回  *[6.0, 0.5, -1.0, 1.0, -1.0 ]* 

输入为:  *vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries* (方程式，方程式结果，问题方程式)， 其中  *equations.size() == values.size()* ，即方程式的长度与方程式结果长度相等（程式与结果一一对应），并且结果值均为正数。以上为方程式的描述。 返回 *vector<double>* 类型。

基于上述例子，输入如下：

```
equations(方程式) = [ ["a", "b"], ["b", "c"] ],
values(方程式结果) = [2.0, 3.0],
queries(问题方程式) = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ]. 

```

输入总是有效的。你可以假设除法运算中不会出现除数为0的情况，且不存在任何矛盾的结果。




# 算法思路

# 测试用例
```
399. Evaluate Division 399. 除法求值 Medium
Solution.calcEquation
---
[["a","b"],["b","c"]]
[2.0,3.0]
[["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]

=[6.0,0.5,-1.0,1.0,-1.0]
```

[enTitle]: https://leetcode.com/problems/evaluate-division/
[cnTitle]: https://leetcode-cn.com/problems/evaluate-division/
