# [1558. Minimum Numbers of Function Calls to Make Target Array][enTitle]

**Medium**

![img](https://assets.leetcode.com/uploads/2020/07/10/sample_2_1887.png)

Your task is to form an integer array  *nums*  from an initial array of zeros  *arr*  that is the same size as  *nums* .

Return the minimum number of function calls to make  *nums*  from  *arr* .

The answer is guaranteed to fit in a 32-bit signed integer.



**Example 1:** 

```
Input: nums = [1,5]
Output: 5
Explanation: Increment by 1 (second element): [0, 0] to get [0, 1] (1 operation).
Double all the elements: [0, 1] -> [0, 2] -> [0, 4] (2 operations).
Increment by 1 (both elements)  [0, 4] -> [1, 4] -> [1, 5] (2 operations).
Total of operations: 1 + 2 + 2 = 5.

```

**Example 2:** 

```
Input: nums = [2,2]
Output: 3
Explanation: Increment by 1 (both elements) [0, 0] -> [0, 1] -> [1, 1] (2 operations).
Double all the elements: [1, 1] -> [2, 2] (1 operation).
Total of operations: 2 + 1 = 3.

```

**Example 3:** 

```
Input: nums = [4,2,5]
Output: 6
Explanation: (initial)[0,0,0] -> [1,0,0] -> [1,0,1] -> [2,0,2] -> [2,1,2] -> [4,2,4] -> [4,2,5](nums).

```

**Example 4:** 

```
Input: nums = [3,2,2,4]
Output: 7

```

**Example 5:** 

```
Input: nums = [2,4,8,16]
Output: 8

```



**Constraints:** 

-  *1 <= nums.length <= 10^5*  
-  *0 <= nums[i] <= 10^9* 


# [1558. 得到目标数组的最少函数调用次数][cnTitle]

**中等**

![img](https://assets.leetcode.com/uploads/2020/07/10/sample_2_1887.png)

给你一个与  *nums*  大小相同且初始值全为 0 的数组  *arr*  ，请你调用以上函数得到整数数组  *nums*  。

请你返回将  *arr*  变成  *nums*  的最少函数调用次数。

答案保证在 32 位有符号整数以内。



**示例 1：** 

```
输入：nums = [1,5]
输出：5
解释：给第二个数加 1 ：[0, 0] 变成 [0, 1] （1 次操作）。
将所有数字乘以 2 ：[0, 1] -> [0, 2] -> [0, 4] （2 次操作）。
给两个数字都加 1 ：[0, 4] -> [1, 4] -> [1, 5] （2 次操作）。
总操作次数为：1 + 2 + 2 = 5 。

```

**示例 2：** 

```
输入：nums = [2,2]
输出：3
解释：给两个数字都加 1 ：[0, 0] -> [0, 1] -> [1, 1] （2 次操作）。
将所有数字乘以 2 ： [1, 1] -> [2, 2] （1 次操作）。
总操作次数为： 2 + 1 = 3 。

```

**示例 3：** 

```
输入：nums = [4,2,5]
输出：6
解释：（初始）[0,0,0] -> [1,0,0] -> [1,0,1] -> [2,0,2] -> [2,1,2] -> [4,2,4] -> [4,2,5]（nums 数组）。

```

**示例 4：** 

```
输入：nums = [3,2,2,4]
输出：7

```

**示例 5：** 

```
输入：nums = [2,4,8,16]
输出：8

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *0 <= nums[i] <= 10^9* 




# 算法思路

# 测试用例
```
1558. Minimum Numbers of Function Calls to Make Target Array 1558. 得到目标数组的最少函数调用次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-numbers-of-function-calls-to-make-target-array/
[cnTitle]: https://leetcode-cn.com/problems/minimum-numbers-of-function-calls-to-make-target-array/
