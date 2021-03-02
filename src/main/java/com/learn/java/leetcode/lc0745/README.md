# [745. Prefix and Suffix Search][enTitle]

**Hard**

Design a special dictionary which has some words and allows you to search the words in it by a prefix and a suffix.

Implement the  *WordFilter*  class:

-  *WordFilter(string[] words)*  Initializes the object with the  *words*  in the dictionary. 
-  *f(string prefix, string suffix)*  Returns  *the index of the word in the dictionary*  which has the prefix  *prefix*  and the suffix  *suffix* . If there is more than one valid index, return **the largest**  of them. If there is no such word in the dictionary, return  *-1* .



**Example 1:** 

```
Input
["WordFilter", "f"]
[[["apple"]], ["a", "e"]]
Output
[null, 0]

Explanation
WordFilter wordFilter = new WordFilter(["apple"]);
wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = "a" and suffix = 'e".

```



**Constraints:** 

-  *1 <= words.length <= 15000*  
-  *1 <= words[i].length <= 10*  
-  *1 <= prefix.length, suffix.length <= 10*  
-  *words[i]* ,  *prefix*  and  *suffix*  consist of lower-case English letters only. 
- At most  *15000*  calls will be made to the function  *f* .


# [745. 前缀和后缀搜索][cnTitle]

**困难**

给定多个  *words* ， *words[i]*  的权重为  *i*  。

设计一个类  *WordFilter*  实现函数 *WordFilter.f(String prefix, String suffix)* 。这个函数将返回具有前缀  *prefix*  和后缀 *suffix*  的词的最大权重。如果没有这样的词，返回 -1。

**例子:** 

```
输入:
WordFilter(["apple"])
WordFilter.f("a", "e") // 返回 0
WordFilter.f("b", "") // 返回 -1

```

**注意:** 

1.  *words* 的长度在 *[1, 15000]* 之间。 
2. 对于每个测试用例，最多会有 *words.length* 次对 *WordFilter.f* 的调用。 
3.  *words[i]* 的长度在 *[1, 10]* 之间。 
4.  *prefix, suffix* 的长度在 *[0, 10]* 之前。 
5.  *words[i]* 和 *prefix, suffix* 只包含小写字母。




# 算法思路

# 测试用例
```
745. Prefix and Suffix Search 745. 前缀和后缀搜索 Hard
```

[enTitle]: https://leetcode.com/problems/prefix-and-suffix-search/
[cnTitle]: https://leetcode-cn.com/problems/prefix-and-suffix-search/
