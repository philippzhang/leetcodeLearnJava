# [636. Exclusive Time of Functions][enTitle]

**Medium**

On a single threaded CPU, we execute some functions. Each function has a unique id between  *0*  and  *N-1* .

We store logs in timestamp order that describe when a function is entered or exited.

Each log is a string with this format:  *"{function_id}:{"start" | "end"}:{timestamp}"* . For example,  *"0:start:3"*  means the function with id  *0*  started at the beginning of timestamp  *3* .  *"1:end:2"*  means the function with id  *1*  ended at the end of timestamp  *2* .

A function's  *exclusive time*  is the number of units of time spent in this function. Note that this does not include any recursive calls to child functions.

Return the exclusive time of each function, sorted by their function id.



Example 1:



```
Input:
n = 2
logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
Output:[3, 4]
Explanation:
Function 0 starts at the beginning of time 0, then it executes 2 units of time and reaches the end of time 1.
Now function 1 starts at the beginning of time 2, executes 4 units of time and ends at time 5.
Function 0 is running again at the beginning of time 6, and also ends at the end of time 6, thus executing for 1 unit of time. 
So function 0 spends 2 + 1 = 3 units of total time executing, and function 1 spends 4 units of total time executing.

```



Note:

1.  *1 <= n <= 100*  
2. Two functions won't start or end at the same time. 
3. Functions will always log when they exit.


# [636. 函数的独占时间][cnTitle]

**中等**

给出一个非抢占单线程CPU的 **n** 个函数运行日志，找到函数的独占时间。

每个函数都有一个唯一的 Id，从 **0**  到**n-1** ，函数可能会递归调用或者被其他函数调用。

日志是具有以下格式的字符串： *function_id：start_or_end：timestamp* 。例如： *"0:start:0"*  表示函数 0 从 0 时刻开始运行。 *"0:end:0"*  表示函数 0 在 0 时刻结束。

函数的独占时间定义是在该方法中花费的时间，调用其他函数花费的时间不算该函数的独占时间。你需要根据函数的 Id 有序地返回每个函数的独占时间。

**示例 1:** 

```
输入:
n = 2
logs = 
["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
输出:[3, 4]
说明：
函数 0 在时刻 0 开始，在执行了  2个时间单位结束于时刻 1。
现在函数 0 调用函数 1，函数 1 在时刻 2 开始，执行 4 个时间单位后结束于时刻 5。
函数 0 再次在时刻 6 开始执行，并在时刻 6 结束运行，从而执行了 1 个时间单位。
所以函数 0 总共的执行了 2 +1 =3 个时间单位，函数 1 总共执行了 4 个时间单位。

```

**说明：** 

1. 输入的日志会根据时间戳排序，而不是根据日志Id排序。 
2. 你的输出会根据函数Id排序，也就意味着你的输出数组中序号为 0 的元素相当于函数 0 的执行时间。 
3. 两个函数不会在同时开始或结束。 
4. 函数允许被递归调用，直到运行结束。 
5. 1 <= n <= 100


# 算法思路

# 测试用例
```
636. Exclusive Time of Functions 636. 函数的独占时间 Medium
```

[enTitle]: https://leetcode.com/problems/exclusive-time-of-functions/
[cnTitle]: https://leetcode-cn.com/problems/exclusive-time-of-functions/
