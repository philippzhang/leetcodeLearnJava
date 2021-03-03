# [1042. Flower Planting With No Adjacent][enTitle]

**Medium**

You have  *n*  gardens, labeled from  *1*  to  *n* , and an array  *paths*  where  *paths[i] = [xi, yi]*  describes a bidirectional path between garden  *xi*  to garden  *yi* . In each garden, you want to plant one of 4 types of flowers.

All gardens have **at most 3**  paths coming into or leaving it.

Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.

Return  *any such a choice as an array*  *answer*  *, where*  *answer[i]*  *is the type of flower planted in the*  *(i+1)th*  *garden. The flower types are denoted*  *1*  *,*  *2*  *,*  *3*  *, or*  *4*  *. It is guaranteed an answer exists.* 



**Example 1:** 

```
Input: n = 3, paths = [[1,2],[2,3],[3,1]]
Output: [1,2,3]
Explanation:
Gardens 1 and 2 have different types.
Gardens 2 and 3 have different types.
Gardens 3 and 1 have different types.
Hence, [1,2,3] is a valid answer. Other valid answers include [1,2,4], [1,4,2], and [3,2,1].

```

**Example 2:** 

```
Input: n = 4, paths = [[1,2],[3,4]]
Output: [1,2,1,2]

```

**Example 3:** 

```
Input: n = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
Output: [1,2,3,4]

```



**Constraints:** 

-  *1 <= n <= 104*  
-  *0 <= paths.length <= 2 * 104*  
-  *paths[i].length == 2*  
-  *1 <= xi, yi <= n*  
-  *xi != yi*  
- Every garden has **at most 3**  paths coming into or leaving it.


# [1042. 不邻接植花][cnTitle]

**中等**

有  *n*  个花园，按从  *1*  到  *n*  标记。另有数组  *paths*  ，其中  *paths[i] = [xi, yi]*  描述了花园  *xi*  到花园  *yi*  的双向路径。在每个花园中，你打算种下四种花之一。

另外，所有花园 **最多**  有 3 条路径可以进入或离开.

你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。

以数组形式返回 **任一**  可行的方案作为答案  *answer* ，其中  *answer[i]*  为在第  *(i+1)*  个花园中种植的花的种类。花的种类用 1、2、3、4 表示。保证存在答案。



**示例 1：** 

```
输入：n = 3, paths = [[1,2],[2,3],[3,1]]
输出：[1,2,3]
解释：
花园 1 和 2 花的种类不同。
花园 2 和 3 花的种类不同。
花园 3 和 1 花的种类不同。
因此，[1,2,3] 是一个满足题意的答案。其他满足题意的答案有 [1,2,4]、[1,4,2] 和 [3,2,1]

```

**示例 2：** 

```
输入：n = 4, paths = [[1,2],[3,4]]
输出：[1,2,1,2]

```

**示例 3：** 

```
输入：n = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
输出：[1,2,3,4]

```



**提示：** 

-  *1 <= n <= 104*  
-  *0 <= paths.length <= 2 * 104*  
-  *paths[i].length == 2*  
-  *1 <= xi, yi <= n*  
-  *xi != yi*  
- 每个花园 **最多**  有 3 条路径可以进入或离开




# 算法思路

# 测试用例
```
1042. Flower Planting With No Adjacent 1042. 不邻接植花 Medium
```

[enTitle]: https://leetcode.com/problems/flower-planting-with-no-adjacent/
[cnTitle]: https://leetcode-cn.com/problems/flower-planting-with-no-adjacent/
