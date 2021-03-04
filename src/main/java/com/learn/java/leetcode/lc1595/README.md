# [1595. Minimum Cost to Connect Two Groups of Points][enTitle]

**Hard**

You are given two groups of points where the first group has  *size1*  points, the second group has  *size2*  points, and  *size1 >= size2* .

The  *cost*  of the connection between any two points are given in an  *size1 x size2*  matrix where  *cost[i][j]*  is the cost of connecting point  *i*  of the first group and point  *j*  of the second group. The groups are connected if **each point in both groups is connected to one or more points in the opposite group** . In other words, each point in the first group must be connected to at least one point in the second group, and each point in the second group must be connected to at least one point in the first group.

Return  *the minimum cost it takes to connect the two groups* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/03/ex1.jpg)

```
Input: cost = [[15, 96], [36, 2]]
Output: 17
Explanation: The optimal way of connecting the groups is:
1--A
2--B
This results in a total cost of 17.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/09/03/ex2.jpg)

```
Input: cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]
Output: 4
Explanation: The optimal way of connecting the groups is:
1--A
2--B
2--C
3--A
This results in a total cost of 4.
Note that there are multiple points connected to point 2 in the first group and point A in the second group. This does not matter as there is no limit to the number of points that can be connected. We only care about the minimum total cost.

```

**Example 3:** 

```
Input: cost = [[2, 5, 1], [3, 4, 7], [8, 1, 2], [6, 2, 4], [3, 8, 8]]
Output: 10

```



**Constraints:** 

-  *size1 == cost.length*  
-  *size2 == cost[i].length*  
-  *1 <= size1, size2 <= 12*  
-  *size1 >= size2*  
-  *0 <= cost[i][j] <= 100* 


# [1595. 连通两组点的最小成本][cnTitle]

**困难**

给你两组点，其中第一组中有  *size1*  个点，第二组中有  *size2*  个点，且  *size1 >= size2*  。

任意两点间的连接成本  *cost*  由大小为  *size1 x size2*  矩阵给出，其中  *cost[i][j]*  是第一组中的点  *i*  和第二组中的点  *j*  的连接成本。**如果两个组中的每个点都与另一组中的一个或多个点连接，则称这两组点是连通的。** 换言之，第一组中的每个点必须至少与第二组中的一个点连接，且第二组中的每个点必须至少与第一组中的一个点连接。

返回连通两组点所需的最小成本。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/20/ex1.jpg)

```
输入：cost = [[15, 96], [36, 2]]
输出：17
解释：连通两组点的最佳方法是：
1--A
2--B
总成本为 17 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/20/ex2.jpg)

```
输入：cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]
输出：4
解释：连通两组点的最佳方法是：
1--A
2--B
2--C
3--A
最小成本为 4 。
请注意，虽然有多个点连接到第一组中的点 2 和第二组中的点 A ，但由于题目并不限制连接点的数目，所以只需要关心最低总成本。
```

**示例 3：** 

```
输入：cost = [[2, 5, 1], [3, 4, 7], [8, 1, 2], [6, 2, 4], [3, 8, 8]]
输出：10

```



**提示：** 

-  *size1 == cost.length*  
-  *size2 == cost[i].length*  
-  *1 <= size1, size2 <= 12*  
-  *size1 >= size2*  
-  *0 <= cost[i][j] <= 100* 




# 算法思路

# 测试用例
```
1595. Minimum Cost to Connect Two Groups of Points 1595. 连通两组点的最小成本 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-cost-to-connect-two-groups-of-points/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-to-connect-two-groups-of-points/
