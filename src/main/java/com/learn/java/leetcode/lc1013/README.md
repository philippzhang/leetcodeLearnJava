# [1013. Partition Array Into Three Parts With Equal Sum][enTitle]

**Easy**

Given an array of integers  *arr* , return  *true*  if we can partition the array into three **non-empty**  parts with equal sums.

Formally, we can partition the array if we can find indexes  *i + 1 < j*  with  *(arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])* 



**Example 1:** 

```
Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation:0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

```

**Example 2:** 

```
Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false

```

**Example 3:** 

```
Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation:3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4

```



**Constraints:** 

-  *3 <= arr.length <= 5 * 104*  
-  *-104 <= arr[i] <= 104* 


# [1013. 将数组分成和相等的三个部分][cnTitle]

**简单**

给你一个整数数组  *A* ，只有可以将其划分为三个和相等的非空部分时才返回  *true* ，否则返回  *false* 。

形式上，如果可以找出索引  *i+1 < j*  且满足  *A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]*  就可以将数组三等分。



**示例 1：** 

```
输入：[0,2,1,-6,6,-7,9,1,2,0,1]
输出：true
解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

```

**示例 2：** 

```
输入：[0,2,1,-6,6,7,9,-1,2,0,1]
输出：false

```

**示例 3：** 

```
输入：[3,3,6,5,-2,2,5,1,-9,4]
输出：true
解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4

```



**提示：** 

1.  *3 <= A.length <= 50000*  
2.  *-10^4 <= A[i] <= 10^4* 




# 算法思路

# 测试用例
```
1013. Partition Array Into Three Parts With Equal Sum 1013. 将数组分成和相等的三个部分 Easy
```

[enTitle]: https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
[cnTitle]: https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
