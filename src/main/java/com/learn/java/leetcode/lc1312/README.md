# [1312. Minimum Insertion Steps to Make a String Palindrome][enTitle]

**Hard**

Given a string  *s* . In one step you can insert any character at any index of the string.

Return  *the minimum number of steps*  to make  *s*  palindrome.

A Palindrome String is one that reads the same backward as well as forward.



**Example 1:** 

```
Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we don't need any insertions.

```

**Example 2:** 

```
Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".

```

**Example 3:** 

```
Input: s = "leetcode"
Output: 5
Explanation: Inserting 5 characters the string becomes "leetcodocteel".

```

**Example 4:** 

```
Input: s = "g"
Output: 0

```

**Example 5:** 

```
Input: s = "no"
Output: 1

```



**Constraints:** 

-  *1 <= s.length <= 500*  
- All characters of  *s*  are lower case English letters.


# [1312. 让字符串成为回文串的最少插入次数][cnTitle]

**困难**

给你一个字符串  *s*  ，每一次操作你都可以在字符串的任意位置插入任意字符。

请你返回让  *s*  成为回文串的 **最少操作次数**  。

「回文串」是正读和反读都相同的字符串。



**示例 1：** 

```
输入：s = "zzazz"
输出：0
解释：字符串 "zzazz" 已经是回文串了，所以不需要做任何插入操作。

```

**示例 2：** 

```
输入：s = "mbadm"
输出：2
解释：字符串可变为 "mbdadbm" 或者 "mdbabdm" 。

```

**示例 3：** 

```
输入：s = "leetcode"
输出：5
解释：插入 5 个字符后字符串变为 "leetcodocteel" 。

```

**示例 4：** 

```
输入：s = "g"
输出：0

```

**示例 5：** 

```
输入：s = "no"
输出：1

```



**提示：** 

-  *1 <= s.length <= 500*  
-  *s*  中所有字符都是小写字母。




# 算法思路

# 测试用例
```
1312. Minimum Insertion Steps to Make a String Palindrome 1312. 让字符串成为回文串的最少插入次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
[cnTitle]: https://leetcode-cn.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
