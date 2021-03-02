# [587. Erect the Fence][enTitle]

**Hard**

There are some trees, where each tree is represented by (x,y) coordinate in a two-dimensional garden. Your job is to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed. Your task is to help find the coordinates of trees which are exactly located on the fence perimeter.



Example 1:


<pre><b>Input:</b> [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
<b>Output:</b> [[1,1],[2,0],[4,2],[3,3],[2,4]]
<b>Explanation:</b>
<img src="https://assets.leetcode.com/uploads/2018/10/12/erect_the_fence_1.png" style="width: 100%; max-width: 320px">
</pre>

Example 2:


<pre><b>Input:</b> [[1,2],[2,2],[4,2]]
<b>Output:</b> [[1,2],[2,2],[4,2]]
<b>Explanation:</b>
<img src="https://assets.leetcode.com/uploads/2018/10/12/erect_the_fence_2.png" style="width: 100%; max-width: 320px">
Even you only have trees in a line, you need to use rope to enclose them. 
</pre>



**Note:** 

1. All trees should be enclosed together. You cannot cut the rope to enclose trees that will separate them in more than one group. 
2. All input integers will range from 0 to 100. 
3. The garden has at least one tree. 
4. All coordinates are distinct. 
5. Input points have NO order. No order required for output. 
6. input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.


# [587. 安装栅栏][cnTitle]

**困难**

在一个二维的花园中，有一些用 (x, y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用**最短** 的绳子围起所有的树。只有当所有的树都被绳子包围时，花园才能围好栅栏。你需要找到正好位于栅栏边界上的树的坐标。



**示例 1:** 


<pre><strong>输入:</strong> [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
<strong>输出:</strong> [[1,1],[2,0],[4,2],[3,3],[2,4]]
<strong>解释:</strong>
<img style="width: 100%; max-width: 320px" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/erect_the_fence_1.png">
</pre>

**示例 2:** 


<pre><strong>输入:</strong> [[1,2],[2,2],[4,2]]
<strong>输出:</strong> [[1,2],[2,2],[4,2]]
<strong>解释:</strong>
<img style="width: 100%; max-width: 320px" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/erect_the_fence_2.png">
即使树都在一条直线上，你也需要先用绳子包围它们。
</pre>



**注意:** 

1. 所有的树应当被围在一起。你不能剪断绳子来包围树或者把树分成一组以上。 
2. 输入的整数在 0 到 100 之间。 
3. 花园至少有一棵树。 
4. 所有树的坐标都是不同的。 
5. 输入的点**没有** 顺序。输出顺序也没有要求。




# 算法思路

# 测试用例
```
587. Erect the Fence 587. 安装栅栏 Hard
```

[enTitle]: https://leetcode.com/problems/erect-the-fence/
[cnTitle]: https://leetcode-cn.com/problems/erect-the-fence/
