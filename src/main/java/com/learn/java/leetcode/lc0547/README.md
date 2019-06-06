# [547. Friend Circles][enTitle]

**Medium**

There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the i<sub>th</sub> and j<sub>th</sub> students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.

Example 1:


<pre><b>Input:</b> 
[[1,1,0],
 [1,1,0],
 [0,0,1]]
<b>Output:</b> 2
<b>Explanation:</b>The 0<sub>th</sub> and 1<sub>st</sub> students are direct friends, so they are in a friend circle. <br>The 2<sub>nd</sub> student himself is in a friend circle. So return 2.
</pre>



Example 2:


<pre><b>Input:</b> 
[[1,1,0],
 [1,1,1],
 [0,1,1]]
<b>Output:</b> 1
<b>Explanation:</b>The 0<sub>th</sub> and 1<sub>st</sub> students are direct friends, the 1<sub>st</sub> and 2<sub>nd</sub> students are direct friends, <br>so the 0<sub>th</sub> and 2<sub>nd</sub> students are indirect friends. All of them are in the same friend circle, so return 1.
</pre>



Note:

1. N is in range [1,200]. 
2. M[i][i] = 1 for all students. 
3. If M[i][j] = 1, then M[j][i] = 1.


# [547. 朋友圈][cnTitle]

**中等**

班上有 **N** 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。

给定一个 **N * N** 的矩阵 **M** ，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生**互为** 朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。

**示例 1:** 

```
输入: 
[[1,1,0],
 [1,1,0],
 [0,0,1]]
输出: 2 
说明：已知学生0和学生1互为朋友，他们在一个朋友圈。
第2个学生自己在一个朋友圈。所以返回2。

```

**示例 2:** 

```
输入: 
[[1,1,0],
 [1,1,1],
 [0,1,1]]
输出: 1
说明：已知学生0和学生1互为朋友，学生1和学生2互为朋友，所以学生0和学生2也是朋友，所以他们三个在一个朋友圈，返回1。

```

**注意：** 

1. N 在[1,200]的范围内。 
2. 对于所有学生，有M[i][i] = 1。 
3. 如果有M[i][j] = 1，则有M[j][i] = 1。


# 算法思路

# 测试用例
```
547. Friend Circles 547. 朋友圈 Medium
Solution.findCircleNum
---
[[1,1,0],[1,1,0],[0,0,1]]

=2 
---
[[1,1,0],[1,1,1],[0,1,1]]

=1
```

[enTitle]: https://leetcode.com/problems/friend-circles/
[cnTitle]: https://leetcode-cn.com/problems/friend-circles/
