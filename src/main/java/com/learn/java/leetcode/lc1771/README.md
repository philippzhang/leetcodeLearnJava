# [1771. Maximize Palindrome Length From Subsequences][enTitle]

**Hard**

You are given two strings,  *word1*  and  *word2* . You want to construct a string in the following manner:

- Choose some **non-empty**  subsequence  *subsequence1*  from  *word1* . 
- Choose some **non-empty**  subsequence  *subsequence2*  from  *word2* . 
- Concatenate the subsequences:  *subsequence1 + subsequence2* , to make the string.

Return  *the length of the longest palindrome that can be constructed in the described manner.* If no palindromes can be constructed, return  *0* .

A **subsequence**  of a string  *s*  is a string that can be made by deleting some (possibly none) characters from  *s*  without changing the order of the remaining characters.

A **palindrome**  is a string that reads the same forward as well as backward.



**Example 1:** 

```
Input: word1 = "cacb", word2 = "cbba"
Output: 5
Explanation: Choose "ab" from word1 and "cba" from word2 to make "abcba", which is a palindrome.
```

**Example 2:** 

```
Input: word1 = "ab", word2 = "ab"
Output: 3
Explanation: Choose "ab" from word1 and "a" from word2 to make "aba", which is a palindrome.
```

**Example 3:** 

```
Input: word1 = "aa", word2 = "bb"
Output: 0
Explanation: You cannot construct a palindrome from the described method, so return 0.
```



**Constraints:** 

-  *1 <= word1.length, word2.length <= 1000*  
-  *word1*  and  *word2*  consist of lowercase English letters.


# [1771. 由子序列构造的最长回文串的长度][cnTitle]

**困难**

给你两个字符串  *word1*  和  *word2*  ，请你按下述方法构造一个字符串：

- 从  *word1*  中选出某个 **非空**  子序列  *subsequence1*  。 
- 从  *word2*  中选出某个 **非空**  子序列  *subsequence2*  。 
- 连接两个子序列  *subsequence1 + subsequence2*  ，得到字符串。

返回可按上述方法构造的最长 **回文串**  的 **长度**  。如果无法构造回文串，返回  *0*  。

字符串  *s*  的一个 **子序列**  是通过从  *s*  中删除一些（也可能不删除）字符而不更改其余字符的顺序生成的字符串。

**回文串**  是正着读和反着读结果一致的字符串。



**示例 1：** 

```
输入：word1 = "cacb", word2 = "cbba"
输出：5
解释：从 word1 中选出 "ab" ，从 word2 中选出 "cba" ，得到回文串 "abcba" 。
```

**示例 2：** 

```
输入：word1 = "ab", word2 = "ab"
输出：3
解释：从 word1 中选出 "ab" ，从 word2 中选出 "a" ，得到回文串 "aba" 。
```

**示例 3：** 

```
输入：word1 = "aa", word2 = "bb"
输出：0
解释：无法按题面所述方法构造回文串，所以返回 0 。
```



**提示：** 

-  *1 <= word1.length, word2.length <= 1000*  
-  *word1*  和  *word2*  由小写英文字母组成




# 算法思路

# 测试用例
```
1771. Maximize Palindrome Length From Subsequences 1771. 由子序列构造的最长回文串的长度 Hard
```

[enTitle]: https://leetcode.com/problems/maximize-palindrome-length-from-subsequences/
[cnTitle]: https://leetcode-cn.com/problems/maximize-palindrome-length-from-subsequences/
