# [299. Bulls and Cows][enTitle]

**Easy**

You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use  *A*  to indicate the bulls and  *B*  to indicate the cows.

Please note that both secret number and friend's guess may contain duplicate digits.

**Example 1:** 

```
Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1<span style="font-family: sans-serif, Arial, Verdana, "Trebuchet MS";"> bull and <code>3</code><span style="font-family: sans-serif, Arial, Verdana, "Trebuchet MS";"> cows. The bull is <code>8</code><span style="font-family: sans-serif, Arial, Verdana, "Trebuchet MS";">, the cows are <code>0</code><span style="font-family: sans-serif, Arial, Verdana, "Trebuchet MS";">, 1<span style="font-family: sans-serif, Arial, Verdana, "Trebuchet MS";"> and <code>7<font face="sans-serif, Arial, Verdana, Trebuchet MS">.</font></code></span></span></span></span></span>
```

**Example 2:** 

```
Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation:The 1st 1in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
```

**Note:** You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.


# [299. 猜数字游戏][cnTitle]

**中等**

你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。

请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用  *A*  表示公牛，用  *B*  表示奶牛。

请注意秘密数字和朋友的猜测数都可能含有重复数字。

**示例 1:** 

```
输入: secret = "1807", guess = "7810"

输出: "1A3B"

解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
```

**示例 2:** 

```
输入: secret = "1123", guess = "0111"

输出: "1A1B"

解释:朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。
```

**说明:** 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。




# 算法思路

# 测试用例
```
299. Bulls and Cows 299. 猜数字游戏 Easy
```

[enTitle]: https://leetcode.com/problems/bulls-and-cows/
[cnTitle]: https://leetcode-cn.com/problems/bulls-and-cows/
