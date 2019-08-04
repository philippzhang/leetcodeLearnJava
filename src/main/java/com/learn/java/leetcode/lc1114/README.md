# [1114. Print in Order][enTitle]

**Easy**

Suppose we have a class:

```
public class Foo {
  public void first() { print("first"); }
  public void second() { print("second"); }
  public void third() { print("third"); }
}

```

The same instance of  *Foo*  will be passed to three different threads. Thread A will call  *first()* , thread B will call  *second()* , and thread C will call  *third()* . Design a mechanism and modify the program to ensure that  *second()*  is executed after  *first()* , and  *third()*  is executed after  *second()* .



**Example 1:** 

```
Input: [1,2,3]
Output: "firstsecondthird"
Explanation: There are three threads being fired asynchronously. The input [1,2,3] means thread A calls first(), thread B calls second(), and thread C calls third(). "firstsecondthird" is the correct output.

```

**Example 2:** 

```
Input: [1,3,2]
Output: "firstsecondthird"
Explanation: The input [1,3,2] means thread A calls first(), thread B calls third(), and thread C calls second(). "firstsecondthird" is the correct output.
```



**Note:** 

We do not know how the threads will be scheduled in the operating system, even though the numbers in the input seems to imply the ordering. The input format you see is mainly to ensure our tests' comprehensiveness.


# [1114. 按序打印][cnTitle]

**简单**

我们提供了一个类：

```
public class Foo {
  public void one() { print("one"); }
  public void two() { print("two"); }
  public void three() { print("three"); }
}

```

三个不同的线程将会共用一个  *Foo*  实例。

- 线程 A 将会调用  *one()*  方法 
- 线程 B 将会调用  *two()*  方法 
- 线程 C 将会调用  *three()*  方法

请设计修改程序，以确保  *two()*  方法在  *one()*  方法之后被执行， *three()*  方法在  *two()*  方法之后被执行。



**示例 1:** 

```
输入: [1,2,3]
输出: "onetwothree"
解释: 
有三个线程会被异步启动。
输入 [1,2,3] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 two() 方法，线程 C 将会调用 three() 方法。
正确的输出是 "onetwothree"。

```

**示例 2:** 

```
输入: [1,3,2]
输出: "onetwothree"
解释: 
输入 [1,3,2] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 three() 方法，线程 C 将会调用 two() 方法。
正确的输出是 "onetwothree"。
```



**注意:** 

尽管输入中的数字似乎暗示了顺序，但是我们并不保证线程在操作系统中的调度顺序。

你看到的输入格式主要是为了确保测试的全面性。




# 算法思路

# 测试用例
```
1114. Print in Order 1114. 按序打印 Easy
Main.test
---
[1,2,3]

="onetwothree"
---
[1,3,2]

="onetwothree"
```

[enTitle]: https://leetcode.com/problems/print-in-order/
[cnTitle]: https://leetcode-cn.com/problems/print-in-order/
