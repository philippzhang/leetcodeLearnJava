# [787. Cheapest Flights Within K Stops][enTitle]

**Medium**

There are  *n*  cities connected by  *m*  flights. Each flight starts from city  *u*  and arrives at  *v*  with a price  *w* .

Now given all the cities and flights, together with starting city  *src*  and the destination  *dst* , your task is to find the cheapest price from  *src*  to  *dst*  with up to  *k*  stops. If there is no such route, output  *-1* .


<pre><strong>Example 1:</strong>
<strong>Input:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
<strong>Output:</strong> 200
<strong>Explanation:</strong> 
The graph looks like this:
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height:180px; width:246px">

The cheapest price from city <code>0</code> to city <code>2</code> with at most 1 stop costs 200, as marked red in the picture.</pre>


<pre><strong>Example 2:</strong>
<strong>Input:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
<strong>Output:</strong> 500
<strong>Explanation:</strong> 
The graph looks like this:
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height:180px; width:246px">

The cheapest price from city <code>0</code> to city <code>2</code> with at most 0 stop costs 500, as marked blue in the picture.
</pre>



**Constraints:** 

- The number of nodes  *n*  will be in range  *[1, 100]* , with nodes labeled from  *0*  to  *n*  *- 1* . 
- The size of  *flights*  will be in range  *[0, n * (n - 1) / 2]* . 
- The format of each flight will be  *(src,*  *dst*  *, price)* . 
- The price of each flight will be in the range  *[1, 10000]* . 
-  *k*  is in the range of  *[0, n - 1]* . 
- There will not be any duplicated flights or self cycles.


# [787. K 站中转内最便宜的航班][cnTitle]

**中等**

有  *n*  个城市通过  *m*  个航班连接。每个航班都从城市  *u*  开始，以价格  *w*  抵达  *v* 。

现在给定所有的城市和航班，以及出发城市  *src*  和目的地  *dst* ，你的任务是找到从  *src*  到  *dst*  最多经过  *k*  站中转的最便宜的价格。 如果没有这样的路线，则输出  *-1* 。



**示例 1：** 


<pre><strong>输入:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
<strong>输出:</strong> 200
<strong>解释:</strong> 
城市航班图如下
<img style="height: 180px; width: 246px;" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" alt="">

从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。</pre>

**示例 2：** 


<pre><strong>输入:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
<strong>输出:</strong> 500
<strong>解释:</strong> 
城市航班图如下
<img style="height: 180px; width: 246px;" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" alt="">

从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。</pre>



**提示：** 

-  *n*  范围是  *[1, 100]* ，城市标签从  *0*  到  *n*  *- 1*  
- 航班数量范围是  *[0, n * (n - 1) / 2]*  
- 每个航班的格式  *(src,*  *dst*  *, price)*  
- 每个航班的价格范围是  *[1, 10000]*  
-  *k*  范围是  *[0, n - 1]*  
- 航班没有重复，且不存在自环




# 算法思路

# 测试用例
```
787. Cheapest Flights Within K Stops 787. K 站中转内最便宜的航班 Medium
```

[enTitle]: https://leetcode.com/problems/cheapest-flights-within-k-stops/
[cnTitle]: https://leetcode-cn.com/problems/cheapest-flights-within-k-stops/
