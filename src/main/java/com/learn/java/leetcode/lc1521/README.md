# [1521. Find a Value of a Mysterious Function Closest to Target][enTitle]

**Hard**

![img](https://assets.leetcode.com/uploads/2020/07/09/change.png)

Winston was given the above mysterious function  *func* . He has an integer array  *arr*  and an integer  *target*  and he wants to find the values  *l*  and  *r*  that make the value  *|func(arr, l, r) - target|*  minimum possible.

Return  *the minimum possible value*  of  *|func(arr, l, r) - target|* .

Notice that  *func*  should be called with the values  *l*  and  *r*  where  *0 <= l, r < arr.length* .



**Example 1:** 

```
Input: arr = [9,12,3,7,15], target = 5
Output: 2
Explanation: Calling func with all the pairs of [l,r] = [[0,0],[1,1],[2,2],[3,3],[4,4],[0,1],[1,2],[2,3],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[0,4]], Winston got the following results [9,12,3,7,15,8,0,3,7,0,0,3,0,0,0]. The value closest to 5 is 7 and 3, thus the minimum difference is 2.

```

**Example 2:** 

```
Input: arr = [1000000,1000000,1000000], target = 1
Output: 999999
Explanation: Winston called the func with all possible values of [l,r] and he always got 1000000, thus the min difference is 999999.

```

**Example 3:** 

```
Input: arr = [1,2,4,8,16], target = 0
Output: 0

```



**Constraints:** 

-  *1 <= arr.length <= 105*  
-  *1 <= arr[i] <= 106*  
-  *0 <= target <= 107* 


# [1521. 找到最接近目标值的函数值][cnTitle]

**困难**

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/07/19/change.png)

Winston 构造了一个如上所示的函数  *func*  。他有一个整数数组  *arr*  和一个整数  *target*  ，他想找到让  *|func(arr, l, r) - target|*  最小的  *l*  和  *r*  。

请你返回  *|func(arr, l, r) - target|*  的最小值。

请注意，  *func*  的输入参数  *l*  和  *r*  需要满足  *0 <= l, r < arr.length*  。



**示例 1：** 

```
输入：arr = [9,12,3,7,15], target = 5
输出：2
解释：所有可能的 [l,r] 数对包括 [[0,0],[1,1],[2,2],[3,3],[4,4],[0,1],[1,2],[2,3],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[0,4]]， Winston 得到的相应结果为 [9,12,3,7,15,8,0,3,7,0,0,3,0,0,0] 。最接近 5 的值是 7 和 3，所以最小差值为 2 。

```

**示例 2：** 

```
输入：arr = [1000000,1000000,1000000], target = 1
输出：999999
解释：Winston 输入函数的所有可能 [l,r] 数对得到的函数值都为 1000000 ，所以最小差值为 999999 。

```

**示例 3：** 

```
输入：arr = [1,2,4,8,16], target = 0
输出：0

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= arr[i] <= 10^6*  
-  *0 <= target <= 10^7* 




# 算法思路

# 测试用例
```
1521. Find a Value of a Mysterious Function Closest to Target 1521. 找到最接近目标值的函数值 Hard
```

[enTitle]: https://leetcode.com/problems/find-a-value-of-a-mysterious-function-closest-to-target/
[cnTitle]: https://leetcode-cn.com/problems/find-a-value-of-a-mysterious-function-closest-to-target/
