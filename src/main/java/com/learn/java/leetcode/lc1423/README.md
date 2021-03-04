# [1423. Maximum Points You Can Obtain from Cards][enTitle]

**Medium**

There are several cards **arranged in a row** , and each card has an associated number of points The points are given in the integer array  *cardPoints* .

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly  *k*  cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array  *cardPoints*  and the integer  *k* , return the  *maximum score*  you can obtain.



**Example 1:** 

```
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

```

**Example 2:** 

```
Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.

```

**Example 3:** 

```
Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.

```

**Example 4:** 

```
Input: cardPoints = [1,1000,1], k = 1
Output: 1
Explanation: You cannot take the card in the middle. Your best score is 1. 

```

**Example 5:** 

```
Input: cardPoints = [1,79,80,1,1,1,200,1], k = 3
Output: 202

```



**Constraints:** 

-  *1 <= cardPoints.length <= 10^5*  
-  *1 <= cardPoints[i] <= 10^4*  
-  *1 <= k <= cardPoints.length* 


# [1423. 可获得的最大点数][cnTitle]

**中等**

几张卡牌**排成一行** ，每张卡牌都有一个对应的点数。点数由整数数组  *cardPoints*  给出。

每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿  *k*  张卡牌。

你的点数就是你拿到手中的所有卡牌的点数之和。

给你一个整数数组  *cardPoints*  和整数  *k* ，请你返回可以获得的最大点数。



**示例 1：** 

```
输入：cardPoints = [1,2,3,4,5,6,1], k = 3
输出：12
解释：第一次行动，不管拿哪张牌，你的点数总是 1 。但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。

```

**示例 2：** 

```
输入：cardPoints = [2,2,2], k = 2
输出：4
解释：无论你拿起哪两张卡牌，可获得的点数总是 4 。

```

**示例 3：** 

```
输入：cardPoints = [9,7,7,9,7,7,9], k = 7
输出：55
解释：你必须拿起所有卡牌，可以获得的点数为所有卡牌的点数之和。

```

**示例 4：** 

```
输入：cardPoints = [1,1000,1], k = 1
输出：1
解释：你无法拿到中间那张卡牌，所以可以获得的最大点数为 1 。 

```

**示例 5：** 

```
输入：cardPoints = [1,79,80,1,1,1,200,1], k = 3
输出：202

```



**提示：** 

-  *1 <= cardPoints.length <= 10^5*  
-  *1 <= cardPoints[i] <= 10^4*  
-  *1 <= k <= cardPoints.length* 




# 算法思路

# 测试用例
```
1423. Maximum Points You Can Obtain from Cards 1423. 可获得的最大点数 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
[cnTitle]: https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/
