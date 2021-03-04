# [1415. The k-th Lexicographical String of All Happy Strings of Length n][enTitle]

**Medium**

A **happy string**  is a string that:

- consists only of letters of the set  *['a', 'b', 'c']* . 
-  *s[i] != s[i + 1]*  for all values of  *i*  from  *1*  to  *s.length - 1*  (string is 1-indexed).

For example, strings **"abc", "ac", "b"**  and **"abcbabcbcb"**  are all happy strings and strings **"aa", "baa"**  and **"ababbc"**  are not happy strings.

Given two integers  *n*  and  *k* , consider a list of all happy strings of length  *n*  sorted in lexicographical order.

Return  *the kth string*  of this list or return an **empty string**  if there are less than  *k*  happy strings of length  *n* .



**Example 1:** 

```
Input: n = 1, k = 3
Output: "c"
Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".

```

**Example 2:** 

```
Input: n = 1, k = 4
Output: ""
Explanation: There are only 3 happy strings of length 1.

```

**Example 3:** 

```
Input: n = 3, k = 9
Output: "cab"
Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"

```

**Example 4:** 

```
Input: n = 2, k = 7
Output: ""

```

**Example 5:** 

```
Input: n = 10, k = 100
Output: "abacbabacb"

```



**Constraints:** 

-  *1 <= n <= 10*  
-  *1 <= k <= 100* 





# [1415. 长度为 n 的开心字符串中字典序第 k 小的字符串][cnTitle]

**中等**

一个 「开心字符串」定义为：

- 仅包含小写字母  *['a', 'b', 'c']* . 
- 对所有在  *1*  到  *s.length - 1*  之间的  *i*  ，满足  *s[i] != s[i + 1]*  （字符串的下标从 1 开始）。

比方说，字符串 **"abc"** ，**"ac"，"b"**  和 **"abcbabcbcb"**  都是开心字符串，但是 **"aa"** ，**"baa"**  和 **"ababbc"**  都不是开心字符串。

给你两个整数  *n*  和  *k*  ，你需要将长度为  *n*  的所有开心字符串按字典序排序。

请你返回排序后的第 k 个开心字符串，如果长度为  *n*  的开心字符串少于  *k*  个，那么请你返回 **空字符串**  。



**示例 1：** 

```
输入：n = 1, k = 3
输出："c"
解释：列表 ["a", "b", "c"] 包含了所有长度为 1 的开心字符串。按照字典序排序后第三个字符串为 "c" 。

```

**示例 2：** 

```
输入：n = 1, k = 4
输出：""
解释：长度为 1 的开心字符串只有 3 个。

```

**示例 3：** 

```
输入：n = 3, k = 9
输出："cab"
解释：长度为 3 的开心字符串总共有 12 个 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"] 。第 9 个字符串为 "cab"

```

**示例 4：** 

```
输入：n = 2, k = 7
输出：""

```

**示例 5：** 

```
输入：n = 10, k = 100
输出："abacbabacb"

```



**提示：** 

-  *1 <= n <= 10*  
-  *1 <= k <= 100* 






# 算法思路

# 测试用例
```
1415. The k-th Lexicographical String of All Happy Strings of Length n 1415. 长度为 n 的开心字符串中字典序第 k 小的字符串 Medium
```

[enTitle]: https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
[cnTitle]: https://leetcode-cn.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
