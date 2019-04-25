# [1021. Remove Outermost Parentheses][enTitle]

**Easy**

A valid parentheses string is either empty  *("")* ,  *"(" + A + ")"* , or  *A + B* , where  *A*  and  *B*  are valid parentheses strings, and  *+*  represents string concatenation. For example,  *""* ,  *"()"* ,  *"(())()"* , and  *"(()(()))"*  are all valid parentheses strings.

A valid parentheses string  *S*  is **primitive**  if it is nonempty, and there does not exist a way to split it into  *S = A+B* , with  *A*  and  *B*  nonempty valid parentheses strings.

Given a valid parentheses string  *S* , consider its primitive decomposition:  *S = P_1 + P_2 + ... + P_k* , where  *P_i*  are primitive valid parentheses strings.

Return  *S*  after removing the outermost parentheses of every primitive string in the primitive decomposition of  *S* .



**Example 1:** 

```
Input:"(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
```


**Example 2:** 

```
Input:"(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
```


**Example 3:** 

```
Input:"()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
```







**Note:** 

1.  *S.length <= 10000*  
2.  *S[i]*  is  *"("*  or  *")"*  
3.  *S*  is a valid parentheses string









# [1021. 删除最外层的括号][cnTitle]

**简单**

有效括号字符串为空  *("")* 、 *"(" + A + ")"*  或  *A + B* ，其中  *A*  和  *B*  都是有效的括号字符串， *+*  代表字符串的连接。例如， *""* ， *"()"* ， *"(())()"*  和  *"(()(()))"*  都是有效的括号字符串。

如果有效字符串  *S*  非空，且不存在将其拆分为  *S = A+B*  的方法，我们称其为**原语（primitive）** ，其中  *A*  和  *B*  都是非空有效括号字符串。

给出一个非空有效字符串  *S* ，考虑将其进行原语化分解，使得： *S = P_1 + P_2 + ... + P_k* ，其中  *P_i*  是有效括号字符串原语。

对  *S*  进行原语化分解，删除分解中每个原语字符串的最外层括号，返回  *S*  。



**示例 1：** 

```
输入："(()())(())"
输出："()()()"
解释：输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
```

**示例 2：** 

```
输入："(()())(())(()(()))"
输出："()()()()(())"
解释：
输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
删除每隔部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。

```

**示例 3：** 

```
输入："()()"
输出：""
解释：
输入字符串为 "()()"，原语化分解得到 "()" + "()"，
删除每个部分中的最外层括号后得到 "" + "" = ""。

```



**提示：** 

1.  *S.length <= 10000*  
2.  *S[i]*  为  *"("*  或  *")"*  
3.  *S*  是一个有效括号字符串


# 算法思路

# 测试用例
```
1021. Remove Outermost Parentheses 1021. 删除最外层的括号 Easy
```

[enTitle]: https://leetcode.com/problems/remove-outermost-parentheses/
[cnTitle]: https://leetcode-cn.com/problems/remove-outermost-parentheses/
