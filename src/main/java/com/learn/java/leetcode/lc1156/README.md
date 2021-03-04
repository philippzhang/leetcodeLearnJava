# [1156. Swap For Longest Repeated Character Substring][enTitle]

**Medium**

Given a string  *text* , we are allowed to swap two of the characters in the string. Find the length of the longest substring with repeated characters.



**Example 1:** 

```
Input: text = "ababa"
Output: 3
Explanation: We can swap the first 'b' with the last 'a', or the last 'b' with the first 'a'. Then, the longest repeated character substring is "aaa", which its length is 3.

```

**Example 2:** 

```
Input: text = "aaabaaa"
Output: 6
Explanation: Swap 'b' with the last 'a' (or the first 'a'), and we get longest repeated character substring "aaaaaa", which its length is 6.

```

**Example 3:** 

```
Input: text = "aaabbaaa"
Output: 4

```

**Example 4:** 

```
Input: text = "aaaaa"
Output: 5
Explanation: No need to swap, longest repeated character substring is "aaaaa", length is 5.

```

**Example 5:** 

```
Input: text = "abcdef"
Output: 1

```



**Constraints:** 

-  *1 <= text.length <= 20000*  
-  *text*  consist of lowercase English characters only.


# [1156. 单字符重复子串的最大长度][cnTitle]

**中等**

如果字符串中的所有字符都相同，那么这个字符串是单字符重复的字符串。

给你一个字符串  *text* ，你只能交换其中两个字符一次或者什么都不做，然后得到一些单字符重复的子串。返回其中最长的子串的长度。



**示例 1：** 

```
输入：text = "ababa"
输出：3

```

**示例 2：** 

```
输入：text = "aaabaaa"
输出：6

```

**示例 3：** 

```
输入：text = "aaabbaaa"
输出：4

```

**示例 4：** 

```
输入：text = "aaaaa"
输出：5

```

**示例 5：** 

```
输入：text = "abcdef"
输出：1

```



**提示：** 

-  *1 <= text.length <= 20000*  
-  *text*  仅由小写英文字母组成。




# 算法思路

# 测试用例
```
1156. Swap For Longest Repeated Character Substring 1156. 单字符重复子串的最大长度 Medium
```

[enTitle]: https://leetcode.com/problems/swap-for-longest-repeated-character-substring/
[cnTitle]: https://leetcode-cn.com/problems/swap-for-longest-repeated-character-substring/
