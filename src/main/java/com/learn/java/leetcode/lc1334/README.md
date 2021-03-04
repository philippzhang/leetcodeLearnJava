# [1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance][enTitle]

**Medium**

There are  *n*  cities numbered from  *0*  to  *n-1* . Given the array  *edges*  where  *edges[i] = [fromi, toi, weighti]*  represents a bidirectional and weighted edge between cities  *fromi*  and  *toi* , and given the integer  *distanceThreshold* .

Return the city with the smallest number of cities that are reachable through some path and whose distance is **at most**   *distanceThreshold* , If there are multiple such cities, return the city with the greatest number.

Notice that the distance of a path connecting cities  *i*  and  *j*  is equal to the sum of the edges' weights along that path.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/16/find_the_city_01.png)

```
Input: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
Output: 3
Explanation:The figure above describes the graph. 
The neighboring cities at a distanceThreshold = 4 for each city are:
City 0 -> [City 1, City 2] 
City 1 -> [City 0, City 2, City 3] 
City 2 -> [City 0, City 1, City 3] 
City 3 -> [City 1, City 2] 
Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/16/find_the_city_02.png)

```
Input: n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
Output: 0
Explanation:The figure above describes the graph. 
The neighboring cities at a distanceThreshold = 2 for each city are:
City 0 -> [City 1] 
City 1 -> [City 0, City 4] 
City 2 -> [City 3, City 4] 
City 3 -> [City 2, City 4]
City 4 -> [City 1, City 2, City 3] 
The city 0 has 1 neighboring city at a distanceThreshold = 2.

```



**Constraints:** 

-  *2 <= n <= 100*  
-  *1 <= edges.length <= n * (n - 1) / 2*  
-  *edges[i].length == 3*  
-  *0 <= fromi < toi < n*  
-  *1 <= weighti, distanceThreshold <= 10^4*  
- All pairs  *(fromi, toi)*  are distinct.


# [1334. 阈值距离内邻居最少的城市][cnTitle]

**中等**

有  *n*  个城市，按从  *0*  到  *n-1*  编号。给你一个边数组  *edges* ，其中  *edges[i] = [fromi, toi, weighti]*  代表  *fromi*  和  *toi* <sub> </sub>两个城市之间的双向加权边，距离阈值是一个整数  *distanceThreshold* 。

返回能通过某些路径到达其他城市数目最少、且路径距离 **最大**  为  *distanceThreshold*  的城市。如果有多个这样的城市，则返回编号最大的城市。

注意，连接城市  *i*  和  *j*  的路径的距离等于沿该路径的所有边的权重之和。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/26/find_the_city_01.png)

```
输入：n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
输出：3
解释：城市分布图如上。
每个城市阈值距离 distanceThreshold = 4 内的邻居城市分别是：
城市 0 -> [城市 1, 城市 2] 
城市 1 -> [城市 0, 城市 2, 城市 3] 
城市 2 -> [城市 0, 城市 1, 城市 3] 
城市 3 -> [城市 1, 城市 2] 
城市 0 和 3 在阈值距离 4 以内都有 2 个邻居城市，但是我们必须返回城市 3，因为它的编号最大。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/26/find_the_city_02.png)

```
输入：n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
输出：0
解释：城市分布图如上。 
每个城市阈值距离 distanceThreshold = 2 内的邻居城市分别是：
城市 0 -> [城市 1] 
城市 1 -> [城市 0, 城市 4] 
城市 2 -> [城市 3, 城市 4] 
城市 3 -> [城市 2, 城市 4]
城市 4 -> [城市 1, 城市 2, 城市 3] 
城市 0 在阈值距离 2 以内只有 1 个邻居城市。

```



**提示：** 

-  *2 <= n <= 100*  
-  *1 <= edges.length <= n * (n - 1) / 2*  
-  *edges[i].length == 3*  
-  *0 <= fromi < toi < n*  
-  *1 <= weighti, distanceThreshold <= 10^4*  
- 所有  *(fromi, toi)*  都是不同的。




# 算法思路

# 测试用例
```
1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance 1334. 阈值距离内邻居最少的城市 Medium
```

[enTitle]: https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
[cnTitle]: https://leetcode-cn.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
