# [857. Minimum Cost to Hire K Workers][enTitle]

**Hard**

There are  *N*  workers. The  *i* -th worker has a  *quality[i]*  and a minimum wage expectation  *wage[i]* .

Now we want to hire exactly  *K*  workers to form a  *paid group* . When hiring a group of K workers, we must pay them according to the following rules:

1. Every worker in the paid group should be paid in the ratio of their quality compared to other workers in the paid group. 
2. Every worker in the paid group must be paid at least their minimum wage expectation.

Return the least amount of money needed to form a paid group satisfying the above conditions.






**Example 1:** 

```
Input:quality = [10,20,5], wage = [70,50,30], K = 2
Output: 105.00000
Explanation: We pay 70 to 0-th worker and 35 to 2-th worker.
```


**Example 2:** 

```
Input:quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3
Output: 30.66667
Explanation: We pay 4 to 0-th worker, 13.33333 to 2-th and 3-th workers seperately.
```



**Note:** 

1.  *1 <= K <= N <= 10000* , where  *N = quality.length = wage.length*  
2.  *1 <= quality[i] <= 10000*  
3.  *1 <= wage[i] <= 10000*  
4. Answers within  *10^-5*  of the correct answer will be considered correct.






# [857. 雇佣 K 名工人的最低成本][cnTitle]

**困难**

有  *N*  名工人。 第  *i*  名工人的工作质量为  *quality[i]*  ，其最低期望工资为  *wage[i]*  。

现在我们想雇佣  *K*  名工人组成一个 *工资组。* 在雇佣 一组 K 名工人时，我们必须按照下述规则向他们支付工资：

1. 对工资组中的每名工人，应当按其工作质量与同组其他工人的工作质量的比例来支付工资。 
2. 工资组中的每名工人至少应当得到他们的最低期望工资。

返回组成一个满足上述条件的工资组至少需要多少钱。





**示例 1：** 

```
输入：quality = [10,20,5], wage = [70,50,30], K = 2
输出：105.00000
解释： 我们向 0 号工人支付 70，向 2 号工人支付 35。
```

**示例 2：** 

```
输入：quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3
输出：30.66667
解释：我们向 0 号工人支付 4，向 2 号和 3 号分别支付 13.33333。
```



**提示：** 

1.  *1 <= K <= N <= 10000* ，其中  *N = quality.length = wage.length*  
2.  *1 <= quality[i] <= 10000*  
3.  *1 <= wage[i] <= 10000*  
4. 与正确答案误差在  *10^-5*  之内的答案将被视为正确的。




# 算法思路

# 测试用例
```
857. Minimum Cost to Hire K Workers 857. 雇佣 K 名工人的最低成本 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-cost-to-hire-k-workers/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-to-hire-k-workers/
