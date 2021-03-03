# [890. Find and Replace Pattern][enTitle]

**Medium**

You have a list of  *words*  and a  *pattern* , and you want to know which words in  *words*  matches the pattern.

A word matches the pattern if there exists a permutation of letters  *p*  so that after replacing every letter  *x*  in the pattern with  *p(x)* , we get the desired word.

( *Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.* )

Return a list of the words in  *words*  that match the given pattern.

You may return the answer in any order.




**Example 1:** 

```
Input:words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.
```



**Note:** 

-  *1 <= words.length <= 50*  
-  *1 <= pattern.length = words[i].length <= 20* 




# [890. 查找和替换模式][cnTitle]

**中等**

你有一个单词列表  *words*  和一个模式  *pattern* ，你想知道  *words*  中的哪些单词与模式匹配。

如果存在字母的排列  *p*  ，使得将模式中的每个字母  *x*  替换为  *p(x)*  之后，我们就得到了所需的单词，那么单词与模式是匹配的。

 *（回想一下，字母的排列是从字母到字母的双射：每个字母映射到另一个字母，没有两个字母映射到同一个字母。）* 

返回  *words*  中与给定模式匹配的单词列表。

你可以按任何顺序返回答案。



**示例：** 

```
输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
输出：["mee","aqq"]
解释："mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
"ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
因为 a 和 b 映射到同一个字母。
```



**提示：** 

-  *1 <= words.length <= 50*  
-  *1 <= pattern.length = words[i].length <= 20* 




# 算法思路

# 测试用例
```
890. Find and Replace Pattern 890. 查找和替换模式 Medium
```

[enTitle]: https://leetcode.com/problems/find-and-replace-pattern/
[cnTitle]: https://leetcode-cn.com/problems/find-and-replace-pattern/
