# [1437. Check If All 1's Are at Least Length K Places Away][enTitle]

**Easy**

Given an array  *nums*  of 0s and 1s and an integer  *k* , return  *True*  if all 1's are at least  *k*  places away from each other, otherwise return  *False* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/04/15/sample_1_1791.png)

```
Input: nums = [1,0,0,0,1,0,0,1], k = 2
Output: true
Explanation: Each of the 1s are at least 2 places away from each other.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/04/15/sample_2_1791.png)

```
Input: nums = [1,0,0,1,0,1], k = 2
Output: false
Explanation:The second 1 and third 1 are only one apart from each other.
```

**Example 3:** 

```
Input: nums = [1,1,1,1,1], k = 0
Output: true

```

**Example 4:** 

```
Input: nums = [0,1,0,1], k = 1
Output: true

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *0 <= k <= nums.length*  
-  *nums[i]*  is  *0*  or  *1* 


# [1437. 是否所有 1 都至少相隔 k 个元素][cnTitle]

**简单**

给你一个由若干  *0*  和  *1*  组成的数组  *nums*  以及整数  *k* 。如果所有  *1*  都至少相隔  *k*  个元素，则返回  *True*  ；否则，返回  *False*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/03/sample_1_1791.png)

```
输入：nums = [1,0,0,0,1,0,0,1], k = 2
输出：true
解释：每个 1 都至少相隔 2 个元素。
```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/03/sample_2_1791.png)

```
输入：nums = [1,0,0,1,0,1], k = 2
输出：false
解释：第二个 1 和第三个 1 之间只隔了 1 个元素。
```

**示例 3：** 

```
输入：nums = [1,1,1,1,1], k = 0
输出：true

```

**示例 4：** 

```
输入：nums = [0,1,0,1], k = 1
输出：true

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *0 <= k <= nums.length*  
-  *nums[i]*  的值为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1437. Check If All 1's Are at Least Length K Places Away 1437. 是否所有 1 都至少相隔 k 个元素 Easy
```

[enTitle]: https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
[cnTitle]: https://leetcode-cn.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
