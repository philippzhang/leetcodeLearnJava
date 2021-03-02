# [753. Cracking the Safe][enTitle]

**Hard**

There is a box protected by a password. The password is a sequence of  *n*  digits where each digit can be one of the first  *k*  digits  *0, 1, ..., k-1* .

While entering a password, the last  *n*  digits entered will automatically be matched against the correct password.

For example, assuming the correct password is  *"345"* , if you type  *"012345"* , the box will open because the correct password matches the suffix of the entered password.

Return any password of **minimum length**  that is guaranteed to open the box at some point of entering it.



Example 1:

```
Input: n = 1, k = 2
Output: "01"
Note: "10" will be accepted too.

```

Example 2:

```
Input: n = 2, k = 2
Output: "00110"
Note: "01100", "10011", "11001" will be accepted too.

```



Note:

1.  *n*  will be in the range  *[1, 4]* . 
2.  *k*  will be in the range  *[1, 10]* . 
3.  *k^n*  will be at most  *4096* .




# [753. 破解保险箱][cnTitle]

**困难**

有一个需要密码才能打开的保险箱。密码是  *n*  位数, 密码的每一位是  *k*  位序列  *0, 1, ..., k-1*  中的一个 。

你可以随意输入密码，保险箱会自动记住最后  *n*  位输入，如果匹配，则能够打开保险箱。

举个例子，假设密码是  *"345"* ，你可以输入  *"012345"*  来打开它，只是你输入了 6 个字符.

请返回一个能打开保险箱的最短字符串。



**示例1:** 

```
输入: n = 1, k = 2
输出: "01"
说明: "10"也可以打开保险箱。

```



**示例2:** 

```
输入: n = 2, k = 2
输出: "00110"
说明:"01100", "10011", "11001" 也能打开保险箱。

```



**提示：** 

1.  *n*  的范围是  *[1, 4]* 。 
2.  *k*  的范围是  *[1, 10]* 。 
3.  *k^n*  最大可能为  *4096* 。






# 算法思路

# 测试用例
```
753. Cracking the Safe 753. 破解保险箱 Hard
```

[enTitle]: https://leetcode.com/problems/cracking-the-safe/
[cnTitle]: https://leetcode-cn.com/problems/cracking-the-safe/
