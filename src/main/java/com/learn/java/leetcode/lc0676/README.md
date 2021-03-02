# [676. Implement Magic Dictionary][enTitle]

**Medium**

Design a data structure that is initialized with a list of **different**  words. Provided a string, you should determine if you can change exactly one character in this string to match any word in the data structure.

Implement the  *MagicDictionary*  class:

-  *MagicDictionary()*  Initializes the object. 
-  *void buildDict(String[] dictionary)*  Sets the data structure with an array of distinct strings  *dictionary* . 
-  *bool search(String searchWord)*  Returns  *true*  if you can change **exactly one character**  in  *searchWord*  to match any string in the data structure, otherwise returns  *false* .



**Example 1:** 

```
Input
["MagicDictionary", "buildDict", "search", "search", "search", "search"]
[[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
Output
[null, null, false, true, false, false]

Explanation
MagicDictionary magicDictionary = new MagicDictionary();
magicDictionary.buildDict(["hello", "leetcode"]);
magicDictionary.search("hello"); // return False
magicDictionary.search("hhllo"); // We can change the second 'h' to 'e' to match "hello" so we return True
magicDictionary.search("hell"); // return False
magicDictionary.search("leetcoded"); // return False

```



**Constraints:** 

-  *1 <= dictionary.length <= 100*  
-  *1 <= dictionary[i].length <= 100*  
-  *dictionary[i]*  consists of only lower-case English letters. 
- All the strings in  *dictionary*  are **distinct** . 
-  *1 <= searchWord.length <= 100*  
-  *searchWord*  consists of only lower-case English letters. 
-  *buildDict*  will be called only once before  *search* . 
- At most  *100*  calls will be made to  *search* .


# [676. 实现一个魔法字典][cnTitle]

**中等**

设计一个使用单词列表进行初始化的数据结构，单词列表中的单词 **互不相同**  。 如果给出一个单词，请判定能否只将这个单词中**一个** 字母换成另一个字母，使得所形成的新单词存在于你构建的字典中。

实现  *MagicDictionary*  类：

-  *MagicDictionary()*  初始化对象 
-  *void buildDict(String[] dictionary)*  使用字符串数组  *dictionary*  设定该数据结构， *dictionary*  中的字符串互不相同 
-  *bool search(String searchWord)*  给定一个字符串  *searchWord*  ，判定能否只将字符串中**一个** 字母换成另一个字母，使得所形成的新字符串能够与字典中的任一字符串匹配。如果可以，返回  *true*  ；否则，返回  *false*  。






**示例：** 

```
输入
["MagicDictionary", "buildDict", "search", "search", "search", "search"]
[[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
输出
[null, null, false, true, false, false]

解释
MagicDictionary magicDictionary = new MagicDictionary();
magicDictionary.buildDict(["hello", "leetcode"]);
magicDictionary.search("hello"); // 返回 False
magicDictionary.search("hhllo"); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
magicDictionary.search("hell"); // 返回 False
magicDictionary.search("leetcoded"); // 返回 False

```



**提示：** 

-  *1 <= dictionary.length <= 100*  
-  *1 <= dictionary[i].length <= 100*  
-  *dictionary[i]*  仅由小写英文字母组成 
-  *dictionary*  中的所有字符串 **互不相同**  
-  *1 <= searchWord.length <= 100*  
-  *searchWord*  仅由小写英文字母组成 
-  *buildDict*  仅在  *search*  之前调用一次 
- 最多调用  *100*  次  *search* 










# 算法思路

# 测试用例
```
676. Implement Magic Dictionary 676. 实现一个魔法字典 Medium
```

[enTitle]: https://leetcode.com/problems/implement-magic-dictionary/
[cnTitle]: https://leetcode-cn.com/problems/implement-magic-dictionary/
