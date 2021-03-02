# [467. Unique Substrings in Wraparound String][enTitle]

**Medium**

Consider the string  *s*  to be the infinite wraparound string of "abcdefghijklmnopqrstuvwxyz", so  *s*  will look like this: "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".

Now we have another string  *p* . Your job is to find out how many unique non-empty substrings of  *p*  are present in  *s* . In particular, your input is the string  *p*  and you need to output the number of different non-empty substrings of  *p*  in the string  *s* .

Note:  *p*  consists of only lowercase English letters and the size of p might be over 10000.

Example 1:

```
Input: "a"
Output: 1

Explanation: Only the substring "a" of string "a" is in the string s.

```



Example 2:

```
Input: "cac"
Output: 2
Explanation: There are two substrings "a", "c" of string "cac" in the string s.

```



Example 3:

```
Input: "zab"
Output: 6
Explanation: There are six substrings "z", "a", "b", "za", "ab", "zab" of string "zab" in the string s.

```




# [467. 环绕字符串中唯一的子字符串][cnTitle]

**中等**

把字符串  *s*  看作是“abcdefghijklmnopqrstuvwxyz”的无限环绕字符串，所以  *s*  看起来是这样的："...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".

现在我们有了另一个字符串  *p*  。你需要的是找出  *s*  中有多少个唯一的  *p*  的非空子串，尤其是当你的输入是字符串  *p*  ，你需要输出字符串  *s*  中  *p*  的不同的非空子串的数目。

**注意:**   *p*  仅由小写的英文字母组成，p 的大小可能超过 10000。



**示例 1:** 

```
输入: "a"
输出: 1
解释: 字符串 S 中只有一个"a"子字符。

```



**示例 2:** 

```
输入: "cac"
输出: 2
解释: 字符串 S 中的字符串“cac”只有两个子串“a”、“c”。.

```



**示例 3:** 

```
输入: "zab"
输出: 6
解释: 在字符串 S 中有六个子串“z”、“a”、“b”、“za”、“ab”、“zab”。.

```






# 算法思路

# 测试用例
```
467. Unique Substrings in Wraparound String 467. 环绕字符串中唯一的子字符串 Medium
```

[enTitle]: https://leetcode.com/problems/unique-substrings-in-wraparound-string/
[cnTitle]: https://leetcode-cn.com/problems/unique-substrings-in-wraparound-string/
