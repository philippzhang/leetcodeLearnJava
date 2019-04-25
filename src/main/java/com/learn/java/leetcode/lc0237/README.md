# [237. Delete Node in a Linked List][enTitle]

**Easy**

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9], which looks like following:

![img](https://assets.leetcode.com/uploads/2018/12/28/237_example.png)



**Example 1:** 

```
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation:You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

```

**Example 2:** 

```
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation:You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

```



**Note:** 

- The linked list will have at least two elements. 
- All of the nodes' values will be unique. 
- The given node will not be the tail and it will always be a valid node of the linked list. 
- Do not return anything from your function.
# [237. 删除链表中的节点][cnTitle]

**简单**

请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

现有一个链表 -- head = [4,5,1,9]，它可以表示为:

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/01/19/237_example.png)



**示例 1:** 

```
输入: head = [4,5,1,9], node = 5
输出: [4,1,9]
解释:给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

```

**示例 2:** 

```
输入: head = [4,5,1,9], node = 1
输出: [4,5,9]
解释:给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.

```



**说明:** 

- 链表至少包含两个节点。 
- 链表中所有节点的值都是唯一的。 
- 给定的节点为非末尾节点并且一定是链表中的一个有效节点。 
- 不要从你的函数中返回任何结果。


# 算法思路

# 测试用例
```
237. Delete Node in a Linked List 237. 删除链表中的节点 Easy
Solution.deleteNode
---
[4,5,1,9]
5

I0=[4,1,9]
```

[enTitle]: https://leetcode.com/problems/delete-node-in-a-linked-list/
[cnTitle]: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/






