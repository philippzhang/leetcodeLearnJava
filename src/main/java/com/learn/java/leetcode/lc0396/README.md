# [396. Rotate Function][enTitle]

**Medium**

Given an array of integers  *A*  and let n to be its length.

Assume  *Bk*  to be an array obtained by rotating the array  *A*  k positions clock-wise, we define a "rotation function"  *F*  on  *A*  as follow:

 *F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]* .

Calculate the maximum value of  *F(0), F(1), ..., F(n-1)* .

Note: n is guaranteed to be less than 10<sup>5</sup>.

Example:

```
A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.

```




# [396. 旋转函数][cnTitle]

**中等**

给定一个长度为  *n*  的整数数组  *A*  。

假设  *Bk*  是数组  *A*  顺时针旋转  *k*  个位置后的数组，我们定义  *A*  的“旋转函数”  *F*  为：

 *F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]* 。

计算 *F(0), F(1), ..., F(n-1)* 中的最大值。

**注意:**  可以认为 *n*  的值小于 10<sup>5</sup>。

**示例:** 

```
A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。

```




# 算法思路

# 测试用例
```
396. Rotate Function 396. 旋转函数 Medium
```

[enTitle]: https://leetcode.com/problems/rotate-function/
[cnTitle]: https://leetcode-cn.com/problems/rotate-function/
