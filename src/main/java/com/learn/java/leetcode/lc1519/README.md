# [1519. Number of Nodes in the Sub-Tree With the Same Label][enTitle]

**Medium**

Given a tree (i.e. a connected, undirected graph that has no cycles) consisting of  *n*  nodes numbered from  *0*  to  *n - 1*  and exactly  *n - 1*   *edges* . The **root**  of the tree is the node  *0* , and each node of the tree has **a label**  which is a lower-case character given in the string  *labels*  (i.e. The node with the number  *i*  has the label  *labels[i]* ).

The  *edges*  array is given on the form  *edges[i] = [ai, bi]* , which means there is an edge between nodes  *ai*  and  *bi*  in the tree.

Return  *an array of size n*  where  *ans[i]*  is the number of nodes in the subtree of the  *ith*  node which have the same label as node  *i* .

A subtree of a tree  *T*  is the tree consisting of a node in  *T*  and all of its descendant nodes.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/07/01/q3e1.jpg)

```
Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], labels = "abaedcd"
Output: [2,1,1,1,1,1,1]
Explanation: Node 0 has label 'a' and its sub-tree has node 2 with label 'a' as well, thus the answer is 2. Notice that any node is part of its sub-tree.
Node 1 has a label 'b'. The sub-tree of node 1 contains nodes 1,4 and 5, as nodes 4 and 5 have different labels than node 1, the answer is just 1 (the node itself).

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/07/01/q3e2.jpg)

```
Input: n = 4, edges = [[0,1],[1,2],[0,3]], labels = "bbbb"
Output: [4,2,1,1]
Explanation: The sub-tree of node 2 contains only node 2, so the answer is 1.
The sub-tree of node 3 contains only node 3, so the answer is 1.
The sub-tree of node 1 contains nodes 1 and 2, both have label 'b', thus the answer is 2.
The sub-tree of node 0 contains nodes 0, 1, 2 and 3, all with label 'b', thus the answer is 4.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/07/01/q3e3.jpg)

```
Input: n = 5, edges = [[0,1],[0,2],[1,3],[0,4]], labels = "aabab"
Output: [3,2,1,1,1]

```

**Example 4:** 

```
Input: n = 6, edges = [[0,1],[0,2],[1,3],[3,4],[4,5]], labels = "cbabaa"
Output: [1,2,1,1,2,1]

```

**Example 5:** 

```
Input: n = 7, edges = [[0,1],[1,2],[2,3],[3,4],[4,5],[5,6]], labels = "aaabaaa"
Output: [6,5,4,1,3,2,1]

```



**Constraints:** 

-  *1 <= n <= 10^5*  
-  *edges.length == n - 1*  
-  *edges[i].length == 2*  
-  *0 <= ai, bi < n*  
-  *ai != bi*  
-  *labels.length == n*  
-  *labels*  is consisting of only of lower-case English letters.


# [1519. 子树中标签相同的节点数][cnTitle]

**中等**

给你一棵树（即，一个连通的无环无向图），这棵树由编号从  *0*  到  *n - 1*  的 n 个节点组成，且恰好有  *n - 1*  条  *edges*  。树的根节点为节点  *0*  ，树上的每一个节点都有一个标签，也就是字符串  *labels*  中的一个小写字符（编号为  *i*  的 节点的标签就是  *labels[i]*  ）

边数组  *edges*  以  *edges[i] = [ai, bi]*  的形式给出，该格式表示节点  *ai*  和  *bi*  之间存在一条边。

返回一个大小为  *n*  的数组，其中  *ans[i]*  表示第  *i*  个节点的子树中与节点  *i*  标签相同的节点数。

树  *T*  中的子树是由  *T*  中的某个节点及其所有后代节点组成的树。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/19/q3e1.jpg)

```
输入：n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], labels = "abaedcd"
输出：[2,1,1,1,1,1,1]
解释：节点 0 的标签为 'a' ，以 'a' 为根节点的子树中，节点 2 的标签也是 'a' ，因此答案为 2 。注意树中的每个节点都是这棵子树的一部分。
节点 1 的标签为 'b' ，节点 1 的子树包含节点 1、4 和 5，但是节点 4、5 的标签与节点 1 不同，故而答案为 1（即，该节点本身）。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/19/q3e2.jpg)

```
输入：n = 4, edges = [[0,1],[1,2],[0,3]], labels = "bbbb"
输出：[4,2,1,1]
解释：节点 2 的子树中只有节点 2 ，所以答案为 1 。
节点 3 的子树中只有节点 3 ，所以答案为 1 。
节点 1 的子树中包含节点 1 和 2 ，标签都是 'b' ，因此答案为 2 。
节点 0 的子树中包含节点 0、1、2 和 3，标签都是 'b'，因此答案为 4 。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/19/q3e3.jpg)

```
输入：n = 5, edges = [[0,1],[0,2],[1,3],[0,4]], labels = "aabab"
输出：[3,2,1,1,1]

```

**示例 4：** 

```
输入：n = 6, edges = [[0,1],[0,2],[1,3],[3,4],[4,5]], labels = "cbabaa"
输出：[1,2,1,1,2,1]

```

**示例 5：** 

```
输入：n = 7, edges = [[0,1],[1,2],[2,3],[3,4],[4,5],[5,6]], labels = "aaabaaa"
输出：[6,5,4,1,3,2,1]

```



**提示：** 

-  *1 <= n <= 10^5*  
-  *edges.length == n - 1*  
-  *edges[i].length == 2*  
-  *0 <= ai, bi < n*  
-  *ai != bi*  
-  *labels.length == n*  
-  *labels*  仅由小写英文字母组成




# 算法思路

# 测试用例
```
1519. Number of Nodes in the Sub-Tree With the Same Label 1519. 子树中标签相同的节点数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/
[cnTitle]: https://leetcode-cn.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/
