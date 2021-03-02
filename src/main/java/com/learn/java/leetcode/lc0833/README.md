# [833. Find And Replace in String][enTitle]

**Medium**

To some string  *S* , we will perform some replacement operations that replace groups of letters with new ones (not necessarily the same size).

Each replacement operation has  *3*  parameters: a starting index  *i* , a source word  *x*  and a target word  *y* . The rule is that if  *x*  starts at position  *i*  in the **original**  **string**  **S** , then we will replace that occurrence of  *x*  with  *y* . If not, we do nothing.

For example, if we have  *S = "abcd"*  and we have some replacement operation  *i = 2, x = "cd", y = "ffff"* , then because  *"cd"*  starts at position  *2*  in the original string  *S* , we will replace it with  *"ffff"* .

Using another example on  *S = "abcd"* , if we have both the replacement operation  *i = 0, x = "ab", y = "eee"* , as well as another replacement operation  *i = 2, x = "ec", y = "ffff"* , this second operation does nothing because in the original string  *S[2] = 'c'* , which doesn't match  *x[0] = 'e'* .

All these operations occur simultaneously. It's guaranteed that there won't be any overlap in replacement: for example,  *S = "abc", indexes = [0, 1], sources = ["ab","bc"]*  is not a valid test case.



**Example 1:** 

```
Input: S = "abcd", indexes = [0, 2], sources = ["a", "cd"], targets = ["eee", "ffff"]
Output: "eeebffff"
Explanation:
"a" starts at index 0 in S, so it's replaced by "eee".
"cd" starts at index 2 in S, so it's replaced by "ffff".

```

**Example 2:** 

```
Input: S = "abcd", indexes = [0, 2], sources = ["ab","ec"], targets = ["eee","ffff"]
Output: "eeecd"
Explanation:
"ab" starts at index 0 in S, so it's replaced by "eee".
"ec" doesn't starts at index 2 in the original S, so we do nothing.

```



**Constraints:** 

-  *0 <= S.length <= 1000*  
-  *S*  consists of only lowercase English letters. 
-  *0 <= indexes.length <= 100*  
-  *0 <= indexes[i] < S.length*  
-  *sources.length == indexes.length*  
-  *targets.length == indexes.length*  
-  *1 <= sources[i].length, targets[i].length <= 50*  
-  *sources[i]*  and  *targets[i]*  consist of only lowercase English letters.


# [833. 字符串中的查找与替换][cnTitle]

**中等**

某个字符串  *S*  需要执行一些替换操作，用新的字母组替换原有的字母组（不一定大小相同）。

每个替换操作具有 3 个参数：起始索引  *i* ，源字  *x*  和目标字  *y* 。规则是：如果  *x*  从**原始字符串 S**  中的位置  *i*  开始，那么就用  *y*  替换出现的  *x* 。如果没有，则什么都不做。

举个例子，如果  *S = “abcd”*  并且替换操作  *i = 2，x = “cd”，y = “ffff”* ，那么因为  *“cd”*  从原始字符串  *S*  中的位置  *2*  开始，所以用  *“ffff”*  替换它。

再来看  *S = “abcd”*  上的另一个例子，如果一个替换操作 *i = 0，x = “ab”，y = “eee”* ，以及另一个替换操作  *i = 2，x = “ec”，y = “ffff”* ，那么第二个操作将不会执行，因为原始字符串中  *S[2] = 'c'* ，与  *x[0] = 'e'*  不匹配。

所有这些操作同时发生。保证在替换时不会有任何重叠：  *S = "abc", indexes = [0, 1], sources = ["ab","bc"]*  不是有效的测试用例。



**示例 1：** 

```
输入：S = "abcd", indexes = [0,2], sources = ["a","cd"], targets = ["eee","ffff"]
输出："eeebffff"
解释："a" 从 S 中的索引 0 开始，所以它被替换为 "eee"。
"cd" 从 S 中的索引 2 开始，所以它被替换为 "ffff"。

```

**示例 2：** 

```
输入：S = "abcd", indexes = [0,2], sources = ["ab","ec"], targets = ["eee","ffff"]
输出："eeecd"
解释："ab" 从 S 中的索引 0 开始，所以它被替换为 "eee"。
"ec" 没有从原始的 S 中的索引 2 开始，所以它没有被替换。

```



**提示：** 

-  *0 <= S.length <= 1000*  
-  *S*  仅由小写英文字母组成 
-  *0 <= indexes.length <= 100*  
-  *0 <= indexes[i] < S.length*  
-  *sources.length == indexes.length*  
-  *targets.length == indexes.length*  
-  *1 <= sources[i].length, targets[i].length <= 50*  
-  *sources[i]*  和  *targets[i]*  仅由小写英文字母组成






# 算法思路

# 测试用例
```
833. Find And Replace in String 833. 字符串中的查找与替换 Medium
```

[enTitle]: https://leetcode.com/problems/find-and-replace-in-string/
[cnTitle]: https://leetcode-cn.com/problems/find-and-replace-in-string/
