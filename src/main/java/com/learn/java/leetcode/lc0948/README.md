# [948. Bag of Tokens][enTitle]

**Medium**

You have an initial **power**  of  *P* , an initial **score**  of  *0* , and a bag of  *tokens*  where  *tokens[i]*  is the value of the  *ith*  token (0-indexed).

Your goal is to maximize your total **score**  by potentially playing each token in one of two ways:

- If your current **power**  is at least  *tokens[i]* , you may play the  *ith*  token face up, losing  *tokens[i]*  **power**  and gaining  *1*  **score** . 
- If your current **score**  is at least  *1* , you may play the  *ith*  token face down, gaining  *tokens[i]*  **power**  and losing  *1*  **score** .

Each token may be played **at most**  once and **in any order** . You do **not**  have to play all the tokens.

Return  *the largest possible score you can achieve after playing any number of tokens* .



**Example 1:** 

```
Input: tokens = [100], P = 50
Output: 0
Explanation: Playing the only token in the bag is impossible because you either have too little power or too little score.

```

**Example 2:** 


<pre><strong>Input:</strong> tokens = [100,200], P = 150
<strong>Output:</strong> 1
<strong>Explanation:</strong> Play the 0<sup>th</sup> token (100) face up, your power becomes 50 and score becomes 1.
There is no need to play the 1<sup>st</sup> token since you cannot play it face up to add to your score.
</pre>

**Example 3:** 


<pre><strong>Input:</strong> tokens = [100,200,300,400], P = 200
<strong>Output:</strong> 2
<strong>Explanation:</strong> Play the tokens in this order to get a score of 2:
1. Play the 0<sup>th</sup> token (100) face up, your power becomes 100 and score becomes 1.
2. Play the 3<sup>rd</sup> token (400) face down, your power becomes 500 and score becomes 0.
3. Play the 1<sup>st</sup> token (200) face up, your power becomes 300 and score becomes 1.
4. Play the 2<sup>nd </sup>token (300) face up, your power becomes 0 and score becomes 2.
</pre>



**Constraints:** 

-  *0 <= tokens.length <= 1000*  
-  *0 <= tokens[i], P < 104* 


# [948. 令牌放置][cnTitle]

**中等**

你的初始 **能量**  为  *P* ，初始 **分数**  为  *0* ，只有一包令牌  *tokens*  。其中  *tokens[i]*  是第  *i*  个令牌的值（下标从 0 开始）。

令牌可能的两种使用方法如下：

- 如果你至少有  *token[i]*  点 **能量**  ，可以将令牌  *i*  置为正面朝上，失去  *token[i]*  点 **能量**  ，并得到  *1*  **分**  。 
- 如果我们至少有  *1*  **分** ，可以将令牌  *i*  置为反面朝上，获得  *token[i]*  点 **能量**  ，并失去  *1*  **分**  。

每个令牌 **最多**  只能使用一次，使用 **顺序不限**  ，**不需**  使用所有令牌。

在使用任意数量的令牌后，返回我们可以得到的最大 **分数**  。





**示例 1：** 

```
输入：tokens = [100], P = 50
输出：0
解释：无法使用唯一的令牌，因为能量和分数都太少了。
```

**示例 2：** 

```
输入：tokens = [100,200], P = 150
输出：1
解释：令牌 0 正面朝上，能量变为 50，分数变为 1 。不必使用令牌 1 ，因为你无法使用它来提高分数。
```

**示例 3：** 

```
输入：tokens = [100,200,300,400], P = 200
输出：2
解释：按下面顺序使用令牌可以得到 2 分：
1. 令牌 0 正面朝上，能量变为 100 ，分数变为 1
2. 令牌 3 正面朝下，能量变为 500 ，分数变为 0
3. 令牌 1 正面朝上，能量变为 300 ，分数变为 1
4. 令牌 2 正面朝上，能量变为 0 ，分数变为 2
```



**提示：** 

-  *0 <= tokens.length <= 1000*  
-  *0 <= tokens[i], P < 104* 




# 算法思路

# 测试用例
```
948. Bag of Tokens 948. 令牌放置 Medium
```

[enTitle]: https://leetcode.com/problems/bag-of-tokens/
[cnTitle]: https://leetcode-cn.com/problems/bag-of-tokens/
