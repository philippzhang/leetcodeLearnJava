# [1405. Longest Happy String][enTitle]

**Medium**

A string is called  *happy*  if it does not have any of the strings  *'aaa'* ,  *'bbb'*  or  *'ccc'*  as a substring.

Given three integers  *a* ,  *b*  and  *c* , return **any**  string  *s* , which satisfies following conditions:

-  *s*  is  *happy* and longest possible. 
-  *s*  contains **at most**   *a*  occurrences of the letter  *'a'* , **at most**   *b*  occurrences of the letter  *'b'*  and **at most**   *c*  occurrences of the letter  *'c'* . 
-  *s* will only contain  *'a'* ,  *'b'*  and  *'c'*  letters.

If there is no such string  *s*  return the empty string  *""* .



**Example 1:** 

```
Input: a = 1, b = 1, c = 7
Output: "ccaccbcc"
Explanation: "ccbccacc" would also be a correct answer.

```

**Example 2:** 

```
Input: a = 2, b = 2, c = 1
Output: "aabbc"

```

**Example 3:** 

```
Input: a = 7, b = 1, c = 0
Output: "aabaa"
Explanation: It's the only correct answer in this case.

```



**Constraints:** 

-  *0 <= a, b, c <= 100*  
-  *a + b + c > 0* 


# [1405. 最长快乐字符串][cnTitle]

**中等**

如果字符串中不含有任何  *'aaa'* ， *'bbb'*  或  *'ccc'*  这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。

给你三个整数  *a* ， *b*  ， *c* ，请你返回 **任意一个**  满足下列全部条件的字符串  *s* ：

-  *s*  是一个尽可能长的快乐字符串。 
-  *s*  中 **最多**  有 *a*  个字母  *'a'* 、 *b*  个字母  *'b'* 、 *c*  个字母  *'c'*  。 
-  *s* 中只含有  *'a'* 、 *'b'*  、 *'c'*  三种字母。

如果不存在这样的字符串  *s*  ，请返回一个空字符串  *""* 。



**示例 1：** 

```
输入：a = 1, b = 1, c = 7
输出："ccaccbcc"
解释："ccbccacc" 也是一种正确答案。

```

**示例 2：** 

```
输入：a = 2, b = 2, c = 1
输出："aabbc"

```

**示例 3：** 

```
输入：a = 7, b = 1, c = 0
输出："aabaa"
解释：这是该测试用例的唯一正确答案。
```



**提示：** 

-  *0 <= a, b, c <= 100*  
-  *a + b + c > 0* 




# 算法思路

# 测试用例
```
1405. Longest Happy String 1405. 最长快乐字符串 Medium
```

[enTitle]: https://leetcode.com/problems/longest-happy-string/
[cnTitle]: https://leetcode-cn.com/problems/longest-happy-string/
