# [749. Contain Virus][enTitle]

**Hard**

A virus is spreading rapidly, and your task is to quarantine the infected area by installing walls.

The world is modeled as a 2-D array of cells, where  *0*  represents uninfected cells, and  *1*  represents cells contaminated with the virus. A wall (and only one wall) can be installed between any two 4-directionally adjacent cells, on the shared boundary.

Every night, the virus spreads to all neighboring cells in all four directions unless blocked by a wall. Resources are limited. Each day, you can install walls around only one region -- the affected area (continuous block of infected cells) that threatens the most uninfected cells the following night. There will never be a tie.

Can you save the day? If so, what is the number of walls required? If not, and the world becomes fully infected, return the number of walls used.



Example 1:

```
Input: grid = 
[[0,1,0,0,0,0,0,1],
 [0,1,0,0,0,0,0,1],
 [0,0,0,0,0,0,0,1],
 [0,0,0,0,0,0,0,0]]
Output: 10
Explanation:
There are 2 contaminated regions.
On the first day, add 5 walls to quarantine the viral region on the left. The board after the virus spreads is:

[[0,1,0,0,0,0,1,1],
 [0,1,0,0,0,0,1,1],
 [0,0,0,0,0,0,1,1],
 [0,0,0,0,0,0,0,1]]

On the second day, add 5 walls to quarantine the viral region on the right. The virus is fully contained.

```



Example 2:

```
Input: grid = 
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output: 4
Explanation: Even though there is only one cell saved, there are 4 walls built.
Notice that walls are only built on the shared boundary of two different cells.

```



Example 3:

```
Input: grid = 
[[1,1,1,0,0,0,0,0,0],
 [1,0,1,0,1,1,1,1,1],
 [1,1,1,0,0,0,0,0,0]]
Output: 13
Explanation: The region on the left only builds two new walls.

```



Note:

1. The number of rows and columns of  *grid*  will each be in the range  *[1, 50]* . 
2. Each  *grid[i][j]*  will be either  *0*  or  *1* . 
3. Throughout the described process, there is always a contiguous viral region that will infect strictly more uncontaminated squares in the next round.




# [749. 隔离病毒][cnTitle]

**困难**

病毒扩散得很快，现在你的任务是尽可能地通过安装防火墙来隔离病毒。

假设世界由二维矩阵组成， *0*  表示该区域未感染病毒，而  *1*  表示该区域已感染病毒。可以在任意 2 个四方向相邻单元之间的共享边界上安装一个防火墙（并且只有一个防火墙）。

每天晚上，病毒会从被感染区域向相邻未感染区域扩散，除非被防火墙隔离。现由于资源有限，每天你只能安装一系列防火墙来隔离其中一个被病毒感染的区域（一个区域或连续的一片区域），且该感染区域对未感染区域的威胁最大且保证唯一。

你需要努力使得最后有部分区域不被病毒感染，如果可以成功，那么返回需要使用的防火墙个数; 如果无法实现，则返回在世界被病毒全部感染时已安装的防火墙个数。



**示例 1：** 

```
输入: grid = 
[[0,1,0,0,0,0,0,1],
 [0,1,0,0,0,0,0,1],
 [0,0,0,0,0,0,0,1],
 [0,0,0,0,0,0,0,0]]
输出: 10
说明:
一共有两块被病毒感染的区域: 从左往右第一块需要 5 个防火墙，同时若该区域不隔离，晚上将感染 5 个未感染区域（即被威胁的未感染区域个数为 5）;
第二块需要 4 个防火墙，同理被威胁的未感染区域个数是 4。因此，第一天先隔离左边的感染区域，经过一晚后，病毒传播后世界如下:
[[0,1,0,0,0,0,1,1],
 [0,1,0,0,0,0,1,1],
 [0,0,0,0,0,0,1,1],
 [0,0,0,0,0,0,0,1]]
第二题，只剩下一块未隔离的被感染的连续区域，此时需要安装 5 个防火墙，且安装完毕后病毒隔离任务完成。

```

**示例 2：** 

```
输入: grid = 
[[1,1,1],
 [1,0,1],
 [1,1,1]]
输出: 4
说明: 
此时只需要安装 4 面防火墙，就有一小区域可以幸存，不被病毒感染。
注意不需要在世界边界建立防火墙。
```



**示例 3:** 

```
输入: grid = 
[[1,1,1,0,0,0,0,0,0],
 [1,0,1,0,1,1,1,1,1],
 [1,1,1,0,0,0,0,0,0]]
输出: 13
说明: 
在隔离右边感染区域后，隔离左边病毒区域只需要 2 个防火墙了。

```



**说明:** 

1.  *grid*  的行数和列数范围是 [1, 50]。 
2.   *grid[i][j]*  只包含  *0*  或  *1*  。 
3. 题目保证每次选取感染区域进行隔离时，一定存在唯一一个对未感染区域的威胁最大的区域。






# 算法思路

# 测试用例
```
749. Contain Virus 749. 隔离病毒 Hard
```

[enTitle]: https://leetcode.com/problems/contain-virus/
[cnTitle]: https://leetcode-cn.com/problems/contain-virus/
