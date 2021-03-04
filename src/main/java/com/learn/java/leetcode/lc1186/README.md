# [1186. Maximum Subarray Sum with One Deletion][enTitle]

**Medium**

Given an array of integers, return the maximum sum for a **non-empty**  subarray (contiguous elements) with at most one element deletion. In other words, you want to choose a subarray and optionally delete one element from it so that there is still at least one element left and the sum of the remaining elements is maximum possible.

Note that the subarray needs to be **non-empty**  after deleting one element.



**Example 1:** 

```
Input: arr = [1,-2,0,3]
Output: 4
Explanation:Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3] becomes the maximum value.
```

**Example 2:** 

```
Input: arr = [1,-2,-2,3]
Output: 3
Explanation:We just choose [3] and it's the maximum sum.

```

**Example 3:** 

```
Input: arr = [-1,-1,-1,-1]
Output: -1
Explanation: The final subarray needs to be non-empty. You can't choose [-1] and delete -1 from it, then get an empty subarray to make the sum equals to 0.

```



**Constraints:** 

-  *1 <= arr.length <= 105*  
-  *-104 <= arr[i] <= 104* 


# [1186. 删除一次得到子数组最大和][cnTitle]

**中等**

给你一个整数数组，返回它的某个 **非空**  子数组（连续元素）在执行一次可选的删除操作后，所能得到的最大元素总和。

换句话说，你可以从原数组中选出一个子数组，并可以决定要不要从中删除一个元素（只能删一次哦），（删除后）子数组中至少应当有一个元素，然后该子数组（剩下）的元素总和是所有子数组之中最大的。

注意，删除一个元素后，子数组 **不能为空** 。

请看示例：

**示例 1：** 

```
输入：arr = [1,-2,0,3]
输出：4
解释：我们可以选出 [1, -2, 0, 3]，然后删掉 -2，这样得到 [1, 0, 3]，和最大。
```

**示例 2：** 

```
输入：arr = [1,-2,-2,3]
输出：3
解释：我们直接选出 [3]，这就是最大和。

```

**示例 3：** 

```
输入：arr = [-1,-1,-1,-1]
输出：-1
解释：最后得到的子数组不能为空，所以我们不能选择 [-1] 并从中删去 -1 来得到 0。
     我们应该直接选择 [-1]，或者选择 [-1, -1] 再从中删去一个 -1。

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *-10^4 <= arr[i] <= 10^4* 




# 算法思路

# 测试用例
```
1186. Maximum Subarray Sum with One Deletion 1186. 删除一次得到子数组最大和 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/
[cnTitle]: https://leetcode-cn.com/problems/maximum-subarray-sum-with-one-deletion/
