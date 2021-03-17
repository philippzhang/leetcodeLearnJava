# [648. Replace Words][enTitle]

**Medium**

In English, we have a concept called **root** , which can be followed by some other word to form another longer word - let's call this word **successor** . For example, when the **root**   *"an"*  is followed by the **successor**  word  *"other"* , we can form a new word  *"another"* .

Given a  *dictionary*  consisting of many **roots**  and a  *sentence*  consisting of words separated by spaces, replace all the **successors**  in the sentence with the **root**  forming it. If a **successor**  can be replaced by more than one **root** , replace it with the **root**  that has **the shortest length** .

Return  *the sentence*  after the replacement.



**Example 1:** 

```
Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"

```

**Example 2:** 

```
Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
Output: "a a b c"

```

**Example 3:** 

```
Input: dictionary = ["a", "aa", "aaa", "aaaa"], sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
Output: "a a a a a a a a bbb baba a"

```

**Example 4:** 

```
Input: dictionary = ["catt","cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"

```

**Example 5:** 

```
Input: dictionary = ["ac","ab"], sentence = "it is abnormal that this solution is accepted"
Output: "it is ab that this solution is ac"

```



**Constraints:** 

-  *1 <= dictionary.length <= 1000*  
-  *1 <= dictionary[i].length <= 100*  
-  *dictionary[i]*  consists of only lower-case letters. 
-  *1 <= sentence.length <= 10^6*  
-  *sentence*  consists of only lower-case letters and spaces. 
- The number of words in  *sentence*  is in the range  *[1, 1000]*  
- The length of each word in  *sentence*  is in the range  *[1, 1000]*  
- Each two consecutive words in  *sentence*  will be separated by exactly one space. 
-  *sentence*  does not have leading or trailing spaces.


# [648. 单词替换][cnTitle]

**中等**

在英语中，我们有一个叫做  *词根* (root)的概念，它可以跟着其他一些词组成另一个较长的单词——我们称这个词为  *继承词* (successor)。例如，词根 *an* ，跟随着单词  *other* (其他)，可以形成新的单词  *another* (另一个)。

现在，给定一个由许多词根组成的词典和一个句子。你需要将句子中的所有 *继承词* 用 *词根* 替换掉。如果 *继承词* 有许多可以形成它的 *词根* ，则用最短的词根替换它。

你需要输出替换之后的句子。



**示例 1：** 

```
输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
输出："the cat was rat by the bat"

```

**示例 2：** 

```
输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
输出："a a b c"

```

**示例 3：** 

```
输入：dictionary = ["a", "aa", "aaa", "aaaa"], sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
输出："a a a a a a a a bbb baba a"

```

**示例 4：** 

```
输入：dictionary = ["catt","cat","bat","rat"], sentence = "the cattle was rattled by the battery"
输出："the cat was rat by the bat"

```

**示例 5：** 

```
输入：dictionary = ["ac","ab"], sentence = "it is abnormal that this solution is accepted"
输出："it is ab that this solution is ac"

```



**提示：** 

-  *1 <= dictionary.length <= 1000*  
-  *1 <= dictionary[i].length <= 100*  
-  *dictionary[i]*  仅由小写字母组成。 
-  *1 <= sentence.length <= 10^6*  
-  *sentence*  仅由小写字母和空格组成。 
-  *sentence*  中单词的总量在范围  *[1, 1000]*  内。 
-  *sentence*  中每个单词的长度在范围  *[1, 1000]*  内。 
-  *sentence*  中单词之间由一个空格隔开。 
-  *sentence*  没有前导或尾随空格。




# 算法思路

# 测试用例
```
648. Replace Words 648. 单词替换 Medium
```

[enTitle]: https://leetcode.com/problems/replace-words/
[cnTitle]: https://leetcode-cn.com/problems/replace-words/