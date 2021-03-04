# [1585. Check If String Is Transformable With Substring Sort Operations][enTitle]

**Hard**

Given two strings  *s*  and  *t* , you want to transform string  *s*  into string  *t*  using the following operation any number of times:

- Choose a **non-empty**  substring in  *s*  and sort it in-place so the characters are in **ascending order** .

For example, applying the operation on the underlined substring in  *"14234"*  results in  *"12344"* .

Return  *true*  if  *it is possible to transform string s into string t* . Otherwise, return  *false* .

A **substring**  is a contiguous sequence of characters within a string.



**Example 1:** 

```
Input: s = "84532", t = "34852"
Output: true
Explanation: You can transform s into t using the following sort operations:
"84532" (from index 2 to 3) -> "84352"
"84352" (from index 0 to 2) -> "34852"

```

**Example 2:** 

```
Input: s = "34521", t = "23415"
Output: true
Explanation: You can transform s into t using the following sort operations:
"34521" -> "23451"
"23451" -> "23415"

```

**Example 3:** 

```
Input: s = "12345", t = "12435"
Output: false

```

**Example 4:** 

```
Input: s = "1", t = "2"
Output: false

```



**Constraints:** 

-  *s.length == t.length*  
-  *1 <= s.length <= 105*  
-  *s*  and  *t*  only contain digits from  *'0'*  to  *'9'* .


# [1585. 检查字符串是否可以通过排序子字符串得到另一个字符串][cnTitle]

**困难**

给你两个字符串  *s*  和  *t*  ，请你通过若干次以下操作将字符串  *s*  转化成字符串  *t*  ：

- 选择  *s*  中一个 **非空**  子字符串并将它包含的字符就地 **升序**  排序。

比方说，对下划线所示的子字符串进行操作可以由  *"14234"*  得到  *"12344"*  。

如果可以将字符串  *s*  变成  *t*  ，返回  *true*  。否则，返回  *false*  。

一个 **子字符串**  定义为一个字符串中连续的若干字符。



**示例 1：** 

```
输入：s = "84532", t = "34852"
输出：true
解释：你可以按以下操作将 s 转变为 t ：
"84532" （从下标 2 到下标 3）-> "84352"
"84352" （从下标 0 到下标 2） -> "34852"

```

**示例 2：** 

```
输入：s = "34521", t = "23415"
输出：true
解释：你可以按以下操作将 s 转变为 t ：
"34521" -> "23451"
"23451" -> "23415"

```

**示例 3：** 

```
输入：s = "12345", t = "12435"
输出：false

```

**示例 4：** 

```
输入：s = "1", t = "2"
输出：false

```



**提示：** 

-  *s.length == t.length*  
-  *1 <= s.length <= 105*  
-  *s*  和  *t*  都只包含数字字符，即  *'0'*  到  *'9'*  。




# 算法思路

# 测试用例
```
1585. Check If String Is Transformable With Substring Sort Operations 1585. 检查字符串是否可以通过排序子字符串得到另一个字符串 Hard
```

[enTitle]: https://leetcode.com/problems/check-if-string-is-transformable-with-substring-sort-operations/
[cnTitle]: https://leetcode-cn.com/problems/check-if-string-is-transformable-with-substring-sort-operations/
