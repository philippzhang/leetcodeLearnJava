# [1449. Form Largest Integer With Digits That Add up to Target][enTitle]

**Hard**

Given an array of integers  *cost*  and an integer  *target* . Return the **maximum**  integer you can paint under the following rules:

- The cost of painting a digit (i+1) is given by  *cost[i]*  (0 indexed). 
- The total cost used must be equal to  *target* . 
- Integer does not have digits 0.

Since the answer may be too large, return it as string.

If there is no way to paint any integer given the condition, return "0".



**Example 1:** 

```
Input: cost = [4,3,2,5,6,7,2,5,5], target = 9
Output: "7772"
Explanation: The cost to paint the digit '7' is 2, and the digit '2' is 3. Then cost("7772") = 2*3+ 3*1 = 9. You could also paint "977", but "7772" is the largest number.
Digit    cost
  1  ->   4
  2  ->   3
  3  ->   2
  4  ->   5
  5  ->   6
  6  ->   7
  7  ->   2
  8  ->   5
  9  ->   5

```

**Example 2:** 

```
Input: cost = [7,6,5,5,5,6,8,7,8], target = 12
Output: "85"
Explanation: The cost to paint the digit '8' is 7, and the digit '5' is 5. Then cost("85") = 7 + 5 = 12.

```

**Example 3:** 

```
Input: cost = [2,4,6,2,4,6,4,4,4], target = 5
Output: "0"
Explanation: It's not possible to paint any integer with total cost equal to target.

```

**Example 4:** 

```
Input: cost = [6,10,15,40,40,40,40,40,40], target = 47
Output: "32211"

```



**Constraints:** 

-  *cost.length == 9*  
-  *1 <= cost[i] <= 5000*  
-  *1 <= target <= 5000* 


# [1449. 数位成本和为目标值的最大数字][cnTitle]

**困难**

给你一个整数数组  *cost*  和一个整数  *target*  。请你返回满足如下规则可以得到的 **最大**  整数：

- 给当前结果添加一个数位（ *i + 1* ）的成本为  *cost[i]*  （ *cost*  数组下标从 0 开始）。 
- 总成本必须恰好等于  *target*  。 
- 添加的数位中没有数字 0 。

由于答案可能会很大，请你以字符串形式返回。

如果按照上述要求无法得到任何整数，请你返回 "0" 。



**示例 1：** 

```
输入：cost = [4,3,2,5,6,7,2,5,5], target = 9
输出："7772"
解释：添加数位 '7' 的成本为 2 ，添加数位 '2' 的成本为 3 。所以 "7772" 的代价为 2*3+ 3*1 = 9 。 "977" 也是满足要求的数字，但 "7772" 是较大的数字。
数字     成本
  1  ->   4
  2  ->   3
  3  ->   2
  4  ->   5
  5  ->   6
  6  ->   7
  7  ->   2
  8  ->   5
  9  ->   5

```

**示例 2：** 

```
输入：cost = [7,6,5,5,5,6,8,7,8], target = 12
输出："85"
解释：添加数位 '8' 的成本是 7 ，添加数位 '5' 的成本是 5 。"85" 的成本为 7 + 5 = 12 。

```

**示例 3：** 

```
输入：cost = [2,4,6,2,4,6,4,4,4], target = 5
输出："0"
解释：总成本是 target 的条件下，无法生成任何整数。

```

**示例 4：** 

```
输入：cost = [6,10,15,40,40,40,40,40,40], target = 47
输出："32211"

```



**提示：** 

-  *cost.length == 9*  
-  *1 <= cost[i] <= 5000*  
-  *1 <= target <= 5000* 




# 算法思路

# 测试用例
```
1449. Form Largest Integer With Digits That Add up to Target 1449. 数位成本和为目标值的最大数字 Hard
```

[enTitle]: https://leetcode.com/problems/form-largest-integer-with-digits-that-add-up-to-target/
[cnTitle]: https://leetcode-cn.com/problems/form-largest-integer-with-digits-that-add-up-to-target/
