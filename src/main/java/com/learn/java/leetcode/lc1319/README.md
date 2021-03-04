# [1319. Number of Operations to Make Network Connected][enTitle]

**Medium**

There are  *n*  computers numbered from  *0*  to  *n-1*  connected by ethernet cables  *connections*  forming a network where  *connections[i] = [a, b]*  represents a connection between computers  *a*  and  *b* . Any computer can reach any other computer directly or indirectly through the network.

Given an initial computer network  *connections* . You can extract certain cables between two directly connected computers, and place them between any pair of disconnected computers to make them directly connected. Return the  *minimum number of times*  you need to do this in order to make all the computers connected. If it's not possible, return -1.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/02/sample_1_1677.png)

```
Input: n = 4, connections = [[0,1],[0,2],[1,2]]
Output: 1
Explanation: Remove cable between computer 1 and 2 and place between computers 1 and 3.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/02/sample_2_1677.png)

```
Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
Output: 2

```

**Example 3:** 

```
Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
Output: -1
Explanation: There are not enough cables.

```

**Example 4:** 

```
Input: n = 5, connections = [[0,1],[0,2],[3,4],[2,3]]
Output: 0

```



**Constraints:** 

-  *1 <= n <= 10^5*  
-  *1 <= connections.length <= min(n*(n-1)/2, 10^5)*  
-  *connections[i].length == 2*  
-  *0 <= connections[i][0], connections[i][1] < n*  
-  *connections[i][0] != connections[i][1]*  
- There are no repeated connections. 
- No two computers are connected by more than one cable.


# [1319. 连通网络的操作次数][cnTitle]

**中等**

用以太网线缆将  *n*  台计算机连接成一个网络，计算机的编号从  *0*  到  *n-1* 。线缆用  *connections*  表示，其中  *connections[i] = [a, b]*  连接了计算机  *a*  和  *b* 。

网络中的任何一台计算机都可以通过网络直接或者间接访问同一个网络中其他任意一台计算机。

给你这个计算机网络的初始布线  *connections* ，你可以拔开任意两台直连计算机之间的线缆，并用它连接一对未直连的计算机。请你计算并返回使所有计算机都连通所需的最少操作次数。如果不可能，则返回 -1 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/11/sample_1_1677.png)

```
输入：n = 4, connections = [[0,1],[0,2],[1,2]]
输出：1
解释：拔下计算机 1 和 2 之间的线缆，并将它插到计算机 1 和 3 上。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/11/sample_2_1677.png)

```
输入：n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
输出：2

```

**示例 3：** 

```
输入：n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
输出：-1
解释：线缆数量不足。

```

**示例 4：** 

```
输入：n = 5, connections = [[0,1],[0,2],[3,4],[2,3]]
输出：0

```



**提示：** 

-  *1 <= n <= 10^5*  
-  *1 <= connections.length <= min(n*(n-1)/2, 10^5)*  
-  *connections[i].length == 2*  
-  *0 <= connections[i][0], connections[i][1] < n*  
-  *connections[i][0] != connections[i][1]*  
- 没有重复的连接。 
- 两台计算机不会通过多条线缆连接。




# 算法思路

# 测试用例
```
1319. Number of Operations to Make Network Connected 1319. 连通网络的操作次数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-operations-to-make-network-connected/
[cnTitle]: https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/
