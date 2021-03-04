# [1147. Longest Chunked Palindrome Decomposition][enTitle]

**Hard**

You are given a string  *text* . You should split it to k substrings  *(subtext1, subtext2, ..., subtextk)*  such that:

-  *subtexti*  is a **non-empty**  string. 
- The concatenation of all the substrings is equal to  *text*  (i.e.,  *subtext1 + subtext2 + ... + subtextk == text* ). 
-  *subtexti == subtextk - i + 1*  for all valid values of  *i*  (i.e.,  *1 <= i <= k* ).

Return the largest possible value of  *k* .



**Example 1:** 

```
Input: text = "ghiabcdefhelloadamhelloabcdefghi"
Output: 7
Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".

```

**Example 2:** 

```
Input: text = "merchant"
Output: 1
Explanation: We can split the string on "(merchant)".

```

**Example 3:** 

```
Input: text = "antaprezatepzapreanta"
Output: 11
Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)".

```

**Example 4:** 

```
Input: text = "aaa"
Output: 3
Explanation: We can split the string on "(a)(a)(a)".

```



**Constraints:** 

-  *1 <= text.length <= 1000*  
-  *text*  consists only of lowercase English characters.


# [1147. 段式回文][cnTitle]

**困难**

段式回文 其实与 一般回文 类似，只不过是最小的单位是 一段字符 而不是 单个字母。

举个例子，对于一般回文 " *abcba* " 是回文，而 " *volvo* " 不是，但如果我们把 " *volvo* " 分为 " *vo* "、" *l* "、" *vo* " 三段，则可以认为 “ *(vo)(l)(vo)* ” 是段式回文（分为 3 段）。



给你一个字符串  *text* ，在确保它满足段式回文的前提下，请你返回 **段**  的 **最大数量**   *k* 。

如果段的最大数量为  *k* ，那么存在满足以下条件的  *a_1, a_2, ..., a_k* ：

- 每个  *a_i*  都是一个非空字符串； 
- 将这些字符串首位相连的结果  *a_1 + a_2 + ... + a_k*  和原始字符串  *text*  相同； 
- 对于所有 *1 <= i <= k* ，都有  *a_i = a_{k+1 - i}* 。



**示例 1：** 

```
输入：text = "ghiabcdefhelloadamhelloabcdefghi"
输出：7
解释：我们可以把字符串拆分成 "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)"。

```

**示例 2：** 

```
输入：text = "merchant"
输出：1
解释：我们可以把字符串拆分成 "(merchant)"。

```

**示例 3：** 

```
输入：text = "antaprezatepzapreanta"
输出：11
解释：我们可以把字符串拆分成 "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)"。

```

**示例 4：** 

```
输入：text = "aaa"
输出：3
解释：我们可以把字符串拆分成 "(a)(a)(a)"。

```



**提示：** 

-  *text*  仅由小写英文字符组成。 
-  *1 <= text.length <= 1000* 




# 算法思路

# 测试用例
```
1147. Longest Chunked Palindrome Decomposition 1147. 段式回文 Hard
```

[enTitle]: https://leetcode.com/problems/longest-chunked-palindrome-decomposition/
[cnTitle]: https://leetcode-cn.com/problems/longest-chunked-palindrome-decomposition/
