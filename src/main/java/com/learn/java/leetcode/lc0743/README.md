# [743. Network Delay Time][enTitle]

**Medium**

You are given a network of  *n*  nodes, labeled from  *1*  to  *n* . You are also given  *times* , a list of travel times as directed edges  *times[i] = (ui, vi, wi)* , where  *ui*  is the source node,  *vi*  is the target node, and  *wi*  is the time it takes for a signal to travel from source to target.

We will send a signal from a given node  *k* . Return the time it takes for all the  *n*  nodes to receive the signal. If it is impossible for all the  *n*  nodes to receive the signal, return  *-1* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/05/23/931_example_1.png)

```
Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2

```

**Example 2:** 

```
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1

```

**Example 3:** 

```
Input: times = [[1,2,1]], n = 2, k = 2
Output: -1

```



**Constraints:** 

-  *1 <= k <= n <= 100*  
-  *1 <= times.length <= 6000*  
-  *times[i].length == 3*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *0 <= wi <= 100*  
- All the pairs  *(ui, vi)*  are **unique** . (i.e., no multiple edges.)


# [743. 网络延迟时间][cnTitle]

**中等**

有  *n*  个网络节点，标记为  *1*  到  *n* 。

给你一个列表  *times* ，表示信号经过 **有向**  边的传递时间。  *times[i] = (ui, vi, wi)* ，其中  *ui*  是源节点， *vi*  是目标节点，  *wi*  是一个信号从源节点传递到目标节点的时间。

现在，从某个节点  *K*  发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回  *-1*  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2019/05/23/931_example_1.png)

```
输入：times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
输出：2

```

**示例 2：** 

```
输入：times = [[1,2,1]], n = 2, k = 1
输出：1

```

**示例 3：** 

```
输入：times = [[1,2,1]], n = 2, k = 2
输出：-1

```



**提示：** 

-  *1 <= k <= n <= 100*  
-  *1 <= times.length <= 6000*  
-  *times[i].length == 3*  
-  *1 <= ui, vi <= n*  
-  *ui != vi*  
-  *0 <= wi <= 100*  
- 所有  *(ui, vi)*  对都 **互不相同** （即，不含重复边）




# 算法思路

# 测试用例
```
743. Network Delay Time 743. 网络延迟时间 Medium
```

[enTitle]: https://leetcode.com/problems/network-delay-time/
[cnTitle]: https://leetcode-cn.com/problems/network-delay-time/
