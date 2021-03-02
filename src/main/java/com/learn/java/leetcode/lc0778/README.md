# [778. Swim in Rising Water][enTitle]

**Hard**

On an N x N  *grid* , each square  *grid[i][j]*  represents the elevation at that point  *(i,j)* .

Now rain starts to fall. At time  *t* , the depth of the water everywhere is  *t* . You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most  *t* . You can swim infinite distance in zero time. Of course, you must stay within the boundaries of the grid during your swim.

You start at the top left square  *(0, 0)* . What is the least time until you can reach the bottom right square  *(N-1, N-1)* ?

**Example 1:** 

```
Input: [[0,2],[1,3]]
Output: 3
Explanation:
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.

You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.

```

**Example 2:** 

```
Input: [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
Output: 16
Explanation:
0  1  2  3  4
24 23 22 21  5
12 13 14 15 16
11 17 18 19 20
10  9  8  7  6

The final route is marked in bold.
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.

```

**Note:** 

1.  *2 <= N <= 50* . 
2. grid[i][j] is a permutation of [0, ..., N*N - 1].


# [778. 水位上升的泳池中游泳][cnTitle]

**困难**

在一个 N x N 的坐标方格  *grid*  中，每一个方格的值  *grid[i][j]*  表示在位置  *(i,j)*  的平台高度。

现在开始下雨了。当时间为  *t*  时，此时雨水导致水池中任意位置的水位为  *t*  。你可以从一个平台游向四周相邻的任意一个平台，但是前提是此时水位必须同时淹没这两个平台。假定你可以瞬间移动无限距离，也就是默认在方格内部游动是不耗时的。当然，在你游泳的时候你必须待在坐标方格里面。

你从坐标方格的左上平台 (0，0) 出发。最少耗时多久你才能到达坐标方格的右下平台  *(N-1, N-1)* ？



**示例 1:** 

```
输入: [[0,2],[1,3]]
输出: 3
解释:
时间为0时，你位于坐标方格的位置为 (0, 0)。
此时你不能游向任意方向，因为四个相邻方向平台的高度都大于当前时间为 0 时的水位。

等时间到达 3 时，你才可以游向平台 (1, 1). 因为此时的水位是 3，坐标方格中的平台没有比水位 3 更高的，所以你可以游向坐标方格中的任意位置

```

**示例2:** 

```
输入: [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
输出: 16
解释:
0  1  2  3  4
24 23 22 21  5
12 13 14 15 16
11 17 18 19 20
10  9  8  7  6

最终的路线用加粗进行了标记。
我们必须等到时间为 16，此时才能保证平台 (0, 0) 和 (4, 4) 是连通的

```



**提示:** 

1.  *2 <= N <= 50* . 
2.  *grid[i][j]*  是  *[0, ..., N*N - 1]*  的排列。




# 算法思路

# 测试用例
```
778. Swim in Rising Water 778. 水位上升的泳池中游泳 Hard
```

[enTitle]: https://leetcode.com/problems/swim-in-rising-water/
[cnTitle]: https://leetcode-cn.com/problems/swim-in-rising-water/
