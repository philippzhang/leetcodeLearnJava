# [470. Implement Rand10() Using Rand7()][enTitle]

**Medium**

Given the **API**   *rand7()*  that generates a uniform random integer in the range  *[1, 7]* , write a function  *rand10()*  that generates a uniform random integer in the range  *[1, 10]* . You can only call the API  *rand7()* , and you shouldn't call any other API. Please **do not**  use a language's built-in random API.

Each test case will have one **internal**  argument  *n* , the number of times that your implemented function  *rand10()*  will be called while testing. Note that this is **not an argument**  passed to  *rand10()* .

**Follow up:** 

- What is the expected value for the number of calls to  *rand7()*  function? 
- Could you minimize the number of calls to  *rand7()* ?



**Example 1:** 

```
Input: n = 1
Output: [2]

```

**Example 2:** 

```
Input: n = 2
Output: [2,8]

```

**Example 3:** 

```
Input: n = 3
Output: [3,8,10]

```



**Constraints:** 

-  *1 <= n <= 105* 


# [470. 用 Rand7() 实现 Rand10()][cnTitle]

**中等**

已有方法  *rand7*  可生成 1 到 7 范围内的均匀随机整数，试写一个方法  *rand10*  生成 1 到 10 范围内的均匀随机整数。

不要使用系统的  *Math.random()*  方法。





**示例 1:** 

```
输入:1
输出:[7]

```

**示例 2:** 

```
输入:2
输出:[8,4]

```

**示例 3:** 

```
输入:3
输出:[8,1,10]

```



**提示:** 

1.  *rand7*  已定义。 
2. 传入参数:  *n*  表示  *rand10*  的调用次数。



**进阶:** 

1.  *rand7()* 调用次数的 期望值 是多少 ? 
2. 你能否尽量少调用  *rand7()*  ?




# 算法思路

# 测试用例
```
470. Implement Rand10() Using Rand7() 470. 用 Rand7() 实现 Rand10() Medium
```

[enTitle]: https://leetcode.com/problems/implement-rand10-using-rand7/
[cnTitle]: https://leetcode-cn.com/problems/implement-rand10-using-rand7/
