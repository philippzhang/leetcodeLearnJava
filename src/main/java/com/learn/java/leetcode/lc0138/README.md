# [138. Copy List with Random Pointer][enTitle]

**Medium**

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

**deep copy** 



**Example 1:** 

![img](https://discuss.leetcode.com/uploads/files/1470150906153-2yxeznm.png)

```
Input:{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

Explanation:
Node 1's value is 1, both of its next and random pointer points to Node 2.
Node 2's value is 2, its next pointer points to null and its random pointer points to itself.
```



**Note:** 

1. You must return the **copy of the given head**  as a reference to the cloned list.
# [138. 复制带随机指针的链表][cnTitle]

**中等**

给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。

要求返回这个链表的**深拷贝** 。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/1470150906153-2yxeznm.png)

```
输入：{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

解释：节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。

```



**提示：** 

1. 你必须返回**给定头的拷贝** 作为对克隆列表的引用。


# 算法思路

# 测试用例
```
138. Copy List with Random Pointer 138. 复制带随机指针的链表 Medium
Solution.copyRandomList
---
{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

={"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

$disprint
---
null

=null

$disprint
---
{}

={}

$disprint
```

[enTitle]: https://leetcode.com/problems/copy-list-with-random-pointer/
[cnTitle]: https://leetcode-cn.com/problems/copy-list-with-random-pointer/


