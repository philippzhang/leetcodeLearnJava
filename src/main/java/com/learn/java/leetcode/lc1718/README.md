# [1718. Construct the Lexicographically Largest Valid Sequence][enTitle]

**Medium**

Given an integer  *n* , find a sequence that satisfies all of the following:

- The integer  *1*  occurs once in the sequence. 
- Each integer between  *2*  and  *n*  occurs twice in the sequence. 
- For every integer  *i*  between  *2*  and  *n* , the **distance**  between the two occurrences of  *i*  is exactly  *i* .

The **distance**  between two numbers on the sequence,  *a[i]*  and  *a[j]* , is the absolute difference of their indices,  *|j - i|* .

Return  *the lexicographically largest sequence*  *. It is guaranteed that under the given constraints, there is always a solution.* 

A sequence  *a*  is lexicographically larger than a sequence  *b*  (of the same length) if in the first position where  *a*  and  *b*  differ, sequence  *a*  has a number greater than the corresponding number in  *b* . For example,  *[0,1,9,0]*  is lexicographically larger than  *[0,1,5,6]*  because the first position they differ is at the third number, and  *9*  is greater than  *5* .



**Example 1:** 

```
Input: n = 3
Output: [3,1,2,3,2]
Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.

```

**Example 2:** 

```
Input: n = 5
Output: [5,3,1,4,3,5,2,4,2]

```



**Constraints:** 

-  *1 <= n <= 20* 


# [1718. 构建字典序最大的可行序列][cnTitle]

**中等**

给你一个整数  *n*  ，请你找到满足下面条件的一个序列：

- 整数  *1*  在序列中只出现一次。 
-  *2*  到  *n*  之间每个整数都恰好出现两次。 
- 对于每个  *2*  到  *n*  之间的整数  *i*  ，两个  *i*  之间出现的距离恰好为  *i*  。

序列里面两个数  *a[i]*  和  *a[j]*  之间的 **距离**  ，我们定义为它们下标绝对值之差  *|j - i|*  。

请你返回满足上述条件中 **字典序最大**  的序列。题目保证在给定限制条件下，一定存在解。

一个序列  *a*  被认为比序列  *b*  （两者长度相同）字典序更大的条件是：  *a*  和  *b*  中第一个不一样的数字处， *a*  序列的数字比  *b*  序列的数字大。比方说， *[0,1,9,0]*  比  *[0,1,5,6]*  字典序更大，因为第一个不同的位置是第三个数字，且  *9*  比  *5*  大。



**示例 1：** 

```
输入：n = 3
输出：[3,1,2,3,2]
解释：[2,3,2,1,3] 也是一个可行的序列，但是 [3,1,2,3,2] 是字典序最大的序列。

```

**示例 2：** 

```
输入：n = 5
输出：[5,3,1,4,3,5,2,4,2]

```



**提示：** 

-  *1 <= n <= 20* 




# 算法思路

# 测试用例
```
1718. Construct the Lexicographically Largest Valid Sequence 1718. 构建字典序最大的可行序列 Medium
```

[enTitle]: https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/
[cnTitle]: https://leetcode-cn.com/problems/construct-the-lexicographically-largest-valid-sequence/
