# [710. Random Pick with Blacklist][enTitle]

**Hard**

Given a blacklist  *B*  containing unique integers from  *[0, N)* , write a function to return a uniform random integer from  *[0, N)*  which is **NOT**  in  *B* .

Optimize it such that it minimizes the call to system’s  *Math.random()* .

**Note:** 

1.  *1 <= N <= 1000000000*  
2.  *0 <= B.length < min(100000, N)*  
3.  *[0, N)*  does NOT include N. See interval notation.

**Example 1:** 

```
Input:["Solution","pick","pick","pick"]
[[1,[]],[],[],[]]
Output: [null,0,0,0]
```

**Example 2:** 

```
Input:["Solution","pick","pick","pick"]
[[2,[]],[],[],[]]
Output: [null,1,1,1]
```

**Example 3:** 

```
Input:["Solution","pick","pick","pick"]
[[3,[1]],[],[],[]]
Output: [null,0,0,2]
```

**Example 4:** 

```
Input:["Solution","pick","pick","pick"]
[[4,[2]],[],[],[]]
Output: [null,1,3,1]
```

**Explanation of Input Syntax:** 

The input is two lists: the subroutines called and their arguments.  *Solution* 's constructor has two arguments,  *N*  and the blacklist  *B* .  *pick*  has no arguments. Arguments are always wrapped with a list, even if there aren't any.


# [710. 黑名单中的随机数][cnTitle]

**困难**

给定一个包含 [0，n ) 中独特的整数的黑名单 B，写一个函数从 [ 0，n ) 中返回一个**不在**  B 中的随机整数。

对它进行优化使其尽量少调用系统方法  *Math.random()*  。

**提示:** 

1.  *1 <= N <= 1000000000*  
2.  *0 <= B.length < min(100000, N)*  
3.  *[0, N)*  不包含 N，详细参见 interval notation 。

**示例 1:** 

```
输入:["Solution","pick","pick","pick"]
[[1,[]],[],[],[]]
输出:[null,0,0,0]

```

**示例 2:** 

```
输入:["Solution","pick","pick","pick"]
[[2,[]],[],[],[]]
输出:[null,1,1,1]

```

**示例 3:** 

```
输入:["Solution","pick","pick","pick"]
[[3,[1]],[],[],[]]
Output:[null,0,0,2]

```

**示例 4:** 

```
输入:["Solution","pick","pick","pick"]
[[4,[2]],[],[],[]]
输出:[null,1,3,1]

```

**输入语法说明：** 

输入是两个列表：调用成员函数名和调用的参数。 *Solution* 的构造函数有两个参数， *N*  和黑名单  *B* 。 *pick*  没有参数，输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。




# 算法思路

# 测试用例
```
710. Random Pick with Blacklist 710. 黑名单中的随机数 Hard
```

[enTitle]: https://leetcode.com/problems/random-pick-with-blacklist/
[cnTitle]: https://leetcode-cn.com/problems/random-pick-with-blacklist/
