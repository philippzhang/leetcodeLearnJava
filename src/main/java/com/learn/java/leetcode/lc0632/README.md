# [632. Smallest Range Covering Elements from K Lists][enTitle]

**Hard**

You have  *k*  lists of sorted integers in **non-decreasing order** . Find the smallest range that includes at least one number from each of the  *k*  lists.

We define the range  *[a, b]*  is smaller than range  *[c, d]*  if  *b - a < d - c*  **or**   *a < c*  if  *b - a == d - c* .



**Example 1:** 

```
Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].

```

**Example 2:** 

```
Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]

```

**Example 3:** 

```
Input: nums = [[10,10],[11,11]]
Output: [10,11]

```

**Example 4:** 

```
Input: nums = [[10],[11]]
Output: [10,11]

```

**Example 5:** 

```
Input: nums = [[1],[2],[3],[4],[5],[6],[7]]
Output: [1,7]

```



**Constraints:** 

-  *nums.length == k*  
-  *1 <= k <= 3500*  
-  *1 <= nums[i].length <= 50*  
-  *-105 <= nums[i][j] <= 105*  
-  *nums[i]*  is sorted in **non-decreasing**  order.


# [632. 最小区间][cnTitle]

**困难**

你有  *k*  个 **非递减排列**  的整数列表。找到一个 **最小** 区间，使得  *k*  个列表中的每个列表至少有一个数包含在其中。

我们定义如果  *b-a < d-c*  或者在  *b-a == d-c*  时  *a < c* ，则区间  *[a,b]*  比  *[c,d]*  小。



**示例 1：** 

```
输入：nums = [[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
输出：[20,24]
解释： 
列表 1：[4, 10, 15, 24, 26]，24 在区间 [20,24] 中。
列表 2：[0, 9, 12, 20]，20 在区间 [20,24] 中。
列表 3：[5, 18, 22, 30]，22 在区间 [20,24] 中。

```

**示例 2：** 

```
输入：nums = [[1,2,3],[1,2,3],[1,2,3]]
输出：[1,1]

```

**示例 3：** 

```
输入：nums = [[10,10],[11,11]]
输出：[10,11]

```

**示例 4：** 

```
输入：nums = [[10],[11]]
输出：[10,11]

```

**示例 5：** 

```
输入：nums = [[1],[2],[3],[4],[5],[6],[7]]
输出：[1,7]

```



**提示：** 

-  *nums.length == k*  
-  *1 <= k <= 3500*  
-  *1 <= nums[i].length <= 50*  
-  *-105 <= nums[i][j] <= 105*  
-  *nums[i]*  按非递减顺序排列




# 算法思路

# 测试用例
```
632. Smallest Range Covering Elements from K Lists 632. 最小区间 Hard
```

[enTitle]: https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/
[cnTitle]: https://leetcode-cn.com/problems/smallest-range-covering-elements-from-k-lists/
