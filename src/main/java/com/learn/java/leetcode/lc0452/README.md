# [452. Minimum Number of Arrows to Burst Balloons][enTitle]

**Medium**

There are a number of spherical balloons spread in two-dimensional space. For each balloon, provided input is the start and end coordinates of the horizontal diameter. Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice. Start is always smaller than end. There will be at most 10<sup>4</sup> balloons.

An arrow can be shot up exactly vertically from different points along the x-axis. A balloon with x<sub>start</sub> and x<sub>end</sub> bursts by an arrow shot at x if x<sub>start</sub> ≤ x ≤ x<sub>end</sub>. There is no limit to the number of arrows that can be shot. An arrow once shot keeps travelling up infinitely. The problem is to find the minimum number of arrows that must be shot to burst all balloons.

Example:

```
Input:
[[10,16], [2,8], [1,6], [7,12]]

Output:
2

Explanation:
One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two balloons).

```


# [452. 用最少数量的箭引爆气球][cnTitle]

**中等**

在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以y坐标并不重要，因此只要知道开始和结束的x坐标就足够了。开始坐标总是小于结束坐标。平面内最多存在10<sup>4</sup>个气球。

一支弓箭可以沿着x轴从不同点完全垂直地射出。在坐标x处射出一支箭，若有一个气球的直径的开始和结束坐标为 x<sub>start，</sub>x<sub>end，</sub> 且满足 x<sub>start</sub> ≤ x ≤ x<sub>end，</sub>则该气球会被引爆<sub>。</sub>可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。

**Example:** 

```
输入:
[[10,16], [2,8], [1,6], [7,12]]

输出:
2

解释:
对于该样例，我们可以在x = 6（射爆[2,8],[1,6]两个气球）和 x = 11（射爆另外两个气球）。

```


# 算法思路

# 测试用例
```
452. Minimum Number of Arrows to Burst Balloons 452. 用最少数量的箭引爆气球 Medium
Solution.findMinArrowShots
---
[[10,16],[2,8],[1,6],[7,12]]

=2
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
