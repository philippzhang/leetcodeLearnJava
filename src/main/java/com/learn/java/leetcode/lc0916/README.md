# [916. Word Subsets][enTitle]

**Medium**

We are given two arrays  *A*  and  *B*  of words. Each word is a string of lowercase letters.

Now, say that word  *b*  is a subset of word  *a* **** if every letter in  *b*  occurs in  *a* , **including multiplicity** . For example,  *"wrr"*  is a subset of  *"warrior"* , but is not a subset of  *"world"* .

Now say a word  *a*  from  *A*  is  *universal*  if for every  *b*  in  *B* ,  *b*  is a subset of  *a* .

Return a list of all universal words in  *A* . You can return the words in any order.






**Example 1:** 

```
Input:A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
Output: ["facebook","google","leetcode"]
```


**Example 2:** 

```
Input:A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
Output: ["apple","google","leetcode"]
```


**Example 3:** 

```
Input:A = ["amazon","apple","facebook","google","leetcode"], B = ["e","oo"]
Output: ["facebook","google"]
```


**Example 4:** 

```
Input:A = ["amazon","apple","facebook","google","leetcode"], B = ["lo","eo"]
Output: ["google","leetcode"]
```


**Example 5:** 

```
Input:A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
Output: ["facebook","leetcode"]
```



**Note:** 

1.  *1 <= A.length, B.length <= 10000*  
2.  *1 <= A[i].length, B[i].length <= 10*  
3.  *A[i]*  and  *B[i]*  consist only of lowercase letters. 
4. All words in  *A[i]*  are unique: there isn't  *i != j*  with  *A[i] == A[j]* .












# [916. 单词子集][cnTitle]

**中等**

我们给出两个单词数组  *A*  和  *B* 。每个单词都是一串小写字母。

现在，如果  *b*  中的每个字母都出现在  *a*  中，**包括重复出现的字母** ，那么称单词  *b*  是单词  *a*  的子集。 例如，“wrr” 是 “warrior” 的子集，但不是 “world” 的子集。

如果对  *B*  中的每一个单词  *b* ， *b*  都是  *a*  的子集，那么我们称  *A*  中的单词  *a*  是 *通用的* 。

你可以按任意顺序以列表形式返回  *A*  中所有的通用单词。





**示例 1：** 

```
输入：A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
输出：["facebook","google","leetcode"]

```

**示例 2：** 

```
输入：A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
输出：["apple","google","leetcode"]

```

**示例 3：** 

```
输入：A = ["amazon","apple","facebook","google","leetcode"], B = ["e","oo"]
输出：["facebook","google"]

```

**示例 4：** 

```
输入：A = ["amazon","apple","facebook","google","leetcode"], B = ["lo","eo"]
输出：["google","leetcode"]

```

**示例 5：** 

```
输入：A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
输出：["facebook","leetcode"]

```



**提示：** 

1.  *1 <= A.length, B.length <= 10000*  
2.  *1 <= A[i].length, B[i].length <= 10*  
3.  *A[i]*  和  *B[i]*  只由小写字母组成。 
4.  *A[i]*  中所有的单词都是独一无二的，也就是说不存在  *i != j*  使得  *A[i] == A[j]* 。




# 算法思路

# 测试用例
```
916. Word Subsets 916. 单词子集 Medium
```

[enTitle]: https://leetcode.com/problems/word-subsets/
[cnTitle]: https://leetcode-cn.com/problems/word-subsets/
