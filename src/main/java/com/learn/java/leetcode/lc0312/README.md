# [312. Burst Balloons][enTitle]

**Hard**

Given  *n*  balloons, indexed from  *0*  to  *n-1* . Each balloon is painted with a number on it represented by array  *nums* . You are asked to burst all the balloons. If the you burst balloon  *i*  you will get  *nums[left] * nums[i] * nums[right]*  coins. Here  *left*  and  *right*  are adjacent indices of  *i* . After the burst, the  *left*  and  *right*  then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note:

- You may imagine  *nums[-1] = nums[n] = 1* . They are not real therefore you can not burst them. 
- 0 ≤  *n*  ≤ 500, 0 ≤  *nums[i]*  ≤ 100

Example:

```
Input: [3,1,5,8]
Output: 167 
Explanation:nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167

```


# [312. 戳气球][cnTitle]

**困难**

有  *n*  个气球，编号为 *0*  到  *n-1* ，每个气球上都标有一个数字，这些数字存在数组  *nums*  中。

现在要求你戳破所有的气球。每当你戳破一个气球  *i*  时，你可以获得  *nums[left] * nums[i] * nums[right]*  个硬币。 这里的  *left*  和  *right*  代表和  *i*  相邻的两个气球的序号。注意当你戳破了气球  *i*  后，气球  *left*  和气球  *right*  就变成了相邻的气球。

求所能获得硬币的最大数量。

**说明:** 

- 你可以假设  *nums[-1] = nums[n] = 1* ，但注意它们不是真实存在的所以并不能被戳破。 
- 0 ≤  *n*  ≤ 500, 0 ≤  *nums[i]*  ≤ 100

**示例:** 

```
输入: [3,1,5,8]
输出: 167 
解释:nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
     coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167

```




# 算法思路

# 测试用例
```
312. Burst Balloons 312. 戳气球 Hard
Solution.maxCoins
---
[3,1,5,8]

=167
```

[enTitle]: https://leetcode.com/problems/burst-balloons/
[cnTitle]: https://leetcode-cn.com/problems/burst-balloons/
