# [901. Online Stock Span][enTitle]

**Medium**

Write a class  *StockSpanner*  which collects daily price quotes for some stock, and returns the  *span*  of that stock's price for the current day.

The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.

For example, if the price of a stock over the next 7 days were  *[100, 80, 60, 70, 60, 75, 85]* , then the stock spans would be  *[1, 1, 1, 2, 1, 4, 6]* .




**Example 1:** 

```
Input:["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
Output: [null,1,1,1,2,1,4,6]
Explanation: 
First, S = StockSpanner() is initialized.  Then:
S.next(100) is called and returns 1,
S.next(80) is called and returns 1,
S.next(60) is called and returns 1,
S.next(70) is called and returns 2,
S.next(60) is called and returns 1,
S.next(75) is called and returns 4,
S.next(85) is called and returns 6.

Note that (for example) S.next(75) returned 4, because the last 4 prices
(including today's price of 75) were less than or equal to today's price.
```



**Note:** 

1. Calls to  *StockSpanner.next(int price)*  will have  *1 <= price <= 10^5* . 
2. There will be at most  *10000*  calls to  *StockSpanner.next*  per test case. 
3. There will be at most  *150000*  calls to  *StockSpanner.next*  across all test cases. 
4. The total time limit for this problem has been reduced by 75% for C++, and 50% for all other languages.


# [901. 股票价格跨度][cnTitle]

**中等**

编写一个  *StockSpanner*  类，它收集某些股票的每日报价，并返回该股票当日价格的跨度。

今天股票价格的跨度被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。

例如，如果未来7天股票的价格是  *[100, 80, 60, 70, 60, 75, 85]* ，那么股票跨度将是  *[1, 1, 1, 2, 1, 4, 6]* 。



**示例：** 

```
输入：["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
输出：[null,1,1,1,2,1,4,6]
解释：
首先，初始化 S = StockSpanner()，然后：
S.next(100) 被调用并返回 1，
S.next(80) 被调用并返回 1，
S.next(60) 被调用并返回 1，
S.next(70) 被调用并返回 2，
S.next(60) 被调用并返回 1，
S.next(75) 被调用并返回 4，
S.next(85) 被调用并返回 6。

注意 (例如) S.next(75) 返回 4，因为截至今天的最后 4 个价格
(包括今天的价格 75) 小于或等于今天的价格。

```



**提示：** 

1. 调用  *StockSpanner.next(int price)*  时，将有  *1 <= price <= 10^5* 。 
2. 每个测试用例最多可以调用  *10000*  次  *StockSpanner.next* 。 
3. 在所有测试用例中，最多调用  *150000*  次  *StockSpanner.next* 。 
4. 此问题的总时间限制减少了 50%。


# 算法思路

# 测试用例
```
901. Online Stock Span 901. 股票价格跨度 Medium
```

[enTitle]: https://leetcode.com/problems/online-stock-span/
[cnTitle]: https://leetcode-cn.com/problems/online-stock-span/
