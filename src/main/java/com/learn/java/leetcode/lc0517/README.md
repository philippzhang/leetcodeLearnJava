# [517. Super Washing Machines][enTitle]

**Hard**

You have n super washing machines on a line. Initially, each washing machine has some dresses or is empty.

For each move, you could choose any m (1 ≤ m ≤ n) washing machines, and pass one dress of each washing machine to one of its adjacent washing machines at the same time.

Given an integer array representing the number of dresses in each washing machine from left to right on the line, you should find the minimum number of moves to make all the washing machines have the same number of dresses. If it is not possible to do it, return -1.

Example1

```
Input: [1,0,5]

Output: 3

Explanation: 
1st move:    1     0 <-- 5    =>    1     1     4
2nd move:    1 <-- 1 <-- 4    =>    2     1     3    
3rd move:    2     1 <-- 3    =>    2     2     2   

```

Example2

```
Input: [0,3,0]

Output: 2

Explanation: 
1st move:    0 <-- 3     0    =>    1     2     0    
2nd move:    1     2 --> 0    =>    1     1     1     

```

Example3

```
Input: [0,2,0]

Output: -1

Explanation: 
It's impossible to make all the three washing machines have the same number of dresses. 

```



Note:

1. The range of n is [1, 10000]. 
2. The range of dresses number in a super washing machine is [0, 1e5].




# [517. 超级洗衣机][cnTitle]

**困难**

假设有 **n** 台超级洗衣机放在同一排上。开始的时候，每台洗衣机内可能有一定量的衣服，也可能是空的。

在**每一步操作** 中，你可以选择**任意 m** （1 ≤ m ≤ n） 台洗衣机，与此**同时** 将每台洗衣机的**一件衣服** 送到相邻的一台洗衣机。

给定一个非负整数数组代表从左至右每台洗衣机中的衣物数量，请给出能让所有洗衣机中剩下的衣物的数量相等的**最少的操作步数** 。如果不能使每台洗衣机中衣物的数量相等，则返回 -1。



**示例 1：** 

```
输入: [1,0,5]

输出: 3

解释: 
第一步:    1     0 <-- 5    =>    1     1     4
第二步:    1 <-- 1 <-- 4    =>    2     1     3    
第三步:    2     1 <-- 3    =>    2     2     2   

```

**示例 2：** 

```
输入: [0,3,0]

输出: 2

解释: 
第一步:    0 <-- 3     0    =>    1     2     0    
第二步:    1     2 --> 0    =>    1     1     1     

```

**示例 3:** 

```
输入: [0,2,0]

输出: -1

解释: 
不可能让所有三个洗衣机同时剩下相同数量的衣物。

```



**提示：** 

1. n 的范围是 [1, 10000]。 
2. 在每台超级洗衣机中，衣物数量的范围是 [0, 1e5]。






# 算法思路

# 测试用例
```
517. Super Washing Machines 517. 超级洗衣机 Hard
```

[enTitle]: https://leetcode.com/problems/super-washing-machines/
[cnTitle]: https://leetcode-cn.com/problems/super-washing-machines/
