# [956. Tallest Billboard][enTitle]

**Hard**

You are installing a billboard and want it to have the largest height. The billboard will have two steel supports, one on each side. Each steel support must be an equal height.

You are given a collection of  *rods*  that can be welded together. For example, if you have rods of lengths  *1* ,  *2* , and  *3* , you can weld them together to make a support of length  *6* .

Return  *the largest possible height of your billboard installation* . If you cannot support the billboard, return  *0* .



**Example 1:** 

```
Input: rods = [1,2,3,6]
Output: 6
Explanation: We have two disjoint subsets {1,2,3} and {6}, which have the same sum = 6.

```

**Example 2:** 

```
Input: rods = [1,2,3,4,5,6]
Output: 10
Explanation: We have two disjoint subsets {2,3,5} and {4,6}, which have the same sum = 10.

```

**Example 3:** 

```
Input: rods = [1,2]
Output: 0
Explanation: The billboard cannot be supported, so we return 0.

```



**Constraints:** 

-  *1 <= rods.length <= 20*  
-  *1 <= rods[i] <= 1000*  
-  *sum(rods[i]) <= 5000* 


# [956. 最高的广告牌][cnTitle]

**困难**

你正在安装一个广告牌，并希望它高度最大。这块广告牌将有两个钢制支架，两边各一个。每个钢支架的高度必须相等。

你有一堆可以焊接在一起的钢筋  *rods* 。举个例子，如果钢筋的长度为 1、2 和 3，则可以将它们焊接在一起形成长度为 6 的支架。

返回广告牌的最大可能安装高度。如果没法安装广告牌，请返回 0。



**示例 1：** 

```
输入：[1,2,3,6]
输出：6
解释：我们有两个不相交的子集 {1,2,3} 和 {6}，它们具有相同的和 sum = 6。

```

**示例 2：** 

```
输入：[1,2,3,4,5,6]
输出：10
解释：我们有两个不相交的子集 {2,3,5} 和 {4,6}，它们具有相同的和 sum = 10。
```

**示例 3：** 

```
输入：[1,2]
输出：0
解释：没法安装广告牌，所以返回 0。
```



**提示：** 

1.  *0 <= rods.length <= 20*  
2.  *1 <= rods[i] <= 1000*  
3.  *钢筋的长度总和最多为 5000* 




# 算法思路

# 测试用例
```
956. Tallest Billboard 956. 最高的广告牌 Hard
```

[enTitle]: https://leetcode.com/problems/tallest-billboard/
[cnTitle]: https://leetcode-cn.com/problems/tallest-billboard/
