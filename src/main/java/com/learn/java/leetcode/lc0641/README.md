# [641. Design Circular Deque][enTitle]

**Medium**

Design your implementation of the circular double-ended queue (deque).

Your implementation should support following operations:

-  *MyCircularDeque(k)* : Constructor, set the size of the deque to be k. 
-  *insertFront()* : Adds an item at the front of Deque. Return true if the operation is successful. 
-  *insertLast()* : Adds an item at the rear of Deque. Return true if the operation is successful. 
-  *deleteFront()* : Deletes an item from the front of Deque. Return true if the operation is successful. 
-  *deleteLast()* : Deletes an item from the rear of Deque. Return true if the operation is successful. 
-  *getFront()* : Gets the front item from the Deque. If the deque is empty, return -1. 
-  *getRear()* : Gets the last item from Deque. If the deque is empty, return -1. 
-  *isEmpty()* : Checks whether Deque is empty or not.  
-  *isFull()* : Checks whether Deque is full or not.



**Example:** 

```
MyCircularDeque circularDeque = new MycircularDeque(3); // set the size to be 3
circularDeque.insertLast(1);			// return true
circularDeque.insertLast(2);			// return true
circularDeque.insertFront(3);			// return true
circularDeque.insertFront(4);			// return false, the queue is full
circularDeque.getRear();  			// return 2
circularDeque.isFull();				// return true
circularDeque.deleteLast();			// return true
circularDeque.insertFront(4);			// return true
circularDeque.getFront();			// return 4

```



**Note:** 

- All values will be in the range of [0, 1000]. 
- The number of operations will be in the range of [1, 1000]. 
- Please do not use the built-in Deque library.
# [641. 设计循环双端队列][cnTitle]

**中等**

设计实现双端队列。 你的实现需要支持以下操作：

- MyCircularDeque(k)：构造函数,双端队列的大小为k。 
- insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。 
- insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。 
- deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。 
- deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。 
- getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。 
- getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。 
- isEmpty()：检查双端队列是否为空。 
- isFull()：检查双端队列是否满了。

**示例：** 

```
MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
circularDeque.insertLast(1);			        // 返回 true
circularDeque.insertLast(2);			        // 返回 true
circularDeque.insertFront(3);			        // 返回 true
circularDeque.insertFront(4);			        // 已经满了，返回 false
circularDeque.getRear();  				// 返回 2
circularDeque.isFull();				        // 返回 true
circularDeque.deleteLast();			        // 返回 true
circularDeque.insertFront(4);			        // 返回 true
circularDeque.getFront();				// 返回 4
 
```



**提示：** 

- 所有值的范围为 [1, 1000] 
- 操作次数的范围为 [1, 1000] 
- 请不要使用内置的双端队列库。


# 算法思路

# 测试用例
```
641. Design Circular Deque 641. 设计循环双端队列 Medium
Main.funcListTest
---
["MyCircularDeque","insertLast","insertLast","insertFront","insertFront","getRear","isFull","deleteLast","insertFront","getFront"]
[[3],[1],[2],[3],[4],[],[],[],[4],[]]

=[null,true,true,true,false,2,true,true,true,4]
---
["MyCircularDeque","insertFront","getRear","insertFront","getRear","insertLast","getFront","getRear","getFront","insertLast","deleteLast","getFront"]
[[3],[9],[],[9],[],[5],[],[],[],[8],[],[]]

=[null,true,9,true,9,true,9,5,9,false,true,9]
```

[enTitle]: https://leetcode.com/problems/design-circular-deque/
[cnTitle]: https://leetcode-cn.com/problems/design-circular-deque/
