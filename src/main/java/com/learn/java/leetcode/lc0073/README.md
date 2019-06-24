# [73. Set Matrix Zeroes][enTitle]

**Medium**

**in-place** 

**Example 1:** 

```
Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

```

**Example 2:** 

```
Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]

```

**Follow up:** 

- A straight forward solution using O( *m*  *n* ) space is probably a bad idea. 
- A simple improvement uses O( *m*  +  *n* ) space, but still not the best solution. 
- Could you devise a constant space solution?


# [73. 矩阵置零][cnTitle]

**中等**

给定一个  *m*  x  *n*  的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用**原地** 算法**。** 

**示例 1:** 

```
输入: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
输出: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

```

**示例 2:** 

```
输入: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
输出: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
```

**进阶:** 

- 一个直接的解决方案是使用 O( *m*  *n* ) 的额外空间，但这并不是一个好的解决方案。 
- 一个简单的改进方案是使用 O( *m*  +  *n* ) 的额外空间，但这仍然不是最好的解决方案。 
- 你能想出一个常数空间的解决方案吗？




# 算法思路

# 测试用例
```
73. Set Matrix Zeroes 73. 矩阵置零 Medium
```

[enTitle]: https://leetcode.com/problems/set-matrix-zeroes/
[cnTitle]: https://leetcode-cn.com/problems/set-matrix-zeroes/
