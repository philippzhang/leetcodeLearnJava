# [915. Partition Array into Disjoint Intervals][enTitle]

**Medium**

Given an array  *A* , partition it into two (contiguous) subarrays  *left*  and  *right*  so that:

- Every element in  *left*  is less than or equal to every element in  *right* . 
-  *left*  and  *right*  are non-empty. 
-  *left*  has the smallest possible size.

Return the **length**  of  *left*  after such a partitioning. It is guaranteed that such a partitioning exists.



**Example 1:** 

```
Input:[5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
```


**Example 2:** 

```
Input:[1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]
```





**Note:** 

1.  *2 <= A.length <= 30000*  
2.  *0 <= A[i] <= 10^6*  
3. It is guaranteed there is at least one way to partition  *A*  as described.








# [915. 分割数组][cnTitle]

**中等**

给定一个数组  *A* ，将其划分为两个不相交（没有公共元素）的连续子数组  *left*  和  *right* ， 使得：

-  *left*  中的每个元素都小于或等于  *right*  中的每个元素。 
-  *left*  和  *right*  都是非空的。 
-  *left*  要尽可能小。

在完成这样的分组后返回  *left*  的**长度** 。可以保证存在这样的划分方法。



**示例 1：** 

```
输入：[5,0,3,8,6]
输出：3
解释：left = [5,0,3]，right = [8,6]

```

**示例 2：** 

```
输入：[1,1,1,0,6,12]
输出：4
解释：left = [1,1,1,0]，right = [6,12]

```



**提示：** 

1.  *2 <= A.length <= 30000*  
2.  *0 <= A[i] <= 10^6*  
3. 可以保证至少有一种方法能够按题目所描述的那样对  *A*  进行划分。






# 算法思路

# 测试用例
```
915. Partition Array into Disjoint Intervals 915. 分割数组 Medium
```

[enTitle]: https://leetcode.com/problems/partition-array-into-disjoint-intervals/
[cnTitle]: https://leetcode-cn.com/problems/partition-array-into-disjoint-intervals/
