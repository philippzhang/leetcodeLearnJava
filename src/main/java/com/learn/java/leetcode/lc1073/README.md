# [1073. Adding Two Negabinary Numbers][enTitle]

**Medium**

Given two numbers  *arr1*  and  *arr2*  in base **-2** , return the result of adding them together.

Each number is given in  *array format* : as an array of 0s and 1s, from most significant bit to least significant bit. For example,  *arr = [1,1,0,1]*  represents the number  *(-2)^3 + (-2)^2 + (-2)^0 = -3* . A number  *arr*  in  *array, format*  is also guaranteed to have no leading zeros: either  *arr == [0]*  or  *arr[0] == 1* .

Return the result of adding  *arr1*  and  *arr2*  in the same format: as an array of 0s and 1s with no leading zeros.



**Example 1:** 

```
Input: arr1 = [1,1,1,1,1], arr2 = [1,0,1]
Output: [1,0,0,0,0]
Explanation:arr1 represents 11, arr2 represents 5, the output represents 16.

```

**Example 2:** 

```
Input: arr1 = [0], arr2 = [0]
Output: [0]

```

**Example 3:** 

```
Input: arr1 = [0], arr2 = [1]
Output: [1]

```



**Constraints:** 

-  *1 <= arr1.length, arr2.length <= 1000*  
-  *arr1[i]*  and  *arr2[i]*  are  *0*  or  *1*  
-  *arr1*  and  *arr2*  have no leading zeros


# [1073. 负二进制数相加][cnTitle]

**中等**

给出基数为 **-2**  的两个数  *arr1*  和  *arr2* ，返回两数相加的结果。

数字以 **数组形式** 给出：数组由若干 0 和 1 组成，按最高有效位到最低有效位的顺序排列。例如， *arr = [1,1,0,1]*  表示数字  *(-2)^3 + (-2)^2 + (-2)^0 = -3* 。**数组形式** 的数字也同样不含前导零：以  *arr*  为例，这意味着要么  *arr == [0]* ，要么  *arr[0] == 1* 。

返回相同表示形式的  *arr1*  和  *arr2*  相加的结果。两数的表示形式为：不含前导零、由若干 0 和 1 组成的数组。



**示例：** 

```
输入：arr1 = [1,1,1,1,1], arr2 = [1,0,1]
输出：[1,0,0,0,0]
解释：arr1 表示 11，arr2 表示 5，输出表示 16 。

```



**提示：** 

1.  *1 <= arr1.length <= 1000*  
2.  *1 <= arr2.length <= 1000*  
3.  *arr1*  和  *arr2*  都不含前导零 
4.  *arr1[i]*  为  *0*  或  *1*  
5.  *arr2[i]*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1073. Adding Two Negabinary Numbers 1073. 负二进制数相加 Medium
```

[enTitle]: https://leetcode.com/problems/adding-two-negabinary-numbers/
[cnTitle]: https://leetcode-cn.com/problems/adding-two-negabinary-numbers/
