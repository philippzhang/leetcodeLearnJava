# [966. Vowel Spellchecker][enTitle]

**Medium**

Given a  *wordlist* , we want to implement a spellchecker that converts a query word into a correct word.

For a given  *query*  word, the spell checker handles two categories of spelling mistakes:

- Capitalization: If the query matches a word in the wordlist (**case-insensitive** ), then the query word is returned with the same case as the case in the wordlist. 
 <ul> 
  - Example:  *wordlist = ["yellow"]* ,  *query = "YellOw"* :  *correct = "yellow"*  
  - Example:  *wordlist = ["Yellow"]* ,  *query = "yellow"* :  *correct = "Yellow"*  
  - Example:  *wordlist = ["yellow"]* ,  *query = "yellow"* :  *correct = "yellow"*  
 </ul>  
- Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually, it matches a word in the wordlist (**case-insensitive** ), then the query word is returned with the same case as the match in the wordlist. 
 <ul> 
  - Example:  *wordlist = ["YellOw"]* ,  *query = "yollow"* :  *correct = "YellOw"*  
  - Example:  *wordlist = ["YellOw"]* ,  *query = "yeellow"* :  *correct = ""*  (no match) 
  - Example:  *wordlist = ["YellOw"]* ,  *query = "yllw"* :  *correct = ""*  (no match) 
 </ul> 

In addition, the spell checker operates under the following precedence rules:

- When the query exactly matches a word in the wordlist (**case-sensitive** ), you should return the same word back. 
- When the query matches a word up to capitlization, you should return the first such match in the wordlist. 
- When the query matches a word up to vowel errors, you should return the first such match in the wordlist. 
- If the query has no matches in the wordlist, you should return the empty string.

Given some  *queries* , return a list of words  *answer* , where  *answer[i]*  is the correct word for  *query = queries[i]* .



**Example 1:** 

```
Input:wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
```



**Note:** 

-  *1 <= wordlist.length <= 5000*  
-  *1 <= queries.length <= 5000*  
-  *1 <= wordlist[i].length <= 7*  
-  *1 <= queries[i].length <= 7*  
- All strings in  *wordlist*  and  *queries*  consist only of **english**  letters.


# [966. 元音拼写检查器][cnTitle]

**中等**

在给定单词列表  *wordlist*  的情况下，我们希望实现一个拼写检查器，将查询单词转换为正确的单词。

对于给定的查询单词  *query* ，拼写检查器将会处理两类拼写错误：

- 大小写：如果查询匹配单词列表中的某个单词（**不区分大小写** ），则返回的正确单词与单词列表中的大小写相同。 
 <ul> 
  - 例如： *wordlist = ["yellow"]* ,  *query = "YellOw"* :  *correct = "yellow"*  
  - 例如： *wordlist = ["Yellow"]* ,  *query = "yellow"* :  *correct = "Yellow"*  
  - 例如： *wordlist = ["yellow"]* ,  *query = "yellow"* :  *correct = "yellow"*  
 </ul>  
- 元音错误：如果在将查询单词中的元音（‘a’、‘e’、‘i’、‘o’、‘u’）分别替换为任何元音后，能与单词列表中的单词匹配（**不区分大小写** ），则返回的正确单词与单词列表中的匹配项大小写相同。 
 <ul> 
  - 例如： *wordlist = ["YellOw"]* ,  *query = "yollow"* :  *correct = "YellOw"*  
  - 例如： *wordlist = ["YellOw"]* ,  *query = "yeellow"* :  *correct = ""*  （无匹配项） 
  - 例如： *wordlist = ["YellOw"]* ,  *query = "yllw"* :  *correct = ""*  （无匹配项） 
 </ul> 

此外，拼写检查器还按照以下优先级规则操作：

- 当查询完全匹配单词列表中的某个单词（**区分大小写** ）时，应返回相同的单词。 
- 当查询匹配到大小写问题的单词时，您应该返回单词列表中的第一个这样的匹配项。 
- 当查询匹配到元音错误的单词时，您应该返回单词列表中的第一个这样的匹配项。 
- 如果该查询在单词列表中没有匹配项，则应返回空字符串。

给出一些查询  *queries* ，返回一个单词列表  *answer* ，其中  *answer[i]*  是由查询  *query = queries[i]*  得到的正确单词。



**示例：** 

```
输入：wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
输出：["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
```



**提示：** 

1.  *1 <= wordlist.length <= 5000*  
2.  *1 <= queries.length <= 5000*  
3.  *1 <= wordlist[i].length <= 7*  
4.  *1 <= queries[i].length <= 7*  
5.  *wordlist*  和  *queries*  中的所有字符串仅由**英文** 字母组成。




# 算法思路

# 测试用例
```
966. Vowel Spellchecker 966. 元音拼写检查器 Medium
```

[enTitle]: https://leetcode.com/problems/vowel-spellchecker/
[cnTitle]: https://leetcode-cn.com/problems/vowel-spellchecker/
