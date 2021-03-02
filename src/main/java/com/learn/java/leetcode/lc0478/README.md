# [478. Generate Random Point in a Circle][enTitle]

**Medium**

Given the radius and x-y positions of the center of a circle, write a function  *randPoint*  which generates a uniform random point in the circle.

Note:

1. input and output values are in floating-point. 
2. radius and x-y position of the center of the circle is passed into the class constructor. 
3. a point on the circumference of the circle is considered to be in the circle. 
4.  *randPoint*  returns a size 2 array containing x-position and y-position of the random point, in that order.


**Example 1:** 

```
Input:["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
Output: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]
```


**Example 2:** 

```
Input:["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
Output: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
```



**Explanation of Input Syntax:** 

The input is two lists: the subroutines called and their arguments.  *Solution* 's constructor has three arguments, the radius, x-position of the center, and y-position of the center of the circle.  *randPoint*  has no arguments. Arguments are always wrapped with a list, even if there aren't any.




# [478. 在圆内随机生成点][cnTitle]

**中等**

给定圆的半径和圆心的 x、y 坐标，写一个在圆中产生均匀随机点的函数  *randPoint*  。

说明:

1. 输入值和输出值都将是浮点数。 
2. 圆的半径和圆心的 x、y 坐标将作为参数传递给类的构造函数。 
3. 圆周上的点也认为是在圆中。 
4.  *randPoint*  返回一个包含随机点的x坐标和y坐标的大小为2的数组。

**示例 1：** 

```
输入:["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
输出:[null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]

```

**示例 2：** 

```
输入:["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
输出:[null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
```

**输入语法说明：** 

输入是两个列表：调用成员函数名和调用的参数。 *Solution*  的构造函数有三个参数，圆的半径、圆心的 x 坐标、圆心的 y 坐标。 *randPoint*  没有参数。输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。




# 算法思路

# 测试用例
```
478. Generate Random Point in a Circle 478. 在圆内随机生成点 Medium
```

[enTitle]: https://leetcode.com/problems/generate-random-point-in-a-circle/
[cnTitle]: https://leetcode-cn.com/problems/generate-random-point-in-a-circle/
