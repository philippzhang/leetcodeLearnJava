# [1599. Maximum Profit of Operating a Centennial Wheel][enTitle]

**Medium**

You are the operator of a Centennial Wheel that has **four gondolas** , and each gondola has room for **up**  **to**  **four people** . You have the ability to rotate the gondolas **counterclockwise** , which costs you  *runningCost*  dollars.

You are given an array  *customers*  of length  *n*  where  *customers[i]*  is the number of new customers arriving just before the  *ith*  rotation (0-indexed). This means you **must rotate the wheel**  *i* **times before the**  *customers[i]* **customers arrive** . **You cannot make customers wait if there is room in the gondola** . Each customer pays  *boardingCost*  dollars when they board on the gondola closest to the ground and will exit once that gondola reaches the ground again.

You can stop the wheel at any time, including **before**  **serving**  **all**  **customers** . If you decide to stop serving customers, **all subsequent rotations are free**  in order to get all the customers down safely. Note that if there are currently more than four customers waiting at the wheel, only four will board the gondola, and the rest will wait **for the next rotation** .

Return *the minimum number of rotations you need to perform to maximize your profit.*  If there is **no scenario**  where the profit is positive, return  *-1* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/09/wheeldiagram12.png)

```
Input: customers = [8,3], boardingCost = 5, runningCost = 6
Output: 3
Explanation: The numbers written on the gondolas are the number of people currently there.
1. 8 customers arrive, 4 board and 4 wait for the next gondola, the wheel rotates. Current profit is 4 * $5 - 1 * $6 = $14.
2. 3 customers arrive, the 4 waiting board the wheel and the other 3 wait, the wheel rotates. Current profit is 8 * $5 - 2 * $6 = $28.
3. The final 3 customers board the gondola, the wheel rotates. Current profit is 11 * $5 - 3 * $6 = $37.
The highest profit was $37 after rotating the wheel 3 times.
```

**Example 2:** 

```
Input: customers = [10,9,6], boardingCost = 6, runningCost = 4
Output: 7
Explanation:
1. 10 customers arrive, 4 board and 6 wait for the next gondola, the wheel rotates. Current profit is 4 * $6 - 1 * $4 = $20.
2. 9 customers arrive, 4 board and 11 wait (2 originally waiting, 9 newly waiting), the wheel rotates. Current profit is 8 * $6 - 2 * $4 = $40.
3. The final 6 customers arrive, 4 board and 13 wait, the wheel rotates. Current profit is 12 * $6 - 3 * $4 = $60.
4. 4 board and 9 wait, the wheel rotates. Current profit is 16 * $6 - 4 * $4 = $80.
5. 4 board and 5 wait, the wheel rotates. Current profit is 20 * $6 - 5 * $4 = $100.
6. 4 board and 1 waits, the wheel rotates. Current profit is 24 * $6 - 6 * $4 = $120.
7. 1 boards, the wheel rotates. Current profit is 25 * $6 - 7 * $4 = $122.
The highest profit was $122 after rotating the wheel 7 times.


```

**Example 3:** 

```
Input: customers = [3,4,0,5,1], boardingCost = 1, runningCost = 92
Output: -1
Explanation:
1. 3 customers arrive, 3 board and 0 wait, the wheel rotates. Current profit is 3 * $1 - 1 * $92 = -$89.
2. 4 customers arrive, 4 board and 0 wait, the wheel rotates. Current profit is 7 * $1 - 2 * $92 = -$177.
3. 0 customers arrive, 0 board and 0 wait, the wheel rotates. Current profit is 7 * $1 - 3 * $92 = -$269.
4. 5 customers arrive, 4 board and 1 waits, the wheel rotates. Current profit is 11 * $1 - 4 * $92 = -$357.
5. 1 customer arrives, 2 board and 0 wait, the wheel rotates. Current profit is 13 * $1 - 5 * $92 = -$447.
The profit was never positive, so return -1.

```

**Example 4:** 

