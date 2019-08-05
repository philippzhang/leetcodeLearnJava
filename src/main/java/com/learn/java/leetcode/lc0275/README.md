# [275. H-Index II][enTitle]

**Medium**

Given an array of citations **sorted in ascending order** (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than hcitations each."

Example:

```
Input: citations = [0,1,3,5,6]
Output: 3 
Explanation:[0,1,3,5,6]means the researcher has 5 papers in total and each of them had 
             received 0, 1, 3, 5, 6 citations respectively. 
             Since the researcher has 3 papers with at least 3 citations each and the remaining 
             two with no more than 3 citations each, her h-index is 3.
```

**Note:** 

If there are several possible values for  *h* , the maximum one is taken as the h-index.

**Follow up:** 

- This is a follow up problem to H-Index, where  *citations*  is now guaranteed to be sorted in ascending order. 
- Could you solve it in logarithmic time complexity?


# [275. H指数 II][cnTitle]

**中等**

给定一位研究者论文被引用次数的数组（被引用次数是非负整数），数组已经按照**升序排列** 。编写一个方法，计算出研究者的  *h*  指数。

h 指数的定义: “h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）**至多** 有 h 篇论文分别被引用了**至少**  h 次。（其余的  *N - h* 篇论文每篇被引用次数**不多于**  *h* 次。）"



**示例:** 

```
输入: citations = [0,1,3,5,6]
输出: 3 
解释:给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 0, 1, 3, 5, 6 次。
     由于研究者有 3篇论文每篇至少被引用了 3 次，其余两篇论文每篇被引用不多于 3 次，所以她的h指数是 3。
```



**说明:** 

如果  *h* 有多有种可能的值 ， *h*  指数是其中最大的那个。



**进阶：** 

- 这是 H指数 的延伸题目，本题中的  *citations*  数组是保证有序的。 
- 你可以优化你的算法到对数时间复杂度吗？




# 算法思路

# 测试用例
```
275. H-Index II 275. H指数 II Medium
```

[enTitle]: https://leetcode.com/problems/h-index-ii/
[cnTitle]: https://leetcode-cn.com/problems/h-index-ii/
