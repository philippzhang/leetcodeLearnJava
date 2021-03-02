# [420. Strong Password Checker][enTitle]

**Hard**

A password is considered strong if the below conditions are all met:

- It has at least  *6*  characters and at most  *20*  characters. 
- It contains at least **one lowercase**  letter, at least **one uppercase**  letter, and at least **one digit** . 
- It does not contain three repeating characters in a row (i.e.,  *"...aaa..."*  is weak, but  *"...aa...a..."*  is strong, assuming other conditions are met).

Given a string  *password* , return <em>the minimum number of steps required to make  *password*  strong. if  *password*  is already strong, return <code>0</code>.</em>

In one step, you can:

- Insert one character to  *password* , 
- Delete one character from  *password* , or 
- Replace one character of  *password*  with another character.



**Example 1:** 

```
Input: password = "a"
Output: 5

```

**Example 2:** 

```
Input: password = "aA1"
Output: 3

```

**Example 3:** 

```
Input: password = "1337C0d3"
Output: 0

```



**Constraints:** 

-  *1 <= password.length <= 50*  
-  *password*  consists of letters, digits, dot  *'.'*  or exclamation mark  *'!'* .


# [420. 强密码检验器][cnTitle]

**困难**

一个强密码应满足以下所有条件：

1. 由至少6个，至多20个字符组成。 
2. 至少包含一个小写字母，一个大写字母，和一个数字。 
3. 同一字符**不能** 连续出现三次 (比如 "...aaa..." 是不允许的, 但是 "...aa...a..." 是可以的)。

编写函数 strongPasswordChecker(s)，s 代表输入字符串，如果 s 已经符合强密码条件，则返回0；否则返回要将 s 修改为满足强密码条件的字符串所需要进行修改的**最小** 步数。

插入、删除、替换任一字符都算作一次修改。




# 算法思路

# 测试用例
```
420. Strong Password Checker 420. 强密码检验器 Hard
```

[enTitle]: https://leetcode.com/problems/strong-password-checker/
[cnTitle]: https://leetcode-cn.com/problems/strong-password-checker/
