# [1779. Find Nearest Point That Has the Same X or Y Coordinate][enTitle]

**Easy**

You are given two integers,  *x*  and  *y* , which represent your current location on a Cartesian grid:  *(x, y)* . You are also given an array  *points*  where each  *points[i] = [ai, bi]*  represents that a point exists at  *(ai, bi)* . A point is **valid**  if it shares the same x-coordinate or the same y-coordinate as your location.

Return  *the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location* . If there are multiple, return  *the valid point with the smallest index* . If there are no valid points, return  *-1* .

The **Manhattan distance**  between two points  *(x1, y1)*  and  *(x2, y2)*  is  *abs(x1 - x2) + abs(y1 - y2)* .



**Example 1:** 

```
Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
Output: 2
Explanation: Of all the points, only [3,1], [2,4] and [4,4] are valid. Of the valid points, [2,4] and [4,4] have the smallest Manhattan distance from your current location, with a distance of 1. [2,4] has the smallest index, so return 2.
```

**Example 2:** 

```
Input: x = 3, y = 4, points = [[3,4]]
Output: 0
Explanation: The answer is allowed to be on the same location as your current location.
```

**Example 3:** 

```
Input: x = 3, y = 4, points = [[2,3]]
Output: -1
Explanation: There are no valid points.
```



**Constraints:** 

-  *1 <= points.length <= 104*  
-  *points[i].length == 2*  
-  *1 <= x, y, ai, bi <= 104* 


# [1779. 找到最近的有相同 X 或 Y 坐标的点][cnTitle]

**简单**

给你两个整数  *x*  和  *y*  ，表示你在一个笛卡尔坐标系下的  *(x, y)*  处。同时，在同一个坐标系下给你一个数组  *points*  ，其中  *points[i] = [ai, bi]*  表示在  *(ai, bi)*  处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。

请返回距离你当前位置 **曼哈顿距离**  最近的 **有效**  点的下标（下标从 **0**  开始）。如果有多个最近的有效点，请返回下标 **最小**  的一个。如果没有有效点，请返回  *-1*  。

两个点  *(x1, y1)*  和  *(x2, y2)*  之间的 **曼哈顿距离**  为  *abs(x1 - x2) + abs(y1 - y2)*  。



**示例 1：** 

```
输入：x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
输出：2
解释：所有点中，[3,1]，[2,4] 和 [4,4] 是有效点。有效点中，[2,4] 和 [4,4] 距离你当前位置的曼哈顿距离最小，都为 1 。[2,4] 的下标最小，所以返回 2 。
```

**示例 2：** 

```
输入：x = 3, y = 4, points = [[3,4]]
输出：0
提示：答案可以与你当前所在位置坐标相同。
```

**示例 3：** 

```
输入：x = 3, y = 4, points = [[2,3]]
输出：-1
解释：没有有效点。
```



**提示：** 

-  *1 <= points.length <= 104*  
-  *points[i].length == 2*  
-  *1 <= x, y, ai, bi <= 104* 




# 算法思路

# 测试用例
```
1779. Find Nearest Point That Has the Same X or Y Coordinate 1779. 找到最近的有相同 X 或 Y 坐标的点 Easy
```

[enTitle]: https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
[cnTitle]: https://leetcode-cn.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
