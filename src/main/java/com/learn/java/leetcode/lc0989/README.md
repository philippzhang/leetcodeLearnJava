# [989. Add to Array-Form of Integer][enTitle]

**Easy**

For a non-negative integer  *X* , the <em>array-form of  *X* </em> is an array of its digits in left to right order. For example, if  *X = 1231* , then the array form is  *[1,2,3,1]* .

Given the array-form  *A*  of a non-negative integer  *X* , return the array-form of the integer  *X+K* .






**Example 1:** 

```
Input:A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
```


**Example 2:** 

```
Input:A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
```


**Example 3:** 

```
Input:A = [2,1,5], K = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
```


**Example 4:** 

```
Input:A = [9,9,9,9,9,9,9,9,9,9], K = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000
```



**Note：** 

1.  *1 <= A.length <= 10000*  
2.  *0 <= A[i] <= 9*  
3.  *0 <= K <= 10000*  
4. If  *A.length > 1* , then  *A[0] != 0* 










# [989. 数组形式的整数加法][cnTitle]

**简单**

对于非负整数  *X*  而言，<em> *X* </em> 的 *数组形式* 是每位数字按从左到右的顺序形成的数组。例如，如果  *X = 1231* ，那么其数组形式为  *[1,2,3,1]* 。

给定非负整数  *X*  的数组形式  *A* ，返回整数  *X+K*  的数组形式。





**示例 1：** 

```
输入：A = [1,2,0,0], K = 34
输出：[1,2,3,4]
解释：1200 + 34 = 1234

```

**示例 2：** 

```
输入：A = [2,7,4], K = 181
输出：[4,5,5]
解释：274 + 181 = 455

```

**示例 3：** 

```
输入：A = [2,1,5], K = 806
输出：[1,0,2,1]
解释：215 + 806 = 1021

```

**示例 4：** 

```
输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
输出：[1,0,0,0,0,0,0,0,0,0,0]
解释：9999999999 + 1 = 10000000000

```



**提示：** 

1.  *1 <= A.length <= 10000*  
2.  *0 <= A[i] <= 9*  
3.  *0 <= K <= 10000*  
4. 如果  *A.length > 1* ，那么  *A[0] != 0* 




# 算法思路

# 测试用例
```
989. Add to Array-Form of Integer 989. 数组形式的整数加法 Easy
```

[enTitle]: https://leetcode.com/problems/add-to-array-form-of-integer/
[cnTitle]: https://leetcode-cn.com/problems/add-to-array-form-of-integer/
