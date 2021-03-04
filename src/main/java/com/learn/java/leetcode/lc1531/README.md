# [1531. String Compression II][enTitle]

**Hard**

Run-length encoding is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string  *"aabccc"*  we replace "aa" by "a2" and replace "ccc" by "c3". Thus the compressed string becomes "a2bc3".

Notice that in this problem, we are not adding  *'1'*  after single characters.

Given a string  *s*  and an integer  *k* . You need to delete **at most**   *k*  characters from  *s*  such that the run-length encoded version of  *s*  has minimum length.

Find the  *minimum length of the run-length encoded version of*  *s*  *after deleting at most*  *k*  *characters* .



**Example 1:** 

```
Input: s = "aaabcccd", k = 2
Output: 4
Explanation:Compressing s without deleting anything will give us "a3bc3d" of length 6. Deleting any of the characters 'a' or 'c' would at most decrease the length of the compressed string to 5, for instance delete 2 'a' then we will have s = "abcccd" which compressed is abc3d. Therefore, the optimal way is to delete 'b' and 'd', then the compressed version of s will be "a3c3" of length 4.
```

**Example 2:** 

```
Input: s = "aabbaa", k = 2
Output: 2
Explanation:If we delete both 'b' characters, the resulting compressed string would be "a4" of length 2.

```

**Example 3:** 

```
Input: s = "aaaaaaaaaaa", k = 0
Output: 3
Explanation:Since k is zero, we cannot delete anything. The compressed string is "a11" of length 3.

```



**Constraints:** 

-  *1 <= s.length <= 100*  
-  *0 <= k <= s.length*  
-  *s*  contains only lowercase English letters.


# [1531. 压缩字符串 II][cnTitle]

**困难**

行程长度编码 是一种常用的字符串压缩方法，它将连续的相同字符（重复 2 次或更多次）替换为字符和表示字符计数的数字（行程长度）。例如，用此方法压缩字符串  *"aabccc"*  ，将  *"aa"*  替换为  *"a2"*  ， *"ccc"*  替换为`  *"c3"*  。因此压缩后的字符串变为  *"a2bc3"*  。

注意，本问题中，压缩时没有在单个字符后附加计数  *'1'*  。

给你一个字符串  *s*  和一个整数  *k*  。你需要从字符串  *s*  中删除最多  *k*  个字符，以使  *s*  的行程长度编码长度最小。

请你返回删除最多  *k*  个字符后， *s*  **行程长度编码的最小长度**  。



**示例 1：** 

```
输入：s = "aaabcccd", k = 2
输出：4
解释：在不删除任何内容的情况下，压缩后的字符串是 "a3bc3d" ，长度为 6 。最优的方案是删除 'b' 和 'd'，这样一来，压缩后的字符串为 "a3c3" ，长度是 4 。
```

**示例 2：** 

```
输入：s = "aabbaa", k = 2
输出：2
解释：如果删去两个 'b' 字符，那么压缩后的字符串是长度为 2 的 "a4" 。

```

**示例 3：** 

```
输入：s = "aaaaaaaaaaa", k = 0
输出：3
解释：由于 k 等于 0 ，不能删去任何字符。压缩后的字符串是 "a11" ，长度为 3 。

```



**提示：** 

-  *1 <= s.length <= 100*  
-  *0 <= k <= s.length*  
-  *s*  仅包含小写英文字母




# 算法思路

# 测试用例
```
1531. String Compression II 1531. 压缩字符串 II Hard
```

[enTitle]: https://leetcode.com/problems/string-compression-ii/
[cnTitle]: https://leetcode-cn.com/problems/string-compression-ii/
