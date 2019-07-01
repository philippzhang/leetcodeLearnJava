# [117. Populating Next Right Pointers in Each Node II][enTitle]

**Medium**

Given a binary tree

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}

```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to  *NULL* .

Initially, all next pointers are set to  *NULL* .



**Example:** 

![img](https://assets.leetcode.com/uploads/2019/02/15/117_sample.png)

```
Input:{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":null,"next":null,"right":{"$id":"6","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}

Output:{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":null,"right":null,"val":7},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"6","left":null,"next":null,"right":{"$ref":"5"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"6"},"val":1}

Explanation:Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B.

```



**Note:** 

- You may only use constant extra space. 
- Recursive approach is fine, implicit stack space does not count as extra space for this problem.


# [117. 填充每个节点的下一个右侧节点指针 II][cnTitle]

**中等**

给定一个二叉树

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为  *NULL* 。

初始状态下，所有 next 指针都被设置为  *NULL* 。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/15/117_sample.png)

```
输入：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":null,"next":null,"right":{"$id":"6","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}

输出：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":null,"right":null,"val":7},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"6","left":null,"next":null,"right":{"$ref":"5"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"6"},"val":1}

解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
```



**提示：** 

- 你只能使用常量级额外空间。 
- 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。




# 算法思路

# 测试用例
```
117. Populating Next Right Pointers in Each Node II 117. 填充每个节点的下一个右侧节点指针 II Medium
```

[enTitle]: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
[cnTitle]: https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/
