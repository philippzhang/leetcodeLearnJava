# [1760. Minimum Limit of Balls in a Bag][enTitle]

**Medium**

You are given an integer array  *nums*  where the  *ith*  bag contains  *nums[i]*  balls. You are also given an integer  *maxOperations* .

You can perform the following operation at most  *maxOperations*  times:

- Take any bag of balls and divide it into two new bags with a **positive** number of balls. 
 <ul> 
  - For example, a bag of  *5*  balls can become two new bags of  *1*  and  *4*  balls, or two new bags of  *2*  and  *3*  balls. 
 </ul> 

Your penalty is the **maximum**  number of balls in a bag. You want to **minimize**  your penalty after the operations.

Return  *the minimum possible penalty after performing the operations* .



**Example 1:** 

```
Input: nums = [9], maxOperations = 2
Output: 3
Explanation: 
- Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
- Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.

```

**Example 2:** 

```
Input: nums = [2,4,8,2], maxOperations = 4
Output: 2
Explanation:
- Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -> [2,4,4,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -> [2,2,2,4,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -> [2,2,2,2,2,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2].
The bag with the most number of balls has 2 balls, so your penalty is 2 an you should return 2.

```

**Example 3:** 

```
Input: nums = [7,17], maxOperations = 2
Output: 7

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= maxOperations, nums[i] <= 109* 


# [1760. 袋子里最少数目的球][cnTitle]

**中等**

给你一个整数数组  *nums*  ，其中  *nums[i]*  表示第  *i*  个袋子里球的数目。同时给你一个整数  *maxOperations*  。

你可以进行如下操作至多  *maxOperations*  次：

- 选择任意一个袋子，并将袋子里的球分到 2 个新的袋子中，每个袋子里都有 **正整数**  个球。 
 <ul> 
  - 比方说，一个袋子里有  *5*  个球，你可以把它们分到两个新袋子里，分别有  *1*  个和  *4*  个球，或者分别有  *2*  个和  *3*  个球。 
 </ul> 

你的开销是单个袋子里球数目的 **最大值**  ，你想要 **最小化**  开销。

请你返回进行上述操作后的最小开销。



**示例 1：** 

```
输入：nums = [9], maxOperations = 2
输出：3
解释：
- 将装有 9 个球的袋子分成装有 6 个和 3 个球的袋子。[9] -> [6,3] 。
- 将装有 6 个球的袋子分成装有 3 个和 3 个球的袋子。[6,3] -> [3,3,3] 。
装有最多球的袋子里装有 3 个球，所以开销为 3 并返回 3 。

```

**示例 2：** 

```
输入：nums = [2,4,8,2], maxOperations = 4
输出：2
解释：
- 将装有 8 个球的袋子分成装有 4 个和 4 个球的袋子。[2,4,8,2] -> [2,4,4,4,2] 。
- 将装有 4 个球的袋子分成装有 2 个和 2 个球的袋子。[2,4,4,4,2] -> [2,2,2,4,4,2] 。
- 将装有 4 个球的袋子分成装有 2 个和 2 个球的袋子。[2,2,2,4,4,2] -> [2,2,2,2,2,4,2] 。
- 将装有 4 个球的袋子分成装有 2 个和 2 个球的袋子。[2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2] 。
装有最多球的袋子里装有 2 个球，所以开销为 2 并返回 2 。

```

**示例 3：** 

```
输入：nums = [7,17], maxOperations = 2
输出：7

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= maxOperations, nums[i] <= 109* 




# 算法思路

# 测试用例
```
1760. Minimum Limit of Balls in a Bag 1760. 袋子里最少数目的球 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/
[cnTitle]: https://leetcode-cn.com/problems/minimum-limit-of-balls-in-a-bag/
