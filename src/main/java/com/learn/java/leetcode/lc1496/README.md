# [1496. Path Crossing][enTitle]

**Easy**

Given a string  *path* , where  *path[i] = 'N'* ,  *'S'* ,  *'E'*  or  *'W'* , each representing moving one unit north, south, east, or west, respectively. You start at the origin  *(0, 0)*  on a 2D plane and walk on the path specified by  *path* .

Return  *True*  if the path crosses itself at any point, that is, if at any time you are on a location you've previously visited. Return  *False*  otherwise.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123929-pm.png)

```
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123843-pm.png)

```
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
```



**Constraints:** 

-  *1 <= path.length <= 10^4*  
-  *path*  will only consist of characters in  *{'N', 'S', 'E', 'W}* 


# [1496. 判断路径是否相交][cnTitle]

**简单**

给你一个字符串  *path* ，其中  *path[i]*  的值可以是  *'N'* 、 *'S'* 、 *'E'*  或者  *'W'* ，分别表示向北、向南、向东、向西移动一个单位。

机器人从二维平面上的原点  *(0, 0)*  处开始出发，按  *path*  所指示的路径行走。

如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回  *True*  ；否则，返回  *False*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/28/screen-shot-2020-06-10-at-123929-pm.png)

```
输入：path = "NES"
输出：false 
解释：该路径没有在任何位置相交。
```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/28/screen-shot-2020-06-10-at-123843-pm.png)

```
输入：path = "NESWW"
输出：true
解释：该路径经过原点两次。
```



**提示：** 

-  *1 <= path.length <= 10^4*  
-  *path*  仅由  *{'N', 'S', 'E', 'W}*  中的字符组成




# 算法思路

# 测试用例
```
1496. Path Crossing 1496. 判断路径是否相交 Easy
```

[enTitle]: https://leetcode.com/problems/path-crossing/
[cnTitle]: https://leetcode-cn.com/problems/path-crossing/
