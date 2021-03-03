# [1032. Stream of Characters][enTitle]

**Hard**

Implement the  *StreamChecker*  class as follows:

-  *StreamChecker(words)* : Constructor, init the data structure with the given words. 
-  *query(letter)* : returns true if and only if for some  *k >= 1* , the last  *k*  characters queried (in order from oldest to newest, including this letter just queried) spell one of the words in the given list.



**Example:** 

```
StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // init the dictionary.
streamChecker.query('a');          // return false
streamChecker.query('b');          // return false
streamChecker.query('c');          // return false
streamChecker.query('d');          // return true, because 'cd' is in the wordlist
streamChecker.query('e');          // return false
streamChecker.query('f');          // return true, because 'f' is in the wordlist
streamChecker.query('g');          // return false
streamChecker.query('h');          // return false
streamChecker.query('i');          // return false
streamChecker.query('j');          // return false
streamChecker.query('k');          // return false
streamChecker.query('l');          // return true, because 'kl' is in the wordlist

```



**Note:** 

-  *1 <= words.length <= 2000*  
-  *1 <= words[i].length <= 2000*  
- Words will only consist of lowercase English letters. 
- Queries will only consist of lowercase English letters. 
- The number of queries is at most 40000.


# [1032. 字符流][cnTitle]

**困难**

按下述要求实现  *StreamChecker*  类：

-  *StreamChecker(words)* ：构造函数，用给定的字词初始化数据结构。 
-  *query(letter)* ：如果存在某些  *k >= 1* ，可以用查询的最后  *k* 个字符（按从旧到新顺序，包括刚刚查询的字母）拼写出给定字词表中的某一字词时，返回  *true* 。否则，返回  *false* 。



**示例：** 

```
StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // 初始化字典
streamChecker.query('a');          // 返回 false
streamChecker.query('b');          // 返回 false
streamChecker.query('c');          // 返回 false
streamChecker.query('d');          // 返回 true，因为 'cd' 在字词表中
streamChecker.query('e');          // 返回 false
streamChecker.query('f');          // 返回 true，因为 'f' 在字词表中
streamChecker.query('g');          // 返回 false
streamChecker.query('h');          // 返回 false
streamChecker.query('i');          // 返回 false
streamChecker.query('j');          // 返回 false
streamChecker.query('k');          // 返回 false
streamChecker.query('l');          // 返回 true，因为 'kl' 在字词表中。
```



**提示：** 

-  *1 <= words.length <= 2000*  
-  *1 <= words[i].length <= 2000*  
- 字词只包含小写英文字母。 
- 待查项只包含小写英文字母。 
- 待查项最多 40000 个。




# 算法思路

# 测试用例
```
1032. Stream of Characters 1032. 字符流 Hard
```

[enTitle]: https://leetcode.com/problems/stream-of-characters/
[cnTitle]: https://leetcode-cn.com/problems/stream-of-characters/
