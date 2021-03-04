# [1722. Minimize Hamming Distance After Swap Operations][enTitle]

**Medium**

You are given two integer arrays,  *source*  and  *target* , both of length  *n* . You are also given an array  *allowedSwaps*  where each  *allowedSwaps[i] = [ai, bi]*  indicates that you are allowed to swap the elements at index  *ai*  and index  *bi*  **(0-indexed)**  of array  *source* . Note that you can swap elements at a specific pair of indices **multiple**  times and in **any**  order.

The **Hamming distance**  of two arrays of the same length,  *source*  and  *target* , is the number of positions where the elements are different. Formally, it is the number of indices  *i*  for  *0 <= i <= n-1*  where  *source[i] != target[i]*  **(0-indexed)** .

Return  *the minimum Hamming distance of*  *source*  *and*  *target*  *after performing any amount of swap operations on array*  *source*  *.* 



**Example 1:** 

```
Input: source = [1,2,3,4], target = [2,1,4,5], allowedSwaps = [[0,1],[2,3]]
Output: 1
Explanation: source can be transformed the following way:
- Swap indices 0 and 1: source = [2,1,3,4]
- Swap indices 2 and 3: source = [2,1,4,3]
The Hamming distance of source and target is 1 as they differ in 1 position: index 3.

```

**Example 2:** 

```
Input: source = [1,2,3,4], target = [1,3,2,4], allowedSwaps = []
Output: 2
Explanation: There are no allowed swaps.
The Hamming distance of source and target is 2 as they differ in 2 positions: index 1 and index 2.

```

**Example 3:** 

```
Input: source = [5,1,2,4,3], target = [1,5,4,2,3], allowedSwaps = [[0,4],[4,2],[1,3],[1,4]]
Output: 0

```



**Constraints:** 

-  *n == source.length == target.length*  
-  *1 <= n <= 105*  
-  *1 <= source[i], target[i] <= 105*  
-  *0 <= allowedSwaps.length <= 105*  
-  *allowedSwaps[i].length == 2*  
-  *0 <= ai, bi <= n - 1*  
-  *ai != bi* 


# [1722. 执行交换操作后的最小汉明距离][cnTitle]

**中等**

给你两个整数数组  *source*  和  *target*  ，长度都是  *n*  。还有一个数组  *allowedSwaps*  ，其中每个  *allowedSwaps[i] = [ai, bi]*  表示你可以交换数组  *source*  中下标为  *ai*  和  *bi* （**下标从 0 开始** ）的两个元素。注意，你可以按 **任意**  顺序 **多次**  交换一对特定下标指向的元素。

相同长度的两个数组  *source*  和  *target*  间的 **汉明距离**  是元素不同的下标数量。形式上，其值等于满足  *source[i] != target[i]*  （**下标从 0 开始** ）的下标  *i* （ *0 <= i <= n-1* ）的数量。

在对数组  *source*  执行 **任意**  数量的交换操作后，返回  *source*  和  *target*  间的 **最小汉明距离**  。



**示例 1：** 

```
输入：source = [1,2,3,4], target = [2,1,4,5], allowedSwaps = [[0,1],[2,3]]
输出：1
解释：source 可以按下述方式转换：
- 交换下标 0 和 1 指向的元素：source = [2,1,3,4]
- 交换下标 2 和 3 指向的元素：source = [2,1,4,3]
source 和 target 间的汉明距离是 1 ，二者有 1 处元素不同，在下标 3 。

```

**示例 2：** 

```
输入：source = [1,2,3,4], target = [1,3,2,4], allowedSwaps = []
输出：2
解释：不能对 source 执行交换操作。
source 和 target 间的汉明距离是 2 ，二者有 2 处元素不同，在下标 1 和下标 2 。
```

**示例 3：** 

```
输入：source = [5,1,2,4,3], target = [1,5,4,2,3], allowedSwaps = [[0,4],[4,2],[1,3],[1,4]]
输出：0

```



**提示：** 

-  *n == source.length == target.length*  
-  *1 <= n <= 105*  
-  *1 <= source[i], target[i] <= 105*  
-  *0 <= allowedSwaps.length <= 105*  
-  *allowedSwaps[i].length == 2*  
-  *0 <= ai, bi <= n - 1*  
-  *ai != bi* 




# 算法思路

# 测试用例
```
1722. Minimize Hamming Distance After Swap Operations 1722. 执行交换操作后的最小汉明距离 Medium
```

[enTitle]: https://leetcode.com/problems/minimize-hamming-distance-after-swap-operations/
[cnTitle]: https://leetcode-cn.com/problems/minimize-hamming-distance-after-swap-operations/
