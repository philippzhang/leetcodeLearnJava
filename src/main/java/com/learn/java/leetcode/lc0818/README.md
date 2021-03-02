# [818. Race Car][enTitle]

**Hard**

Your car starts at position 0 and speed +1 on an infinite number line. (Your car can go into negative positions.)

Your car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).

When you get an instruction "A", your car does the following:  *position += speed, speed *= 2* .

When you get an instruction "R", your car does the following: if your speed is positive then  *speed = -1*  , otherwise  *speed = 1* . (Your position stays the same.)

For example, after commands "AAR", your car goes to positions 0->1->3->3, and your speed goes to 1->2->4->-1.

Now for some target position, say the **length**  of the shortest sequence of instructions to get there.

```
Example 1:
Input: 
target = 3
Output: 2
Explanation: 
The shortest instruction sequence is "AA".
Your position goes from 0->1->3.

```

```
Example 2:
Input: 
target = 6
Output: 5
Explanation: 
The shortest instruction sequence is "AAARA".
Your position goes from 0->1->3->7->7->6.

```



**Note:** 

-  *1 <= target <= 10000* .


# [818. 赛车][cnTitle]

**困难**

你的赛车起始停留在位置 0，速度为 +1，正行驶在一个无限长的数轴上。（车也可以向负数方向行驶。）

你的车会根据一系列由 A（加速）和 R（倒车）组成的指令进行自动驾驶 。

当车得到指令 "A" 时, 将会做出以下操作：  *position += speed, speed *= 2* 。

当车得到指令 "R" 时, 将会做出以下操作：如果当前速度是正数，则将车速调整为  *speed = -1*  ；否则将车速调整为  *speed = 1* 。 (当前所处位置不变。)

例如，当得到一系列指令 "AAR" 后, 你的车将会走过位置 0->1->3->3，并且速度变化为 1->2->4->-1。

现在给定一个目标位置，请给出能够到达目标位置的最短指令列表的**长度** 。

```
示例 1:
输入: 
target = 3
输出: 2
解释: 
最短指令列表为 "AA"
位置变化为 0->1->3

```

```
示例 2:
输入: 
target = 6
输出: 5
解释: 
最短指令列表为 "AAARA"
位置变化为 0->1->3->7->7->6

```

**说明:** 

-  *1 <= target（目标位置） <= 10000* 。




# 算法思路

# 测试用例
```
818. Race Car 818. 赛车 Hard
```

[enTitle]: https://leetcode.com/problems/race-car/
[cnTitle]: https://leetcode-cn.com/problems/race-car/
