# [1701. Average Waiting Time][enTitle]

**Medium**

There is a restaurant with a single chef. You are given an array  *customers* , where  *customers[i] = [arrivali, timei]:* 

-  *arrivali*  is the arrival time of the  *ith*  customer. The arrival times are sorted in **non-decreasing**  order. 
-  *timei*  is the time needed to prepare the order of the  *ith*  customer.

When a customer arrives, he gives the chef his order, and the chef starts preparing it once he is idle. The customer waits till the chef finishes preparing his order. The chef does not prepare food for more than one customer at a time. The chef prepares food for customers **in the order they were given in the input** .

Return  *the average waiting time of all customers* . Solutions within  *10-5*  from the actual answer are considered accepted.



**Example 1:** 

```
Input: customers = [[1,2],[2,5],[4,3]]
Output: 5.00000
Explanation:1) The first customer arrives at time 1, the chef takes his order and starts preparing it immediately at time 1, and finishes at time 3, so the waiting time of the first customer is 3 - 1 = 2.
2) The second customer arrives at time 2, the chef takes his order and starts preparing it at time 3, and finishes at time 8, so the waiting time of the second customer is 8 - 2 = 6.
3) The third customer arrives at time 4, the chef takes his order and starts preparing it at time 8, and finishes at time 11, so the waiting time of the third customer is 11 - 4 = 7.
So the average waiting time = (2 + 6 + 7) / 3 = 5.

```

**Example 2:** 

```
Input: customers = [[5,2],[5,4],[10,3],[20,1]]
Output: 3.25000
Explanation:1) The first customer arrives at time 5, the chef takes his order and starts preparing it immediately at time 5, and finishes at time 7, so the waiting time of the first customer is 7 - 5 = 2.
2) The second customer arrives at time 5, the chef takes his order and starts preparing it at time 7, and finishes at time 11, so the waiting time of the second customer is 11 - 5 = 6.
3) The third customer arrives at time 10, the chef takes his order and starts preparing it at time 11, and finishes at time 14, so the waiting time of the third customer is 14 - 10 = 4.
4) The fourth customer arrives at time 20, the chef takes his order and starts preparing it immediately at time 20, and finishes at time 21, so the waiting time of the fourth customer is 21 - 20 = 1.
So the average waiting time = (2 + 6 + 4 + 1) / 4 = 3.25.

```



**Constraints:** 

-  *1 <= customers.length <= 105*  
-  *1 <= arrivali, timei <= 104*  
-  *arrivali <= arrivali+1* 


# [1701. 平均等待时间][cnTitle]

**中等**

有一个餐厅，只有一位厨师。你有一个顾客数组  *customers*  ，其中  *customers[i] = [arrivali, timei]*  ：

-  *arrivali*  是第  *i*  位顾客到达的时间，到达时间按 **非递减**  顺序排列。 
-  *timei*  是给第  *i*  位顾客做菜需要的时间。

当一位顾客到达时，他将他的订单给厨师，厨师一旦空闲的时候就开始做这位顾客的菜。每位顾客会一直等待到厨师完成他的订单。厨师同时只能做一个人的订单。厨师会严格按照 **订单给他的顺序**  做菜。

请你返回所有顾客需要等待的 **平均** 时间。与标准答案误差在  *10-5*  范围以内，都视为正确结果。



**示例 1：** 

```
输入：customers = [[1,2],[2,5],[4,3]]
输出：5.00000
解释：1) 第一位顾客在时刻 1 到达，厨师拿到他的订单并在时刻 1 立马开始做菜，并在时刻 3 完成，第一位顾客等待时间为 3 - 1 = 2 。
2) 第二位顾客在时刻 2 到达，厨师在时刻 3 开始为他做菜，并在时刻 8 完成，第二位顾客等待时间为 8 - 2 = 6 。
3) 第三位顾客在时刻 4 到达，厨师在时刻 8 开始为他做菜，并在时刻 11 完成，第三位顾客等待时间为 11 - 4 = 7 。
平均等待时间为 (2 + 6 + 7) / 3 = 5 。

```

**示例 2：** 

```
输入：customers = [[5,2],[5,4],[10,3],[20,1]]
输出：3.25000
解释：1) 第一位顾客在时刻 5 到达，厨师拿到他的订单并在时刻 5 立马开始做菜，并在时刻 7 完成，第一位顾客等待时间为 7 - 5 = 2 。
2) 第二位顾客在时刻 5 到达，厨师在时刻 7 开始为他做菜，并在时刻 11 完成，第二位顾客等待时间为 11 - 5 = 6 。
3) 第三位顾客在时刻 10 到达，厨师在时刻 11 开始为他做菜，并在时刻 14 完成，第三位顾客等待时间为 14 - 10 = 4 。
4) 第四位顾客在时刻 20 到达，厨师拿到他的订单并在时刻 20 立马开始做菜，并在时刻 21 完成，第四位顾客等待时间为 21 - 20 = 1 。
平均等待时间为 (2 + 6 + 4 + 1) / 4 = 3.25 。

```



**提示：** 

-  *1 <= customers.length <= 105*  
-  *1 <= arrivali, timei <= 104*  
-  *arrivali <= arrivali+1* 




# 算法思路

# 测试用例
```
1701. Average Waiting Time 1701. 平均等待时间 Medium
```

[enTitle]: https://leetcode.com/problems/average-waiting-time/
[cnTitle]: https://leetcode-cn.com/problems/average-waiting-time/
