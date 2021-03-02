# [808. Soup Servings][enTitle]

**Medium**

There are two types of soup: type A and type B. Initially we have  *N*  ml of each type of soup. There are four kinds of operations:

1. Serve 100 ml of soup A and 0 ml of soup B 
2. Serve 75 ml of soup A and 25 ml of soup B 
3. Serve 50 ml of soup A and 50 ml of soup B 
4. Serve 25 ml of soup A and 75 ml of soup B

When we serve some soup, we give it to someone and we no longer have it. Each turn, we will choose from the four operations with equal probability 0.25. If the remaining volume of soup is not enough to complete the operation, we will serve as much as we can. We stop once we no longer have some quantity of both types of soup.

Note that we do not have the operation where all 100 ml's of soup B are used first.

Return the probability that soup A will be empty first, plus half the probability that A and B become empty at the same time.



```
Example:
Input: N = 50
Output: 0.625
Explanation: 
If we choose the first two operations, A will become empty first. For the third operation, A and B will become empty at the same time. For the fourth operation, B will become empty first. So the total probability of A becoming empty first plus half the probability that A and B become empty at the same time, is 0.25 * (1 + 1 + 0.5 + 0) = 0.625.


```

**Notes:** 

-  *0 <= N <= 10^9* .  
- Answers within  *10^-6*  of the true value will be accepted as correct.


# [808. 分汤][cnTitle]

**中等**

有 A 和 B 两种类型的汤。一开始每种类型的汤有  *N*  毫升。有四种分配操作：

1. 提供 100ml 的汤A 和 0ml 的汤B。 
2. 提供 75ml 的汤A 和 25ml 的汤B。 
3. 提供 50ml 的汤A 和 50ml 的汤B。 
4. 提供 25ml 的汤A 和 75ml 的汤B。

当我们把汤分配给某人之后，汤就没有了。每个回合，我们将从四种概率同为0.25的操作中进行分配选择。如果汤的剩余量不足以完成某次操作，我们将尽可能分配。当两种类型的汤都分配完时，停止操作。

注意不存在先分配100 ml汤B的操作。

需要返回的值： 汤A先分配完的概率 + 汤A和汤B同时分配完的概率 / 2。

```
示例:
输入: N = 50
输出: 0.625
解释:如果我们选择前两个操作，A将首先变为空。对于第三个操作，A和B会同时变为空。对于第四个操作，B将首先变为空。所以A变为空的总概率加上A和B同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。

```

**注释:** 

-  *0 <= N <= 10^9* 。 
-  返回值在 10^-6 的范围将被认为是正确的。 




# 算法思路

# 测试用例
```
808. Soup Servings 808. 分汤 Medium
```

[enTitle]: https://leetcode.com/problems/soup-servings/
[cnTitle]: https://leetcode-cn.com/problems/soup-servings/
