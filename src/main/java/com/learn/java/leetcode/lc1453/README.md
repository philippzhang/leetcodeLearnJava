# [1453. Maximum Number of Darts Inside of a Circular Dartboard][enTitle]

**Hard**

You have a very large square wall and a circular dartboard placed on the wall. You have been challenged to throw darts into the board blindfolded. Darts thrown at the wall are represented as an array of  *points*  on a 2D plane.

Return the maximum number of points that are within or lie on **any**  circular dartboard of radius  *r* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/04/29/sample_1_1806.png)

```
Input: points = [[-2,0],[2,0],[0,2],[0,-2]], r = 2
Output: 4
Explanation: Circle dartboard with center in (0,0) and radius = 2 contain all points.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/04/29/sample_2_1806.png)

```
Input: points = [[-3,0],[3,0],[2,6],[5,4],[0,9],[7,8]], r = 5
Output: 5
Explanation: Circle dartboard with center in (0,4) and radius = 5 contain all points except the point (7,8).

```

**Example 3:** 

```
Input: points = [[-2,0],[2,0],[0,2],[0,-2]], r = 1
Output: 1

```

**Example 4:** 

```
Input: points = [[1,2],[3,5],[1,-1],[2,3],[4,1],[1,3]], r = 2
Output: 4

```



**Constraints:** 

-  *1 <= points.length <= 100*  
-  *points[i].length == 2*  
-  *-10^4 <= points[i][0], points[i][1] <= 10^4*  
-  *1 <= r <= 5000* 


# [1453. 圆形靶内的最大飞镖数量][cnTitle]

**困难**

墙壁上挂着一个圆形的飞镖靶。现在请你蒙着眼睛向靶上投掷飞镖。

投掷到墙上的飞镖用二维平面上的点坐标数组表示。飞镖靶的半径为  *r*  。

请返回能够落在 **任意**  半径为  *r*  的圆形靶内或靶上的最大飞镖数。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/16/sample_1_1806.png)

```
输入：points = [[-2,0],[2,0],[0,2],[0,-2]], r = 2
输出：4
解释：如果圆形的飞镖靶的圆心为 (0,0) ，半径为 2 ，所有的飞镖都落在靶上，此时落在靶上的飞镖数最大，值为 4 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/16/sample_2_1806.png)

```
输入：points = [[-3,0],[3,0],[2,6],[5,4],[0,9],[7,8]], r = 5
输出：5
解释：如果圆形的飞镖靶的圆心为 (0,4) ，半径为 5 ，则除了 (7,8) 之外的飞镖都落在靶上，此时落在靶上的飞镖数最大，值为 5 。
```

**示例 3：** 

```
输入：points = [[-2,0],[2,0],[0,2],[0,-2]], r = 1
输出：1

```

**示例 4：** 

```
输入：points = [[1,2],[3,5],[1,-1],[2,3],[4,1],[1,3]], r = 2
输出：4

```



**提示：** 

-  *1 <= points.length <= 100*  
-  *points[i].length == 2*  
-  *-10^4 <= points[i][0], points[i][1] <= 10^4*  
-  *1 <= r <= 5000* 




# 算法思路

# 测试用例
```
1453. Maximum Number of Darts Inside of a Circular Dartboard 1453. 圆形靶内的最大飞镖数量 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-darts-inside-of-a-circular-dartboard/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-darts-inside-of-a-circular-dartboard/
