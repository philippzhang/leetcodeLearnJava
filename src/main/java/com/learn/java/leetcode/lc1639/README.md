# [1639. Number of Ways to Form a Target String Given a Dictionary][enTitle]

**Hard**

You are given a list of strings of the **same length**   *words*  and a string  *target* .

Your task is to form  *target*  using the given  *words*  under the following rules:

-  *target*  should be formed from left to right. 
- To form the  *ith*  character (**0-indexed** ) of  *target* , you can choose the  *kth*  character of the  *jth*  string in  *words*  if  *target[i] = words[j][k]* . 
- Once you use the  *kth*  character of the  *jth*  string of  *words* , you **can no longer**  use the  *xth*  character of any string in  *words*  where  *x <= k* . In other words, all characters to the left of or at index  *k*  become unusuable for every string. 
- Repeat the process until you form the string  *target* .

**Notice**  that you can use **multiple characters**  from the **same string**  in  *words*  provided the conditions above are met.

Return  *the number of ways to form target from words* . Since the answer may be too large, return it **modulo**   *109 + 7* .



**Example 1:** 

```
Input: words = ["acca","bbbb","caca"], target = "aba"
Output: 6
Explanation: There are 6 ways to form target.
"aba" -> index 0 ("acca"), index 1 ("bbbb"), index 3 ("caca")
"aba" -> index 0 ("acca"), index 2 ("bbbb"), index 3 ("caca")
"aba" -> index 0 ("acca"), index 1 ("bbbb"), index 3 ("acca")
"aba" -> index 0 ("acca"), index 2 ("bbbb"), index 3 ("acca")
"aba" -> index 1 ("caca"), index 2 ("bbbb"), index 3 ("acca")
"aba" -> index 1 ("caca"), index 2 ("bbbb"), index 3 ("caca")

```

**Example 2:** 

```
Input: words = ["abba","baab"], target = "bab"
Output: 4
Explanation: There are 4 ways to form target.
"bab" -> index 0 ("baab"), index 1 ("baab"), index 2 ("abba")
"bab" -> index 0 ("baab"), index 1 ("baab"), index 3 ("baab")
"bab" -> index 0 ("baab"), index 2 ("baab"), index 3 ("baab")
"bab" -> index 1 ("abba"), index 2 ("baab"), index 3 ("baab")

```

**Example 3:** 

```
Input: words = ["abcd"], target = "abcd"
Output: 1

```

**Example 4:** 

```
Input: words = ["abab","baba","abba","baab"], target = "abba"
Output: 16

```



**Constraints:** 

-  *1 <= words.length <= 1000*  
-  *1 <= words[i].length <= 1000*  
- All strings in  *words*  have the same length. 
-  *1 <= target.length <= 1000*  
-  *words[i]*  and  *target*  contain only lowercase English letters.


# [1639. 通过给定词典构造目标字符串的方案数][cnTitle]

**困难**

给你一个字符串列表  *words*  和一个目标字符串  *target*  。 *words*  中所有字符串都 **长度相同**  。

你的目标是使用给定的  *words*  字符串列表按照下述规则构造  *target*  ：

- 从左到右依次构造  *target*  的每一个字符。 
- 为了得到  *target*  第  *i*  个字符（下标从 **0**  开始），当  *target[i] = words[j][k]*  时，你可以使用  *words*  列表中第  *j*  个字符串的第  *k*  个字符。 
- 一旦你使用了  *words*  中第  *j*  个字符串的第  *k*  个字符，你不能再使用  *words*  字符串列表中任意单词的第  *x*  个字符（ *x <= k* ）。也就是说，所有单词下标小于等于  *k*  的字符都不能再被使用。 
- 请你重复此过程直到得到目标字符串  *target*  。

**请注意** ， 在构造目标字符串的过程中，你可以按照上述规定使用  *words*  列表中 **同一个字符串**  的 **多个字符**  。

请你返回使用  *words*  构造  *target*  的方案数。由于答案可能会很大，请对  *109 + 7*  **取余**  后返回。

（译者注：此题目求的是有多少个不同的  *k*  序列，详情请见示例。）



**示例 1：** 

```
输入：words = ["acca","bbbb","caca"], target = "aba"
输出：6
解释：总共有 6 种方法构造目标串。
"aba" -> 下标为 0 ("acca")，下标为 1 ("bbbb")，下标为 3 ("caca")
"aba" -> 下标为 0 ("acca")，下标为 2 ("bbbb")，下标为 3 ("caca")
"aba" -> 下标为 0 ("acca")，下标为 1 ("bbbb")，下标为 3 ("acca")
"aba" -> 下标为 0 ("acca")，下标为 2 ("bbbb")，下标为 3 ("acca")
"aba" -> 下标为 1 ("caca")，下标为 2 ("bbbb")，下标为 3 ("acca")
"aba" -> 下标为 1 ("caca")，下标为 2 ("bbbb")，下标为 3 ("caca")

```

**示例 2：** 

```
输入：words = ["abba","baab"], target = "bab"
输出：4
解释：总共有 4 种不同形成 target 的方法。
"bab" -> 下标为 0 ("baab")，下标为 1 ("baab")，下标为 2 ("abba")
"bab" -> 下标为 0 ("baab")，下标为 1 ("baab")，下标为 3 ("baab")
"bab" -> 下标为 0 ("baab")，下标为 2 ("baab")，下标为 3 ("baab")
"bab" -> 下标为 1 ("abba")，下标为 2 ("baab")，下标为 3 ("baab")

```

**示例 3：** 

```
输入：words = ["abcd"], target = "abcd"
输出：1

```

**示例 4：** 

```
输入：words = ["abab","baba","abba","baab"], target = "abba"
输出：16

```



**提示：** 

-  *1 <= words.length <= 1000*  
-  *1 <= words[i].length <= 1000*  
-  *words*  中所有单词长度相同。 
-  *1 <= target.length <= 1000*  
-  *words[i]*  和  *target*  都仅包含小写英文字母。




# 算法思路

# 测试用例
```
1639. Number of Ways to Form a Target String Given a Dictionary 1639. 通过给定词典构造目标字符串的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/
