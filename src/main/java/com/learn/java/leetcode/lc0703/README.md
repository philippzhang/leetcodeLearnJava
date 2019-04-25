# [703. Kth Largest Element in a Stream][enTitle]

**Easy**

Design a class to find the **k** th largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Your  *KthLargest*  class will have a constructor which accepts an integer  *k*  and an integer array  *nums* , which contains initial elements from the stream. For each call to the method  *KthLargest.add* , return the element representing the kth largest element in the stream.

**Example:** 

```
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8

```

**Note:**  You may assume that  *nums* ' length ≥  *k-1*  and  *k*  ≥ 1.
# [703. 数据流中的第K大元素][cnTitle]

**简单**

设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。

你的  *KthLargest*  类需要一个同时接收整数  *k*  和整数数组 *nums*  的构造器，它包含数据流中的初始元素。每次调用  *KthLargest.add* ，返回当前数据流中第K大的元素。

**示例:** 

```
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8

```

**说明:**  你可以假设  *nums*  的长度≥  *k-1*  且 *k*  ≥ 1。


# 算法思路

# 测试用例
```
703. Kth Largest Element in a Stream 703. 数据流中的第K大元素 Easy
Main.funcListTest
---
["KthLargest","add","add","add","add","add"]
[[3,[4,5,8,2]],[3],[5],[10],[9],[4]]

=[null,4,5,5,8,8]
```

[enTitle]: https://leetcode.com/problems/kth-largest-element-in-a-stream/
[cnTitle]: https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
