# [1106. Parsing A Boolean Expression][enTitle]

**Hard**

Return the result of evaluating a given boolean  *expression* , represented as a string.

An expression can either be:

-  *"t"* , evaluating to  *True* ; 
-  *"f"* , evaluating to  *False* ; 
-  *"!(expr)"* , evaluating to the logical NOT of the inner expression  *expr* ; 
-  *"&(expr1,expr2,...)"* , evaluating to the logical AND of 2 or more inner expressions  *expr1, expr2, ...* ; 
-  *"|(expr1,expr2,...)"* , evaluating to the logical OR of 2 or more inner expressions  *expr1, expr2, ...* 



**Example 1:** 

```
Input: expression = "!(f)"
Output: true

```

**Example 2:** 

```
Input: expression = "|(f,t)"
Output: true

```

**Example 3:** 

```
Input: expression = "&(t,f)"
Output: false

```

**Example 4:** 

```
Input: expression = "|(&(t,f,t),!(t))"
Output: false

```



**Constraints:** 

-  *1 <= expression.length <= 20000*  
-  *expression[i]*  consists of characters in  *{'(', ')', '&', '|', '!', 't', 'f', ','}* . 
-  *expression*  is a valid expression representing a boolean, as given in the description.


# [1106. 解析布尔表达式][cnTitle]

**困难**

给你一个以字符串形式表述的 布尔表达式（boolean）  *expression* ，返回该式的运算结果。

有效的表达式需遵循以下约定：

-  *"t"* ，运算结果为  *True*  
-  *"f"* ，运算结果为  *False*  
-  *"!(expr)"* ，运算过程为对内部表达式  *expr*  进行逻辑 **非的运算** （NOT） 
-  *"&(expr1,expr2,...)"* ，运算过程为对 2 个或以上内部表达式  *expr1, expr2, ...*  进行逻辑 **与的运算** （AND） 
-  *"|(expr1,expr2,...)"* ，运算过程为对 2 个或以上内部表达式  *expr1, expr2, ...*  进行逻辑 **或的运算** （OR）



**示例 1：** 

```
输入：expression = "!(f)"
输出：true

```

**示例 2：** 

```
输入：expression = "|(f,t)"
输出：true

```

**示例 3：** 

```
输入：expression = "&(t,f)"
输出：false

```

**示例 4：** 

```
输入：expression = "|(&(t,f,t),!(t))"
输出：false

```



**提示：** 

-  *1 <= expression.length <= 20000*  
-  *expression[i]*  由  *{'(', ')', '&', '|', '!', 't', 'f', ','}*  中的字符组成。 
-  *expression*  是以上述形式给出的有效表达式，表示一个布尔值。




# 算法思路

# 测试用例
```
1106. Parsing A Boolean Expression 1106. 解析布尔表达式 Hard
```

[enTitle]: https://leetcode.com/problems/parsing-a-boolean-expression/
[cnTitle]: https://leetcode-cn.com/problems/parsing-a-boolean-expression/
