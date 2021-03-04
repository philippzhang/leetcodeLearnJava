# [1359. Count All Valid Pickup and Delivery Options][enTitle]

**Hard**

Given  *n*  orders, each order consist in pickup and delivery services.

Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i).

Since the answer may be too large, return it modulo 10^9 + 7.



**Example 1:** 

```
Input: n = 1
Output: 1
Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.

```

**Example 2:** 

```
Input: n = 2
Output: 6
Explanation: All possible orders: 
(P1,P2,D1,D2), (P1,P2,D2,D1), (P1,D1,P2,D2), (P2,P1,D1,D2), (P2,P1,D2,D1) and (P2,D2,P1,D1).
This is an invalid order (P1,D2,P2,D1) because Pickup 2 is after of Delivery 2.

```

**Example 3:** 

```
Input: n = 3
Output: 90

```



**Constraints:** 

-  *1 <= n <= 500* 


# [1359. 有效的快递序列数目][cnTitle]

**困难**

给你  *n*  笔订单，每笔订单都需要快递服务。

请你统计所有有效的 收件/配送 序列的数目，确保第  *i*  个物品的配送服务  *delivery(i)*  总是在其收件服务  *pickup(i)*  之后。

由于答案可能很大，请返回答案对  *10^9 + 7*  取余的结果。



**示例 1：** 

```
输入：n = 1
输出：1
解释：只有一种序列 (P1, D1)，物品 1 的配送服务（D1）在物品 1 的收件服务（P1）后。

```

**示例 2：** 

```
输入：n = 2
输出：6
解释：所有可能的序列包括：
(P1,P2,D1,D2)，(P1,P2,D2,D1)，(P1,D1,P2,D2)，(P2,P1,D1,D2)，(P2,P1,D2,D1) 和 (P2,D2,P1,D1)。
(P1,D2,P2,D1) 是一个无效的序列，因为物品 2 的收件服务（P2）不应在物品 2 的配送服务（D2）之后。

```

**示例 3：** 

```
输入：n = 3
输出：90

```



**提示：** 

-  *1 <= n <= 500* 




# 算法思路

# 测试用例
```
1359. Count All Valid Pickup and Delivery Options 1359. 有效的快递序列数目 Hard
```

[enTitle]: https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
[cnTitle]: https://leetcode-cn.com/problems/count-all-valid-pickup-and-delivery-options/
