# [960. Delete Columns to Make Sorted III][enTitle]

**Hard**

You are given an array of  *n*  strings  *strs* , all of the same length.

We may choose any deletion indices, and we delete all the characters in those indices for each string.

For example, if we have  *strs = ["abcdef","uvwxyz"]*  and deletion indices  *{0, 2, 3}* , then the final array after deletions is  *["bef", "vyz"]* .

Suppose we chose a set of deletion indices  *answer*  such that after deletions, the final array has **every string (row) in lexicographic**  order. (i.e.,  *(strs[0][0] <= strs[0][1] <= ... <= strs[0][strs[0].length - 1])* , and  *(strs[1][0] <= strs[1][1] <= ... <= strs[1][strs[1].length - 1])* , and so on). Return  *the minimum possible value of*   *answer.length* .



**Example 1:** 

```
Input: strs = ["babca","bbazb"]
Output: 3
Explanation: After deleting columns 0, 1, and 4, the final array is strs = ["bc", "az"].
Both these rows are individually in lexicographic order (ie. strs[0][0] <= strs[0][1] and strs[1][0] <= strs[1][1]).
Note that strs[0] > strs[1] - the array strs is not necessarily in lexicographic order.
```

**Example 2:** 

```
Input: strs = ["edcba"]
Output: 4
Explanation: If we delete less than 4 columns, the only row will not be lexicographically sorted.

```

**Example 3:** 

```
Input: strs = ["ghi","def","abc"]
Output: 0
Explanation: All rows are already lexicographically sorted.

```



**Constraints:** 

-  *n == strs.length*  
-  *1 <= n <= 100*  
-  *1 <= strs[i].length <= 100*  
-  *strs[i]*  consists of lowercase English letters.

-  


# [960. 删列造序 III][cnTitle]

**困难**

给定由  *N*  个小写字母字符串组成的数组  *A* ，其中每个字符串长度相等。

选取一个删除索引序列，对于  *A*  中的每个字符串，删除对应每个索引处的字符。

比如，有  *A = ["babca","bbazb"]* ，删除索引序列  *{0, 1, 4}* ，删除后  *A*  为 *["bc","az"]* 。

假设，我们选择了一组删除索引  *D* ，那么在执行删除操作之后，最终得到的数组的行中的每个元素都是按**字典序** 排列的。

清楚起见， *A[0]*  是按字典序排列的（即， *A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1]* ）， *A[1]*  是按字典序排列的（即， *A[1][0] <= A[1][1] <= ... <= A[1][A[1].length - 1]* ），依此类推。

请你返回  *D.length*  的最小可能值。



**示例 1：** 

```
输入：["babca","bbazb"]
输出：3
解释：删除 0、1 和 4 这三列后，最终得到的数组是 A = ["bc", "az"]。
这两行是分别按字典序排列的（即，A[0][0] <= A[0][1] 且 A[1][0] <= A[1][1]）。
注意，A[0] > A[1] —— 数组 A 不一定是按字典序排列的。

```

**示例 2：** 

```
输入：["edcba"]
输出：4
解释：如果删除的列少于 4 列，则剩下的行都不会按字典序排列。

```

**示例 3：** 

```
输入：["ghi","def","abc"]
输出：0
解释：所有行都已按字典序排列。

```



**提示：** 

1.  *1 <= A.length <= 100*  
2.  *1 <= A[i].length <= 100* 




# 算法思路

# 测试用例
```
960. Delete Columns to Make Sorted III 960. 删列造序 III Hard
```

[enTitle]: https://leetcode.com/problems/delete-columns-to-make-sorted-iii/
[cnTitle]: https://leetcode-cn.com/problems/delete-columns-to-make-sorted-iii/
