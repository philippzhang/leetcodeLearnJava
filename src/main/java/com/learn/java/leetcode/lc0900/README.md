# [900. RLE Iterator][enTitle]

**Medium**

Write an iterator that iterates through a run-length encoded sequence.

The iterator is initialized by  *RLEIterator(int[] A)* , where  *A*  is a run-length encoding of some sequence. More specifically, for all even  *i* ,  *A[i]*  tells us the number of times that the non-negative integer value  *A[i+1]*  is repeated in the sequence.

The iterator supports one function:  *next(int n)* , which exhausts the next  *n*  elements ( *n >= 1* ) and returns the last element exhausted in this way. If there is no element left to exhaust,  *next*  returns  *-1*  instead.

For example, we start with  *A = [3,8,0,9,2,5]* , which is a run-length encoding of the sequence  *[8,8,8,5,5]* . This is because the sequence can be read as "three eights, zero nines, two fives".



**Example 1:** 

```
Input:["RLEIterator","next","next","next","next"], [[[3,8,0,9,2,5]],[2],[1],[1],[2]]
Output: [null,8,8,5,-1]
Explanation: 
RLEIterator is initialized with RLEIterator([3,8,0,9,2,5]).
This maps to the sequence [8,8,8,5,5].
RLEIterator.next is then called 4 times:

.next(2) exhausts 2 terms of the sequence, returning 8.  The remaining sequence is now [8, 5, 5].

.next(1) exhausts 1 term of the sequence, returning 8.  The remaining sequence is now [5, 5].

.next(1) exhausts 1 term of the sequence, returning 5.  The remaining sequence is now [5].

.next(2) exhausts 2 terms, returning -1.  This is because the first term exhausted was 5,
but the second term did not exist.  Since the last term exhausted does not exist, we return -1.
```

**Note:** 

1.  *0 <= A.length <= 1000*  
2.  *A.length*  is an even integer. 
3.  *0 <= A[i] <= 10^9*  
4. There are at most  *1000*  calls to  *RLEIterator.next(int n)*  per test case. 
5. Each call to  *RLEIterator.next(int n)*  will have  *1 <= n <= 10^9* .


# [900. RLE 迭代器][cnTitle]

**中等**

编写一个遍历游程编码序列的迭代器。

迭代器由  *RLEIterator(int[] A)*  初始化，其中  *A*  是某个序列的游程编码。更具体地，对于所有偶数  *i* ， *A[i]*  告诉我们在序列中重复非负整数值  *A[i + 1]*  的次数。

迭代器支持一个函数： *next(int n)* ，它耗尽接下来的  *n*  个元素（ *n >= 1* ）并返回以这种方式耗去的最后一个元素。如果没有剩余的元素可供耗尽，则  *next*  返回  *-1*  。

例如，我们以  *A = [3,8,0,9,2,5]*  开始，这是序列  *[8,8,8,5,5]*  的游程编码。这是因为该序列可以读作 “三个八，零个九，两个五”。



**示例：** 

```
输入：["RLEIterator","next","next","next","next"], [[[3,8,0,9,2,5]],[2],[1],[1],[2]]
输出：[null,8,8,5,-1]
解释：
RLEIterator 由 RLEIterator([3,8,0,9,2,5]) 初始化。
这映射到序列 [8,8,8,5,5]。
然后调用 RLEIterator.next 4次。

.next(2) 耗去序列的 2 个项，返回 8。现在剩下的序列是 [8, 5, 5]。

.next(1) 耗去序列的 1 个项，返回 8。现在剩下的序列是 [5, 5]。

.next(1) 耗去序列的 1 个项，返回 5。现在剩下的序列是 [5]。

.next(2) 耗去序列的 2 个项，返回 -1。 这是由于第一个被耗去的项是 5，
但第二个项并不存在。由于最后一个要耗去的项不存在，我们返回 -1。

```



**提示：** 

1.  *0 <= A.length <= 1000*  
2.  *A.length*  是偶数。 
3.  *0 <= A[i] <= 10^9*  
4. 每个测试用例最多调用  *1000*  次  *RLEIterator.next(int n)* 。 
5. 每次调用  *RLEIterator.next(int n)*  都有  *1 <= n <= 10^9*  。




# 算法思路

# 测试用例
```
900. RLE Iterator 900. RLE 迭代器 Medium
```

[enTitle]: https://leetcode.com/problems/rle-iterator/
[cnTitle]: https://leetcode-cn.com/problems/rle-iterator/
