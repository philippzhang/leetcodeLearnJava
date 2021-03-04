# [1744. Can You Eat Your Favorite Candy on Your Favorite Day?][enTitle]

**Medium**

You are given a **(0-indexed)**  array of positive integers  *candiesCount*  where  *candiesCount[i]*  represents the number of candies of the  *ith*  type you have. You are also given a 2D array  *queries*  where  *queries[i] = [favoriteTypei, favoriteDayi, dailyCapi]* .

You play a game with the following rules:

- You start eating candies on day  *0* . 
- You cannot eat **any**  candy of type  *i*  unless you have eaten **all**  candies of type  *i - 1* . 
- You must eat **at least**  **one**  candy per day until you have eaten all the candies.

Construct a boolean array  *answer*  such that  *answer.length == queries.length*  and  *answer[i]*  is  *true*  if you can eat a candy of type  *favoriteTypei*  on day  *favoriteDayi*  without eating **more than**   *dailyCapi*  candies on **any**  day, and  *false*  otherwise. Note that you can eat different types of candy on the same day, provided that you follow rule 2.

Return  *the constructed array*  *answer* .



**Example 1:** 

```
Input: candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
Output: [true,false,true]
Explanation:
1- If you eat 2 candies (type 0) on day 0 and 2 candies (type 0) on day 1, you will eat a candy of type 0 on day 2.
2- You can eat at most 4 candies each day.
   If you eat 4 candies every day, you will eat 4 candies (type 0) on day 0 and 4 candies (type 0 and type 1) on day 1.
   On day 2, you can only eat 4 candies (type 1 and type 2), so you cannot eat a candy of type 4 on day 2.
3- If you eat 1 candy each day, you will eat a candy of type 2 on day 13.

```

**Example 2:** 

```
Input: candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
Output: [false,true,true,false,false]

```



**Constraints:** 

-  *1 <= candiesCount.length <= 105*  
-  *1 <= candiesCount[i] <= 105*  
-  *1 <= queries.length <= 105*  
-  *queries[i].length == 3*  
-  *0 <= favoriteTypei < candiesCount.length*  
-  *0 <= favoriteDayi <= 109*  
-  *1 <= dailyCapi <= 109* 


# [1744. 你能在你最喜欢的那天吃到你最喜欢的糖果吗？][cnTitle]

**中等**

给你一个下标从 **0**  开始的正整数数组  *candiesCount*  ，其中  *candiesCount[i]*  表示你拥有的第  *i*  类糖果的数目。同时给你一个二维数组  *queries*  ，其中  *queries[i] = [favoriteTypei, favoriteDayi, dailyCapi]*  。

你按照如下规则进行一场游戏：

- 你从第  *0* **** 天开始吃糖果。 
- 你在吃完 **所有**  第  *i - 1*  类糖果之前，**不能**  吃任何一颗第  *i*  类糖果。 
- 在吃完所有糖果之前，你必须每天 **至少**  吃 **一颗**  糖果。

请你构建一个布尔型数组  *answer*  ，满足  *answer.length == queries.length*  。 *answer[i]*  为  *true*  的条件是：在每天吃 **不超过**   *dailyCapi* <sub> </sub>颗糖果的前提下，你可以在第  *favoriteDayi*  天吃到第  *favoriteTypei*  类糖果；否则  *answer[i]*  为  *false*  。注意，只要满足上面 3 条规则中的第二条规则，你就可以在同一天吃不同类型的糖果。

请你返回得到的数组 *answer*  。



**示例 1：** 

```
输入：candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
输出：[true,false,true]
提示：
1- 在第 0 天吃 2 颗糖果(类型 0），第 1 天吃 2 颗糖果（类型 0），第 2 天你可以吃到类型 0 的糖果。
2- 每天你最多吃 4 颗糖果。即使第 0 天吃 4 颗糖果（类型 0），第 1 天吃 4 颗糖果（类型 0 和类型 1），你也没办法在第 2 天吃到类型 4 的糖果。换言之，你没法在每天吃 4 颗糖果的限制下在第 2 天吃到第 4 类糖果。
3- 如果你每天吃 1 颗糖果，你可以在第 13 天吃到类型 2 的糖果。

```

**示例 2：** 

```
输入：candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
输出：[false,true,true,false,false]

```



**提示：** 

-  *1 <= candiesCount.length <= 105*  
-  *1 <= candiesCount[i] <= 105*  
-  *1 <= queries.length <= 105*  
-  *queries[i].length == 3*  
-  *0 <= favoriteTypei < candiesCount.length*  
-  *0 <= favoriteDayi <= 109*  
-  *1 <= dailyCapi <= 109* 




# 算法思路

# 测试用例
```
1744. Can You Eat Your Favorite Candy on Your Favorite Day? 1744. 你能在你最喜欢的那天吃到你最喜欢的糖果吗？ Medium
```

[enTitle]: https://leetcode.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/
[cnTitle]: https://leetcode-cn.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/
