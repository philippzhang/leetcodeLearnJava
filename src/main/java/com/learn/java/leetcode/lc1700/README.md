# [1700. Number of Students Unable to Eat Lunch][enTitle]

**Easy**

The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers  *0*  and  *1*  respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.

The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a **stack** . At each step:

- If the student at the front of the queue **prefers**  the sandwich on the top of the stack, they will **take it**  and leave the queue. 
- Otherwise, they will **leave it**  and go to the queue's end.

This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

You are given two integer arrays  *students*  and  *sandwiches*  where  *sandwiches[i]*  is the type of the  *ith*  sandwich in the stack ( *i = 0*  is the top of the stack) and  *students[j]*  is the preference of the  *jth*  student in the initial queue ( *j = 0*  is the front of the queue). Return  *the number of students that are unable to eat.* 



**Example 1:** 

```
Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0Explanation:
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.

```

**Example 2:** 

```
Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
Output: 3

```



**Constraints:** 

-  *1 <= students.length, sandwiches.length <= 100*  
-  *students.length == sandwiches.length*  
-  *sandwiches[i]*  is  *0*  or  *1* . 
-  *students[i]*  is  *0*  or  *1* .


# [1700. 无法吃午餐的学生数量][cnTitle]

**简单**

学校的自助午餐提供圆形和方形的三明治，分别用数字  *0*  和  *1*  表示。所有学生站在一个队列里，每个学生要么喜欢圆形的要么喜欢方形的。 餐厅里三明治的数量与学生的数量相同。所有三明治都放在一个 **栈**  里，每一轮：

- 如果队列最前面的学生 **喜欢**  栈顶的三明治，那么会 **拿走它**  并离开队列。 
- 否则，这名学生会 **放弃这个三明治**  并回到队列的尾部。

这个过程会一直持续到队列里所有学生都不喜欢栈顶的三明治为止。

给你两个整数数组  *students*  和  *sandwiches*  ，其中  *sandwiches[i]*  是栈里面第  *i*  个三明治的类型（ *i = 0*  是栈的顶部），  *students[j]*  是初始队列里第  *j*  名学生对三明治的喜好（ *j = 0*  是队列的最开始位置）。请你返回无法吃午餐的学生数量。



**示例 1：** 

```
输入：students = [1,1,0,0], sandwiches = [0,1,0,1]
输出：0解释：
- 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,0,0,1]。
- 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,0,1,1]。
- 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [0,1,1]，三明治栈为 sandwiches = [1,0,1]。
- 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,1,0]。
- 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1,0]，三明治栈为 sandwiches = [0,1]。
- 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,1]。
- 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1]，三明治栈为 sandwiches = [1]。
- 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = []，三明治栈为 sandwiches = []。
所以所有学生都有三明治吃。

```

**示例 2：** 

```
输入：students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
输出：3

```



**提示：** 

-  *1 <= students.length, sandwiches.length <= 100*  
-  *students.length == sandwiches.length*  
-  *sandwiches[i]*  要么是  *0*  ，要么是  *1*  。 
-  *students[i]*  要么是  *0*  ，要么是  *1*  。




# 算法思路

# 测试用例
```
1700. Number of Students Unable to Eat Lunch 1700. 无法吃午餐的学生数量 Easy
```

[enTitle]: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
[cnTitle]: https://leetcode-cn.com/problems/number-of-students-unable-to-eat-lunch/
