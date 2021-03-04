# [1170. Compare Strings by Frequency of the Smallest Character][enTitle]

**Medium**

Let the function  *f(s)*  be the **frequency of the lexicographically smallest character**  in a non-empty string  *s* . For example, if  *s = "dcce"*  then  *f(s) = 2*  because the lexicographically smallest character is  *'c'* , which has a frequency of 2.

You are given an array of strings  *words*  and another array of query strings  *queries* . For each query  *queries[i]* , count the **number of words**  in  *words*  such that  *f(queries[i])*  <  *f(W)*  for each  *W*  in  *words* .

Return  *an integer array*  *answer*  *, where each*  *answer[i]*  *is the answer to the*  *ith*  *query* .



**Example 1:** 

```
Input: queries = ["cbd"], words = ["zaaaz"]
Output: [1]
Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").

```

**Example 2:** 

```
Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
Output: [1,2]
Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").

```



**Constraints:** 

-  *1 <= queries.length <= 2000*  
-  *1 <= words.length <= 2000*  
-  *1 <= queries[i].length, words[i].length <= 10*  
-  *queries[i][j]* ,  *words[i][j]*  consist of lowercase English letters.


# [1170. 比较字符串最小字母出现频次][cnTitle]

**中等**

定义一个函数  *f(s)* ，统计  *s*  中**（按字典序比较）最小字母的出现频次**  ，其中  *s*  是一个非空字符串。

例如，若  *s = "dcce"* ，那么  *f(s) = 2* ，因为字典序最小字母是  *"c"* ，它出现了 2 次。

现在，给你两个字符串数组待查表  *queries*  和词汇表  *words*  。对于每次查询  *queries[i]*  ，需统计  *words*  中满足  *f(queries[i])*  <  *f(W)*  的**词的数目**  ， *W*  表示词汇表  *words*  中的每个词。

请你返回一个整数数组  *answer*  作为答案，其中每个  *answer[i]*  是第  *i*  次查询的结果。



**示例 1：** 

```
输入：queries = ["cbd"], words = ["zaaaz"]
输出：[1]
解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。

```

**示例 2：** 

```
输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
输出：[1,2]
解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。

```



**提示：** 

-  *1 <= queries.length <= 2000*  
-  *1 <= words.length <= 2000*  
-  *1 <= queries[i].length, words[i].length <= 10*  
-  *queries[i][j]* 、 *words[i][j]*  都由小写英文字母组成




# 算法思路

# 测试用例
```
1170. Compare Strings by Frequency of the Smallest Character 1170. 比较字符串最小字母出现频次 Medium
```

[enTitle]: https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
[cnTitle]: https://leetcode-cn.com/problems/compare-strings-by-frequency-of-the-smallest-character/
