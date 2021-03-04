# [1349. Maximum Students Taking Exam][enTitle]

**Hard**

Given a  *m * n*  matrix  *seats*  that represent seats distributions in a classroom. If a seat is broken, it is denoted by  *'#'*  character otherwise it is denoted by a  *'.'*  character.

Students can see the answers of those sitting next to the left, right, upper left and upper right, but he cannot see the answers of the student sitting directly in front or behind him. Return the **maximum** number of students that can take the exam together without any cheating being possible..

Students must be placed in seats in good condition.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/29/image.png)

```
Input: seats = [["#",".","#","#",".","#"],
                [".","#","#","#","#","."],
                ["#",".","#","#",".","#"]]
Output: 4
Explanation: Teacher can place 4 students in available seats so they don't cheat on the exam. 

```

**Example 2:** 

```
Input: seats = [[".","#"],
                ["#","#"],
                ["#","."],
                ["#","#"],
                [".","#"]]
Output: 3
Explanation: Place all students in available seats. 


```

**Example 3:** 

```
Input: seats = [["#",".",".",".","#"],
                [".","#",".","#","."],
                [".",".","#",".","."],
                [".","#",".","#","."],
                ["#",".",".",".","#"]]
Output: 10
Explanation: Place students in available seats in column 1, 3 and 5.

```



**Constraints:** 

-  *seats*  contains only characters  *'.' and*  *'#'.*  
-  *m == seats.length*  
-  *n == seats[i].length*  
-  *1 <= m <= 8*  
-  *1 <= n <= 8* 


# [1349. 参加考试的最大学生数][cnTitle]

**困难**

给你一个  *m * n*  的矩阵  *seats*  表示教室中的座位分布。如果座位是坏的（不可用），就用  *'#'*  表示；否则，用  *'.'*  表示。

学生可以看到左侧、右侧、左上、右上这四个方向上紧邻他的学生的答卷，但是看不到直接坐在他前面或者后面的学生的答卷。请你计算并返回该考场可以容纳的一起参加考试且无法作弊的最大学生人数。

学生必须坐在状况良好的座位上。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/09/image.png)

```
输入：seats = [["#",".","#","#",".","#"],
              [".","#","#","#","#","."],
              ["#",".","#","#",".","#"]]
输出：4
解释：教师可以让 4 个学生坐在可用的座位上，这样他们就无法在考试中作弊。 

```

**示例 2：** 

```
输入：seats = [[".","#"],
              ["#","#"],
              ["#","."],
              ["#","#"],
              [".","#"]]
输出：3
解释：让所有学生坐在可用的座位上。

```

**示例 3：** 

```
输入：seats = [["#",".",".",".","#"],
              [".","#",".","#","."],
              [".",".","#",".","."],
              [".","#",".","#","."],
              ["#",".",".",".","#"]]
输出：10
解释：让学生坐在第 1、3 和 5 列的可用座位上。

```



**提示：** 

-  *seats*  只包含字符  *'.' 和*  *'#'*  
-  *m == seats.length*  
-  *n == seats[i].length*  
-  *1 <= m <= 8*  
-  *1 <= n <= 8* 




# 算法思路

# 测试用例
```
1349. Maximum Students Taking Exam 1349. 参加考试的最大学生数 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-students-taking-exam/
[cnTitle]: https://leetcode-cn.com/problems/maximum-students-taking-exam/
