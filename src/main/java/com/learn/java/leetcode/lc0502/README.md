# [502. IPO][enTitle]

**Hard**

Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.

You are given several projects. For each project i, it has a pure profit Pi and a minimum capital of Ci is needed to start the corresponding project. Initially, you have W capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.

To sum up, pick a list of at most k distinct projects from given projects to maximize your final capital, and output your final maximized capital.

Example 1:

```
Input: k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].

Output: 4

Explanation: Since your initial capital is 0, you can only start the project indexed 0.
             After finishing it you will obtain profit 1 and your capital becomes 1.
             With capital 1, you can either start the project indexed 1 or the project indexed 2.
             Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
             Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.

```



Note:

1. You may assume all numbers in the input are non-negative integers. 
2. The length of Profits array and Capital array will not exceed 50,000. 
3. The answer is guaranteed to fit in a 32-bit signed integer.




# [502. IPO][cnTitle]

**困难**

假设 力扣（LeetCode）即将开始其 IPO。为了以更高的价格将股票卖给风险投资公司，力扣 希望在 IPO 之前开展一些项目以增加其资本。 由于资源有限，它只能在 IPO 之前完成最多 **k**  个不同的项目。帮助 力扣 设计完成最多 **k**  个不同项目后得到最大总资本的方式。

给定若干个项目。对于每个项目 **i** ，它都有一个纯利润 **Pi** ，并且需要最小的资本 **Ci**  来启动相应的项目。最初，你有 **W**  资本。当你完成一个项目时，你将获得纯利润，且利润将被添加到你的总资本中。

总而言之，从给定项目中选择最多 **k**  个不同项目的列表，以最大化最终资本，并输出最终可获得的最多资本。



**示例：** 

```
输入：k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].
输出：4
解释：由于你的初始资本为 0，你仅可以从 0 号项目开始。
在完成后，你将获得 1 的利润，你的总资本将变为 1。
此时你可以选择开始 1 号或 2 号项目。
由于你最多可以选择两个项目，所以你需要完成 2 号项目以获得最大的资本。
因此，输出最后最大化的资本，为 0 + 1 + 3 = 4。

```



**提示：** 

- 假设所有输入数字都是非负整数。 
- 表示利润和资本的数组的长度不超过 50000。 
- 答案保证在 32 位有符号整数范围内。




# 算法思路

# 测试用例
```
502. IPO 502. IPO Hard
```

[enTitle]: https://leetcode.com/problems/ipo/
[cnTitle]: https://leetcode-cn.com/problems/ipo/
