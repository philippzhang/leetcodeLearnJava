# [1420. Build Array Where You Can Find The Maximum Exactly K Comparisons][enTitle]

**Hard**

Given three integers  *n* ,  *m*  and  *k* . Consider the following algorithm to find the maximum element of an array of positive integers:

![img](https://assets.leetcode.com/uploads/2020/04/02/e.png)

You should build the array arr which has the following properties:

-  *arr*  has exactly  *n*  integers. 
-  *1 <= arr[i] <= m*  where  *(0 <= i < n)* . 
- After applying the mentioned algorithm to  *arr* , the value  *search_cost*  is equal to  *k* .

Return  *the number of ways*  to build the array  *arr*  under the mentioned conditions. As the answer may grow large, the answer **must be**  computed modulo  *10^9 + 7* .



**Example 1:** 

```
Input: n = 2, m = 3, k = 1
Output: 6
Explanation: The possible arrays are [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]

```

**Example 2:** 

```
Input: n = 5, m = 2, k = 3
Output: 0
Explanation: There are no possible arrays that satisify the mentioned conditions.

```

**Example 3:** 

```
Input: n = 9, m = 1, k = 1
Output: 1
Explanation: The only possible array is [1, 1, 1, 1, 1, 1, 1, 1, 1]

```

**Example 4:** 

```
Input: n = 50, m = 100, k = 25
Output: 34549172
Explanation: Don't forget to compute the answer modulo 1000000007

```

**Example 5:** 

```
Input: n = 37, m = 17, k = 7
Output: 418930126

```



**Constraints:** 

-  *1 <= n <= 50*  
-  *1 <= m <= 100*  
-  *0 <= k <= n* 


# [1420. 生成数组][cnTitle]

**困难**

给你三个整数  *n* 、 *m*  和  *k*  。下图描述的算法用于找出正整数数组中最大的元素。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/04/19/e.png)

请你生成一个具有下述属性的数组  *arr*  ：

-  *arr*  中有  *n*  个整数。 
-  *1 <= arr[i] <= m*  其中  *(0 <= i < n)*  。 
- 将上面提到的算法应用于  *arr*  ， *search_cost*  的值等于  *k*  。

返回上述条件下生成数组  *arr*  的 **方法数**  ，由于答案可能会很大，所以 **必须**  对  *10^9 + 7*  取余。



**示例 1：** 

```
输入：n = 2, m = 3, k = 1
输出：6
解释：可能的数组分别为 [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]

```

**示例 2：** 

```
输入：n = 5, m = 2, k = 3
输出：0
解释：没有数组可以满足上述条件

```

**示例 3：** 

```
输入：n = 9, m = 1, k = 1
输出：1
解释：可能的数组只有 [1, 1, 1, 1, 1, 1, 1, 1, 1]

```

**示例 4：** 

```
输入：n = 50, m = 100, k = 25
输出：34549172
解释：不要忘了对 1000000007 取余

```

**示例 5：** 

```
输入：n = 37, m = 17, k = 7
输出：418930126

```



**提示：** 

-  *1 <= n <= 50*  
-  *1 <= m <= 100*  
-  *0 <= k <= n* 




# 算法思路

# 测试用例
```
1420. Build Array Where You Can Find The Maximum Exactly K Comparisons 1420. 生成数组 Hard
```

[enTitle]: https://leetcode.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/
[cnTitle]: https://leetcode-cn.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/
