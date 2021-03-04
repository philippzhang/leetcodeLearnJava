# [1643. Kth Smallest Instructions][enTitle]

**Hard**

Bob is standing at cell  *(0, 0)* , and he wants to reach  *destination* :  *(row, column)* . He can only travel **right**  and **down** . You are going to help Bob by providing **instructions**  for him to reach  *destination* .

The **instructions**  are represented as a string, where each character is either:

-  *'H'* , meaning move horizontally (go **right** ), or 
-  *'V'* , meaning move vertically (go **down** ).

Multiple **instructions**  will lead Bob to  *destination* . For example, if  *destination*  is  *(2, 3)* , both  *"HHHVV"*  and  *"HVHVH"*  are valid **instructions** .



However, Bob is very picky. Bob has a lucky number  *k* , and he wants the  *kth*  **lexicographically smallest instructions**  that will lead him to  *destination* .  *k*  is **1-indexed** .

Given an integer array  *destination*  and an integer  *k* , return  *the*  *kth*  *lexicographically smallest instructions that will take Bob to*  *destination* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/12/ex1.png)

```
Input: destination = [2,3], k = 1
Output: "HHHVV"
Explanation: All the instructions that reach (2, 3) in lexicographic order are as follows:
["HHHVV", "HHVHV", "HHVVH", "HVHHV", "HVHVH", "HVVHH", "VHHHV", "VHHVH", "VHVHH", "VVHHH"].

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/10/12/ex2.png)

```
Input: destination = [2,3], k = 2
Output: "HHVHV"

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/10/12/ex3.png)

```
Input: destination = [2,3], k = 3
Output: "HHVVH"

```



**Constraints:** 

-  *destination.length == 2*  
-  *1 <= row, column <= 15*  
-  *1 <= k <= nCr(row + column, row)* , where  *nCr(a, b)*  denotes  *a*  choose  *b* ​​​​​.


# [1643. 第 K 条最小指令][cnTitle]

**困难**

Bob 站在单元格  *(0, 0)*  ，想要前往目的地  *destination*  ： *(row, column)*  。他只能向 **右**  或向 **下**  走。你可以为 Bob 提供导航 **指令**  来帮助他到达目的地  *destination*  。

**指令**  用字符串表示，其中每个字符：

-  *'H'*  ，意味着水平向右移动 
-  *'V'*  ，意味着竖直向下移动

能够为 Bob 导航到目的地  *destination*  的指令可以有多种，例如，如果目的地  *destination*  是  *(2, 3)* ， *"HHHVV"*  和  *"HVHVH"*  都是有效**指令**  。



然而，Bob 很挑剔。因为他的幸运数字是  *k* ，他想要遵循 <strong>按字典序排列后的第  *k*  条最小指令 </strong>的导航前往目的地  *destination*  。 *k*  的编号 **从 1 开始**  。

给你一个整数数组  *destination*  和一个整数  *k*  ，请你返回可以为Bob提供前往目的地  *destination*  导航的<strong> 按字典序排列后的第  *k*  条最小指令 </strong>。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/01/ex1.png)

```
输入：destination = [2,3], k = 1
输出："HHHVV"
解释：能前往 (2, 3) 的所有导航指令 按字典序排列后 如下所示：
["HHHVV", "HHVHV", "HHVVH", "HVHHV", "HVHVH", "HVVHH", "VHHHV", "VHHVH", "VHVHH", "VVHHH"].

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/01/ex2.png)

```
输入：destination = [2,3], k = 2
输出："HHVHV"

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/01/ex3.png)

```
输入：destination = [2,3], k = 3
输出："HHVVH"

```



**提示：** 

-  *destination.length == 2*  
-  *1 <= row, column <= 15*  
-  *1 <= k <= nCr(row + column, row)* ，其中  *nCr(a, b)*  表示组合数，即从  *a*  个物品中选  *b*  个物品的不同方案数。




# 算法思路

# 测试用例
```
1643. Kth Smallest Instructions 1643. 第 K 条最小指令 Hard
```

[enTitle]: https://leetcode.com/problems/kth-smallest-instructions/
[cnTitle]: https://leetcode-cn.com/problems/kth-smallest-instructions/
