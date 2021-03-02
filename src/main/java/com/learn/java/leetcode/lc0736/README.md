# [736. Parse Lisp Expression][enTitle]

**Hard**

You are given a string  *expression*  representing a Lisp-like expression to return the integer value of.

The syntax for these expressions is given as follows.




































Evaluation Examples:

```
Input: (add 1 2)
Output: 3

Input: (mult 3 (add 2 3))
Output: 15

Input: (let x 2 (mult x 5))
Output: 10

Input: (let x 2 (mult x (let x 3 y 4 (add x y))))
Output: 14
Explanation: In the expression (add x y), when checking for the value of the variable x,
we check from the innermost scope to the outermost in the context of the variable we are trying to evaluate.
Since x = 3 is found first, the value of x is 3.

Input: (let x 3 x 2 x)
Output: 2
Explanation: Assignment in let statements is processed sequentially.

Input: (let x 1 y 2 x (add x y) (add x y))
Output: 5
Explanation: The first (add x y) evaluates as 3, and is assigned to x.
The second (add x y) evaluates as 3+2 = 5.

Input: (let x 2 (add (let x 3 (let x 4 x)) x))
Output: 6
Explanation: Even though (let x 4 x) has a deeper scope, it is outside the context
of the final x in the add-expression.  That final x will equal 2.

Input: (let a1 3 b2 (add a1 1) b2) 
Output 4
Explanation: Variable names can contain digits after the first character.


```

Note:







# [736. Lisp 语法解析][cnTitle]

**困难**

给定一个类似 Lisp 语句的表达式  *expression* ，求出其计算结果。

表达式语法如下所示:

- 表达式可以为整数，let 语法，add 语法，mult 语法，或赋值的变量。表达式的结果总是一个整数。 
- (整数可以是正整数、负整数、0) 
- **let**  语法表示为  *(let v1 e1 v2 e2 ... vn en expr)* , 其中  *let* 语法总是以字符串  *"let"* 来表示，接下来会跟随一个或多个交替变量或表达式，也就是说，第一个变量  *v1* 被分配为表达式  *e1*  的值，第二个变量  *v2*  被分配为表达式  *e2*  的值，**以此类推** ；最终 let 语法的值为  *expr* 表达式的值。 
- **add** 语法表示为  *(add e1 e2)* ，其中  *add*  语法总是以字符串  *"add"* 来表示，该语法总是有两个表达式 *e1* 、 *e2* , 该语法的最终结果是  *e1*  表达式的值与  *e2*  表达式的值之**和** 。 
- **mult**  语法表示为  *(mult e1 e2)*  ，其中  *mult*  语法总是以字符串 *"mult"* 表示， 该语法总是有两个表达式  *e1* 、 *e2* ，该语法的最终结果是  *e1*  表达式的值与  *e2*  表达式的值之**积** 。 
- 在该题目中，变量的命名以小写字符开始，之后跟随0个或多个小写字符或数字。为了方便，"add"，"let"，"mult"会被定义为"关键字"，不会在表达式的变量命名中出现。 
- 最后，要说一下作用域的概念。计算变量名所对应的表达式时，在计算上下文中，首先检查最内层作用域（按括号计），然后按顺序依次检查外部作用域。我们将保证每一个测试的表达式都是合法的。有关作用域的更多详细信息，请参阅示例。



**示例：** 

```
输入: (add 1 2)
输出: 3

输入: (mult 3 (add 2 3))
输出: 15

输入: (let x 2 (mult x 5))
输出: 10

输入: (let x 2 (mult x (let x 3 y 4 (add x y))))
输出: 14
解释: 
表达式 (add x y), 在获取 x 值时, 我们应当由最内层依次向外计算, 首先遇到了 x=3, 所以此处的 x 值是 3.


输入: (let x 3 x 2 x)
输出: 2
解释: let 语句中的赋值运算按顺序处理即可

输入: (let x 1 y 2 x (add x y) (add x y))
输出: 5
解释: 
第一个 (add x y) 计算结果是 3，并且将此值赋给了 x 。
第二个 (add x y) 计算结果就是 3+2 = 5 。

输入: (let x 2 (add (let x 3 (let x 4 x)) x))
输出: 6
解释: 
(let x 4 x) 中的 x 的作用域仅在()之内。所以最终做加法操作时，x 的值是 2 。

输入: (let a1 3 b2 (add a1 1) b2) 
输出:4
解释: 
变量命名时可以在第一个小写字母后跟随数字.

```



**注意:** 

- 我们给定的  *expression*  表达式都是格式化后的：表达式前后没有多余的空格，表达式的不同部分(关键字、变量、表达式)之间仅使用一个空格分割，并且在相邻括号之间也没有空格。我们给定的表达式均为合法的且最终结果为整数。 
- 我们给定的表达式长度最多为 2000 (表达式也不会为空，因为那不是一个合法的表达式)。 
- 最终的结果和中间的计算结果都将是一个 32 位整数。






# 算法思路

# 测试用例
```
736. Parse Lisp Expression 736. Lisp 语法解析 Hard
```

[enTitle]: https://leetcode.com/problems/parse-lisp-expression/
[cnTitle]: https://leetcode-cn.com/problems/parse-lisp-expression/
