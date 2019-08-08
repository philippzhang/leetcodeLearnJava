# [373. Find K Pairs with Smallest Sums][enTitle]

**Medium**

You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

Define a pair (u,v) which consists of one element from the first array and one element from the second array.

Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.

**Example 1:** 

```
Input:nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]] 
Explanation: The first 3 pairs are returned from the sequence: 
             [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
```

**Example 2:** 

```
Input:nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output:[1,1],[1,1]
Explanation:The first 2 pairs are returned from the sequence: 
             [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
```

**Example 3:** 

```
Input:nums1 = [1,2], nums2 = [3], k = 3
Output:[1,3],[2,3]
Explanation:All possible pairs are returned from the sequence: [1,3],[2,3]

```


# [373. 查找和最小的K对数字][cnTitle]

**中等**

给定两个以升序排列的整形数组 **nums1**  和 **nums2** , 以及一个整数 **k** 。

定义一对值 **(u,v)** ，其中第一个元素来自 **nums1** ，第二个元素来自 **nums2** 。

找到和最小的 k 对数字 **(u1,v1), (u2,v2) ... (uk,vk)** 。

**示例 1:** 

```
输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
输出: [1,2],[1,4],[1,6]
解释:返回序列中的前 3 对数：
     [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

```

**示例 2:** 

```
输入:nums1 = [1,1,2], nums2 = [1,2,3], k = 2
输出:[1,1],[1,1]
解释:返回序列中的前 2 对数：
     [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

```

**示例 3:** 

```
输入:nums1 = [1,2], nums2 = [3], k = 3 
输出: [1,3],[2,3]
解释:也可能序列中所有的数对都被返回:[1,3],[2,3]

```




# 算法思路

# 测试用例
```
373. Find K Pairs with Smallest Sums 373. 查找和最小的K对数字 Medium
```

[enTitle]: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
[cnTitle]: https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
