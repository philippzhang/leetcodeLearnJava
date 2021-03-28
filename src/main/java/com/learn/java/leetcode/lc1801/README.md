# [1801. Number of Orders in the Backlog][enTitle]

**Medium**

You are given a 2D integer array  *orders* , where each  *orders[i] = [pricei, amounti, orderTypei]*  denotes that  *amounti* <sub> </sub>orders have been placed of type  *orderTypei*  at the price  *pricei* . The  *orderTypei*  is:

-  *0*  if it is a batch of  *buy*  orders, or 
-  *1*  if it is a batch of  *sell*  orders.

Note that  *orders[i]*  represents a batch of  *amounti*  independent orders with the same price and order type. All orders represented by  *orders[i]*  will be placed before all orders represented by  *orders[i+1]*  for all valid  *i* .

There is a **backlog**  that consists of orders that have not been executed. The backlog is initially empty. When an order is placed, the following happens:

- If the order is a  *buy*  order, you look at the  *sell*  order with the **smallest**  price in the backlog. If that  *sell*  order's price is **smaller than or equal to**  the current  *buy*  order's price, they will match and be executed, and that  *sell*  order will be removed from the backlog. Else, the  *buy*  order is added to the backlog. 
- Vice versa, if the order is a  *sell*  order, you look at the  *buy*  order with the **largest**  price in the backlog. If that  *buy*  order's price is **larger than or equal to**  the current  *sell*  order's price, they will match and be executed, and that  *buy*  order will be removed from the backlog. Else, the  *sell*  order is added to the backlog.

Return  *the total amount of orders in the backlog after placing all the orders from the input* . Since this number can be large, return it **modulo**   *109 + 7* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/03/11/ex1.png)


<pre><strong>Input:</strong> orders = [[10,5,0],[15,2,1],[25,1,1],[30,4,0]]
<strong>Output:</strong> 6
<strong>Explanation:</strong> Here is what happens with the orders:
- 5 orders of type buy with price 10 are placed. There are no sell orders, so the 5 orders are added to the backlog.
- 2 orders of type sell with price 15 are placed. There are no buy orders with prices larger than or equal to 15, so the 2 orders are added to the backlog.
- 1 order of type sell with price 25 is placed. There are no buy orders with prices larger than or equal to 25 in the backlog, so this order is added to the backlog.
- 4 orders of type buy with price 30 are placed. The first 2 orders are matched with the 2 sell orders of the least price, which is 15 and these 2 sell orders are removed from the backlog. The 3<sup>rd</sup> order is matched with the sell order of the least price, which is 25 and this sell order is removed from the backlog. Then, there are no more sell orders in the backlog, so the 4<sup>th</sup> order is added to the backlog.
Finally, the backlog has 5 buy orders with price 10, and 1 buy order with price 30. So the total number of orders in the backlog is 6.
</pre>

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/03/11/ex2.png)


<pre><strong>Input:</strong> orders = [[7,1000000000,1],[15,3,0],[5,999999995,0],[5,1,1]]
<strong>Output:</strong> 999999984
<strong>Explanation:</strong> Here is what happens with the orders:
- 10<sup>9</sup> orders of type sell with price 7 are placed. There are no buy orders, so the 10<sup>9</sup> orders are added to the backlog.
- 3 orders of type buy with price 15 are placed. They are matched with the 3 sell orders with the least price which is 7, and those 3 sell orders are removed from the backlog.
- 999999995 orders of type buy with price 5 are placed. The least price of a sell order is 7, so the 999999995 orders are added to the backlog.
- 1 order of type sell with price 5 is placed. It is matched with the buy order of the highest price, which is 5, and that buy order is removed from the backlog.
Finally, the backlog has (1000000000-3) sell orders with price 7, and (999999995-1) buy orders with price 5. So the total number of orders = 1999999991, which is equal to 999999984 % (10<sup>9</sup> + 7).
</pre>



**Constraints:** 

-  *1 <= orders.length <= 105*  
-  *orders[i].length == 3*  
-  *1 <= pricei, amounti <= 109*  
-  *orderTypei*  is either  *0*  or  *1* .


# [1801. 积压订单中的订单总数][cnTitle]

**中等**

给你一个二维整数数组  *orders*  ，其中每个  *orders[i] = [pricei, amounti, orderTypei]*  表示有  *amounti* <sub> </sub>笔类型为  *orderTypei*  、价格为  *pricei*  的订单。

