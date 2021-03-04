# [1467. Probability of a Two Boxes Having The Same Number of Distinct Balls][enTitle]

**Hard**

Given  *2n*  balls of  *k*  distinct colors. You will be given an integer array  *balls*  of size  *k*  where  *balls[i]*  is the number of balls of color  *i* .

All the balls will be **shuffled uniformly at random** , then we will distribute the first  *n*  balls to the first box and the remaining  *n*  balls to the other box (Please read the explanation of the second example carefully).

Please note that the two boxes are considered different. For example, if we have two balls of colors  *a*  and  *b* , and two boxes  *[]*  and  *()* , then the distribution  *[a] (b)*  is considered different than the distribution  *[b] (a)* (Please read the explanation of the first example carefully).

We want to  *calculate the probability*  that the two boxes have the same number of distinct balls.



**Example 1:** 

```
Input: balls = [1,1]
Output: 1.00000
Explanation: Only 2 ways to divide the balls equally:
- A ball of color 1 to box 1 and a ball of color 2 to box 2
- A ball of color 2 to box 1 and a ball of color 1 to box 2
In both ways, the number of distinct colors in each box is equal. The probability is 2/2 = 1

```

**Example 2:** 

```
Input: balls = [2,1,1]
Output: 0.66667
Explanation: We have the set of balls [1, 1, 2, 3]
This set of balls will be shuffled randomly and we may have one of the 12 distinct shuffles with equale probability (i.e. 1/12):
[1,1 / 2,3], [1,1 / 3,2], [1,2 / 1,3], [1,2 / 3,1], [1,3 / 1,2], [1,3 / 2,1], [2,1 / 1,3], [2,1 / 3,1], [2,3 / 1,1], [3,1 / 1,2], [3,1 / 2,1], [3,2 / 1,1]
After that we add the first two balls to the first box and the second two balls to the second box.
We can see that 8 of these 12 possible random distributions have the same number of distinct colors of balls in each box.
Probability is 8/12 = 0.66667

```

**Example 3:** 

```
Input: balls = [1,2,1,2]
Output: 0.60000
Explanation: The set of balls is [1, 2, 2, 3, 4, 4]. It is hard to display all the 180 possible random shuffles of this set but it is easy to check that 108 of them will have the same number of distinct colors in each box.
Probability = 108 / 180 = 0.6

```

**Example 4:** 

```
Input: balls = [3,2,1]
Output: 0.30000
Explanation: The set of balls is [1, 1, 1, 2, 2, 3]. It is hard to display all the 60 possible random shuffles of this set but it is easy to check that 18 of them will have the same number of distinct colors in each box.
Probability = 18 / 60 = 0.3

```

**Example 5:** 

```
Input: balls = [6,6,6,6,6,6]
Output: 0.90327

```



**Constraints:** 

-  *1 <= balls.length <= 8*  
-  *1 <= balls[i] <= 6*  
-  *sum(balls)*  is even. 
- Answers within  *10^-5*  of the actual value will be accepted as correct.


# [1467. 两个盒子中球的颜色数相同的概率][cnTitle]

**困难**

桌面上有  *2n*  个颜色不完全相同的球，球上的颜色共有  *k*  种。给你一个大小为  *k*  的整数数组  *balls*  ，其中  *balls[i]*  是颜色为  *i*  的球的数量。

所有的球都已经 **随机打乱顺序**  ，前  *n*  个球放入第一个盒子，后  *n*  个球放入另一个盒子（请认真阅读示例 2 的解释部分）。

**注意：** 这两个盒子是不同的。例如，两个球颜色分别为  *a*  和  *b* ，盒子分别为  *[]*  和  *()* ，那么  *[a] (b)*  和  *[b] (a)*  这两种分配方式是不同的（请认真阅读示例 1 的解释部分）。

请计算「两个盒子中球的颜色数相同」的情况的概率。



**示例 1：** 

```
输入：balls = [1,1]
输出：1.00000
解释：球平均分配的方式只有两种：
- 颜色为 1 的球放入第一个盒子，颜色为 2 的球放入第二个盒子
- 颜色为 2 的球放入第一个盒子，颜色为 1 的球放入第二个盒子
这两种分配，两个盒子中球的颜色数都相同。所以概率为 2/2 = 1 。

```

**示例 2：** 

```
输入：balls = [2,1,1]
输出：0.66667
解释：球的列表为 [1, 1, 2, 3]
随机打乱，得到 12 种等概率的不同打乱方案，每种方案概率为 1/12 ：
[1,1 / 2,3], [1,1 / 3,2], [1,2 / 1,3], [1,2 / 3,1], [1,3 / 1,2], [1,3 / 2,1], [2,1 / 1,3], [2,1 / 3,1], [2,3 / 1,1], [3,1 / 1,2], [3,1 / 2,1], [3,2 / 1,1]
然后，我们将前两个球放入第一个盒子，后两个球放入第二个盒子。
这 12 种可能的随机打乱方式中的 8 种满足「两个盒子中球的颜色数相同」。
概率 = 8/12 = 0.66667

```

**示例 3：** 

```
输入：balls = [1,2,1,2]
输出：0.60000
解释：球的列表为 [1, 2, 2, 3, 4, 4]。要想显示所有 180 种随机打乱方案是很难的，但只检查「两个盒子中球的颜色数相同」的 108 种情况是比较容易的。
概率 = 108 / 180 = 0.6 。

```

**示例 4：** 

```
输入：balls = [3,2,1]
输出：0.30000
解释：球的列表为 [1, 1, 1, 2, 2, 3]。要想显示所有 60 种随机打乱方案是很难的，但只检查「两个盒子中球的颜色数相同」的 18 种情况是比较容易的。
概率 = 18 / 60 = 0.3 。

```

**示例 5：** 

```
输入：balls = [6,6,6,6,6,6]
输出：0.90327

```



**提示：** 

-  *1 <= balls.length <= 8*  
-  *1 <= balls[i] <= 6*  
-  *sum(balls)*  是偶数 
- 答案与真实值误差在  *10^-5*  以内，则被视为正确答案




# 算法思路

# 测试用例
```
1467. Probability of a Two Boxes Having The Same Number of Distinct Balls 1467. 两个盒子中球的颜色数相同的概率 Hard
```

[enTitle]: https://leetcode.com/problems/probability-of-a-two-boxes-having-the-same-number-of-distinct-balls/
[cnTitle]: https://leetcode-cn.com/problems/probability-of-a-two-boxes-having-the-same-number-of-distinct-balls/
