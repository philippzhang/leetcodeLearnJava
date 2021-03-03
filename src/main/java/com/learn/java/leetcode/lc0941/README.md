# [941. Valid Mountain Array][enTitle]

**Easy**

Given an array of integers  *arr* , return  *true if and only if it is a valid mountain array* .

Recall that arr is a mountain array if and only if:

-  *arr.length >= 3*  
- There exists some  *i*  with  *0 < i < arr.length - 1*  such that: 
 <ul> 
  -  *arr[0] < arr[1] < ... < arr[i - 1] < arr[i]*  
  -  *arr[i] > arr[i + 1] > ... > arr[arr.length - 1]*  
 </ul> 

![img](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)



**Example 1:** 

```
Input: arr = [2,1]
Output: false

```

**Example 2:** 

```
Input: arr = [3,5,5]
Output: false

```

**Example 3:** 

```
Input: arr = [0,3,2,1]
Output: true

```



**Constraints:** 

-  *1 <= arr.length <= 104*  
-  *0 <= arr[i] <= 104* 


# [941. 有效的山脉数组][cnTitle]

**简单**

给定一个整数数组  *arr* ，如果它是有效的山脉数组就返回  *true* ，否则返回  *false* 。

让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：

-  *arr.length >= 3*  
- 在  *0 < i < arr.length - 1*  条件下，存在  *i*  使得： 
 <ul> 
  -  *arr[0] < arr[1] < ... arr[i-1] < arr[i]*  
  -  *arr[i] > arr[i+1] > ... > arr[arr.length - 1]*  
 </ul> 



![img](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)



**示例 1：** 

```
输入：arr = [2,1]
输出：false

```

**示例 2：** 

```
输入：arr = [3,5,5]
输出：false

```

**示例 3：** 

```
输入：arr = [0,3,2,1]
输出：true
```



**提示：** 

-  *1 <= arr.length <= 104*  
-  *0 <= arr[i] <= 104* 




# 算法思路

# 测试用例
```
941. Valid Mountain Array 941. 有效的山脉数组 Easy
```

[enTitle]: https://leetcode.com/problems/valid-mountain-array/
[cnTitle]: https://leetcode-cn.com/problems/valid-mountain-array/
