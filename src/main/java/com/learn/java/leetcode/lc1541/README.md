# [1541. Minimum Insertions to Balance a Parentheses String][enTitle]

**Medium**

Given a parentheses string  *s*  containing only the characters  *'('*  and  *')'* . A parentheses string is **balanced**  if:

- Any left parenthesis  *'('*  must have a corresponding two consecutive right parenthesis  *'))'* . 
- Left parenthesis  *'('*  must go before the corresponding two consecutive right parenthesis  *'))'* .

In other words, we treat  *'('*  as openning parenthesis and  *'))'*  as closing parenthesis.

For example,  *"())"* ,  *"())(())))"*  and  *"(())())))"*  are balanced,  *")()"* ,  *"()))"*  and  *"(()))"*  are not balanced.

You can insert the characters  *'('*  and  *')'*  at any position of the string to balance it if needed.

Return  *the minimum number of insertions*  needed to make  *s*  balanced.



**Example 1:** 

```
Input: s = "(()))"
Output: 1
Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to to add one more ')' at the end of the string to be "(())))" which is balanced.

```

**Example 2:** 

```
Input: s = "())"
Output: 0
Explanation: The string is already balanced.

```

**Example 3:** 

```
Input: s = "))())("
Output: 3
Explanation: Add '(' to match the first '))', Add '))' to match the last '('.

```

**Example 4:** 

```
Input: s = "(((((("
Output: 12
Explanation: Add 12 ')' to balance the string.

```

**Example 5:** 

```
Input: s = ")))))))"
Output: 5
Explanation: Add 4 '(' at the beginning of the string and one ')' at the end. The string becomes "(((())))))))".

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *s*  consists of  *'('*  and  *')'*  only.


# [1541. 平衡括号字符串的最少插入次数][cnTitle]

**中等**

给你一个括号字符串  *s*  ，它只包含字符  *'('*  和  *')'*  。一个括号字符串被称为平衡的当它满足：

- 任何左括号  *'('*  必须对应两个连续的右括号  *'))'*  。 
- 左括号  *'('*  必须在对应的连续两个右括号  *'))'*  之前。

比方说  *"())"* ，  *"())(())))"*  和  *"(())())))"*  都是平衡的，  *")()"* ，  *"()))"*  和  *"(()))"*  都是不平衡的。

你可以在任意位置插入字符 '(' 和 ')' 使字符串平衡。

请你返回让  *s*  平衡的最少插入次数。



**示例 1：** 

```
输入：s = "(()))"
输出：1
解释：第二个左括号有与之匹配的两个右括号，但是第一个左括号只有一个右括号。我们需要在字符串结尾额外增加一个 ')' 使字符串变成平衡字符串 "(())))" 。

```

**示例 2：** 

```
输入：s = "())"
输出：0
解释：字符串已经平衡了。

```

**示例 3：** 

```
输入：s = "))())("
输出：3
解释：添加 '(' 去匹配最开头的 '))' ，然后添加 '))' 去匹配最后一个 '(' 。

```

**示例 4：** 

```
输入：s = "(((((("
输出：12
解释：添加 12 个 ')' 得到平衡字符串。

```

**示例 5：** 

```
输入：s = ")))))))"
输出：5
解释：在字符串开头添加 4 个 '(' 并在结尾添加 1 个 ')' ，字符串变成平衡字符串 "(((())))))))" 。

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *s*  只包含  *'('*  和  *')'*  。




# 算法思路

# 测试用例
```
1541. Minimum Insertions to Balance a Parentheses String 1541. 平衡括号字符串的最少插入次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
[cnTitle]: https://leetcode-cn.com/problems/minimum-insertions-to-balance-a-parentheses-string/
