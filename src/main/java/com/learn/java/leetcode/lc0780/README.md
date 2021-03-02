# [780. Reaching Points][enTitle]

**Hard**

A move consists of taking a point  *(x, y)*  and transforming it to either  *(x, x+y)*  or  *(x+y, y)* .

Given a starting point  *(sx, sy)*  and a target point  *(tx, ty)* , return  *True*  if and only if a sequence of moves exists to transform the point  *(sx, sy)*  to  *(tx, ty)* . Otherwise, return  *False* .

```
Examples:
Input: sx = 1, sy = 1, tx = 3, ty = 5
Output: True
Explanation:
One series of moves that transforms the starting point to the target is:
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)

Input: sx = 1, sy = 1, tx = 2, ty = 2
Output: False

Input: sx = 1, sy = 1, tx = 1, ty = 1
Output: True


```

**Note:** 

-  *sx, sy, tx, ty*  will all be integers in the range  *[1, 10^9]* .


# [780. 到达终点][cnTitle]

**困难**

从点  *(x, y)*  可以**转换** 到  *(x, x+y)*  或者  *(x+y, y)* 。

给定一个起点  *(sx, sy)*  和一个终点  *(tx, ty)* ，如果通过一系列的**转换** 可以从起点到达终点，则返回  *True* ，否则返回  *False* 。

```
示例:
输入: sx = 1, sy = 1, tx = 3, ty = 5
输出: True
解释:可以通过以下一系列转换从起点转换到终点：
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)

输入: sx = 1, sy = 1, tx = 2, ty = 2
输出: False

输入: sx = 1, sy = 1, tx = 1, ty = 1
输出: True


```

**注意:** 

-  *sx, sy, tx, ty*  是范围在  *[1, 10^9]*  的整数。




# 算法思路

# 测试用例
```
780. Reaching Points 780. 到达终点 Hard
```

[enTitle]: https://leetcode.com/problems/reaching-points/
[cnTitle]: https://leetcode-cn.com/problems/reaching-points/
