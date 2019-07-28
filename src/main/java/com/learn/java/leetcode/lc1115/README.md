# [1115. Print FooBar Alternately][enTitle]

**Medium**

Suppose you are given the following code:

```
class FooBar {
  public void foo() {
    for (int i = 0; i < n; i++) {
      print("foo");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}

```

The same instance of  *FooBar*  will be passed to two different threads. Thread A will call  *foo()*  while thread B will call  *bar()* . Modify the given program to output "foobar"  *n*  times.



**Example 1:** 

```
Input: n = 1
Output: "foobar"
Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar(). "foobar" is being output 1 time.

```

**Example 2:** 

```
Input: n = 2
Output: "foobarfoobar"
Explanation: "foobar" is being output 2 times.

```


# [1115. 交替打印FooBar][cnTitle]

**中等**

我们提供一个类：

```
class FooBar {
  public void foo() {
    for (int i = 0; i < n; i++) {
      print("foo");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}

```

两个不同的线程将会共用一个  *FooBar*  实例。其中一个线程将会调用  *foo()*  方法，另一个线程将会调用  *bar()*  方法。

请设计修改程序，以确保 "foobar" 被输出 n 次。



**示例 1:** 

```
输入: n = 1
输出: "foobar"
解释: 这里有两个线程被异步启动。其中一个调用 foo() 方法, 另一个调用 bar() 方法，"foobar" 将被输出一次。

```

**示例 2:** 

```
输入: n = 2
输出: "foobarfoobar"
解释: "foobar" 将被输出两次。

```




# 算法思路

# 测试用例
```
1115. Print FooBar Alternately 1115. 交替打印FooBar Medium
```

[enTitle]: https://leetcode.com/problems/print-foobar-alternately/
[cnTitle]: https://leetcode-cn.com/problems/print-foobar-alternately/
