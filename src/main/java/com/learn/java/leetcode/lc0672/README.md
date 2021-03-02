# [672. Bulb Switcher II][enTitle]

**Medium**

There is a room with  *n*  lights which are turned on initially and 4 buttons on the wall. After performing exactly  *m*  unknown operations towards buttons, you need to return how many different kinds of status of the  *n*  lights could be.

Suppose  *n*  lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:

1. Flip all the lights. 
2. Flip lights with even numbers. 
3. Flip lights with odd numbers. 
4. Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...



Example 1:

```
Input: n = 1, m = 1.
Output: 2
Explanation: Status can be: [on], [off]

```



Example 2:

```
Input: n = 2, m = 1.
Output: 3
Explanation: Status can be: [on, off], [off, on], [off, off]

```



Example 3:

```
Input: n = 3, m = 1.
Output: 4
Explanation: Status can be: [off, on, off], [on, off, on], [off, off, off], [off, on, on].

```



Note:  *n*  and  *m*  both fit in range [0, 1000].


# [672. 灯泡开关 Ⅱ][cnTitle]

**中等**

现有一个房间，墙上挂有  *n*  只已经打开的灯泡和 4 个按钮。在进行了  *m*  次未知操作后，你需要返回这  *n*  只灯泡可能有多少种不同的状态。

假设这  *n*  只灯泡被编号为 [1, 2, 3 ..., n]，这 4 个按钮的功能如下：

1. 将所有灯泡的状态反转（即开变为关，关变为开） 
2. 将编号为偶数的灯泡的状态反转 
3. 将编号为奇数的灯泡的状态反转 
4. 将编号为  *3k+1*  的灯泡的状态反转（k = 0, 1, 2, ...)

**示例 1:** 

```
输入: n = 1, m = 1.
输出: 2
说明: 状态为: [开], [关]

```

**示例 2:** 

```
输入: n = 2, m = 1.
输出: 3
说明: 状态为: [开, 关], [关, 开], [关, 关]

```

**示例 3:** 

```
输入: n = 3, m = 1.
输出: 4
说明: 状态为: [关, 开, 关], [开, 关, 开], [关, 关, 关], [关, 开, 开].

```

**注意：**   *n*  和  *m*  都属于 [0, 1000].




# 算法思路

# 测试用例
```
672. Bulb Switcher II 672. 灯泡开关 Ⅱ Medium
```

[enTitle]: https://leetcode.com/problems/bulb-switcher-ii/
[cnTitle]: https://leetcode-cn.com/problems/bulb-switcher-ii/
