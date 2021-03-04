# [1482. Minimum Number of Days to Make m Bouquets][enTitle]

**Medium**

Given an integer array  *bloomDay* , an integer  *m*  and an integer  *k* .

We need to make  *m*  bouquets. To make a bouquet, you need to use  *k*  **adjacent flowers**  from the garden.

The garden consists of  *n*  flowers, the  *ith*  flower will bloom in the  *bloomDay[i]*  and then can be used in **exactly one**  bouquet.

Return  *the minimum number of days*  you need to wait to be able to make  *m*  bouquets from the garden. If it is impossible to make  *m*  bouquets return **-1** .



**Example 1:** 

```
Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let's see what happened in the first three days. x means flower bloomed and _ means flower didn't bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.

```

**Example 2:** 

```
Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
Output: -1
Explanation: We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.

```

**Example 3:** 

```
Input: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
Output: 12
Explanation: We need 2 bouquets each should have 3 flowers.
Here's the garden after the 7 and 12 days:
After day 7: [x, x, x, x, _, x, x]
We can make one bouquet of the first three flowers that bloomed. We cannot make another bouquet from the last three flowers that bloomed because they are not adjacent.
After day 12: [x, x, x, x, x, x, x]
It is obvious that we can make two bouquets in different ways.

```

**Example 4:** 

```
Input: bloomDay = [1000000000,1000000000], m = 1, k = 1
Output: 1000000000
Explanation: You need to wait 1000000000 days to have a flower ready for a bouquet.

```

**Example 5:** 

```
Input: bloomDay = [1,10,2,9,3,8,4,7,5,6], m = 4, k = 2
Output: 9

```



**Constraints:** 

-  *bloomDay.length == n*  
-  *1 <= n <= 10^5*  
-  *1 <= bloomDay[i] <= 10^9*  
-  *1 <= m <= 10^6*  
-  *1 <= k <= n* 


# [1482. 制作 m 束花所需的最少天数][cnTitle]

**中等**

给你一个整数数组  *bloomDay* ，以及两个整数  *m*  和  *k*  。

现需要制作  *m*  束花。制作花束时，需要使用花园中 **相邻的 k 朵花**  。

花园中有  *n*  朵花，第  *i*  朵花会在  *bloomDay[i]*  时盛开，**恰好**  可以用于 **一束**  花中。

请你返回从花园中摘  *m*  束花需要等待的最少的天数。如果不能摘到  *m*  束花则返回 **-1**  。



**示例 1：** 

```
输入：bloomDay = [1,10,3,10,2], m = 3, k = 1
输出：3
解释：让我们一起观察这三天的花开过程，x 表示花开，而 _ 表示花还未开。
现在需要制作 3 束花，每束只需要 1 朵。
1 天后：[x, _, _, _, _]   // 只能制作 1 束花
2 天后：[x, _, _, _, x]   // 只能制作 2 束花
3 天后：[x, _, x, _, x]   // 可以制作 3 束花，答案为 3

```

**示例 2：** 

```
输入：bloomDay = [1,10,3,10,2], m = 3, k = 2
输出：-1
解释：要制作 3 束花，每束需要 2 朵花，也就是一共需要 6 朵花。而花园中只有 5 朵花，无法满足制作要求，返回 -1 。

```

**示例 3：** 

```
输入：bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
输出：12
解释：要制作 2 束花，每束需要 3 朵。
花园在 7 天后和 12 天后的情况如下：
7 天后：[x, x, x, x, _, x, x]
可以用前 3 朵盛开的花制作第一束花。但不能使用后 3 朵盛开的花，因为它们不相邻。
12 天后：[x, x, x, x, x, x, x]
显然，我们可以用不同的方式制作两束花。

```

**示例 4：** 

```
输入：bloomDay = [1000000000,1000000000], m = 1, k = 1
输出：1000000000
解释：需要等 1000000000 天才能采到花来制作花束

```

**示例 5：** 

```
输入：bloomDay = [1,10,2,9,3,8,4,7,5,6], m = 4, k = 2
输出：9

```



**提示：** 

-  *bloomDay.length == n*  
-  *1 <= n <= 10^5*  
-  *1 <= bloomDay[i] <= 10^9*  
-  *1 <= m <= 10^6*  
-  *1 <= k <= n* 




# 算法思路

# 测试用例
```
1482. Minimum Number of Days to Make m Bouquets 1482. 制作 m 束花所需的最少天数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/
