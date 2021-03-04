# [1705. Maximum Number of Eaten Apples][enTitle]

**Medium**

There is a special kind of apple tree that grows apples every day for  *n*  days. On the  *ith*  day, the tree grows  *apples[i]*  apples that will rot after  *days[i]*  days, that is on day  *i + days[i]*  the apples will be rotten and cannot be eaten. On some days, the apple tree does not grow any apples, which are denoted by  *apples[i] == 0*  and  *days[i] == 0* .

You decided to eat **at most**  one apple a day (to keep the doctors away). Note that you can keep eating after the first  *n*  days.

Given two integer arrays  *days*  and  *apples*  of length  *n* , return  *the maximum number of apples you can eat.* 



**Example 1:** 

```
Input: apples = [1,2,3,5,2], days = [3,2,1,4,2]
Output: 7
Explanation: You can eat 7 apples:
- On the first day, you eat an apple that grew on the first day.
- On the second day, you eat an apple that grew on the second day.
- On the third day, you eat an apple that grew on the second day. After this day, the apples that grew on the third day rot.
- On the fourth to the seventh days, you eat apples that grew on the fourth day.

```

**Example 2:** 

```
Input: apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
Output: 5
Explanation: You can eat 5 apples:
- On the first to the third day you eat apples that grew on the first day.
- Do nothing on the fouth and fifth days.
- On the sixth and seventh days you eat apples that grew on the sixth day.

```



**Constraints:** 

-  *apples.length == n*  
-  *days.length == n*  
-  *1 <= n <= 2 * 104*  
-  *0 <= apples[i], days[i] <= 2 * 104*  
-  *days[i] = 0*  if and only if  *apples[i] = 0* .


# [1705. 吃苹果的最大数目][cnTitle]

**中等**

有一棵特殊的苹果树，一连  *n*  天，每天都可以长出若干个苹果。在第  *i*  天，树上会长出  *apples[i]*  个苹果，这些苹果将会在  *days[i]*  天后（也就是说，第  *i + days[i]*  天时）腐烂，变得无法食用。也可能有那么几天，树上不会长出新的苹果，此时用  *apples[i] == 0*  且  *days[i] == 0*  表示。

你打算每天 **最多**  吃一个苹果来保证营养均衡。注意，你可以在这  *n*  天之后继续吃苹果。

给你两个长度为  *n*  的整数数组  *days*  和  *apples*  ，返回你可以吃掉的苹果的最大数目 *。* 



**示例 1：** 

```
输入：apples = [1,2,3,5,2], days = [3,2,1,4,2]
输出：7
解释：你可以吃掉 7 个苹果：
- 第一天，你吃掉第一天长出来的苹果。
- 第二天，你吃掉一个第二天长出来的苹果。
- 第三天，你吃掉一个第二天长出来的苹果。过了这一天，第三天长出来的苹果就已经腐烂了。
- 第四天到第七天，你吃的都是第四天长出来的苹果。

```

**示例 2：** 

```
输入：apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
输出：5
解释：你可以吃掉 5 个苹果：
- 第一天到第三天，你吃的都是第一天长出来的苹果。
- 第四天和第五天不吃苹果。
- 第六天和第七天，你吃的都是第六天长出来的苹果。

```



**提示：** 

-  *apples.length == n*  
-  *days.length == n*  
-  *1 <= n <= 2 * 104*  
-  *0 <= apples[i], days[i] <= 2 * 104*  
- 只有在  *apples[i] = 0*  时， *days[i] = 0*  才成立




# 算法思路

# 测试用例
```
1705. Maximum Number of Eaten Apples 1705. 吃苹果的最大数目 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-eaten-apples/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-eaten-apples/
