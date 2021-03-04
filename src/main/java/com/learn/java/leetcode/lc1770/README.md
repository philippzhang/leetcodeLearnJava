# [1770. Maximum Score from Performing Multiplication Operations][enTitle]

**Medium**

You are given two integer arrays  *nums*  and  *multipliers* **** of size  *n*  and  *m*  respectively, where  *n >= m* . The arrays are **1-indexed** .

You begin with a score of  *0* . You want to perform **exactly**   *m*  operations. On the  *ith*  operation **(1-indexed)** , you will:

- Choose one integer  *x*  from **either the start or the end** of the array  *nums* . 
- Add  *multipliers[i] * x*  to your score. 
- Remove  *x*  from the array  *nums* .

Return  *the maximum score after performing*  *m*   *operations.* 



**Example 1:** 

```
Input: nums = [1,2,3], multipliers = [3,2,1]
Output: 14
Explanation: An optimal solution is as follows:
- Choose from the end, [1,2,3], adding 3 * 3 = 9 to the score.
- Choose from the end, [1,2], adding 2 * 2 = 4 to the score.
- Choose from the end, [1], adding 1 * 1 = 1 to the score.
The total score is 9 + 4 + 1 = 14.
```

**Example 2:** 

```
Input: nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
Output: 102
Explanation:An optimal solution is as follows:
- Choose from the start, [-5,-3,-3,-2,7,1], adding -5 * -10 = 50 to the score.
- Choose from the start, [-3,-3,-2,7,1], adding -3 * -5 = 15 to the score.
- Choose from the start, [-3,-2,7,1], adding -3 * 3 = -9 to the score.
- Choose from the end, [-2,7,1], adding 1 * 4 = 4 to the score.
- Choose from the end, [-2,7], adding 7 * 6 = 42 to the score. 
The total score is 50 + 15 - 9 + 4 + 42 = 102.

```



**Constraints:** 

-  *n == nums.length*  
-  *m == multipliers.length*  
-  *1 <= m <= 103*  
-  *m <= n <= 105*  
-  *-1000 <= nums[i], multipliers[i] <= 1000* 


# [1770. 执行乘法运算的最大分数][cnTitle]

**中等**

给你两个长度分别  *n*  和  *m*  的整数数组  *nums*  和  *multipliers* **** ，其中  *n >= m*  ，数组下标 **从 1 开始**  计数。

初始时，你的分数为  *0*  。你需要执行恰好  *m*  步操作。在第  *i*  步操作（**从 1 开始**  计数）中，需要：

- 选择数组  *nums*  **开头处或者末尾处**  的整数  *x*  。 
- 你获得  *multipliers[i] * x*  分，并累加到你的分数中。 
- 将  *x*  从数组  *nums*  中移除。

在执行 *m*  步操作后，返回 **最大**  分数 *。* 



**示例 1：** 

```
输入：nums = [1,2,3], multipliers = [3,2,1]
输出：14
解释：一种最优解决方案如下：
- 选择末尾处的整数 3 ，[1,2,3] ，得 3 * 3 = 9 分，累加到分数中。
- 选择末尾处的整数 2 ，[1,2] ，得 2 * 2 = 4 分，累加到分数中。
- 选择末尾处的整数 1 ，[1] ，得 1 * 1 = 1 分，累加到分数中。
总分数为 9 + 4 + 1 = 14 。
```

**示例 2：** 

```
输入：nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
输出：102
解释：一种最优解决方案如下：
- 选择开头处的整数 -5 ，[-5,-3,-3,-2,7,1] ，得 -5 * -10 = 50 分，累加到分数中。
- 选择开头处的整数 -3 ，[-3,-3,-2,7,1] ，得 -3 * -5 = 15 分，累加到分数中。
- 选择开头处的整数 -3 ，[-3,-2,7,1] ，得 -3 * 3 = -9 分，累加到分数中。
- 选择末尾处的整数 1 ，[-2,7,1] ，得 1 * 4 = 4 分，累加到分数中。
- 选择末尾处的整数 7 ，[-2,7] ，得 7 * 6 = 42 分，累加到分数中。
总分数为 50 + 15 - 9 + 4 + 42 = 102 。

```



**提示：** 

-  *n == nums.length*  
-  *m == multipliers.length*  
-  *1 <= m <= 103*  
-  *m <= n <= 105*  
-  *-1000 <= nums[i], multipliers[i] <= 1000* 




# 算法思路

# 测试用例
```
1770. Maximum Score from Performing Multiplication Operations 1770. 执行乘法运算的最大分数 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
[cnTitle]: https://leetcode-cn.com/problems/maximum-score-from-performing-multiplication-operations/
