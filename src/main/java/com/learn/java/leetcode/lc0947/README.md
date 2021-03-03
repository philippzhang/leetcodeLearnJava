# [947. Most Stones Removed with Same Row or Column][enTitle]

**Medium**

On a 2D plane, we place  *n*  stones at some integer coordinate points. Each coordinate point may have at most one stone.

A stone can be removed if it shares either **the same row or the same column**  as another stone that has not been removed.

Given an array  *stones*  of length  *n*  where  *stones[i] = [xi, yi]*  represents the location of the  *ith*  stone, return  *the largest possible number of stones that can be removed* .



**Example 1:** 

```
Input: stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
Output: 5
Explanation: One way to remove 5 stones is as follows:
1. Remove stone [2,2] because it shares the same row as [2,1].
2. Remove stone [2,1] because it shares the same column as [0,1].
3. Remove stone [1,2] because it shares the same row as [1,0].
4. Remove stone [1,0] because it shares the same column as [0,0].
5. Remove stone [0,1] because it shares the same row as [0,0].
Stone [0,0] cannot be removed since it does not share a row/column with another stone still on the plane.

```

**Example 2:** 

```
Input: stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
Output: 3
Explanation: One way to make 3 moves is as follows:
1. Remove stone [2,2] because it shares the same row as [2,0].
2. Remove stone [2,0] because it shares the same column as [0,0].
3. Remove stone [0,2] because it shares the same row as [0,0].
Stones [0,0] and [1,1] cannot be removed since they do not share a row/column with another stone still on the plane.

```

**Example 3:** 

```
Input: stones = [[0,0]]
Output: 0
Explanation: [0,0] is the only stone on the plane, so you cannot remove it.

```



**Constraints:** 

-  *1 <= stones.length <= 1000*  
-  *0 <= xi, yi <= 104*  
- No two stones are at the same coordinate point.


# [947. 移除最多的同行或同列石头][cnTitle]

**中等**

 *n*  块石头放置在二维平面中的一些整数坐标点上。每个坐标点上最多只能有一块石头。

如果一块石头的 **同行或者同列**  上有其他石头存在，那么就可以移除这块石头。

给你一个长度为  *n*  的数组  *stones*  ，其中  *stones[i] = [xi, yi]*  表示第  *i*  块石头的位置，返回 **可以移除的石子**  的最大数量。



**示例 1：** 

```
输入：stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
输出：5
解释：一种移除 5 块石头的方法如下所示：
1. 移除石头 [2,2] ，因为它和 [2,1] 同行。
2. 移除石头 [2,1] ，因为它和 [0,1] 同列。
3. 移除石头 [1,2] ，因为它和 [1,0] 同行。
4. 移除石头 [1,0] ，因为它和 [0,0] 同列。
5. 移除石头 [0,1] ，因为它和 [0,0] 同行。
石头 [0,0] 不能移除，因为它没有与另一块石头同行/列。
```

**示例 2：** 

```
输入：stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
输出：3
解释：一种移除 3 块石头的方法如下所示：
1. 移除石头 [2,2] ，因为它和 [2,0] 同行。
2. 移除石头 [2,0] ，因为它和 [0,0] 同列。
3. 移除石头 [0,2] ，因为它和 [0,0] 同行。
石头 [0,0] 和 [1,1] 不能移除，因为它们没有与另一块石头同行/列。
```

**示例 3：** 

```
输入：stones = [[0,0]]
输出：0
解释：[0,0] 是平面上唯一一块石头，所以不可以移除它。
```



**提示：** 

-  *1 <= stones.length <= 1000*  
-  *0 <= xi, yi <= 104*  
- 不会有两块石头放在同一个坐标点上




# 算法思路

# 测试用例
```
947. Most Stones Removed with Same Row or Column 947. 移除最多的同行或同列石头 Medium
```

[enTitle]: https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
[cnTitle]: https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/
