# [1529. Bulb Switcher IV][enTitle]

**Medium**

There is a room with  *n*  bulbs, numbered from  *0*  to  *n-1* , arranged in a row from left to right. Initially all the bulbs are **turned off** .

Your task is to obtain the configuration represented by  *target*  where  *target[i]*  is '1' if the i-th bulb is turned on and is '0' if it is turned off.

You have a switch to flip the state of the bulb, a flip operation is defined as follows:

- Choose **any**  bulb (index  *i* ) of your current configuration. 
- Flip each bulb from index  *i*  to  *n-1* .

When any bulb is flipped it means that if it is 0 it changes to 1 and if it is 1 it changes to 0.

Return the **minimum**  number of flips required to form  *target* .



**Example 1:** 

```
Input: target = "10111"
Output: 3
Explanation:Initial configuration "00000".
flip from the third bulb:  "00000" -> "00111"
flip from the first bulb:  "00111" -> "11000"
flip from the second bulb:  "11000" -> "10111"
We need at least 3 flip operations to form target.
```

**Example 2:** 

```
Input: target = "101"
Output: 3
Explanation:"000" -> "111" -> "100" -> "101".

```

**Example 3:** 

```
Input: target = "00000"
Output: 0

```

**Example 4:** 

```
Input: target = "001011101"
Output: 5

```



**Constraints:** 

-  *1 <= target.length <= 10^5*  
-  *target[i] == '0'*  or  *target[i] == '1'* 


# [1529. 灯泡开关 IV][cnTitle]

**中等**

房间中有  *n*  个灯泡，编号从  *0*  到  *n-1*  ，自左向右排成一行。最开始的时候，所有的灯泡都是 **关**  着的。

请你设法使得灯泡的开关状态和  *target*  描述的状态一致，其中  *target[i]*  等于  *1*  第  *i*  个灯泡是开着的，等于  *0*  意味着第  *i*  个灯是关着的。

有一个开关可以用于翻转灯泡的状态，翻转操作定义如下：

- 选择当前配置下的任意一个灯泡（下标为  *i*  ） 
- 翻转下标从  *i*  到  *n-1*  的每个灯泡

翻转时，如果灯泡的状态为  *0*  就变为  *1* ，为  *1*  就变为  *0*  。

返回达成  *target*  描述的状态所需的 **最少**  翻转次数。



**示例 1：** 

```
输入：target = "10111"
输出：3
解释：初始配置 "00000".
从第 3 个灯泡（下标为 2）开始翻转 "00000" -> "00111"
从第 1 个灯泡（下标为 0）开始翻转 "00111" -> "11000"
从第 2 个灯泡（下标为 1）开始翻转 "11000" -> "10111"
至少需要翻转 3 次才能达成 target 描述的状态
```

**示例 2：** 

```
输入：target = "101"
输出：3
解释："000" -> "111" -> "100" -> "101".

```

**示例 3：** 

```
输入：target = "00000"
输出：0

```

**示例 4：** 

```
输入：target = "001011101"
输出：5

```



**提示：** 

-  *1 <= target.length <= 10^5*  
-  *target[i] == '0'*  或者  *target[i] == '1'* 




# 算法思路

# 测试用例
```
1529. Bulb Switcher IV 1529. 灯泡开关 IV Medium
```

[enTitle]: https://leetcode.com/problems/bulb-switcher-iv/
[cnTitle]: https://leetcode-cn.com/problems/bulb-switcher-iv/
