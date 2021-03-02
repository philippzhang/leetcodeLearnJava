# [837. New 21 Game][enTitle]

**Medium**

Alice plays the following game, loosely based on the card game "21".

Alice starts with  *0*  points, and draws numbers while she has less than  *K*  points. During each draw, she gains an integer number of points randomly from the range  *[1, W]* , where  *W*  is an integer. Each draw is independent and the outcomes have equal probabilities.

Alice stops drawing numbers when she gets  *K*  or more points. What is the probability that she has  *N*  or less points?

**Example 1:** 

```
Input:N = 10, K = 1, W = 10
Output:1.00000
Explanation: Alice gets a single card, then stops.

```

**Example 2:** 

```
Input:N = 6, K = 1, W = 10
Output:0.60000
Explanation: Alice gets a single card, then stops.
In 6 out of W = 10 possibilities, she is at or below N = 6 points.

```

**Example 3:** 

```
Input:N = 21, K = 17, W = 10
Output:0.73278
```

**Note:** 

1.  *0 <= K <= N <= 10000*  
2.  *1 <= W <= 10000*  
3. Answers will be accepted as correct if they are within  *10^-5*  of the correct answer. 
4. The judging time limit has been reduced for this question.


# [837. 新21点][cnTitle]

**中等**

爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：

爱丽丝以  *0*  分开始，并在她的得分少于  *K*  分时抽取数字。 抽取时，她从  *[1, W]*  的范围中随机获得一个整数作为分数进行累计，其中  *W*  是整数。 每次抽取都是独立的，其结果具有相同的概率。

当爱丽丝获得不少于  *K*  分时，她就停止抽取数字。 爱丽丝的分数不超过  *N*  的概率是多少？



**示例** **1** **：** 

```
输入：N = 10, K = 1, W = 10
输出：1.00000
说明：爱丽丝得到一张卡，然后停止。
```

**示例** **2** **：** 

```
输入：N = 6, K = 1, W = 10
输出：0.60000
说明：爱丽丝得到一张卡，然后停止。
在 W = 10 的 6 种可能下，她的得分不超过 N = 6 分。
```

**示例** **3** **：** 

```
输入：N = 21, K = 17, W = 10
输出：0.73278
```



**提示：** 

1.  *0 <= K <= N <= 10000*  
2.  *1 <= W <= 10000*  
3. 如果答案与正确答案的误差不超过  *10^-5* ，则该答案将被视为正确答案通过。 
4. 此问题的判断限制时间已经减少。




# 算法思路

# 测试用例
```
837. New 21 Game 837. 新21点 Medium
```

[enTitle]: https://leetcode.com/problems/new-21-game/
[cnTitle]: https://leetcode-cn.com/problems/new-21-game/
