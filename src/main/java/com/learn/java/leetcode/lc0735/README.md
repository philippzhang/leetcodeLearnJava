# [735. Asteroid Collision][enTitle]

**Medium**

We are given an array  *asteroids*  of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:

```
Input: 
asteroids = [5, 10, -5]
Output: [5, 10]
Explanation: 
The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.

```



Example 2:

```
Input: 
asteroids = [8, -8]
Output: []
Explanation: 
The 8 and -8 collide exploding each other.

```



Example 3:

```
Input: 
asteroids = [10, 2, -5]
Output: [10]
Explanation: 
The 2 and -5 collide resulting in -5.  The 10 and -5 collide resulting in 10.

```



Example 4:

```
Input: 
asteroids = [-2, -1, 1, 2]
Output: [-2, -1, 1, 2]
Explanation: 
The -2 and -1 are moving left, while the 1 and 2 are moving right.
Asteroids moving the same direction never meet, so no asteroids will meet each other.

```



Note:




# [735. 行星碰撞][cnTitle]

**中等**

给定一个整数数组  *asteroids* ，表示在同一行的行星。

对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。

找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。

**示例 1:** 

```
输入: 
asteroids = [5, 10, -5]
输出: [5, 10]
解释: 
10 和 -5 碰撞后只剩下 10。 5 和 10 永远不会发生碰撞。

```

**示例 2:** 

```
输入: 
asteroids = [8, -8]
输出: []
解释: 
8 和 -8 碰撞后，两者都发生爆炸。

```

**示例 3:** 

```
输入: 
asteroids = [10, 2, -5]
输出: [10]
解释: 
2 和 -5 发生碰撞后剩下 -5。10 和 -5 发生碰撞后剩下 10。

```

**示例 4:** 

```
输入: 
asteroids = [-2, -1, 1, 2]
输出: [-2, -1, 1, 2]
解释: 
-2 和 -1 向左移动，而 1 和 2 向右移动。
由于移动方向相同的行星不会发生碰撞，所以最终没有行星发生碰撞。

```

**说明:** 

- 数组  *asteroids*  的长度不超过  *10000* 。 
- 每一颗行星的大小都是非零整数，范围是  *[-1000, 1000]*  。


# 算法思路

# 测试用例
```
735. Asteroid Collision 735. 行星碰撞 Medium
Solution.asteroidCollision
---
[5,10,-5]

=[5,10]
---
[8,-8]

=[]
---
[10,2,-5]

=[10]
---
[-2,-1,1,2]

=[-2,-1,1,2]
```

[enTitle]: https://leetcode.com/problems/asteroid-collision/
[cnTitle]: https://leetcode-cn.com/problems/asteroid-collision/
