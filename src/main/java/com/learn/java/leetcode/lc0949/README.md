# [949. Largest Time for Given Digits][enTitle]

**Medium**

Given an array  *arr*  of 4 digits, find the latest 24-hour time that can be made using each digit **exactly once** .

24-hour times are formatted as  *"HH:MM"* , where  *HH*  is between  *00*  and  *23* , and  *MM*  is between  *00*  and  *59* . The earliest 24-hour time is  *00:00* , and the latest is  *23:59* .

Return  *the latest 24-hour time in "HH:MM" format* . If no valid time can be made, return an empty string.



**Example 1:** 

```
Input: A = [1,2,3,4]
Output: "23:41"
Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.

```

**Example 2:** 

```
Input: A = [5,5,5,5]
Output: ""
Explanation: There are no valid 24-hour times as "55:55" is not valid.

```

**Example 3:** 

```
Input: A = [0,0,0,0]
Output: "00:00"

```

**Example 4:** 

```
Input: A = [0,0,1,0]
Output: "10:00"

```



**Constraints:** 

-  *arr.length == 4*  
-  *0 <= arr[i] <= 9* 


# [949. 给定数字能组成的最大时间][cnTitle]

**中等**

给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。

24 小时格式为  *"HH:MM"*  ，其中  *HH*  在  *00*  到  *23*  之间， *MM*  在  *00*  到  *59*  之间。最小的 24 小时制时间是  *00:00*  ，而最大的是  *23:59*  。从 00:00 （午夜）开始算起，过得越久，时间越大。

以长度为 5 的字符串，按  *"HH:MM"*  格式返回答案。如果不能确定有效时间，则返回空字符串。



**示例 1：** 

```
输入：arr = [1,2,3,4]
输出："23:41"
解释：有效的 24 小时制时间是 "12:34"，"12:43"，"13:24"，"13:42"，"14:23"，"14:32"，"21:34"，"21:43"，"23:14" 和 "23:41" 。这些时间中，"23:41" 是最大时间。

```

**示例 2：** 

```
输入：arr = [5,5,5,5]
输出：""
解释：不存在有效的 24 小时制时间，因为 "55:55" 无效。

```

**示例 3：** 

```
输入：arr = [0,0,0,0]
输出："00:00"

```

**示例 4：** 

```
输入：arr = [0,0,1,0]
输出："10:00"

```



**提示：** 

-  *arr.length == 4*  
-  *0 <= arr[i] <= 9* 




# 算法思路

# 测试用例
```
949. Largest Time for Given Digits 949. 给定数字能组成的最大时间 Medium
```

[enTitle]: https://leetcode.com/problems/largest-time-for-given-digits/
[cnTitle]: https://leetcode-cn.com/problems/largest-time-for-given-digits/
