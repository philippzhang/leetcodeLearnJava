# [1232. Check If It Is a Straight Line][enTitle]

**Easy**

You are given an array  *coordinates* ,  *coordinates[i] = [x, y]* , where  *[x, y]*  represents the coordinate of a point. Check if these points make a straight line in the XY plane.





**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/10/15/untitled-diagram-2.jpg)

```
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/10/09/untitled-diagram-1.jpg)

```
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

```



**Constraints:** 

-  *2 <= coordinates.length <= 1000*  
-  *coordinates[i].length == 2*  
-  *-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4*  
-  *coordinates*  contains no duplicate point.


# [1232. 缀点成线][cnTitle]

**简单**

在一个 XY 坐标系中有一些点，我们用数组  *coordinates*  来分别记录它们的坐标，其中  *coordinates[i] = [x, y]*  表示横坐标为  *x* 、纵坐标为  *y*  的点。

请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回  *true* ，否则请返回  *false* 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/10/19/untitled-diagram-2.jpg)

```
输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
输出：true

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/10/19/untitled-diagram-1.jpg)

```
输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
输出：false

```



**提示：** 

-  *2 <= coordinates.length <= 1000*  
-  *coordinates[i].length == 2*  
-  *-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4*  
-  *coordinates*  中不含重复的点




# 算法思路

# 测试用例
```
1232. Check If It Is a Straight Line 1232. 缀点成线 Easy
```

[enTitle]: https://leetcode.com/problems/check-if-it-is-a-straight-line/
[cnTitle]: https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
