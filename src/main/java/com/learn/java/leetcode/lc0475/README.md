# [475. Heaters][enTitle]

**Medium**

Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.

Every house can be warmed, as long as the house is within the heater's warm radius range.

Given the positions of  *houses*  and  *heaters*  on a horizontal line, return  *the minimum radius standard of heaters so that those heaters could cover all houses.* 

**Notice**  that all the  *heaters*  follow your radius standard, and the warm radius will the same.



**Example 1:** 

```
Input: houses = [1,2,3], heaters = [2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.

```

**Example 2:** 

```
Input: houses = [1,2,3,4], heaters = [1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, then all the houses can be warmed.

```

**Example 3:** 

```
Input: houses = [1,5], heaters = [2]
Output: 3

```



**Constraints:** 

-  *1 <= houses.length, heaters.length <= 3 * 104*  
-  *1 <= houses[i], heaters[i] <= 109* 


# [475. 供暖器][cnTitle]

**中等**

冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。

在加热器的加热半径范围内的每个房屋都可以获得供暖。

现在，给出位于一条水平线上的房屋  *houses*  和供暖器  *heaters*  的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。

**说明** ：所有供暖器都遵循你的半径标准，加热的半径也一样。



**示例 1:** 

```
输入: houses = [1,2,3], heaters = [2]
输出: 1
解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。

```

**示例 2:** 

```
输入: houses = [1,2,3,4], heaters = [1,4]
输出: 1
解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。

```

**示例 3：** 

```
输入：houses = [1,5], heaters = [2]
输出：3

```



**提示：** 

-  *1 <= houses.length, heaters.length <= 3 * 104*  
-  *1 <= houses[i], heaters[i] <= 109* 




# 算法思路

# 测试用例
```
475. Heaters 475. 供暖器 Medium
```

[enTitle]: https://leetcode.com/problems/heaters/
[cnTitle]: https://leetcode-cn.com/problems/heaters/
