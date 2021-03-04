# [1515. Best Position for a Service Centre][enTitle]

**Hard**

A delivery company wants to build a new service centre in a new city. The company knows the positions of all the customers in this city on a 2D-Map and wants to build the new centre in a position such that **the sum of the euclidean distances to all customers is minimum** .

Given an array  *positions*  where  *positions[i] = [xi, yi]*  is the position of the  *ith*  customer on the map, return  *the minimum sum of the euclidean distances*  to all customers.

In other words, you need to choose the position of the service centre  *[xcentre, ycentre]*  such that the following formula is minimized:

![img](https://assets.leetcode.com/uploads/2020/06/25/q4_edited.jpg)

Answers within  *10^-5*  of the actual value will be accepted.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/06/25/q4_e1.jpg)


<pre><strong>Input:</strong> positions = [[0,1],[1,0],[1,2],[2,1]]
<strong>Output:</strong> 4.00000
<strong>Explanation:</strong> As shown, you can see that choosing [x<sub>centre</sub>, y<sub>centre</sub>] = [1, 1] will make the distance to each customer = 1, the sum of all distances is 4 which is the minimum possible we can achieve.
</pre>

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/06/25/q4_e3.jpg)

```
Input: positions = [[1,1],[3,3]]
Output: 2.82843
Explanation: The minimum possible sum of distances = sqrt(2) + sqrt(2) = 2.82843

```

**Example 3:** 

```
Input: positions = [[1,1]]
Output: 0.00000

```

**Example 4:** 

```
Input: positions = [[1,1],[0,0],[2,0]]
Output: 2.73205
Explanation: At the first glance, you may think that locating the centre at [1, 0] will achieve the minimum sum, but locating it at [1, 0] will make the sum of distances = 3.
Try to locate the centre at [1.0, 0.5773502711] you will see that the sum of distances is 2.73205.
Be careful with the precision!

```

**Example 5:** 

```
Input: positions = [[0,1],[3,2],[4,5],[7,6],[8,9],[11,1],[2,12]]
Output: 32.94036
Explanation: You can use [4.3460852395, 4.9813795505] as the position of the centre.

```



**Constraints:** 

-  *1 <= positions.length <= 50*  
-  *positions[i].length == 2*  
-  *0 <= positions[i][0], positions[i][1] <= 100* 


# [1515. 服务中心的最佳位置][cnTitle]

**困难**

一家快递公司希望在新城市建立新的服务中心。公司统计了该城市所有客户在二维地图上的坐标，并希望能够以此为依据为新的服务中心选址：使服务中心 **到所有客户的欧几里得距离的总和最小**  。

给你一个数组  *positions*  ，其中  *positions[i] = [xi, yi]*  表示第  *i*  个客户在二维地图上的位置，返回到所有客户的 **欧几里得距离的最小总和 。** 

换句话说，请你为服务中心选址，该位置的坐标  *[xcentre, ycentre]*  需要使下面的公式取到最小值：

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/12/q4_edited.jpg)

与真实值误差在  *10^-5*  之内的答案将被视作正确答案。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/12/q4_e1.jpg)


<pre><strong>输入：</strong>positions = [[0,1],[1,0],[1,2],[2,1]]
<strong>输出：</strong>4.00000
<strong>解释：</strong>如图所示，你可以选 [x<sub>centre</sub>, y<sub>centre</sub>] = [1, 1] 作为新中心的位置，这样一来到每个客户的距离就都是 1，所有距离之和为 4 ，这也是可以找到的最小值。
</pre>

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/12/q4_e3.jpg)

```
输入：positions = [[1,1],[3,3]]
输出：2.82843
解释：欧几里得距离可能的最小总和为 sqrt(2) + sqrt(2) = 2.82843

```

**示例 3：** 

```
输入：positions = [[1,1]]
输出：0.00000

```

**示例 4：** 

```
输入：positions = [[1,1],[0,0],[2,0]]
输出：2.73205
解释：乍一看，你可能会将中心定在 [1, 0] 并期待能够得到最小总和，但是如果选址在 [1, 0] 距离总和为 3
如果将位置选在 [1.0, 0.5773502711] ，距离总和将会变为 2.73205
当心精度问题！

```

**示例 5：** 

```
输入：positions = [[0,1],[3,2],[4,5],[7,6],[8,9],[11,1],[2,12]]
输出：32.94036
解释：你可以用 [4.3460852395, 4.9813795505] 作为新中心的位置

```



**提示：** 

-  *1 <= positions.length <= 50*  
-  *positions[i].length == 2*  
-  *0 <= positions[i][0], positions[i][1] <= 100* 




# 算法思路

# 测试用例
```
1515. Best Position for a Service Centre 1515. 服务中心的最佳位置 Hard
```

[enTitle]: https://leetcode.com/problems/best-position-for-a-service-centre/
[cnTitle]: https://leetcode-cn.com/problems/best-position-for-a-service-centre/