```
Input: customers = [10,10,6,4,7], boardingCost = 3, runningCost = 8
Output: 9
Explanation:
1. 10 customers arrive, 4 board and 6 wait, the wheel rotates. Current profit is 4 * $3 - 1 * $8 = $4.
2. 10 customers arrive, 4 board and 12 wait, the wheel rotates. Current profit is 8 * $3 - 2 * $8 = $8.
3. 6 customers arrive, 4 board and 14 wait, the wheel rotates. Current profit is 12 * $3 - 3 * $8 = $12.
4. 4 customers arrive, 4 board and 14 wait, the wheel rotates. Current profit is 16 * $3 - 4 * $8 = $16.
5. 7 customers arrive, 4 board and 17 wait, the wheel rotates. Current profit is 20 * $3 - 5 * $8 = $20.
6. 4 board and 13 wait, the wheel rotates. Current profit is 24 * $3 - 6 * $8 = $24.
7. 4 board and 9 wait, the wheel rotates. Current profit is 28 * $3 - 7 * $8 = $28.
8. 4 board and 5 wait, the wheel rotates. Current profit is 32 * $3 - 8 * $8 = $32.
9. 4 board and 1 waits, the wheel rotates. Current profit is 36 * $3 - 9 * $8 = $36.
10. 1 board and 0 wait, the wheel rotates. Current profit is 37 * $3 - 10 * $8 = $31.
The highest profit was $36 after rotating the wheel 9 times.

```



**Constraints:** 

-  *n == customers.length*  
-  *1 <= n <= 105*  
-  *0 <= customers[i] <= 50*  
-  *1 <= boardingCost, runningCost <= 100* 


# [1599. 经营摩天轮的最大利润][cnTitle]

**中等**

你正在经营一座摩天轮，该摩天轮共有 **4 个座舱**  ，每个座舱**最多可以容纳 4 位游客**  。你可以 **逆时针**  轮转座舱，但每次轮转都需要支付一定的运行成本  *runningCost*  。摩天轮每次轮转都恰好转动 1 / 4 周。

给你一个长度为  *n*  的数组  *customers*  ，  *customers[i]*  是在第  *i*  次轮转（下标从 0 开始）之前到达的新游客的数量。这也意味着你必须在新游客到来前轮转  *i*  次。每位游客在登上离地面最近的座舱前都会支付登舱成本  *boardingCost*  ，一旦该座舱再次抵达地面，他们就会离开座舱结束游玩。

你可以随时停下摩天轮，即便是 **在服务所有游客之前**  。如果你决定停止运营摩天轮，为了保证所有游客安全着陆，**将免费进行** **所有后续轮转**  。注意，如果有超过 4 位游客在等摩天轮，那么只有 4 位游客可以登上摩天轮，其余的需要等待 **下一次轮转**  。

返回最大化利润所需执行的 **最小轮转次数**  。 如果不存在利润为正的方案，则返回  *-1*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/26/wheeldiagram12.png)

```
输入：customers = [8,3], boardingCost = 5, runningCost = 6
输出：3
解释：座舱上标注的数字是该座舱的当前游客数。
1. 8 位游客抵达，4 位登舱，4 位等待下一舱，摩天轮轮转。当前利润为 4 * $5 - 1 * $6 = $14 。
2. 3 位游客抵达，4 位在等待的游客登舱，其他 3 位等待，摩天轮轮转。当前利润为 8 * $5 - 2 * $6 = $28 。
3. 最后 3 位游客登舱，摩天轮轮转。当前利润为 11 * $5 - 3 * $6 = $37 。
轮转 3 次得到最大利润，最大利润为 $37 。
```

**示例 2：** 

