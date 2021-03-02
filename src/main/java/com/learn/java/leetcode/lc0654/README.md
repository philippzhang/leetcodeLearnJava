# [654. Maximum Binary Tree][enTitle]

**Medium**

You are given an integer array  *nums*  with no duplicates. A **maximum binary tree**  can be built recursively from  *nums*  using the following algorithm:

1. Create a root node whose value is the maximum value in  *nums* . 
2. Recursively build the left subtree on the **subarray prefix**  to the **left**  of the maximum value. 
3. Recursively build the right subtree on the **subarray suffix**  to the **right**  of the maximum value.

Return  *the maximum binary tree built from*  *nums* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/12/24/tree1.jpg)

```
Input: nums = [3,2,1,6,0,5]
Output: [6,3,5,null,2,0,null,null,1]
Explanation: The recursive calls are as follow:
- The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
    - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
        - Empty array, so no child.
        - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
            - Empty array, so no child.
            - Only one element, so child is a node with value 1.
    - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
        - Only one element, so child is a node with value 0.
        - Empty array, so no child.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/12/24/tree2.jpg)

```
Input: nums = [3,2,1]
Output: [3,null,2,null,1]

```



**Constraints:** 

-  *1 <= nums.length <= 1000*  
-  *0 <= nums[i] <= 1000*  
- All integers in  *nums*  are **unique** .


# [654. 最大二叉树][cnTitle]

**中等**

给定一个不含重复元素的整数数组  *nums*  。一个以此数组直接递归构建的 **最大二叉树**  定义如下：

1. 二叉树的根是数组  *nums*  中的最大元素。 
2. 左子树是通过数组中 **最大值左边部分**  递归构造出的最大二叉树。 
3. 右子树是通过数组中 **最大值右边部分**  递归构造出的最大二叉树。

返回有给定数组  *nums*  构建的 **最大二叉树** 。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/12/24/tree1.jpg)

```
输入：nums = [3,2,1,6,0,5]
输出：[6,3,5,null,2,0,null,null,1]
解释：递归调用如下所示：
- [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
    - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
        - 空数组，无子节点。
        - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
            - 空数组，无子节点。
            - 只有一个元素，所以子节点是一个值为 1 的节点。
    - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
        - 只有一个元素，所以子节点是一个值为 0 的节点。
        - 空数组，无子节点。

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/12/24/tree2.jpg)

```
输入：nums = [3,2,1]
输出：[3,null,2,null,1]

```



**提示：** 

-  *1 <= nums.length <= 1000*  
-  *0 <= nums[i] <= 1000*  
-  *nums*  中的所有整数 **互不相同** 




# 算法思路

# 测试用例
```
654. Maximum Binary Tree 654. 最大二叉树 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/maximum-binary-tree/
