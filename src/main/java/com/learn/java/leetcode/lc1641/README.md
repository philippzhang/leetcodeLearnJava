# [1641. Count Sorted Vowel Strings][enTitle]

**Medium**

Given an integer  *n* , return  *the number of strings of length*  *n*  *that consist only of vowels (*  *a*  *,*  *e*  *,*  *i*  *,*  *o*  *,*  *u*  *) and are lexicographically sorted.* 

A string  *s*  is **lexicographically sorted**  if for all valid  *i* ,  *s[i]*  is the same as or comes before  *s[i+1]*  in the alphabet.



**Example 1:** 

```
Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].

```

**Example 2:** 

```
Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

```

**Example 3:** 

```
Input: n = 33
Output: 66045

```



**Constraints:** 

-  *1 <= n <= 50*  


# [1641. 统计字典序元音字符串的数目][cnTitle]

**中等**

给你一个整数  *n* ，请返回长度为  *n*  、仅由元音 ( *a* ,  *e* ,  *i* ,  *o* ,  *u* ) 组成且按 **字典序排列**  的字符串数量。

字符串  *s*  按 **字典序排列**  需要满足：对于所有有效的  *i* ， *s[i]*  在字母表中的位置总是与  *s[i+1]*  相同或在  *s[i+1]*  之前。



**示例 1：** 

```
输入：n = 1
输出：5
解释：仅由元音组成的 5 个字典序字符串为 ["a","e","i","o","u"]

```

**示例 2：** 

```
输入：n = 2
输出：15
解释：仅由元音组成的 15 个字典序字符串为
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]
注意，"ea" 不是符合题意的字符串，因为 'e' 在字母表中的位置比 'a' 靠后

```

**示例 3：** 

```
输入：n = 33
输出：66045

```



**提示：** 

-  *1 <= n <= 50*  




# 算法思路

# 测试用例
```
1641. Count Sorted Vowel Strings 1641. 统计字典序元音字符串的数目 Medium
```

[enTitle]: https://leetcode.com/problems/count-sorted-vowel-strings/
[cnTitle]: https://leetcode-cn.com/problems/count-sorted-vowel-strings/
