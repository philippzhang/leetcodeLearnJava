# [1052. Grumpy Bookstore Owner][enTitle]

**Medium**

Today, the bookstore owner has a store open for  *customers.length*  minutes. Every minute, some number of customers ( *customers[i]* ) enter the store, and all those customers leave after the end of that minute.

On some minutes, the bookstore owner is grumpy. If the bookstore owner is grumpy on the i-th minute,  *grumpy[i] = 1* , otherwise  *grumpy[i] = 0* . When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise they are satisfied.

The bookstore owner knows a secret technique to keep themselves not grumpy for  *X*  minutes straight, but can only use it once.

Return the maximum number of customers that can be satisfied throughout the day.



**Example 1:** 

```
Input:customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
Output:16
Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.

```



**Note:** 

-  *1 <= X <= customers.length == grumpy.length <= 20000*  
-  *0 <= customers[i] <= 1000*  
-  *0 <= grumpy[i] <= 1* 


# [1052. 爱生气的书店老板][cnTitle]

**中等**

今天，书店老板有一家店打算试营业  *customers.length*  分钟。每分钟都有一些顾客（ *customers[i]* ）会进入书店，所有这些顾客都会在那一分钟结束后离开。

在某些时候，书店老板会生气。 如果书店老板在第  *i*  分钟生气，那么  *grumpy[i] = 1* ，否则  *grumpy[i] = 0* 。 当书店老板生气时，那一分钟的顾客就会不满意，不生气则他们是满意的。

书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续  *X*  分钟不生气，但却只能使用一次。

请你返回这一天营业下来，最多有多少客户能够感到满意的数量。

**示例：** 

```
输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
输出：16
解释：书店老板在最后 3 分钟保持冷静。
感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.

```



**提示：** 

-  *1 <= X <= customers.length == grumpy.length <= 20000*  
-  *0 <= customers[i] <= 1000*  
-  *0 <= grumpy[i] <= 1* 




# 算法思路

# 测试用例
```
1052. Grumpy Bookstore Owner 1052. 爱生气的书店老板 Medium
```

[enTitle]: https://leetcode.com/problems/grumpy-bookstore-owner/
[cnTitle]: https://leetcode-cn.com/problems/grumpy-bookstore-owner/
