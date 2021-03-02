# [764. Largest Plus Sign][enTitle]

**Medium**

In a 2D  *grid*  from (0, 0) to (N-1, N-1), every cell contains a  *1* , except those cells in the given list  *mines*  which are  *0* . What is the largest axis-aligned plus sign of  *1* s contained in the grid? Return the order of the plus sign. If there is none, return 0.

An "axis-aligned plus sign of 1s of order k" has some center  *grid[x][y] = 1*  along with 4 arms of length  *k-1*  going up, down, left, and right, and made of  *1* s. This is demonstrated in the diagrams below. Note that there could be  *0* s or  *1* s beyond the arms of the plus sign, only the relevant area of the plus sign is checked for 1s.



Examples of Axis-Aligned Plus Signs of Order k:

```
Order 1:
000
010
000

Order 2:
00000
00100
01110
00100
00000

Order 3:
0000000
0001000
0001000
0111110
0001000
0001000
0000000

```



Example 1:

```
Input: N = 5, mines = [[4, 2]]
Output: 2
Explanation:
11111
11111
11111
11111
11011
In the above grid, the largest plus sign can only be order 2.  One of them is marked in bold.

```



Example 2:

```
Input: N = 2, mines = []
Output: 1
Explanation:
There is no plus sign of order 2, but there is of order 1.

```



Example 3:

```
Input: N = 1, mines = [[0, 0]]
Output: 0
Explanation:
There is no plus sign, so return 0.

```



Note:

1.  *N*  will be an integer in the range  *[1, 500]* . 
2.  *mines*  will have length at most  *5000* . 
3.  *mines[i]*  will be length 2 and consist of integers in the range  *[0, N-1]* . 
4. (Additionally, programs submitted in C, C++, or C# will be judged with a slightly smaller time limit.)




# [764. 最大加号标志][cnTitle]

**中等**

在一个大小在 (0, 0) 到 (N-1, N-1) 的2D网格  *grid*  中，除了在  *mines*  中给出的单元为  *0* ，其他每个单元都是  *1* 。网格中包含  *1*  的最大的轴对齐加号标志是多少阶？返回加号标志的阶数。如果未找到加号标志，则返回 0。

一个 **k** " 阶由  *1*  组成的“轴对称”加号标志具有中心网格  *grid[x][y] = 1*  ，以及4个从中心向上、向下、向左、向右延伸，长度为  *k-1* ，由  *1*  组成的臂。下面给出 **k** " 阶“轴对称”加号标志的示例。注意，只有加号标志的所有网格要求为 1，别的网格可能为 0 也可能为 1。



**k 阶轴对称加号标志示例:** 

```
阶 1:
000
010
000

阶 2:
00000
00100
01110
00100
00000

阶 3:
0000000
0001000
0001000
0111110
0001000
0001000
0000000

```



**示例 1：** 

```
输入: N = 5, mines = [[4, 2]]
输出: 2
解释:
11111
11111
11111
11111
11011

在上面的网格中，最大加号标志的阶只能是2。一个标志已在图中标出。

```



**示例 2：** 

```
输入: N = 2, mines = []
输出: 1
解释:

11
11
没有 2 阶加号标志，有 1 阶加号标志。

```



**示例 3：** 

```
输入: N = 1, mines = [[0, 0]]
输出: 0
解释:

0
没有加号标志，返回 0 。

```



**提示：** 

1. 整数 *N*  的范围：  *[1, 500]* . 
2.  *mines*  的最大长度为  *5000* . 
3.  *mines[i]*  是长度为2的由2个  *[0, N-1]*  中的数组成. 
4.  *(另外,使用 C, C++, 或者 C# 编程将以稍小的时间限制进行判断.)* 






# 算法思路

# 测试用例
```
764. Largest Plus Sign 764. 最大加号标志 Medium
```

[enTitle]: https://leetcode.com/problems/largest-plus-sign/
[cnTitle]: https://leetcode-cn.com/problems/largest-plus-sign/
