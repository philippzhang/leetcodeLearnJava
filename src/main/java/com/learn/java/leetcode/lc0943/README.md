# [943. Find the Shortest Superstring][enTitle]

**Hard**

Given an array of strings  *words* , return  *the smallest string that contains each string in*   *words*   *as a substring* . If there are multiple valid strings of the smallest length, return **any of them** .

You may assume that no string in  *words*  is a substring of another string in  *words* .



**Example 1:** 

```
Input: words = ["alex","loves","leetcode"]
Output: "alexlovesleetcode"
Explanation: All permutations of "alex","loves","leetcode" would also be accepted.

```

**Example 2:** 

```
Input: words = ["catg","ctaagt","gcta","ttca","atgcatc"]
Output: "gctaagttcatgcatc"

```



**Constraints:** 

-  *1 <= words.length <= 12*  
-  *1 <= words[i].length <= 20*  
-  *words[i]*  consists of lowercase English letters. 
- All the strings of  *words*  are **unique** .


# [943. 最短超级串][cnTitle]

**困难**

给定一个字符串数组  *words* ，找到以  *words*  中每个字符串作为子字符串的最短字符串。如果有多个有效最短字符串满足题目条件，返回其中 **任意一个**  即可。

我们可以假设  *words*  中没有字符串是  *words*  中另一个字符串的子字符串。



**示例 1：** 

```
输入：words = ["alex","loves","leetcode"]
输出："alexlovesleetcode"
解释："alex"，"loves"，"leetcode" 的所有排列都会被接受。
```

**示例 2：** 

```
输入：words = ["catg","ctaagt","gcta","ttca","atgcatc"]
输出："gctaagttcatgcatc"
```



**提示：** 

-  *1 <= words.length <= 12*  
-  *1 <= words[i].length <= 20*  
-  *words[i]*  由小写英文字母组成 
-  *words*  中的所有字符串 **互不相同** 




# 算法思路

# 测试用例
```
943. Find the Shortest Superstring 943. 最短超级串 Hard
```

[enTitle]: https://leetcode.com/problems/find-the-shortest-superstring/
[cnTitle]: https://leetcode-cn.com/problems/find-the-shortest-superstring/
