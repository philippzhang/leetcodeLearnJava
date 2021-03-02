# [474. Ones and Zeroes][enTitle]

**Medium**

You are given an array of binary strings  *strs*  and two integers  *m*  and  *n* .

Return  *the size of the largest subset of strs such that there are at most*  *m*  *0*  *'s and*  *n*  *1*  *'s in the subset* .

A set  *x*  is a **subset**  of a set  *y*  if all elements of  *x*  are also elements of  *y* .



**Example 1:** 

```
Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
Output: 4
Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.

```

**Example 2:** 

```
Input: strs = ["10","0","1"], m = 1, n = 1
Output: 2
Explanation: The largest subset is {"0", "1"}, so the answer is 2.

```



**Constraints:** 

-  *1 <= strs.length <= 600*  
-  *1 <= strs[i].length <= 100*  
-  *strs[i]*  consists only of digits  *'0'*  and  *'1'* . 
-  *1 <= m, n <= 100* 


# [474. 一和零][cnTitle]

**中等**

给你一个二进制字符串数组  *strs*  和两个整数  *m*  和  *n*  。


请你找出并返回  *strs*  的最大子集的大小，该子集中 **最多**  有  *m*  个  *0*  和  *n*  个  *1*  。

如果  *x*  的所有元素也是  *y*  的元素，集合  *x*  是集合  *y*  的 **子集**  。





**示例 1：** 

```
输入：strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
输出：4
解释：最多有 5 个 0 和 3 个 1 的最大子集是 {"10","0001","1","0"} ，因此答案是 4 。
其他满足题意但较小的子集包括 {"0001","1"} 和 {"10","1","0"} 。{"111001"} 不满足题意，因为它含 4 个 1 ，大于 n 的值 3 。

```

**示例 2：** 

```
输入：strs = ["10", "0", "1"], m = 1, n = 1
输出：2
解释：最大的子集是 {"0", "1"} ，所以答案是 2 。

```



**提示：** 

-  *1 <= strs.length <= 600*  
-  *1 <= strs[i].length <= 100*  
-  *strs[i]*  仅由  *'0'*  和  *'1'*  组成 
-  *1 <= m, n <= 100* 




# 算法思路

# 测试用例
```
474. Ones and Zeroes 474. 一和零 Medium
```

[enTitle]: https://leetcode.com/problems/ones-and-zeroes/
[cnTitle]: https://leetcode-cn.com/problems/ones-and-zeroes/
