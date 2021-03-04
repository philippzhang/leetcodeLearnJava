# [1627. Graph Connectivity With Threshold][enTitle]

**Hard**

We have  *n*  cities labeled from  *1*  to  *n* . Two different cities with labels  *x*  and  *y*  are directly connected by a bidirectional road if and only if  *x*  and  *y*  share a common divisor **strictly greater**  than some  *threshold* . More formally, cities with labels  *x*  and  *y*  have a road between them if there exists an integer  *z*  such that all of the following are true:

-  *x % z == 0* , 
-  *y % z == 0* , and 
-  *z > threshold* .

Given the two integers,  *n*  and  *threshold* , and an array of  *queries* , you must determine for each  *queries[i] = [ai, bi]*  if cities  *ai*  and  *bi*  are connected directly or indirectly. (i.e. there is some path between them).

Return  *an array*  *answer*  *, where*  *answer.length == queries.length*  *and*  *answer[i]*  *is*  *true*  *if for the*  *ith*  *query, there is a path between*  *ai*  *and*  *bi*  *, or*  *answer[i]*  *is*  *false*  *if there is no path.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/09/ex1.jpg)

```
Input: n = 6, threshold = 2, queries = [[1,4],[2,5],[3,6]]
Output: [false,false,true]
Explanation: The divisors for each number:
1:   1
2:   1, 2
3:   1, 3
4:   1, 2, 4
5:   1, 5
6:   1, 2, 3, 6
Using the underlined divisors above the threshold, only cities 3 and 6 share a common divisor, so they are the
only ones directly connected. The result of each query:
[1,4]   1 is not connected to 4
[2,5]   2 is not connected to 5
[3,6]   3 is connected to 6 through path 3--6

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/10/10/tmp.jpg)

```
Input: n = 6, threshold = 0, queries = [[4,5],[3,4],[3,2],[2,6],[1,3]]
Output: [true,true,true,true,true]
Explanation: The divisors for each number are the same as the previous example. However, since the threshold is 0,
all divisors can be used. Since all numbers share 1 as a divisor, all cities are connected.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/10/17/ex3.jpg)

```
Input: n = 5, threshold = 1, queries = [[4,5],[4,5],[3,2],[2,3],[3,4]]
Output: [false,false,false,false,false]
Explanation: Only cities 2 and 4 share a common divisor 2 which is strictly greater than the threshold 1, so they are the only ones directly connected.
Please notice that there can be multiple queries for the same pair of nodes [x, y], and that the query [x, y] is equivalent to the query [y, x].

```



**Constraints:** 

-  *2 <= n <= 104*  
-  *0 <= threshold <= n*  
-  *1 <= queries.length <= 105*  
-  *queries[i].length == 2*  
-  *1 <= ai, bi <= cities*  
-  *ai != bi* 


# [1627. 带阈值的图连通性][cnTitle]

**困难**

有  *n*  座城市，编号从  *1*  到  *n*  。编号为  *x*  和  *y*  的两座城市直接连通的前提是：  *x*  和  *y*  的公因数中，至少有一个 **严格大于**  某个阈值  *threshold*  。更正式地说，如果存在整数  *z*  ，且满足以下所有条件，则编号  *x*  和  *y*  的城市之间有一条道路：

-  *x % z == 0*  
-  *y % z == 0*  
-  *z > threshold* 

给你两个整数  *n*  和  *threshold*  ，以及一个待查询数组，请你判断每个查询 *queries[i] = [ai, bi]*  指向的城市  *ai*  和  *bi*  是否连通（即，它们之间是否存在一条路径）。

返回数组  *answer*  ，其中 *answer.length == queries.length*  。如果第  *i*  个查询中指向的城市  *ai*  和  *bi*  连通，则  *answer[i]*  为  *true*  ；如果不连通，则  *answer[i]*  为  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/18/ex1.jpg)



```
输入：n = 6, threshold = 2, queries = [[1,4],[2,5],[3,6]]
输出：[false,false,true]
解释：每个数的因数如下：
1:   1
2:   1, 2
3:   1, 3
4:   1, 2, 4
5:   1, 5
6:   1, 2, 3, 6
所有大于阈值的的因数已经加粗标识，只有城市 3 和 6 共享公约数 3 ，因此结果是： 
[1,4]   1 与 4 不连通
[2,5]   2 与 5 不连通
[3,6]   3 与 6 连通，存在路径 3--6

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/18/tmp.jpg)



```
输入：n = 6, threshold = 0, queries = [[4,5],[3,4],[3,2],[2,6],[1,3]]
输出：[true,true,true,true,true]
解释：每个数的因数与上一个例子相同。但是，由于阈值为 0 ，所有的因数都大于阈值。因为所有的数字共享公因数 1 ，所以所有的城市都互相连通。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/16/ex3.jpg)



```
输入：n = 5, threshold = 1, queries = [[4,5],[4,5],[3,2],[2,3],[3,4]]
输出：[false,false,false,false,false]
解释：只有城市 2 和 4 共享的公约数 2 严格大于阈值 1 ，所以只有这两座城市是连通的。
注意，同一对节点 [x, y] 可以有多个查询，并且查询 [x，y] 等同于查询 [y，x] 。

```



**提示：** 

-  *2 <= n <= 104*  
-  *0 <= threshold <= n*  
-  *1 <= queries.length <= 105*  
-  *queries[i].length == 2*  
-  *1 <= ai, bi <= cities*  
-  *ai != bi* 




# 算法思路

# 测试用例
```
1627. Graph Connectivity With Threshold 1627. 带阈值的图连通性 Hard
```

[enTitle]: https://leetcode.com/problems/graph-connectivity-with-threshold/
[cnTitle]: https://leetcode-cn.com/problems/graph-connectivity-with-threshold/
