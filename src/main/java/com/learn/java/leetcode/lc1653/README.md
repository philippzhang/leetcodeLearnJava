# [1653. Minimum Deletions to Make String Balanced][enTitle]

**Medium**

You are given a string  *s*  consisting only of characters  *'a'*  and  *'b'* ​​​​.

You can delete any number of characters in  *s*  to make  *s*  **balanced** .  *s*  is **balanced**  if there is no pair of indices  *(i,j)*  such that  *i < j*  and  *s[i] = 'b'*  and  *s[j]= 'a'* .

Return  *the minimum number of deletions needed to make*  *s*  *balanced* .



**Example 1:** 

```
Input: s = "aababbab"
Output: 2
Explanation: You can either:
Delete the characters at 0-indexed positions 2 and 6 ("aababbab" -> "aaabbb"), or
Delete the characters at 0-indexed positions 3 and 6 ("aababbab" -> "aabbbb").

```

**Example 2:** 

```
Input: s = "bbaaaaabb"
Output: 2
Explanation: The only solution is to delete the first two characters.

```



**Constraints:** 

-  *1 <= s.length <= 105*  
-  *s[i]*  is  *'a'*  or  *'b'* ​​.


# [1653. 使字符串平衡的最少删除次数][cnTitle]

**中等**

给你一个字符串  *s*  ，它仅包含字符  *'a'*  和  *'b'* ​​​​ 。

你可以删除  *s*  中任意数目的字符，使得  *s*  **平衡**  。我们称  *s*  **平衡的**  当不存在下标对  *(i,j)*  满足  *i < j*  且  *s[i] = 'b'*  同时  *s[j]= 'a'*  。

请你返回使  *s*  **平衡**  的 **最少**  删除次数。



**示例 1：** 

```
输入：s = "aababbab"
输出：2
解释：你可以选择以下任意一种方案：
下标从 0 开始，删除第 2 和第 6 个字符（"aababbab" -> "aaabbb"），
下标从 0 开始，删除第 3 和第 6 个字符（"aababbab" -> "aabbbb"）。

```

**示例 2：** 

```
输入：s = "bbaaaaabb"
输出：2
解释：唯一的最优解是删除最前面两个字符。

```



**提示：** 

-  *1 <= s.length <= 105*  
-  *s[i]*  要么是  *'a'*  要么是  *'b'* ​**** 。​




# 算法思路

# 测试用例
```
1653. Minimum Deletions to Make String Balanced 1653. 使字符串平衡的最少删除次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/
[cnTitle]: https://leetcode-cn.com/problems/minimum-deletions-to-make-string-balanced/
