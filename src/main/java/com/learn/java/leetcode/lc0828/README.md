# [828. Count Unique Characters of All Substrings of a Given String][enTitle]

**Hard**

Let's define a function  *countUniqueChars(s)*  that returns the number of unique characters on  *s* , for example if  *s = "LEETCODE"*  then  *"L"* ,  *"T"* , *"C"* , *"O"* , *"D"*  are the unique characters since they appear only once in  *s* , therefore  *countUniqueChars(s) = 5* .  On this problem given a string  *s*  we need to return the sum of  *countUniqueChars(t)*  where  *t*  is a substring of  *s* . Notice that some substrings can be repeated so on this case you have to count the repeated ones too.

Since the answer can be very large, return the answer modulo  *10 ^ 9 + 7* .



**Example 1:** 

```
Input: s = "ABC"
Output: 10
Explanation:All possible substrings are: "A","B","C","AB","BC" and "ABC".
Evey substring is composed with only unique letters.
Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10

```

**Example 2:** 

```
Input: s = "ABA"
Output: 8
Explanation:The same as example 1, except countUniqueChars("ABA") = 1.

```

**Example 3:** 

```
Input: s = "LEETCODE"
Output: 92

```



**Constraints:** 

-  *0 <= s.length <= 10^4*  
-  *s*  contain upper-case English letters only.


# [828. 统计子串中的唯一字符][cnTitle]

**困难**

我们定义了一个函数  *countUniqueChars(s)*  来统计字符串  *s*  中的唯一字符，并返回唯一字符的个数。

例如： *s = "LEETCODE"*  ，则其中  *"L"* ,  *"T"* , *"C"* , *"O"* , *"D"*  都是唯一字符，因为它们只出现一次，所以  *countUniqueChars(s) = 5*  。

本题将会给你一个字符串  *s*  ，我们需要返回  *countUniqueChars(t)*  的总和，其中  *t*  是  *s*  的子字符串。注意，某些子字符串可能是重复的，但你统计时也必须算上这些重复的子字符串（也就是说，你必须统计  *s*  的所有子字符串中的唯一字符）。

由于答案可能非常大，请将结果 **mod 10 ^ 9 + 7**  后再返回。



**示例 1：** 

```
输入:s = "ABC"
输出:10
解释: 所有可能的子串为："A","B","C","AB","BC" 和 "ABC"。
     其中，每一个子串都由独特字符构成。
     所以其长度总和为：1 + 1 + 1 + 2 + 2 + 3 = 10

```

**示例 2：** 

```
输入:s = "ABA"
输出:8
解释:除了 countUniqueChars("ABA") = 1 之外，其余与示例 1 相同。

```

**示例 3：** 

```
输入：s = "LEETCODE"
输出：92

```



**提示：** 

-  *0 <= s.length <= 10^4*  
-  *s*  只包含大写英文字符




# 算法思路

# 测试用例
```
828. Count Unique Characters of All Substrings of a Given String 828. 统计子串中的唯一字符 Hard
```

[enTitle]: https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
[cnTitle]: https://leetcode-cn.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
