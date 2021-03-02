# [854. K-Similar Strings][enTitle]

**Hard**

Strings  *A*  and  *B*  are  *K* -similar (for some non-negative integer  *K* ) if we can swap the positions of two letters in  *A*  exactly  *K*  times so that the resulting string equals  *B* .

Given two anagrams  *A*  and  *B* , return the smallest  *K*  for which  *A*  and  *B*  are  *K* -similar.

**Example 1:** 

```
Input:A = "ab", B = "ba"
Output: 1
```


**Example 2:** 

```
Input:A = "abc", B = "bca"
Output: 2
```


**Example 3:** 

```
Input:A = "abac", B = "baca"
Output: 2
```


**Example 4:** 

```
Input:A = "aabc", B = "abca"
Output: 2
```







**Note:** 

1.  *1 <= A.length == B.length <= 20*  
2.  *A*  and  *B*  contain only lowercase letters from the set  *{'a', 'b', 'c', 'd', 'e', 'f'}* 


# [854. 相似度为 K 的字符串][cnTitle]

**困难**

如果可以通过将  *A*  中的两个小写字母精确地交换位置  *K*  次得到与  *B*  相等的字符串，我们称字符串  *A*  和  *B*  的相似度为  *K* （ *K*  为非负整数）。

给定两个字母异位词  *A*  和  *B*  ，返回  *A*  和  *B*  的相似度  *K*  的最小值。



**示例 1：** 

```
输入：A = "ab", B = "ba"
输出：1

```

**示例 2：** 

```
输入：A = "abc", B = "bca"
输出：2

```

**示例 3：** 

```
输入：A = "abac", B = "baca"
输出：2

```

**示例 4：** 

```
输入：A = "aabc", B = "abca"
输出：2
```



**提示：** 

1.  *1 <= A.length == B.length <= 20*  
2.  *A*  和  *B*  只包含集合  *{'a', 'b', 'c', 'd', 'e', 'f'}*  中的小写字母。




# 算法思路

# 测试用例
```
854. K-Similar Strings 854. 相似度为 K 的字符串 Hard
```

[enTitle]: https://leetcode.com/problems/k-similar-strings/
[cnTitle]: https://leetcode-cn.com/problems/k-similar-strings/
