# [472. Concatenated Words][enTitle]

**Hard**

Given an array of strings  *words*  (**without duplicates** ), return  *all the concatenated words in the given list of*   *words* .

A **concatenated word**  is defined as a string that is comprised entirely of at least two shorter words in the given array.



**Example 1:** 

```
Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
```

**Example 2:** 

```
Input: words = ["cat","dog","catdog"]
Output: ["catdog"]

```



**Constraints:** 

-  *1 <= words.length <= 104*  
-  *0 <= words[i].length <= 1000*  
-  *words[i]*  consists of only lowercase English letters. 
-  *0 <= sum(words[i].length) <= 6 * 105* 


# [472. 连接词][cnTitle]

**困难**

给定一个 **不含重复** 单词的字符串数组  *words*  ，编写一个程序，返回  *words*  中的所有 **连接词**  。

**连接词**  的定义为：一个字符串完全是由至少两个给定数组中的单词组成的。



**示例 1：** 

```
输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
解释："catsdogcats"由"cats", "dog" 和 "cats"组成; 
     "dogcatsdog"由"dog", "cats"和"dog"组成; 
     "ratcatdogcat"由"rat", "cat", "dog"和"cat"组成。

```

**示例 2：** 

```
输入：words = ["cat","dog","catdog"]
输出：["catdog"]
```



**提示：** 

-  *1 <= words.length <= 104*  
-  *0 <= words[i].length <= 1000*  
-  *words[i]*  仅由小写字母组成 
-  *0 <= sum(words[i].length) <= 6 * 105* 




# 算法思路

# 测试用例
```
472. Concatenated Words 472. 连接词 Hard
```

[enTitle]: https://leetcode.com/problems/concatenated-words/
[cnTitle]: https://leetcode-cn.com/problems/concatenated-words/
