# [506. Relative Ranks][enTitle]

**Easy**

You are given an integer array  *score*  of size  *n* , where  *score[i]*  is the score of the  *ith*  athlete in a competition. All the scores are guaranteed to be **unique** .

The athletes are **placed**  based on their scores, where the  *1st*  place athlete has the highest score, the  *2nd*  place athlete has the  *2nd*  highest score, and so on. The placement of each athlete determines their rank:

- The  *1st*  place athlete's rank is  *"Gold Medal"* . 
- The  *2nd*  place athlete's rank is  *"Silver Medal"* . 
- The  *3rd*  place athlete's rank is  *"Bronze Medal"* . 
- For the  *4th*  place to the  *nth*  place athlete, their rank is their placement number (i.e., the  *xth*  place athlete's rank is  *"x"* ).

Return an array  *answer*  of size  *n*  where  *answer[i]*  is the **rank**  of the  *ith*  athlete.



**Example 1:** 


<pre><strong>Input:</strong> score = [5,4,3,2,1]
<strong>Output:</strong> ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
<strong>Explanation:</strong> The placements are [1<sup>st</sup>, 2<sup>nd</sup>, 3<sup>rd</sup>, 4<sup>th</sup>, 5<sup>th</sup>].</pre>

**Example 2:** 


<pre><strong>Input:</strong> score = [10,3,8,9,4]
<strong>Output:</strong> ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
<strong>Explanation:</strong> The placements are [1<sup>st</sup>, 5<sup>th</sup>, 3<sup>rd</sup>, 2<sup>nd</sup>, 4<sup>th</sup>].

</pre>



**Constraints:** 

-  *n == score.length*  
-  *1 <= n <= 104*  
-  *0 <= score[i] <= 106*  
- All the values in  *score*  are **unique** .


# [506. 相对名次][cnTitle]

**简单**

给出 **N**  名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。

(注：分数越高的选手，排名越靠前。)

**示例 1:** 

```
输入: [5, 4, 3, 2, 1]
输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
```

**提示:** 

1. N 是一个正整数并且不会超过 10000。 
2. 所有运动员的成绩都不相同。




# 算法思路

# 测试用例
```
506. Relative Ranks 506. 相对名次 Easy
```

[enTitle]: https://leetcode.com/problems/relative-ranks/
[cnTitle]: https://leetcode-cn.com/problems/relative-ranks/
