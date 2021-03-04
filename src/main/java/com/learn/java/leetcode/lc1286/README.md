# [1286. Iterator for Combination][enTitle]

**Medium**

Design the  *CombinationIterator*  class:

-  *CombinationIterator(string characters, int combinationLength)*  Initializes the object with a string  *characters*  of **sorted distinct**  lowercase English letters and a number  *combinationLength*  as arguments. 
-  *next()*  Returns the next combination of length  *combinationLength*  in **lexicographical order** . 
-  *hasNext()*  Returns  *true*  if and only if there exists a next combination.



**Example 1:** 

```
Input
["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[["abc", 2], [], [], [], [], [], []]
Output
[null, "ab", true, "ac", true, "bc", false]

Explanation
CombinationIterator itr = new CombinationIterator("abc", 2);
itr.next();    // return "ab"
itr.hasNext(); // return True
itr.next();    // return "ac"
itr.hasNext(); // return True
itr.next();    // return "bc"
itr.hasNext(); // return False

```



**Constraints:** 

-  *1 <= combinationLength <= characters.length <= 15*  
- All the characters of  *characters*  are **unique** . 
- At most  *104*  calls will be made to  *next*  and  *hasNext* . 
- It's guaranteed that all calls of the function  *next*  are valid.


# [1286. 字母组合迭代器][cnTitle]

**中等**

请你设计一个迭代器类，包括以下内容：

- 一个构造函数，输入参数包括：一个 **有序且字符唯一** 的字符串  *characters* （该字符串只包含小写英文字母）和一个数字  *combinationLength*  。 
- 函数  *next()* ，按 **字典序** 返回长度为  *combinationLength*  的下一个字母组合。 
- 函数  *hasNext()* ，只有存在长度为  *combinationLength*  的下一个字母组合时，才返回  *True* ；否则，返回  *False* 。



**示例：** 

```
CombinationIterator iterator = new CombinationIterator("abc", 2); // 创建迭代器 iterator

iterator.next(); // 返回 "ab"
iterator.hasNext(); // 返回 true
iterator.next(); // 返回 "ac"
iterator.hasNext(); // 返回 true
iterator.next(); // 返回 "bc"
iterator.hasNext(); // 返回 false

```



**提示：** 

-  *1 <= combinationLength <= characters.length <= 15*  
- 每组测试数据最多包含  *10^4*  次函数调用。 
- 题目保证每次调用函数  *next*  时都存在下一个字母组合。




# 算法思路

# 测试用例
```
1286. Iterator for Combination 1286. 字母组合迭代器 Medium
```

[enTitle]: https://leetcode.com/problems/iterator-for-combination/
[cnTitle]: https://leetcode-cn.com/problems/iterator-for-combination/
