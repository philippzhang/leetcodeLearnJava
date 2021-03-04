# [1444. Number of Ways of Cutting a Pizza][enTitle]

**Hard**

Given a rectangular pizza represented as a  *rows x cols*  matrix containing the following characters:  *'A'*  (an apple) and  *'.'*  (empty cell) and given the integer  *k* . You have to cut the pizza into  *k*  pieces using  *k-1*  cuts.

For each cut you choose the direction: vertical or horizontal, then you choose a cut position at the cell boundary and cut the pizza into two pieces. If you cut the pizza vertically, give the left part of the pizza to a person. If you cut the pizza horizontally, give the upper part of the pizza to a person. Give the last piece of pizza to the last person.

 *Return the number of ways of cutting the pizza such that each piece contains at least one apple.* Since the answer can be a huge number, return this modulo 10^9 + 7.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/04/23/ways_to_cut_apple_1.png)

```
Input: pizza = ["A..","AAA","..."], k = 3
Output: 3 
Explanation: The figure above shows the three ways to cut the pizza. Note that pieces must contain at least one apple.

```

**Example 2:** 

```
Input: pizza = ["A..","AA.","..."], k = 3
Output: 1

```

**Example 3:** 

```
Input: pizza = ["A..","A..","..."], k = 1
Output: 1

```



**Constraints:** 

-  *1 <= rows, cols <= 50*  
-  *rows == pizza.length*  
-  *cols == pizza[i].length*  
-  *1 <= k <= 10*  
-  *pizza*  consists of characters  *'A'*  and  *'.'*  only.


# [1444. 切披萨的方案数][cnTitle]

**困难**

给你一个  *rows x cols*  大小的矩形披萨和一个整数  *k*  ，矩形包含两种字符：  *'A'*  （表示苹果）和  *'.'*  （表示空白格子）。你需要切披萨  *k-1*  次，得到  *k*  块披萨并送给别人。

切披萨的每一刀，先要选择是向垂直还是水平方向切，再在矩形的边界上选一个切的位置，将披萨一分为二。如果垂直地切披萨，那么需要把左边的部分送给一个人，如果水平地切，那么需要把上面的部分送给一个人。在切完最后一刀后，需要把剩下来的一块送给最后一个人。

请你返回确保每一块披萨包含 **至少**  一个苹果的切披萨方案数。由于答案可能是个很大的数字，请你返回它对 10^9 + 7 取余的结果。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/10/ways_to_cut_apple_1.png)

```
输入：pizza = ["A..","AAA","..."], k = 3
输出：3 
解释：上图展示了三种切披萨的方案。注意每一块披萨都至少包含一个苹果。

```

**示例 2：** 

```
输入：pizza = ["A..","AA.","..."], k = 3
输出：1

```

**示例 3：** 

```
输入：pizza = ["A..","A..","..."], k = 1
输出：1

```



**提示：** 

-  *1 <= rows, cols <= 50*  
-  *rows == pizza.length*  
-  *cols == pizza[i].length*  
-  *1 <= k <= 10*  
-  *pizza*  只包含字符  *'A'*  和  *'.'*  。




# 算法思路

# 测试用例
```
1444. Number of Ways of Cutting a Pizza 1444. 切披萨的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-of-cutting-a-pizza/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-of-cutting-a-pizza/
