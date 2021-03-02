# [850. Rectangle Area II][enTitle]

**Hard**

We are given a list of (axis-aligned)  *rectangles* . Each  *rectangle[i] = [xi1, yi1, xi2, yi2]* , where  *(xi1, yi1)*  are the coordinates of the bottom-left corner, and  *(xi2, yi2)*  are the coordinates of the top-right corner of the  *ith*  rectangle.

Find the total area covered by all  *rectangles*  in the plane. Since the answer may be too large, return it **modulo**   *109 + 7* .



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/06/rectangle_area_ii_pic.png)

```
Input: rectangles = [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
Output: 6
Explanation:As illustrated in the picture.

```

**Example 2:** 


<pre><strong>Input:</strong> rectangles = [[0,0,1000000000,1000000000]]
<strong>Output:</strong> 49
<strong>Explanation: </strong>The answer is 10<sup>18</sup> modulo (10<sup>9</sup> + 7), which is (10<sup>9</sup>)<sup>2</sup> = (-7)<sup>2</sup> = 49.
</pre>



**Constraints:** 

-  *1 <= rectangles.length <= 200*  
-  *rectanges[i].length = 4*  
-  *0 <= rectangles[i][j] <= 109*  
- The total area covered by all rectangles will never exceed  *263 - 1*  and thus will fit in a **64-bit**  signed integer.


# [850. 矩形面积 II][cnTitle]

**困难**

我们给出了一个（轴对齐的）矩形列表  *rectangles*  。 对于  *rectangle[i] = [x1, y1, x2, y2]* ，其中（x1，y1）是矩形  *i*  左下角的坐标，（x2，y2）是该矩形右上角的坐标。

找出平面中所有矩形叠加覆盖后的总面积。 由于答案可能太大，**请返回它对 10 ^ 9 + 7 取模的结果** 。

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/06/rectangle_area_ii_pic.png)

**示例 1：** 

```
输入：[[0,0,2,2],[1,0,2,3],[1,0,3,1]]
输出：6
解释：如图所示。

```

**示例 2：** 

```
输入：[[0,0,1000000000,1000000000]]
输出：49
解释：答案是 10^18 对 (10^9 + 7) 取模的结果， 即 (10^9)^2 → (-7)^2 = 49 。

```

**提示：** 

-  *1 <= rectangles.length <= 200*  
-  *rectanges[i].length = 4*  
-  *0 <= rectangles[i][j] <= 10^9*  
- 矩形叠加覆盖后的总面积不会超越  *2^63 - 1*  ，这意味着可以用一个 64 位有符号整数来保存面积结果。




# 算法思路

# 测试用例
```
850. Rectangle Area II 850. 矩形面积 II Hard
```

[enTitle]: https://leetcode.com/problems/rectangle-area-ii/
[cnTitle]: https://leetcode-cn.com/problems/rectangle-area-ii/
