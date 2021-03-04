# [1739. Building Boxes][enTitle]

**Hard**

You have a cubic storeroom where the width, length, and height of the room are all equal to  *n*  units. You are asked to place  *n*  boxes in this room where each box is a cube of unit side length. There are however some rules to placing the boxes:

- You can place the boxes anywhere on the floor. 
- If box  *x*  is placed on top of the box  *y* , then each side of the four vertical sides of the box  *y*  **must**  either be adjacent to another box or to a wall.

Given an integer  *n* , return *the minimum possible number of boxes touching the floor.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/04/3-boxes.png)

```
Input: n = 3
Output: 3
Explanation: The figure above is for the placement of the three boxes.
These boxes are placed in the corner of the room, where the corner is on the left side.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/04/4-boxes.png)

```
Input: n = 4
Output: 3
Explanation: The figure above is for the placement of the four boxes.
These boxes are placed in the corner of the room, where the corner is on the left side.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2021/01/04/10-boxes.png)

```
Input: n = 10
Output: 6
Explanation: The figure above is for the placement of the ten boxes.
These boxes are placed in the corner of the room, where the corner is on the back side.
```



**Constraints:** 

-  *1 <= n <= 109* 


# [1739. 放置盒子][cnTitle]

**困难**

有一个立方体房间，其长度、宽度和高度都等于  *n*  个单位。请你在房间里放置  *n*  个盒子，每个盒子都是一个单位边长的立方体。放置规则如下：

- 你可以把盒子放在地板上的任何地方。 
- 如果盒子  *x*  需要放置在盒子  *y*  的顶部，那么盒子  *y*  竖直的四个侧面都 **必须**  与另一个盒子或墙相邻。

给你一个整数  *n*  ，返回接触地面的盒子的 **最少**  可能数量 *。* 



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/24/3-boxes.png)

```
输入：n = 3
输出：3
解释：上图是 3 个盒子的摆放位置。
这些盒子放在房间的一角，对应左侧位置。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/24/4-boxes.png)

```
输入：n = 4
输出：3
解释：上图是 3 个盒子的摆放位置。
这些盒子放在房间的一角，对应左侧位置。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/24/10-boxes.png)

```
输入：n = 10
输出：6
解释：上图是 10 个盒子的摆放位置。
这些盒子放在房间的一角，对应后方位置。
```



**提示：** 

-  *1 <= n <= 109* 




# 算法思路

# 测试用例
```
1739. Building Boxes 1739. 放置盒子 Hard
```

[enTitle]: https://leetcode.com/problems/building-boxes/
[cnTitle]: https://leetcode-cn.com/problems/building-boxes/
