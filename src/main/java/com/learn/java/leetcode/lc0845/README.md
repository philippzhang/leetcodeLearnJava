# [845. Longest Mountain in Array][enTitle]

**Medium**

You may recall that an array  *arr*  is a **mountain array**  if and only if:

-  *arr.length >= 3*  
- There exists some index  *i*  (**0-indexed** ) with  *0 < i < arr.length - 1*  such that: 
 <ul> 
  -  *arr[0] < arr[1] < ... < arr[i - 1] < arr[i]*  
  -  *arr[i] > arr[i + 1] > ... > arr[arr.length - 1]*  
 </ul> 

Given an integer array  *arr* , return  *the length of the longest subarray, which is a mountain* . Return  *0*  if there is no mountain subarray.



**Example 1:** 

```
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.

```

**Example 2:** 

```
Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.

```



**Constraints:** 

-  *1 <= arr.length <= 104*  
-  *0 <= arr[i] <= 104* 



**Follow up:** 

- Can you solve it using only one pass? 
- Can you solve it in  *O(1)*  space?


# [845. 数组中的最长山脉][cnTitle]

**中等**

我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “ *山脉”* ：

-  *B.length >= 3*  
- 存在  *0 < i < B.length - 1*  使得  *B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]* 

（注意：B 可以是 A 的任意子数组，包括整个数组 A。）

给出一个整数数组  *A* ，返回最长  *“山脉”*  的长度。

如果不含有 “ *山脉”* 则返回  *0* 。



**示例 1：** 

```
输入：[2,1,4,7,3,2,5]
输出：5
解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。

```

**示例 2：** 

```
输入：[2,2,2]
输出：0
解释：不含 “山脉”。

```



**提示：** 

1.  *0 <= A.length <= 10000*  
2.  *0 <= A[i] <= 10000* 




# 算法思路

# 测试用例
```
845. Longest Mountain in Array 845. 数组中的最长山脉 Medium
```

[enTitle]: https://leetcode.com/problems/longest-mountain-in-array/
[cnTitle]: https://leetcode-cn.com/problems/longest-mountain-in-array/
