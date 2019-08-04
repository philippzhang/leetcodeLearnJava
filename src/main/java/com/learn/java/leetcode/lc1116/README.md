# [1116. Print Zero Even Odd][enTitle]

**Medium**

Suppose you are given the following code:

```
class ZeroEvenOdd {
  public ZeroEvenOdd(int n) { ... }      // constructor
  public void zero(printNumber) { ... }  // only output 0's
  public void even(printNumber) { ... }  // only output even numbers
  public void odd(printNumber) { ... }   // only output odd numbers
}

```

The same instance of  *ZeroEvenOdd*  will be passed to three different threads:

1. Thread A will call  *zero()*  which should only output 0's. 
2. Thread B will call  *even()*  which should only ouput even numbers. 
3. Thread C will call  *odd()*  which should only output odd numbers.

Each of the thread is given a  *printNumber*  method to output an integer. Modify the given program to output the series  *010203040506* ... where the length of the series must be 2 *n* .



**Example 1:** 

```
Input: n = 2
Output: "0102"
Explanation: There are three threads being fired asynchronously. One of them calls zero(), the other calls even(), and the last one calls odd(). "0102" is the correct output.

```

**Example 2:** 

```
Input: n = 5
Output: "0102030405"

```


# [1116. 打印零与奇偶数][cnTitle]

**中等**

假设有这么一个类：

```
class ZeroEvenOdd {
  public ZeroEvenOdd(int n) { ... }      // 构造函数
  public void zero(printNumber) { ... }  // 仅打印出 0
  public void even(printNumber) { ... }  // 仅打印出 偶数
  public void odd(printNumber) { ... }   // 仅打印出 奇数
}

```

相同的一个  *ZeroEvenOdd*  类实例将会传递给三个不同的线程：

1. 线程 A 将调用  *zero()* ，它只输出 0 。 
2. 线程 B 将调用  *even()* ，它只输出偶数。 
3. 线程 C 将调用  *odd()* ，它只输出奇数。

每个线程都有一个  *printNumber*  方法来输出一个整数。请修改给出的代码以输出整数序列  *010203040506* ... ，其中序列的长度必须为 2 *n* 。



**示例 1：** 

```
输入：n = 2
输出："0102"
说明：三条线程异步执行，其中一个调用 zero()，另一个线程调用 even()，最后一个线程调用odd()。正确的输出为 "0102"。

```

**示例 2：** 

```
输入：n = 5
输出："0102030405"

```




# 算法思路

# 测试用例
```
1116. Print Zero Even Odd 1116. 打印零与奇偶数 Medium
Main.test
---
2

="0102"
---
5

="0102030405"
```

[enTitle]: https://leetcode.com/problems/print-zero-even-odd/
[cnTitle]: https://leetcode-cn.com/problems/print-zero-even-odd/
