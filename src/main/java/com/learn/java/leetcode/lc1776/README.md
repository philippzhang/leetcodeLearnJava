# [1776. Car Fleet II][enTitle]

**Hard**

There are  *n*  cars traveling at different speeds in the same direction along a one-lane road. You are given an array  *cars*  of length  *n* , where  *cars[i] = [positioni, speedi]*  represents:

-  *positioni*  is the distance between the  *ith*  car and the beginning of the road in meters. It is guaranteed that  *positioni < positioni+1* . 
-  *speedi*  is the initial speed of the  *ith*  car in meters per second.

For simplicity, cars can be considered as points moving along the number line. Two cars collide when they occupy the same position. Once a car collides with another car, they unite and form a single car fleet. The cars in the formed fleet will have the same position and the same speed, which is the initial speed of the **slowest**  car in the fleet.

Return an array  *answer* , where  *answer[i]*  is the time, in seconds, at which the  *ith*  car collides with the next car, or  *-1*  if the car does not collide with the next car. Answers within  *10-5*  of the actual answers are accepted.



**Example 1:** 

```
Input: cars = [[1,2],[2,1],[4,3],[7,2]]
Output: [1.00000,-1.00000,3.00000,-1.00000]
Explanation: After exactly one second, the first car will collide with the second car, and form a car fleet with speed 1 m/s. After exactly 3 seconds, the third car will collide with the fourth car, and form a car fleet with speed 2 m/s.

```

**Example 2:** 

```
Input: cars = [[3,4],[5,4],[6,3],[9,1]]
Output: [2.00000,1.00000,1.50000,-1.00000]

```



**Constraints:** 

-  *1 <= cars.length <= 105*  
-  *1 <= positioni, speedi <= 106*  
-  *positioni < positioni+1* 


# [1776. 车队 II][cnTitle]

**困难**

在一条单车道上有  *n*  辆车，它们朝着同样的方向行驶。给你一个长度为  *n*  的数组  *cars*  ，其中  *cars[i] = [positioni, speedi]*  ，它表示：

-  *positioni*  是第  *i*  辆车和道路起点之间的距离（单位：米）。题目保证  *positioni < positioni+1* <sub> </sub>。 
-  *speedi*  是第  *i*  辆车的初始速度（单位：米/秒）。

简单起见，所有车子可以视为在数轴上移动的点。当两辆车占据同一个位置时，我们称它们相遇了。一旦两辆车相遇，它们会合并成一个车队，这个车队里的车有着同样的位置和相同的速度，速度为这个车队里 **最慢**  一辆车的速度。

请你返回一个数组  *answer*  ，其中  *answer[i]*  是第  *i*  辆车与下一辆车相遇的时间（单位：秒），如果这辆车不会与下一辆车相遇，则  *answer[i]*  为  *-1*  。答案精度误差需在  *10-5*  以内。



**示例 1：** 

```
输入：cars = [[1,2],[2,1],[4,3],[7,2]]
输出：[1.00000,-1.00000,3.00000,-1.00000]
解释：经过恰好 1 秒以后，第一辆车会与第二辆车相遇，并形成一个 1 m/s 的车队。经过恰好 3 秒以后，第三辆车会与第四辆车相遇，并形成一个 2 m/s 的车队。

```

**示例 2：** 

```
输入：cars = [[3,4],[5,4],[6,3],[9,1]]
输出：[2.00000,1.00000,1.50000,-1.00000]

```



**提示：** 

-  *1 <= cars.length <= 105*  
-  *1 <= positioni, speedi <= 106*  
-  *positioni < positioni+1* 




# 算法思路

# 测试用例
```
1776. Car Fleet II 1776. 车队 II Hard
```

[enTitle]: https://leetcode.com/problems/car-fleet-ii/
[cnTitle]: https://leetcode-cn.com/problems/car-fleet-ii/
