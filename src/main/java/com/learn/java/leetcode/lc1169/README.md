# [1169. Invalid Transactions][enTitle]

**Medium**

A transaction is possibly invalid if:

- the amount exceeds  *$1000* , or; 
- if it occurs within (and including)  *60*  minutes of another transaction with the **same name**  in a **different city** .

You are given an array of strings  *transaction*  where  *transactions[i]*  consists of comma-separated values representing the name, time (in minutes), amount, and city of the transaction.

Return a list of  *transactions*  that are possibly invalid. You may return the answer in **any order** .



**Example 1:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output: ["alice,20,800,mtv","alice,50,100,beijing"]
Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
```

**Example 2:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output: ["alice,50,1200,mtv"]

```

**Example 3:** 

```
Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output: ["bob,50,1200,mtv"]

```



**Constraints:** 

-  *transactions.length <= 1000*  
- Each  *transactions[i]*  takes the form  *"{name},{time},{amount},{city}"*  
- Each  *{name}*  and  *{city}*  consist of lowercase English letters, and have lengths between  *1*  and  *10* . 
- Each  *{time}*  consist of digits, and represent an integer between  *0*  and  *1000* . 
- Each  *{amount}*  consist of digits, and represent an integer between  *0*  and  *2000* .


# [1169. 查询无效交易][cnTitle]

**中等**

如果出现下述两种情况，交易 **可能无效** ：

- 交易金额超过 ¥1000 
- 或者，它和另一个城市中同名的另一笔交易相隔不超过 60 分钟（包含 60 分钟整）

每个交易字符串  *transactions[i]*  由一些用逗号分隔的值组成，这些值分别表示交易的名称，时间（以分钟计），金额以及城市。

给你一份交易清单  *transactions* ，返回可能无效的交易列表。你可以按任何顺序返回答案。



**示例 1：** 

```
输入：transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
输出：["alice,20,800,mtv","alice,50,100,beijing"]
解释：第一笔交易是无效的，因为第二笔交易和它间隔不超过 60 分钟、名称相同且发生在不同的城市。同样，第二笔交易也是无效的。
```

**示例 2：** 

```
输入：transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
输出：["alice,50,1200,mtv"]

```

**示例 3：** 

```
输入：transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
输出：["bob,50,1200,mtv"]

```



**提示：** 

-  *transactions.length <= 1000*  
- 每笔交易  *transactions[i]*  按  *"{name},{time},{amount},{city}"*  的格式进行记录 
- 每个交易名称  *{name}*  和城市  *{city}*  都由小写英文字母组成，长度在  *1*  到  *10*  之间 
- 每个交易时间  *{time}*  由一些数字组成，表示一个  *0*  到  *1000*  之间的整数 
- 每笔交易金额  *{amount}*  由一些数字组成，表示一个  *0*  到  *2000*  之间的整数




# 算法思路

# 测试用例
```
1169. Invalid Transactions 1169. 查询无效交易 Medium
```

[enTitle]: https://leetcode.com/problems/invalid-transactions/
[cnTitle]: https://leetcode-cn.com/problems/invalid-transactions/