订单类型  *orderTypei*  可以分为两种：

-  *0*  表示这是一批采购订单  *buy*  
-  *1*  表示这是一批销售订单  *sell* 

注意， *orders[i]*  表示一批共计  *amounti*  笔的独立订单，这些订单的价格和类型相同。对于所有有效的  *i*  ，由  *orders[i]*  表示的所有订单提交时间均早于  *orders[i+1]*  表示的所有订单。

存在由未执行订单组成的 **积压订单**  。积压订单最初是空的。提交订单时，会发生以下情况：

- 如果该订单是一笔采购订单  *buy*  ，则可以查看积压订单中价格 **最低**  的销售订单  *sell*  。如果该销售订单  *sell*  的价格 **低于或等于**  当前采购订单  *buy*  的价格，则匹配并执行这两笔订单，并将销售订单  *sell*  从积压订单中删除。否则，采购订单  *buy*  将会添加到积压订单中。 
- 反之亦然，如果该订单是一笔销售订单  *sell*  ，则可以查看积压订单中价格 **最高**  的采购订单  *buy*  。如果该采购订单  *buy*  的价格 **高于或等于**  当前销售订单  *sell*  的价格，则匹配并执行这两笔订单，并将采购订单  *buy*  从积压订单中删除。否则，销售订单  *sell*  将会添加到积压订单中。

输入所有订单后，返回积压订单中的 **订单总数**  。由于数字可能很大，所以需要返回对  *109 + 7*  取余的结果。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/03/21/ex1.png)

```
输入：orders = [[10,5,0],[15,2,1],[25,1,1],[30,4,0]]
输出：6
解释：输入订单后会发生下述情况：
- 提交 5 笔采购订单，价格为 10 。没有销售订单，所以这 5 笔订单添加到积压订单中。
- 提交 2 笔销售订单，价格为 15 。没有采购订单的价格大于或等于 15 ，所以这 2 笔订单添加到积压订单中。
- 提交 1 笔销售订单，价格为 25 。没有采购订单的价格大于或等于 25 ，所以这 1 笔订单添加到积压订单中。
- 提交 4 笔采购订单，价格为 30 。前 2 笔采购订单与价格最低（价格为 15）的 2 笔销售订单匹配，从积压订单中删除这 2 笔销售订单。第 3 笔采购订单与价格最低的 1 笔销售订单匹配，销售订单价格为 25 ，从积压订单中删除这 1 笔销售订单。积压订单中不存在更多销售订单，所以第 4 笔采购订单需要添加到积压订单中。
最终，积压订单中有 5 笔价格为 10 的采购订单，和 1 笔价格为 30 的采购订单。所以积压订单中的订单总数为 6 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/03/21/ex2.png)


<pre><strong>输入：</strong>orders = [[7,1000000000,1],[15,3,0],[5,999999995,0],[5,1,1]]
<strong>输出：</strong>999999984
<strong>解释：</strong>输入订单后会发生下述情况：
- 提交 10<sup>9</sup> 笔销售订单，价格为 7 。没有采购订单，所以这 10<sup>9</sup> 笔订单添加到积压订单中。
- 提交 3 笔采购订单，价格为 15 。这些采购订单与价格最低（价格为 7 ）的 3 笔销售订单匹配，从积压订单中删除这 3 笔销售订单。
- 提交 999999995 笔采购订单，价格为 5 。销售订单的最低价为 7 ，所以这 999999995 笔订单添加到积压订单中。
- 提交 1 笔销售订单，价格为 5 。这笔销售订单与价格最高（价格为 5 ）的 1 笔采购订单匹配，从积压订单中删除这 1 笔采购订单。
最终，积压订单中有 (1000000000-3) 笔价格为 7 的销售订单，和 (999999995-1) 笔价格为 5 的采购订单。所以积压订单中的订单总数为 1999999991 ，等于 999999984 % (10<sup>9</sup> + 7) 。</pre>



**提示：** 

-  *1 <= orders.length <= 105*  
-  *orders[i].length == 3*  
-  *1 <= pricei, amounti <= 109*  
-  *orderTypei*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1801. Number of Orders in the Backlog 1801. 积压订单中的订单总数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-orders-in-the-backlog/
[cnTitle]: https://leetcode-cn.com/problems/number-of-orders-in-the-backlog/
