# [820. Short Encoding of Words][enTitle]

**Medium**

A **valid encoding**  of an array of  *words*  is any reference string  *s*  and array of indices  *indices*  such that:

-  *words.length == indices.length*  
- The reference string  *s*  ends with the  *'#'*  character. 
- For each index  *indices[i]* , the **substring**  of  *s*  starting from  *indices[i]*  and up to (but not including) the next  *'#'*  character is equal to  *words[i]* .

Given an array of  *words* , return  *the length of the shortest reference string*  *s*  *possible of any valid encoding of*  *words*  *.* 



**Example 1:** 

```
Input: words = ["time", "me", "bell"]
Output: 10
Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"

```

**Example 2:** 

```
Input: words = ["t"]
Output: 2
Explanation: A valid encoding would be s = "t#" and indices = [0].


```



**Constraints:** 

-  *1 <= words.length <= 2000*  
-  *1 <= words[i].length <= 7*  
-  *words[i]*  consists of only lowercase letters.


# [820. 单词的压缩编码][cnTitle]

**中等**

单词数组  *words*  的 **有效编码**  由任意助记字符串  *s*  和下标数组  *indices*  组成，且满足：

-  *words.length == indices.length*  
- 助记字符串  *s*  以  *'#'*  字符结尾 
- 对于每个下标  *indices[i]*  ， *s*  的一个从  *indices[i]*  开始、到下一个  *'#'*  字符结束（但不包括  *'#'* ）的 **子字符串**  恰好与  *words[i]*  相等

给你一个单词数组  *words*  ，返回成功对  *words*  进行编码的最小助记字符串  *s*  的长度 。



**示例 1：** 

```
输入：words = ["time", "me", "bell"]
输出：10
解释：一组有效编码为 s = "time#bell#" 和 indices = [0, 2, 5] 。
words[0] = "time" ，s 开始于 indices[0] = 0 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
words[1] = "me" ，s 开始于 indices[1] = 2 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
words[2] = "bell" ，s 开始于 indices[2] = 5 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"

```

**示例 2：** 

```
输入：words = ["t"]
输出：2
解释：一组有效编码为 s = "t#" 和 indices = [0] 。

```



**提示：** 

-  *1 <= words.length <= 2000*  
-  *1 <= words[i].length <= 7*  
-  *words[i]*  仅由小写字母组成




# 算法思路

# 测试用例
```
820. Short Encoding of Words 820. 单词的压缩编码 Medium
```

[enTitle]: https://leetcode.com/problems/short-encoding-of-words/
[cnTitle]: https://leetcode-cn.com/problems/short-encoding-of-words/
