# [874. Walking Robot Simulation][enTitle]

**Easy**

A robot on an infinite XY-plane starts at point  *(0, 0)*  and faces north. The robot can receive one of three possible types of  *commands* :

-  *-2* : turn left  *90*  degrees, 
-  *-1* : turn right  *90*  degrees, or 
-  *1 <= k <= 9* : move forward  *k*  units.

Some of the grid squares are  *obstacles* . The  *ith*  obstacle is at grid point  *obstacles[i] = (xi, yi)* .

If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)

Return  *the maximum Euclidean distance that the robot will be from the origin squared (i.e. if the distance is*  *5*  *, return*  *25*  *)* .

**Note:** 

- North means +Y direction. 
- East means +X direction. 
- South means -Y direction. 
- West means -X direction.



**Example 1:** 


<pre><strong>Input:</strong> commands = [4,-1,3], obstacles = []
<strong>Output:</strong> 25
<strong>Explanation:</strong> The robot starts at (0, 0):
1. Move north 4 units to (0, 4).
2. Turn right.
3. Move east 3 units to (3, 4).
The furthest point away from the origin is (3, 4), which is 3<sup>2</sup> + 4<sup>2</sup> = 25 units away.
</pre>

**Example 2:** 


<pre><strong>Input:</strong> commands = [4,-1,4,-2,4], obstacles = [[2,4]]
<strong>Output:</strong> 65
<strong>Explanation:</strong> The robot starts at (0, 0):
1. Move north 4 units to (0, 4).
2. Turn right.
3. Move east 1 unit and get blocked by the obstacle at (2, 4), robot is at (1, 4).
4. Turn left.
5. Move north 4 units to (1, 8).
The furthest point away from the origin is (1, 8), which is 1<sup>2</sup> + 8<sup>2</sup> = 65 units away.
</pre>



**Constraints:** 

-  *1 <= commands.length <= 104*  
-  *commands[i]*  is one of the values in the list  *[-2,-1,1,2,3,4,5,6,7,8,9]* . 
-  *0 <= obstacles.length <= 104*  
-  *-3 * 104 <= xi, yi <= 3 * 104*  
- The answer is guaranteed to be less than  *231* .


# [874. 模拟行走机器人][cnTitle]

**简单**

机器人在一个无限大小的 XY 网格平面上行走，从点  *(0, 0)*  处开始出发，面向北方。该机器人可以接收以下三种类型的命令  *commands*  ：

-  *-2*  ：向左转  *90*  度 
-  *-1*  ：向右转  *90*  度 
-  *1 <= x <= 9*  ：向前移动  *x*  个单位长度

在网格上有一些格子被视为障碍物  *obstacles*  。第  *i*  个障碍物位于网格点  *obstacles[i] = (xi, yi)*  。

机器人无法走到障碍物上，它将会停留在障碍物的前一个网格方块上，但仍然可以继续尝试进行该路线的其余部分。

返回从原点到机器人所有经过的路径点（坐标为整数）的最大欧式距离的平方。（即，如果距离为  *5*  ，则返回  *25*  ）











**注意：** 

<li class="MachineTrans-lang-zh-CN">北表示  *+Y*  方向。 
<li class="MachineTrans-lang-zh-CN">东表示  *+X*  方向。 
<li class="MachineTrans-lang-zh-CN">南表示  *-Y*  方向。 
<li class="MachineTrans-lang-zh-CN">西表示  *-X*  方向。











**示例 1：** 


<pre><strong>输入：</strong>commands = [4,-1,3], obstacles = []
<strong>输出：</strong>25
<strong>解释：
</strong>机器人开始位于 (0, 0)：
1. 向北移动 4 个单位，到达 (0, 4)
2. 右转
3. 向东移动 3 个单位，到达 (3, 4)
距离原点最远的是 (3, 4) ，距离为 3<sup>2</sup> + 4<sup>2</sup> = 25</pre>

**示例 2：** 


<pre><strong>输入：</strong>commands = [4,-1,4,-2,4], obstacles = [[2,4]]
<strong>输出：</strong>65
<strong>解释</strong>：机器人开始位于 (0, 0)：
1. 向北移动 4 个单位，到达 (0, 4)
2. 右转
3. 向东移动 1 个单位，然后被位于 (2, 4) 的障碍物阻挡，机器人停在 (1, 4)
4. 左转
5. 向北走 4 个单位，到达 (1, 8)
距离原点最远的是 (1, 8) ，距离为 1<sup>2</sup> + 8<sup>2</sup> = 65</pre>



**提示：** 

-  *1 <= commands.length <= 104*  
-  *commands[i]*  is one of the values in the list  *[-2,-1,1,2,3,4,5,6,7,8,9]* . 
-  *0 <= obstacles.length <= 104*  
-  *-3 * 104 <= xi, yi <= 3 * 104*  
- 答案保证小于  *231* 




# 算法思路

# 测试用例
```
874. Walking Robot Simulation 874. 模拟行走机器人 Easy
```

[enTitle]: https://leetcode.com/problems/walking-robot-simulation/
[cnTitle]: https://leetcode-cn.com/problems/walking-robot-simulation/
