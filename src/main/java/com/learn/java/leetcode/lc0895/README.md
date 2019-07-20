# [895. Maximum Frequency Stack][enTitle]

**Hard**

Implement  *FreqStack* , a class which simulates the operation of a stack-like data structure.

 *FreqStack*  has two functions:

-  *push(int x)* , which pushes an integer  *x*  onto the stack. 
-  *pop()* , which **removes**  and returns the most frequent element in the stack. 
 <ul> 
  - If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned. 
 </ul> 



**Example 1:** 

```
Input:
["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
Output: [null,null,null,null,null,null,null,5,7,5,4]
Explanation:
After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:

pop() -> returns 5, as 5 is the most frequent.
The stack becomes [5,7,5,7,4].

pop() -> returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
The stack becomes [5,7,5,4].

pop() -> returns 5.
The stack becomes [5,7,4].

pop() -> returns 4.
The stack becomes [5,7].
```



**Note:** 

- Calls to  *FreqStack.push(int x)*  will be such that  *0 <= x <= 10^9* . 
- It is guaranteed that  *FreqStack.pop()*  won't be called if the stack has zero elements. 
- The total number of  *FreqStack.push*  calls will not exceed  *10000*  in a single test case. 
- The total number of  *FreqStack.pop*  calls will not exceed  *10000*  in a single test case. 
- The total number of  *FreqStack.push*  and  *FreqStack.pop*  calls will not exceed  *150000*  across all test cases.







# [895. 最大频率栈][cnTitle]

**困难**

实现  *FreqStack* ，模拟类似栈的数据结构的操作的一个类。

 *FreqStack*  有两个函数：

-  *push(int x)* ，将整数  *x*  推入栈中。 
-  *pop()* ，它**移除** 并返回栈中出现最频繁的元素。 
 <ul> 
  - 如果最频繁的元素不只一个，则移除并返回最接近栈顶的元素。 
 </ul> 



**示例：** 

```
输入：
["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
输出：[null,null,null,null,null,null,null,5,7,5,4]
解释：
执行六次 .push 操作后，栈自底向上为 [5,7,5,7,4,5]。然后：

pop() -> 返回 5，因为 5 是出现频率最高的。
栈变成 [5,7,5,7,4]。

pop() -> 返回 7，因为 5 和 7 都是频率最高的，但 7 最接近栈顶。
栈变成 [5,7,5,4]。

pop() -> 返回 5 。
栈变成 [5,7,4]。

pop() -> 返回 4 。
栈变成 [5,7]。

```



**提示：** 

- 对  *FreqStack.push(int x)*  的调用中  *0 <= x <= 10^9* 。 
- 如果栈的元素数目为零，则保证不会调用  *FreqStack.pop()* 。 
- 单个测试样例中，对  *FreqStack.push*  的总调用次数不会超过  *10000* 。 
- 单个测试样例中，对  *FreqStack.pop*  的总调用次数不会超过  *10000* 。 
- 所有测试样例中，对  *FreqStack.push*  和  *FreqStack.pop*  的总调用次数不会超过  *150000* 。






# 算法思路

# 测试用例
```
895. Maximum Frequency Stack 895. 最大频率栈 Hard
Main.funcListTest
---
["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"]
[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]

=[null,null,null,null,null,null,null,5,7,5,4]
```

[enTitle]: https://leetcode.com/problems/maximum-frequency-stack/
[cnTitle]: https://leetcode-cn.com/problems/maximum-frequency-stack/
