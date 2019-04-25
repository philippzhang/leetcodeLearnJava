# [707. Design Linked List][enTitle]

**Easy**

Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes:  *val*  and  *next* .  *val*  is the value of the current node, and  *next*  is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute  *prev*  to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement these functions in your linked list class:

- get(index) : Get the value of the  *index* -th node in the linked list. If the index is invalid, return  *-1* . 
- addAtHead(val) : Add a node of value  *val*  before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. 
- addAtTail(val) : Append a node of value  *val*  to the last element of the linked list. 
- addAtIndex(index, val) : Add a node of value  *val*  before the  *index* -th node in the linked list. If  *index*  equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. 
- deleteAtIndex(index) : Delete the  *index* -th node in the linked list, if the index is valid.

**Example:** 

```
MyLinkedList linkedList = new MyLinkedList();
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
linkedList.get(1);            // returns 2
linkedList.deleteAtIndex(1);  // now the linked list is 1->3
linkedList.get(1);            // returns 3

```

**Note:** 

- All values will be in the range of  *[1, 1000]* . 
- The number of operations will be in the range of  *[1, 1000]* . 
- Please do not use the built-in LinkedList library.
# [707. 设计链表][cnTitle]

**简单**

设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性： *val*  和  *next* 。 *val*  是当前节点的值， *next*  是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性  *prev*  以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。

在链表类中实现这些功能：

- get(index)：获取链表中第  *index*  个节点的值。如果索引无效，则返回 *-1* 。 
- addAtHead(val)：在链表的第一个元素之前添加一个值为  *val*  的节点。插入后，新节点将成为链表的第一个节点。 
- addAtTail(val)：将值为  *val*  的节点追加到链表的最后一个元素。 
- addAtIndex(index,val)：在链表中的第  *index*  个节点之前添加值为  *val*  的节点。如果  *index*  等于链表的长度，则该节点将附加到链表的末尾。如果  *index*  大于链表长度，则不会插入节点。 
- deleteAtIndex(index)：如果索引  *index*  有效，则删除链表中的第  *index*  个节点。



**示例：** 

```
MyLinkedList linkedList = new MyLinkedList();
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
linkedList.get(1);            //返回2
linkedList.deleteAtIndex(1);  //现在链表是1-> 3
linkedList.get(1);            //返回3

```



**提示：** 

- 所有值都在  *[1, 1000]*  之内。 
- 操作次数将在  *[1, 1000]*  之内。 
- 请不要使用内置的 LinkedList 库。


# 算法思路

# 测试用例
```
707. Design Linked List 707. 设计链表 Easy
Main.funcListTest
---
["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[1],[1]]

=[null,null,null,null,2,null,3]
```

[enTitle]: https://leetcode.com/problems/design-linked-list/
[cnTitle]: https://leetcode-cn.com/problems/design-linked-list/






