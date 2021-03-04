# [1562. Find Latest Group of Size M][enTitle]

**Medium**

Given an array  *arr*  that represents a permutation of numbers from  *1*  to  *n* . You have a binary string of size  *n*  that initially has all its bits set to zero.

At each step  *i*  (assuming both the binary string and  *arr*  are 1-indexed) from  *1*  to  *n* , the bit at position  *arr[i]*  is set to  *1* . You are given an integer  *m*  and you need to find the latest step at which there exists a group of ones of length  *m* . A group of ones is a contiguous substring of 1s such that it cannot be extended in either direction.

Return  *the latest step at which there exists a group of ones of length exactly*   *m* .  *If no such group exists, return*   *-1* .



**Example 1:** 

```
Input: arr = [3,5,1,2,4], m = 1
Output: 4
Explanation:Step 1: "00100", groups: ["1"]
Step 2: "00101", groups: ["1", "1"]
Step 3: "10101", groups: ["1", "1", "1"]
Step 4: "11101", groups: ["111", "1"]
Step 5: "11111", groups: ["11111"]
The latest step at which there exists a group of size 1 is step 4.
```

**Example 2:** 

```
Input: arr = [3,1,5,4,2], m = 2
Output: -1
Explanation:Step 1: "00100", groups: ["1"]
Step 2: "10100", groups: ["1", "1"]
Step 3: "10101", groups: ["1", "1", "1"]
Step 4: "10111", groups: ["1", "111"]
Step 5: "11111", groups: ["11111"]
No group of size 2 exists during any step.

```

**Example 3:** 

```
Input: arr = [1], m = 1
Output: 1

```

**Example 4:** 

```
Input: arr = [2,1], m = 2
Output: 2

```



**Constraints:** 

-  *n == arr.length*  
-  *1 <= n <= 10^5*  
-  *1 <= arr[i] <= n*  
- All integers in  *arr*  are **distinct** . 
-  *1 <= m <= arr.length* 


# [1562. 查找大小为 M 的最新分组][cnTitle]

**中等**

给你一个数组  *arr*  ，该数组表示一个从  *1*  到  *n*  的数字排列。有一个长度为  *n*  的二进制字符串，该字符串上的所有位最初都设置为  *0*  。

在从  *1*  到  *n*  的每个步骤  *i*  中（假设二进制字符串和  *arr*  都是从  *1*  开始索引的情况下），二进制字符串上位于位置  *arr[i]*  的位将会设为  *1*  。

给你一个整数  *m*  ，请你找出二进制字符串上存在长度为  *m*  的一组  *1*  的最后步骤。一组  *1*  是一个连续的、由  *1*  组成的子串，且左右两边不再有可以延伸的  *1*  。

返回存在长度 **恰好**  为  *m*  的 **一组 1**  的最后步骤。如果不存在这样的步骤，请返回  *-1*  。



**示例 1：** 

```
输入：arr = [3,5,1,2,4], m = 1
输出：4
解释：步骤 1："00100"，由 1 构成的组：["1"]
步骤 2："00101"，由 1 构成的组：["1", "1"]
步骤 3："10101"，由 1 构成的组：["1", "1", "1"]
步骤 4："11101"，由 1 构成的组：["111", "1"]
步骤 5："11111"，由 1 构成的组：["11111"]
存在长度为 1 的一组 1 的最后步骤是步骤 4 。
```

**示例 2：** 

```
输入：arr = [3,1,5,4,2], m = 2
输出：-1
解释：步骤 1："00100"，由 1 构成的组：["1"]
步骤 2："10100"，由 1 构成的组：["1", "1"]
步骤 3："10101"，由 1 构成的组：["1", "1", "1"]
步骤 4："10111"，由 1 构成的组：["1", "111"]
步骤 5："11111"，由 1 构成的组：["11111"]
不管是哪一步骤都无法形成长度为 2 的一组 1 。

```

**示例 3：** 

```
输入：arr = [1], m = 1
输出：1

```

**示例 4：** 

```
输入：arr = [2,1], m = 2
输出：2

```



**提示：** 

-  *n == arr.length*  
-  *1 <= n <= 10^5*  
-  *1 <= arr[i] <= n*  
-  *arr*  中的所有整数 **互不相同**  
-  *1 <= m <= arr.length* 




# 算法思路

# 测试用例
```
1562. Find Latest Group of Size M 1562. 查找大小为 M 的最新分组 Medium
```

[enTitle]: https://leetcode.com/problems/find-latest-group-of-size-m/
[cnTitle]: https://leetcode-cn.com/problems/find-latest-group-of-size-m/
