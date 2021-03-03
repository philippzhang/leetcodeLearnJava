# [988. Smallest String Starting From Leaf][enTitle]

**Medium**

Given the  *root*  of a binary tree, each node has a value from  *0*  to  *25*  representing the letters  *'a'*  to  *'z'* : a value of  *0*  represents  *'a'* , a value of  *1*  represents  *'b'* , and so on.

Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

 *(As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is lexicographically smaller than "aba". A leaf of a node is a node that has no children.)* 












**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/01/30/tree1.png)

```
Input:[0,1,2,3,4,3,4]
Output: "dba"
```


**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/01/30/tree2.png)

```
Input:[25,1,3,1,3,0,2]
Output: "adz"
```


**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/02/01/tree3.png)

```
Input:[2,2,1,null,1,0,null,0]
Output: "abc"
```



**Note:** 

1. The number of nodes in the given tree will be between  *1*  and  *8500* . 
2. Each node in the tree will have a value between  *0*  and  *25* .








# [988. 从叶结点开始的最小字符串][cnTitle]

**中等**

给定一颗根结点为  *root*  的二叉树，树中的每一个结点都有一个从  *0*  到  *25*  的值，分别代表字母  *'a'*  到  *'z'* ：值  *0*  代表  *'a'* ，值  *1*  代表  *'b'* ，依此类推。

找出按字典序最小的字符串，该字符串从这棵树的一个叶结点开始，到根结点结束。

 *（小贴士：字符串中任何较短的前缀在字典序上都是较小的：例如，在字典序上 "ab" 比 "aba" 要小。叶结点是指没有子结点的结点。）* 





**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/02/tree1.png)

```
输入：[0,1,2,3,4,3,4]
输出："dba"

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/02/tree2.png)

```
输入：[25,1,3,1,3,0,2]
输出："adz"

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/02/tree3.png)

```
输入：[2,2,1,null,1,0,null,0]
输出："abc"

```



**提示：** 

1. 给定树的结点数介于  *1*  和  *8500*  之间。 
2. 树中的每个结点都有一个介于  *0*  和  *25*  之间的值。




# 算法思路

# 测试用例
```
988. Smallest String Starting From Leaf 988. 从叶结点开始的最小字符串 Medium
```

[enTitle]: https://leetcode.com/problems/smallest-string-starting-from-leaf/
[cnTitle]: https://leetcode-cn.com/problems/smallest-string-starting-from-leaf/
