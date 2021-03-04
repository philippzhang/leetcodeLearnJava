# [1584. Min Cost to Connect All Points][enTitle]

**Medium**

You are given an array  *points*  representing integer coordinates of some points on a 2D-plane, where  *points[i] = [xi, yi]* .

The cost of connecting two points  *[xi, yi]*  and  *[xj, yj]*  is the **manhattan distance**  between them:  *|xi - xj| + |yi - yj|* , where  *|val|*  denotes the absolute value of  *val* .

Return  *the minimum cost to make all points connected.*  All points are connected if there is **exactly one**  simple path between any two points.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/26/d.png)


<pre><strong>Input:</strong> points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
<strong>Output:</strong> 20
<strong>Explanation:
</strong><img alt="" src="https://assets.leetcode.com/uploads/2020/08/26/c.png" style="width: 214px; height: 268px;">
We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
</pre>

**Example 2:** 

```
Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18

```

**Example 3:** 

```
Input: points = [[0,0],[1,1],[1,0],[-1,1]]
Output: 4

```

**Example 4:** 

```
Input: points = [[-1000000,-1000000],[1000000,1000000]]
Output: 4000000

```

**Example 5:** 

```
Input: points = [[0,0]]
Output: 0

```



**Constraints:** 

-  *1 <= points.length <= 1000*  
-  *-106 <= xi, yi <= 106*  
- All pairs  *(xi, yi)*  are distinct.


# [1584. 连接所有点的最小费用][cnTitle]

**中等**

给你一个 *points*  数组，表示 2D 平面上的一些点，其中  *points[i] = [xi, yi]*  。

连接点  *[xi, yi]*  和点  *[xj, yj]*  的费用为它们之间的 **曼哈顿距离**  ： *|xi - xj| + |yi - yj|*  ，其中  *|val|*  表示  *val*  的绝对值。

请你返回将所有点连接的最小总费用。只有任意两点之间 **有且仅有**  一条简单路径时，才认为所有点都已连接。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/08/26/d.png)


<pre><strong>输入：</strong>points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
<strong>输出：</strong>20
<strong>解释：
</strong><img style="height:268px; width:214px" src="https://assets.leetcode.com/uploads/2020/08/26/c.png" alt="">
我们可以按照上图所示连接所有点得到最小总费用，总费用为 20 。
注意到任意两个点之间只有唯一一条路径互相到达。
</pre>

**示例 2：** 

```
输入：points = [[3,12],[-2,5],[-4,1]]
输出：18

```

**示例 3：** 

```
输入：points = [[0,0],[1,1],[1,0],[-1,1]]
输出：4

```

**示例 4：** 

```
输入：points = [[-1000000,-1000000],[1000000,1000000]]
输出：4000000

```

**示例 5：** 

```
输入：points = [[0,0]]
输出：0

```



**提示：** 

-  *1 <= points.length <= 1000*  
-  *-106 <= xi, yi <= 106*  
- 所有点  *(xi, yi)*  两两不同。




# 算法思路

# 测试用例
```
1584. Min Cost to Connect All Points 1584. 连接所有点的最小费用 Medium
```

[enTitle]: https://leetcode.com/problems/min-cost-to-connect-all-points/
[cnTitle]: https://leetcode-cn.com/problems/min-cost-to-connect-all-points/
