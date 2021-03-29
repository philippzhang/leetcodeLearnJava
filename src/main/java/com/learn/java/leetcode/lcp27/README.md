# [LCP 27. 黑盒光线反射][cnTitle]

**困难**

秋日市集上有个奇怪的黑盒，黑盒的主视图为 n*m 的矩形。从黑盒的主视图来看，黑盒的上面和下面各均匀分布有 m 个小孔，黑盒的左面和右面各均匀分布有 n 个小孔。黑盒左上角小孔序号为 0，按顺时针编号，总共有 2*(m+n) 个小孔。每个小孔均可以打开或者关闭，初始时，所有小孔均处于关闭状态。每个小孔上的盖子均为镜面材质。例如一个 2*3 的黑盒主视图与其小孔分布如图所示:


![img](https://pic.leetcode-cn.com/1598951281-ZCBrif-image.png)


店长告诉小扣，这里是「几何学的快问快答」，店长可能有两种操作：


-  *open(int index, int direction)*  - 若小孔处于关闭状态，则打开小孔，照入光线；否则直接照入光线； 
-  *close(int index)*  - 关闭处于打开状态小孔，店长保证不会关闭已处于关闭状态的小孔；


其中：


-  *index* ： 表示小孔序号 
-  *direction* ： *1*  表示光线沿 <span class="katex"><span class="katex-mathml"> 
   <math xmlns="http://www.w3.org/1998/Math/MathML"> 
    <semantics> 
     <mrow> 
      <mi>
        y 
      </mi> 
      <mo>
        = 
      </mo> 
      <mi>
        x 
      </mi> 
     </mrow> 
     <annotation encoding="application/x-tex">
       y=x 
     </annotation> 
    </semantics> 
   </math><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:0.625em;vertical-align:-0.19444em;"><span class="mord mathdefault" style="margin-right:0.03588em;">y<span class="mspace" style="margin-right:0.2777777777777778em;"><span class="mrel">=<span class="mspace" style="margin-right:0.2777777777777778em;"><span class="base"><span class="strut" style="height:0.43056em;vertical-align:0em;"><span class="mord mathdefault">x 方向，<code>-1</code> 表示光线沿 <span class="katex"><span class="katex-mathml"> 
               <math xmlns="http://www.w3.org/1998/Math/MathML"> 
                <semantics> 
                 <mrow> 
                  <mi>
                    y 
                  </mi> 
                  <mo>
                    = 
                  </mo> 
                  <mo>
                    − 
                  </mo> 
                  <mi>
                    x 
                  </mi> 
                 </mrow> 
                 <annotation encoding="application/x-tex">
                   y=-x 
                 </annotation> 
                </semantics> 
               </math><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:0.625em;vertical-align:-0.19444em;"><span class="mord mathdefault" style="margin-right:0.03588em;">y<span class="mspace" style="margin-right:0.2777777777777778em;"><span class="mrel">=<span class="mspace" style="margin-right:0.2777777777777778em;"><span class="base"><span class="strut" style="height:0.66666em;vertical-align:-0.08333em;"><span class="mord">−<span class="mord mathdefault">x 方向。</span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span></span>


![img](https://pic.leetcode-cn.com/1599620810-HdOlMi-image.png)


当光线照至边界时：若边界上的小孔为开启状态，则光线会射出；否则，光线会在小孔之间进行反射。特别地：


1. 若光线射向未打开的拐角（黑盒顶点），则光线会原路反射回去； 
2. 光线自拐角处的小孔照入时，只有一种入射方向（如自序号为 0 的小孔照入方向只能为  *-1* ）


![img](https://pic.leetcode-cn.com/1598953840-DLiAsf-image.png)


请帮助小扣判断并返回店长每次照入的光线从几号小孔射出。


**示例 1：** 




**示例 2：** 




**提示：** 


-  *1 <= n, m <= 10000*  
-  *1 <= 操作次数 <= 10000*  
-  *direction*  仅为  *1*  或  *-1*  
-  *0 <= index < 2*(m+n)* 




# 算法思路

# 测试用例
```
LCP 27. 黑盒光线反射 困难
```

[cnTitle]: https://leetcode-cn.com/problems/IQvJ9i/
