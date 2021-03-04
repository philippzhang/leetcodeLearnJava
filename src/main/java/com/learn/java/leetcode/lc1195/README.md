# [1195. Fizz Buzz Multithreaded][enTitle]

**Medium**

Write a program that outputs the string representation of numbers from 1 to n, however:

- If the number is divisible by 3, output "fizz". 
- If the number is divisible by 5, output "buzz". 
- If the number is divisible by both 3 and 5, output "fizzbuzz".

For example, for  *n = 15* , we output:  *1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz* .

Suppose you are given the following code:

```
class FizzBuzz {
  public FizzBuzz(int n) { ... }               // constructor
  public void fizz(printFizz) { ... }          // only output "fizz"
  public void buzz(printBuzz) { ... }          // only output "buzz"
  public void fizzbuzz(printFizzBuzz) { ... }  // only output "fizzbuzz"
  public void number(printNumber) { ... }      // only output the numbers
}
```

Implement a multithreaded version of  *FizzBuzz*  with **four**  threads. The same instance of  *FizzBuzz*  will be passed to four different threads:

1. Thread A will call  *fizz()*  to check for divisibility of 3 and outputs  *fizz* . 
2. Thread B will call  *buzz()*  to check for divisibility of 5 and outputs  *buzz* . 
3. Thread C will call  *fizzbuzz()*  to check for divisibility of 3 and 5 and outputs  *fizzbuzz* . 
4. Thread D will call  *number()*  which should only output the numbers.


# [1195. 交替打印字符串][cnTitle]

**中等**

编写一个可以从 1 到 n 输出代表这个数字的字符串的程序，但是：

- 如果这个数字可以被 3 整除，输出 "fizz"。 
- 如果这个数字可以被 5 整除，输出 "buzz"。 
- 如果这个数字可以同时被 3 和 5 整除，输出 "fizzbuzz"。

例如，当  *n = 15* ，输出：  *1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz* 。

假设有这么一个类：

```
class FizzBuzz {
  public FizzBuzz(int n) { ... }               // constructor
  public void fizz(printFizz) { ... }          // only output "fizz"
  public void buzz(printBuzz) { ... }          // only output "buzz"
  public void fizzbuzz(printFizzBuzz) { ... }  // only output "fizzbuzz"
  public void number(printNumber) { ... }      // only output the numbers
}
```

请你实现一个有四个线程的多线程版  *FizzBuzz* ， 同一个  *FizzBuzz*  实例会被如下四个线程使用：

1. 线程A将调用  *fizz()*  来判断是否能被 3 整除，如果可以，则输出  *fizz* 。 
2. 线程B将调用  *buzz()*  来判断是否能被 5 整除，如果可以，则输出  *buzz* 。 
3. 线程C将调用  *fizzbuzz()*  来判断是否同时能被 3 和 5 整除，如果可以，则输出  *fizzbuzz* 。 
4. 线程D将调用  *number()*  来实现输出既不能被 3 整除也不能被 5 整除的数字。



**提示：** 

- 本题已经提供了打印字符串的相关方法，如  *printFizz()*  等，具体方法名请参考答题模板中的注释部分。






# 算法思路

# 测试用例
```
1195. Fizz Buzz Multithreaded 1195. 交替打印字符串 Medium
```

[enTitle]: https://leetcode.com/problems/fizz-buzz-multithreaded/
[cnTitle]: https://leetcode-cn.com/problems/fizz-buzz-multithreaded/
