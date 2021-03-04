# [1657. Determine if Two Strings Are Close][enTitle]

**Medium**

Two strings are considered **close**  if you can attain one from the other using the following operations:

- Operation 1: Swap any two **existing**  characters. 
 <ul> 
  - For example,  *abcde -> aecdb*  
 </ul>  
- Operation 2: Transform **every**  occurrence of one **existing**  character into another **existing**  character, and do the same with the other character. 
 <ul> 
  - For example,  *aacabb -> bbcbaa*  (all  *a* 's turn into  *b* 's, and all  *b* 's turn into  *a* 's) 
 </ul> 

You can use the operations on either string as many times as necessary.

Given two strings,  *word1*  and  *word2* , return  *true*  *if*  *word1*  *and*  *word2*  *are close, and*  *false*  *otherwise.* 



**Example 1:** 

```
Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"

```

**Example 2:** 

```
Input: word1 = "a", word2 = "aa"
Output: false
Explanation:It is impossible to attain word2 from word1, or vice versa, in any number of operations.

```

**Example 3:** 

```
Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"

```

**Example 4:** 

```
Input: word1 = "cabbba", word2 = "aabbss"
Output: false
Explanation:It is impossible to attain word2 from word1, or vice versa, in any amount of operations.

```



**Constraints:** 

-  *1 <= word1.length, word2.length <= 105*  
-  *word1*  and  *word2*  contain only lowercase English letters.


# [1657. 确定两个字符串是否接近][cnTitle]

**中等**

如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 **接近**  ：

- 操作 1：交换任意两个 **现有**  字符。 
 <ul> 
  - 例如， *abcde -> aecdb*  
 </ul>  
- 操作 2：将一个 **现有**  字符的每次出现转换为另一个 **现有**  字符，并对另一个字符执行相同的操作。 
 <ul> 
  - 例如， *aacabb -> bbcbaa* （所有  *a*  转化为  *b*  ，而所有的  *b*  转换为  *a*  ） 
 </ul> 

你可以根据需要对任意一个字符串多次使用这两种操作。

给你两个字符串， *word1*  和  *word2*  。如果 *word1* 和 *word2* **接近** ，就返回  *true*  ；否则，返回 *false* 。



**示例 1：** 

```
输入：word1 = "abc", word2 = "bca"
输出：true
解释：2 次操作从 word1 获得 word2 。
执行操作 1："abc" -> "acb"
执行操作 1："acb" -> "bca"

```

**示例 2：** 

```
输入：word1 = "a", word2 = "aa"
输出：false
解释：不管执行多少次操作，都无法从 word1 得到 word2 ，反之亦然。
```

**示例 3：** 

```
输入：word1 = "cabbba", word2 = "abbccc"
输出：true
解释：3 次操作从 word1 获得 word2 。
执行操作 1："cabbba" -> "caabbb"
执行操作 2："caabbb" -> "baaccc"
执行操作 2："baaccc" -> "abbccc"

```

**示例 4：** 

```
输入：word1 = "cabbba", word2 = "aabbss"
输出：false
解释：不管执行多少次操作，都无法从 word1 得到 word2 ，反之亦然。
```



**提示：** 

-  *1 <= word1.length, word2.length <= 105*  
-  *word1*  和  *word2*  仅包含小写英文字母




# 算法思路

# 测试用例
```
1657. Determine if Two Strings Are Close 1657. 确定两个字符串是否接近 Medium
```

[enTitle]: https://leetcode.com/problems/determine-if-two-strings-are-close/
[cnTitle]: https://leetcode-cn.com/problems/determine-if-two-strings-are-close/
