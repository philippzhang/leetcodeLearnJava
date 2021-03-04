# [1655. Distribute Repeating Integers][enTitle]

**Hard**

You are given an array of  *n*  integers,  *nums* , where there are at most  *50*  unique values in the array. You are also given an array of  *m*  customer order quantities,  *quantity* , where  *quantity[i]*  is the amount of integers the  *ith*  customer ordered. Determine if it is possible to distribute  *nums*  such that:

- The  *ith*  customer gets **exactly**   *quantity[i]*  integers, 
- The integers the  *ith*  customer gets are **all equal** , and 
- Every customer is satisfied.

Return  *true*  *if it is possible to distribute*  *nums*  *according to the above conditions* .



**Example 1:** 

```
Input: nums = [1,2,3,4], quantity = [2]
Output: false
Explanation: The 0th customer cannot be given two different integers.

```

**Example 2:** 

```
Input: nums = [1,2,3,3], quantity = [2]
Output: true
Explanation: The 0th customer is given [3,3]. The integers [1,2] are not used.

```

**Example 3:** 

```
Input: nums = [1,1,2,2], quantity = [2,2]
Output: true
Explanation: The 0th customer is given [1,1], and the 1st customer is given [2,2].

```

**Example 4:** 

```
Input: nums = [1,1,2,3], quantity = [2,2]
Output: false
Explanation: Although the 0th customer could be given [1,1], the 1st customer cannot be satisfied.
```

**Example 5:** 

```
Input: nums = [1,1,1,1,1], quantity = [2,3]
Output: true
Explanation: The 0th customer is given [1,1], and the 1st customer is given [1,1,1].

```



**Constraints:** 

-  *n == nums.length*  
-  *1 <= n <= 105*  
-  *1 <= nums[i] <= 1000*  
-  *m == quantity.length*  
-  *1 <= m <= 10*  
-  *1 <= quantity[i] <= 105*  
- There are at most  *50*  unique values in  *nums* .


# [1655. 分配重复整数][cnTitle]

**困难**

给你一个长度为  *n*  的整数数组  *nums*  ，这个数组中至多有  *50*  个不同的值。同时你有  *m*  个顾客的订单  *quantity*  ，其中，整数  *quantity[i]*  是第  *i*  位顾客订单的数目。请你判断是否能将  *nums*  中的整数分配给这些顾客，且满足：

- 第  *i*  位顾客 **恰好** 有  *quantity[i]*  个整数。 
- 第  *i*  位顾客拿到的整数都是 **相同的**  。 
- 每位顾客都满足上述两个要求。

如果你可以分配  *nums*  中的整数满足上面的要求，那么请返回  *true*  ，否则返回  *false*  。



**示例 1：** 

```
输入：nums = [1,2,3,4], quantity = [2]
输出：false
解释：第 0 位顾客没办法得到两个相同的整数。

```

**示例 2：** 

```
输入：nums = [1,2,3,3], quantity = [2]
输出：true
解释：第 0 位顾客得到 [3,3] 。整数 [1,2] 都没有被使用。

```

**示例 3：** 

```
输入：nums = [1,1,2,2], quantity = [2,2]
输出：true
解释：第 0 位顾客得到 [1,1] ，第 1 位顾客得到 [2,2] 。

```

**示例 4：** 

```
输入：nums = [1,1,2,3], quantity = [2,2]
输出：false
解释：尽管第 0 位顾客可以得到 [1,1] ，第 1 位顾客没法得到 2 个一样的整数。
```

**示例 5：** 

```
输入：nums = [1,1,1,1,1], quantity = [2,3]
输出：true
解释：第 0 位顾客得到 [1,1] ，第 1 位顾客得到 [1,1,1] 。

```



**提示：** 

-  *n == nums.length*  
-  *1 <= n <= 105*  
-  *1 <= nums[i] <= 1000*  
-  *m == quantity.length*  
-  *1 <= m <= 10*  
-  *1 <= quantity[i] <= 105*  
-  *nums*  中至多有  *50*  个不同的数字。




# 算法思路

# 测试用例
```
1655. Distribute Repeating Integers 1655. 分配重复整数 Hard
```

[enTitle]: https://leetcode.com/problems/distribute-repeating-integers/
[cnTitle]: https://leetcode-cn.com/problems/distribute-repeating-integers/
