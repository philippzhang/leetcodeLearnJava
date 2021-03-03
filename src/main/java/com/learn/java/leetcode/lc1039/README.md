# [1039. Minimum Score Triangulation of Polygon][enTitle]

**Medium**

You have a convex  *n* -sided polygon where each vertex has an integer value. You are given an integer array  *values*  where  *values[i]*  is the value of the  *ith*  vertex (i.e., **clockwise order** ).

You will **triangulate**  the polygon into  *n - 2*  triangles. For each triangle, the value of that triangle is the product of the values of its vertices, and the total score of the triangulation is the sum of these values over all  *n - 2*  triangles in the triangulation.

Return  *the smallest possible total score that you can achieve with some triangulation of the polygon* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/25/shape1.jpg)

```
Input: values = [1,2,3]
Output: 6
Explanation: The polygon is already triangulated, and the score of the only triangle is 6.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/02/25/shape2.jpg)

```
Input: values = [3,7,4,5]
Output: 144
Explanation: There are two triangulations, with possible scores: 3*7*5 + 4*5*7 = 245, or 3*4*5 + 3*4*7 = 144.
The minimum score is 144.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2021/02/25/shape3.jpg)

```
Input: values = [1,3,1,4,1,5]
Output: 13
Explanation: The minimum score triangulation has score 1*1*3 + 1*1*4 + 1*1*5 + 1*1*1 = 13.

```



**Constraints:** 

-  *n == values.length*  
-  *3 <= n <= 50*  
-  *1 <= values[i] <= 100* 


# [1039. 多边形三角剖分的最低得分][cnTitle]

**中等**

给定  *N* ，想象一个凸  *N*  边多边形，其顶点按顺时针顺序依次标记为  *A[0], A[i], ..., A[N-1]* 。

假设您将多边形剖分为  *N-2*  个三角形。对于每个三角形，该三角形的值是顶点标记的**乘积** ，三角剖分的分数是进行三角剖分后所有  *N-2*  个三角形的值之和。

返回多边形进行三角剖分后可以得到的最低分。



**示例 1：** 

```
输入：[1,2,3]
输出：6
解释：多边形已经三角化，唯一三角形的分数为 6。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/05/03/minimum-score-triangulation-of-polygon-1.png)

```
输入：[3,7,4,5]
输出：144
解释：有两种三角剖分，可能得分分别为：3*7*5 + 4*5*7 = 245，或 3*4*5 + 3*4*7 = 144。最低分数为 144。

```

**示例 3：** 

```
输入：[1,3,1,4,1,5]
输出：13
解释：最低分数三角剖分的得分情况为 1*1*3 + 1*1*4 + 1*1*5 + 1*1*1 = 13。

```



**提示：** 

1.  *3 <= A.length <= 50*  
2.  *1 <= A[i] <= 100* 




# 算法思路

# 测试用例
```
1039. Minimum Score Triangulation of Polygon 1039. 多边形三角剖分的最低得分 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
[cnTitle]: https://leetcode-cn.com/problems/minimum-score-triangulation-of-polygon/
