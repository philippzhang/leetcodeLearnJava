# [952. Largest Component Size by Common Factor][enTitle]

**Hard**

Given a non-empty array of unique positive integers  *A* , consider the following graph:

- There are  *A.length*  nodes, labelled  *A[0]*  to  *A[A.length - 1];*  
- There is an edge between  *A[i]*  and  *A[j]*  if and only if  *A[i]*  and  *A[j]*  share a common factor greater than 1.

Return the size of the largest connected component in the graph.






**Example 1:** 


<pre><strong>Input: </strong><span id="example-input-1-1">[4,6,15,35]
<strong>Output: </strong><span id="example-output-1">4
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/01/ex1.png" style="width: 257px; height: 50px;">
</span></span></pre>


**Example 2:** 


<pre><strong>Input: </strong><span id="example-input-2-1">[20,50,9,63]
<strong>Output: </strong><span id="example-output-2">2
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/01/ex2.png" style="width: 293px; height: 50px;">
</span></span></pre>


**Example 3:** 


<pre><strong>Input: </strong><span id="example-input-3-1">[2,3,6,7,4,12,21,39]
<strong>Output: </strong><span id="example-output-3">8
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/01/ex3.png" style="width: 346px; height: 180px;">
</span></span></pre>

**Note:** 

1.  *1 <= A.length <= 20000*  
2.  *1 <= A[i] <= 100000* 








# [952. 按公因数计算最大组件大小][cnTitle]

**困难**

给定一个由不同正整数的组成的非空数组  *A* ，考虑下面的图：

- 有  *A.length*  个节点，按从  *A[0]*  到  *A[A.length - 1]*  标记； 
- 只有当  *A[i]*  和  *A[j]*  共用一个大于 1 的公因数时， *A[i]*  和  *A[j]*  之间才有一条边。

返回图中最大连通组件的大小。





**示例 1：** 


<pre><strong>输入：</strong>[4,6,15,35]
<strong>输出：</strong>4
<img style="height: 50px; width: 257px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/01/ex1.png" alt="">
</pre>

**示例 2：** 


<pre><strong>输入：</strong>[20,50,9,63]
<strong>输出：</strong>2
<img style="height: 50px; width: 293px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/01/ex2.png" alt="">
</pre>

**示例 3：** 


<pre><strong>输入：</strong>[2,3,6,7,4,12,21,39]
<strong>输出：</strong>8
<img style="height: 180px; width: 346px;" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/01/ex3.png" alt="">
</pre>



**提示：** 

1.  *1 <= A.length <= 20000*  
2.  *1 <= A[i] <= 100000* 




# 算法思路

# 测试用例
```
952. Largest Component Size by Common Factor 952. 按公因数计算最大组件大小 Hard
```

[enTitle]: https://leetcode.com/problems/largest-component-size-by-common-factor/
[cnTitle]: https://leetcode-cn.com/problems/largest-component-size-by-common-factor/
