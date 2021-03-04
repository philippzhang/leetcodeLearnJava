# [1620. Coordinate With Maximum Network Quality][enTitle]

**Medium**

You are given an array of network towers  *towers*  and an integer  *radius* , where  *towers[i] = [xi, yi, qi]*  denotes the  *ith*  network tower with location  *(xi, yi)*  and quality factor  *qi* . All the coordinates are **integral coordinates**  on the X-Y plane, and the distance between two coordinates is the **Euclidean distance** .

The integer  *radius*  denotes the **maximum distance**  in which the tower is **reachable** . The tower is **reachable**  if the distance is less than or equal to  *radius* . Outside that distance, the signal becomes garbled, and the tower is **not reachable** .

The signal quality of the  *ith*  tower at a coordinate  *(x, y)*  is calculated with the formula  *⌊qi / (1 + d)⌋* , where  *d*  is the distance between the tower and the coordinate. The **network quality**  at a coordinate is the sum of the signal qualities from all the **reachable**  towers.

Return  *the integral coordinate where the network quality is maximum* . If there are multiple coordinates with the same **network quality** , return  *the lexicographically minimum coordinate* .

**Note:** 

- A coordinate  *(x1, y1)*  is lexicographically smaller than  *(x2, y2)*  if either  *x1 < x2*  or  *x1 == x2*  and  *y1 < y2* . 
-  *⌊val⌋*  is the greatest integer less than or equal to  *val*  (the floor function).



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/22/untitled-diagram.png)

```
Input: towers = [[1,2,5],[2,1,7],[3,1,9]], radius = 2
Output: [2,1]
Explanation:
At coordinate (2, 1) the total quality is 13
- Quality of 7 from (2, 1) results in ⌊7 / (1 + sqrt(0)⌋ = ⌊7⌋ = 7
- Quality of 5 from (1, 2) results in ⌊5 / (1 + sqrt(2)⌋ = ⌊2.07⌋ = 2
- Quality of 9 from (3, 1) results in ⌊9 / (1 + sqrt(1)⌋ = ⌊4.5⌋ = 4
No other coordinate has higher quality.
```

**Example 2:** 

```
Input: towers = [[23,11,21]], radius = 9
Output: [23,11]

```

**Example 3:** 

```
Input: towers = [[1,2,13],[2,1,7],[0,1,9]], radius = 2
Output: [1,2]

```

**Example 4:** 

```
Input: towers = [[2,1,9],[0,1,9]], radius = 2
Output: [0,1]
Explanation:Both (0, 1) and (2, 1) are optimal in terms of quality but (0, 1) is lexicograpically minimal.

```



**Constraints:** 

-  *1 <= towers.length <= 50*  
-  *towers[i].length == 3*  
-  *0 <= xi, yi, qi <= 50*  
-  *1 <= radius <= 50* 


# [1620. 网络信号最好的坐标][cnTitle]

**中等**

给你一个数组  *towers*  和一个整数  *radius*  ，数组中包含一些网络信号塔，其中  *towers[i] = [xi, yi, qi]*  表示第  *i*  个网络信号塔的坐标是  *(xi, yi)*  且信号强度参数为  *qi* <sub> </sub>。所有坐标都是在 X-Y 坐标系内的 **整数**  坐标。两个坐标之间的距离用 **欧几里得距离**  计算。

整数  *radius*  表示一个塔 **能到达** 的 **最远距离**  。如果一个坐标跟塔的距离在  *radius*  以内，那么该塔的信号可以到达该坐标。在这个范围以外信号会很微弱，所以  *radius*  以外的距离该塔是 **不能到达的**  。

如果第  *i*  个塔能到达  *(x, y)*  ，那么该塔在此处的信号为  *⌊qi / (1 + d)⌋*  ，其中  *d*  是塔跟此坐标的距离。一个坐标的 网络信号 是所有 **能到达** 该坐标的塔的信号强度之和。

请你返回 **网络信号**  最大的整数坐标点。如果有多个坐标网络信号一样大，请你返回字典序最小的一个坐标。

**注意：** 

- 坐标  *(x1, y1)*  字典序比另一个坐标  *(x2, y2)*  小：要么  *x1 < x2*  ，要么  *x1 == x2*  且  *y1 < y2*  。 
-  *⌊val⌋*  表示小于等于  *val*  的最大整数（向下取整函数）。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/17/untitled-diagram.png)

```
输入：towers = [[1,2,5],[2,1,7],[3,1,9]], radius = 2
输出：[2,1]
解释：
坐标 (2, 1) 信号强度之和为 13
- 塔 (2, 1) 强度参数为 7 ，在该点强度为 ⌊7 / (1 + sqrt(0)⌋ = ⌊7⌋ = 7
- 塔 (1, 2) 强度参数为 5 ，在该点强度为 ⌊5 / (1 + sqrt(2)⌋ = ⌊2.07⌋ = 2
- 塔 (3, 1) 强度参数为 9 ，在该点强度为 ⌊9 / (1 + sqrt(1)⌋ = ⌊4.5⌋ = 4
没有别的坐标有更大的信号强度。
```

**示例 2：** 

```
输入：towers = [[23,11,21]], radius = 9
输出：[23,11]

```

**示例 3：** 

```
输入：towers = [[1,2,13],[2,1,7],[0,1,9]], radius = 2
输出：[1,2]

```

**示例 4：** 

```
输入：towers = [[2,1,9],[0,1,9]], radius = 2
输出：[0,1]
解释：坐标 (0, 1) 和坐标 (2, 1) 都是强度最大的位置，但是 (0, 1) 字典序更小。

```



**提示：** 

-  *1 <= towers.length <= 50*  
-  *towers[i].length == 3*  
-  *0 <= xi, yi, qi <= 50*  
-  *1 <= radius <= 50* 




# 算法思路

# 测试用例
```
1620. Coordinate With Maximum Network Quality 1620. 网络信号最好的坐标 Medium
```

[enTitle]: https://leetcode.com/problems/coordinate-with-maximum-network-quality/
[cnTitle]: https://leetcode-cn.com/problems/coordinate-with-maximum-network-quality/