```
输入：customers = [10,9,6], boardingCost = 6, runningCost = 4
输出：7
解释：
1. 10 位游客抵达，4 位登舱，6 位等待下一舱，摩天轮轮转。当前利润为 4 * $6 - 1 * $4 = $20 。
2. 9 位游客抵达，4 位登舱，11 位等待（2 位是先前就在等待的，9 位新加入等待的），摩天轮轮转。当前利润为 8 * $6 - 2 * $4 = $40 。
3. 最后 6 位游客抵达，4 位登舱，13 位等待，摩天轮轮转。当前利润为 12 * $6 - 3 * $4 = $60 。
4. 4 位登舱，9 位等待，摩天轮轮转。当前利润为 * $6 - 4 * $4 = $80 。
5. 4 位登舱，5 位等待，摩天轮轮转。当前利润为 20 * $6 - 5 * $4 = $100 。
6. 4 位登舱，1 位等待，摩天轮轮转。当前利润为 24 * $6 - 6 * $4 = $120 。
7. 1 位登舱，摩天轮轮转。当前利润为 25 * $6 - 7 * $4 = $122 。
轮转 7 次得到最大利润，最大利润为$122 。

```

**示例 3：** 

```
输入：customers = [3,4,0,5,1], boardingCost = 1, runningCost = 92
输出：-1
解释：
1. 3 位游客抵达，3 位登舱，0 位等待，摩天轮轮转。当前利润为 3 * $1 - 1 * $92 = -$89 。
2. 4 位游客抵达，4 位登舱，0 位等待，摩天轮轮转。当前利润为 is 7 * $1 - 2 * $92 = -$177 。
3. 0 位游客抵达，0 位登舱，0 位等待，摩天轮轮转。当前利润为 7 * $1 - 3 * $92 = -$269 。
4. 5 位游客抵达，4 位登舱，1 位等待，摩天轮轮转。当前利润为 12 * $1 - 4 * $92 = -$356 。
5. 1 位游客抵达，2 位登舱，0 位等待，摩天轮轮转。当前利润为 13 * $1 - 5 * $92 = -$447 。
利润永不为正，所以返回 -1 。

```

**示例 4：** 

```
输入：customers = [10,10,6,4,7], boardingCost = 3, runningCost = 8
输出：9
解释：
1. 10 位游客抵达，4 位登舱，6 位等待，摩天轮轮转。当前利润为 4 * $3 - 1 * $8 = $4 。
2. 10 位游客抵达，4 位登舱，12 位等待，摩天轮轮转。当前利润为 8 * $3 - 2 * $8 = $8 。
3. 6 位游客抵达，4 位登舱，14 位等待，摩天轮轮转。当前利润为 12 * $3 - 3 * $8 = $12 。
4. 4 位游客抵达，4 位登舱，14 位等待，摩天轮轮转。当前利润为 16 * $3 - 4 * $8 = $16 。
5. 7 位游客抵达，4 位登舱，17 位等待，摩天轮轮转。当前利润为 20 * $3 - 5 * $8 = $20 。
6. 4 位登舱，13 位等待，摩天轮轮转。当前利润为 24 * $3 - 6 * $8 = $24 。
7. 4 位登舱，9 位等待，摩天轮轮转。当前利润为 28 * $3 - 7 * $8 = $28 。
8. 4 位登舱，5 位等待，摩天轮轮转。当前利润为 32 * $3 - 8 * $8 = $32 。
9. 4 位登舱，1 位等待，摩天轮轮转。当前利润为 36 * $3 - 9 * $8 = $36 。
​​​​​​​10. 1 位登舱，0 位等待，摩天轮轮转。当前利润为 37 * $3 - 10 * $8 = $31 。
轮转 9 次得到最大利润，最大利润为 $36 。

```



**提示：** 

-  *n == customers.length*  
-  *1 <= n <= 105*  
-  *0 <= customers[i] <= 50*  
-  *1 <= boardingCost, runningCost <= 100* 




# 算法思路

# 测试用例
```
1599. Maximum Profit of Operating a Centennial Wheel 1599. 经营摩天轮的最大利润 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-profit-of-operating-a-centennial-wheel/
[cnTitle]: https://leetcode-cn.com/problems/maximum-profit-of-operating-a-centennial-wheel/
