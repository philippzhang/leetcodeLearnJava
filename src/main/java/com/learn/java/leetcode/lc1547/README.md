# [1547. Minimum Cost to Cut a Stick][enTitle]

**Hard**

Given a wooden stick of length  *n*  units. The stick is labelled from  *0*  to  *n* . For example, a stick of length **6**  is labelled as follows:

![img](https://assets.leetcode.com/uploads/2020/07/21/statement.jpg)

Given an integer array  *cuts*  where  *cuts[i]*  denotes a position you should perform a cut at.

You should perform the cuts in order, you can change the order of the cuts as you wish.

The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of the stick before the cut). Please refer to the first example for a better explanation.

Return  *the minimum total cost*  of the cuts.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/07/23/e1.jpg)


<pre><strong>Input:</strong> n = 7, cuts = [1,3,4,5]
<strong>Output:</strong> 16
<strong>Explanation:</strong> Using cuts order = [1, 3, 4, 5] as in the input leads to the following scenario:
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/21/e11.jpg" style="width: 350px; height: 284px;">
The first cut is done to a rod of length 7 so the cost is 7. The second cut is done to a rod of length 6 (i.e. the second part of the first cut), the third is done to a rod of length 4 and the last cut is to a rod of length 3. The total cost is 7 + 6 + 4 + 3 = 20.
Rearranging the cuts to be [3, 5, 1, 4] for example will lead to a scenario with total cost = 16 (as shown in the example photo 7 + 4 + 3 + 2 = 16).</pre>

**Example 2:** 

```
Input: n = 9, cuts = [5,6,1,4,2]
Output: 22
Explanation: If you try the given cuts ordering the cost will be 25.
There are much ordering with total cost <= 25, for example, the order [4, 6, 5, 2, 1] has total cost = 22 which is the minimum possible.

```



**Constraints:** 

-  *2 <= n <= 10^6*  
-  *1 <= cuts.length <= min(n - 1, 100)*  
-  *1 <= cuts[i] <= n - 1*  
- All the integers in  *cuts*  array are **distinct** .


# [1547. 切棍子的最小成本][cnTitle]

**困难**

有一根长度为  *n*  个单位的木棍，棍上从  *0*  到  *n*  标记了若干位置。例如，长度为 **6**  的棍子可以标记如下：

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/09/statement.jpg)

给你一个整数数组  *cuts*  ，其中  *cuts[i]*  表示你需要将棍子切开的位置。

你可以按顺序完成切割，也可以根据需要更改切割的顺序。

每次切割的成本都是当前要切割的棍子的长度，切棍子的总成本是历次切割成本的总和。对棍子进行切割将会把一根木棍分成两根较小的木棍（这两根木棍的长度和就是切割前木棍的长度）。请参阅第一个示例以获得更直观的解释。

返回切棍子的 **最小总成本**  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/09/e1.jpg)


<pre><strong>输入：</strong>n = 7, cuts = [1,3,4,5]
<strong>输出：</strong>16
<strong>解释：</strong>按 [1, 3, 4, 5] 的顺序切割的情况如下所示：
<img style="height: 284px; width: 350px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/09/e11.jpg" alt="">
第一次切割长度为 7 的棍子，成本为 7 。第二次切割长度为 6 的棍子（即第一次切割得到的第二根棍子），第三次切割为长度 4 的棍子，最后切割长度为 3 的棍子。总成本为 7 + 6 + 4 + 3 = 20 。
而将切割顺序重新排列为 [3, 5, 1, 4] 后，总成本 = 16（如示例图中 7 + 4 + 3 + 2 = 16）。
</pre>

**示例 2：** 

```
输入：n = 9, cuts = [5,6,1,4,2]
输出：22
解释：如果按给定的顺序切割，则总成本为 25 。总成本 <= 25 的切割顺序很多，例如，[4, 6, 5, 2, 1] 的总成本 = 22，是所有可能方案中成本最小的。
```



**提示：** 

-  *2 <= n <= 10^6*  
-  *1 <= cuts.length <= min(n - 1, 100)*  
-  *1 <= cuts[i] <= n - 1*  
-  *cuts*  数组中的所有整数都 **互不相同** 




# 算法思路

# 测试用例
```
1547. Minimum Cost to Cut a Stick 1547. 切棍子的最小成本 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-cost-to-cut-a-stick/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-to-cut-a-stick/
