# [946. Validate Stack Sequences][enTitle]

**Medium**

Given two sequences  *pushed*  and  *popped*  **with distinct values** , return  *true*  if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.




**Example 1:** 

```
Input:pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
```


**Example 2:** 

```
Input:pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
```



**Note:** 

1.  *0 <= pushed.length == popped.length <= 1000*  
2.  *0 <= pushed[i], popped[i] < 1000*  
3.  *pushed*  is a permutation of  *popped* . 
4.  *pushed*  and  *popped*  have distinct values.




# [946. 验证栈序列][cnTitle]

**中等**

给定  *pushed*  和  *popped*  两个序列，只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回  *true* ；否则，返回  *false*  。



**示例 1：** 

```
输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
输出：true
解释：我们可以按以下顺序执行：
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

```

**示例 2：** 

```
输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
输出：false
解释：1 不能在 2 之前弹出。

```



**提示：** 

1.  *0 <= pushed.length == popped.length <= 1000*  
2.  *0 <= pushed[i], popped[i] < 1000*  
3.  *pushed*  是  *popped*  的排列。


# 算法思路

# 测试用例
```
946. Validate Stack Sequences 946. 验证栈序列 Medium
Solution.validateStackSequences
---
[1,2,3,4,5]
[4,5,3,2,1]
=true
---
[1,2,3,4,5]
[4,3,5,1,2]
=false
```

[enTitle]: https://leetcode.com/problems/validate-stack-sequences/
[cnTitle]: https://leetcode-cn.com/problems/validate-stack-sequences/
