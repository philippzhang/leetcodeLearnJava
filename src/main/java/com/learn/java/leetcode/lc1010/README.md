# [1010. Pairs of Songs With Total Durations Divisible by 60][enTitle]

**Medium**

You are given a list of songs where the i<sup>th</sup> song has a duration of  *time[i]*  seconds.

Return  *the number of pairs of songs for which their total duration in seconds is divisible by*   *60* . Formally, we want the number of indices  *i* ,  *j*  such that  *i < j*  with  *(time[i] + time[j]) % 60 == 0* .



**Example 1:** 

```
Input: time = [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60

```

**Example 2:** 

```
Input: time = [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, which is divisible by 60.

```



**Constraints:** 

-  *1 <= time.length <= 6 * 104*  
-  *1 <= time[i] <= 500* 


# [1010. 总持续时间可被 60 整除的歌曲][cnTitle]

**中等**

在歌曲列表中，第  *i*  首歌曲的持续时间为  *time[i]*  秒。

返回其总持续时间（以秒为单位）可被  *60*  整除的歌曲对的数量。形式上，我们希望索引的数字  *i*  和  *j*  满足  *i < j*  且有  *(time[i] + time[j]) % 60 == 0* 。



**示例 1：** 

```
输入：[30,20,150,100,40]
输出：3
解释：这三对的总持续时间可被 60 整数：
(time[0] = 30, time[2] = 150): 总持续时间 180
(time[1] = 20, time[3] = 100): 总持续时间 120
(time[1] = 20, time[4] = 40): 总持续时间 60

```

**示例 2：** 

```
输入：[60,60,60]
输出：3
解释：所有三对的总持续时间都是 120，可以被 60 整数。

```



**提示：** 

1.  *1 <= time.length <= 60000*  
2.  *1 <= time[i] <= 500* 




# 算法思路

# 测试用例
```
1010. Pairs of Songs With Total Durations Divisible by 60 1010. 总持续时间可被 60 整除的歌曲 Medium
```

[enTitle]: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
[cnTitle]: https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
