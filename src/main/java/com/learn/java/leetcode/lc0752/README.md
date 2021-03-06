# [752. Open the Lock][enTitle]

**Medium**

You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots:  *'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'* . The wheels can rotate freely and wrap around: for example we can turn  *'9'*  to be  *'0'* , or  *'0'*  to be  *'9'* . Each move consists of turning one wheel one slot.

The lock initially starts at  *'0000'* , a string representing the state of the 4 wheels.

You are given a list of  *deadends*  dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.

Given a  *target*  representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.



**Example 1:** 

```
Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".

```

**Example 2:** 

```
Input: deadends = ["8888"], target = "0009"
Output: 1
Explanation:
We can turn the last wheel in reverse to move from "0000" -> "0009".

```

**Example 3:** 

```
Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
Output: -1
Explanation:
We can't reach the target without getting stuck.

```

**Example 4:** 

```
Input: deadends = ["0000"], target = "8888"
Output: -1

```



**Constraints:** 

-  *1 <= deadends.length <= 500*  
-  *deadends[i].length == 4*  
-  *target.length == 4*  
- target **will not be**  in the list  *deadends* . 
-  *target*  and  *deadends[i]*  consist of digits only.


# [752. 打开转盘锁][cnTitle]

**中等**

你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字：  *'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'*  。每个拨轮可以自由旋转：例如把  *'9'*  变为  *'0'* ， *'0'*  变为  *'9'*  。每次旋转都只能旋转一个拨轮的一位数字。

锁的初始数字为  *'0000'*  ，一个代表四个拨轮的数字的字符串。

列表  *deadends*  包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。

字符串  *target*  代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。



**示例 1:** 

```
输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
输出：6
解释：
可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
因为当拨动到 "0102" 时这个锁就会被锁定。

```

**示例 2:** 

```
输入: deadends = ["8888"], target = "0009"
输出：1
解释：
把最后一位反向旋转一次即可 "0000" -> "0009"。

```

**示例 3:** 

```
输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
输出：-1
解释：无法旋转到目标数字且不被锁定。

```

**示例 4:** 

```
输入: deadends = ["0000"], target = "8888"
输出：-1

```



**提示：** 

1. 死亡列表  *deadends*  的长度范围为  *[1, 500]* 。 
2. 目标数字  *target*  不会在  *deadends*  之中。 
3. 每个  *deadends*  和  *target*  中的字符串的数字会在 10,000 个可能的情况  *'0000'*  到  *'9999'*  中产生。




# 算法思路

# 测试用例
```
752. Open the Lock 752. 打开转盘锁 Medium
```

[enTitle]: https://leetcode.com/problems/open-the-lock/
[cnTitle]: https://leetcode-cn.com/problems/open-the-lock/
