# [1249. Minimum Remove to Make Valid Parentheses][enTitle]

**Medium**

Given a string s of  *'('*  ,  *')'*  and lowercase English characters.

Your task is to remove the minimum number of parentheses (  *'('*  or  *')'* , in any positions ) so that the resulting  *parentheses string*  is valid and return **any**  valid string.

Formally, a  *parentheses string*  is valid if and only if:

- It is the empty string, contains only lowercase characters, or 
- It can be written as  *AB*  ( *A*  concatenated with  *B* ), where  *A*  and  *B*  are valid strings, or 
- It can be written as  *(A)* , where  *A*  is a valid string.



**Example 1:** 

```
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.

```

**Example 2:** 

```
Input: s = "a)b(c)d"
Output: "ab(c)d"

```

**Example 3:** 

```
Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.

```

**Example 4:** 

```
Input: s = "(a(b(c)d)"
Output: "a(b(c)d)"

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *s[i]*  is one of  *'('*  ,  *')'*  and lowercase English letters *.* 


# [1249. 移除无效的括号][cnTitle]

**中等**

给你一个由  *'('* 、 *')'*  和小写字母组成的字符串  *s* 。

你需要从字符串中删除最少数目的  *'('*  或者  *')'*  （可以删除任意位置的括号)，使得剩下的「括号字符串」有效。

请返回任意一个合法字符串。

有效「括号字符串」应当符合以下 **任意一条** 要求：

- 空字符串或只包含小写字母的字符串 
- 可以被写作  *AB* （ *A*  连接  *B* ）的字符串，其中  *A*  和  *B*  都是有效「括号字符串」 
- 可以被写作  *(A)*  的字符串，其中  *A*  是一个有效的「括号字符串」



**示例 1：** 

```
输入：s = "lee(t(c)o)de)"
输出："lee(t(c)o)de"
解释："lee(t(co)de)" , "lee(t(c)ode)" 也是一个可行答案。

```

**示例 2：** 

```
输入：s = "a)b(c)d"
输出："ab(c)d"

```

**示例 3：** 

```
输入：s = "))(("
输出：""
解释：空字符串也是有效的

```

**示例 4：** 

```
输入：s = "(a(b(c)d)"
输出："a(b(c)d)"

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *s[i]*  可能是  *'('* 、 *')'*  或英文小写字母




# 算法思路

# 测试用例
```
1249. Minimum Remove to Make Valid Parentheses 1249. 移除无效的括号 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
[cnTitle]: https://leetcode-cn.com/problems/minimum-remove-to-make-valid-parentheses/
