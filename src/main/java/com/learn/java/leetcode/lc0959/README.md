# [959. Regions Cut By Slashes][enTitle]

**Medium**

In a N x N  *grid*  composed of 1 x 1 squares, each 1 x 1 square consists of a  */* ,  *\* , or blank space. These characters divide the square into contiguous regions.

(Note that backslash characters are escaped, so a  *\*  is represented as  *"\\"* .)

Return the number of regions.





















**Example 1:** 


<pre><strong>Input:
</strong><span id="example-input-1-1">[
  " /",
  "/ "
]
<strong>Output: </strong><span id="example-output-1">2
<strong>Explanation: </strong>The 2x2 grid is as follows:
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/15/1.png" style="width: 82px; height: 82px;">
</span></span></pre>


**Example 2:** 


<pre><strong>Input:
</strong><span id="example-input-2-1">[
  " /",
  "  "
]
<strong>Output: </strong><span id="example-output-2">1
<strong>Explanation: </strong>The 2x2 grid is as follows:
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/15/2.png" style="width: 82px; height: 82px;">
</span></span></pre>


**Example 3:** 


<pre><strong>Input:
</strong><span id="example-input-3-1">[
  "\\/",
  "/\\"
]
<strong>Output: </strong><span id="example-output-3">4
<strong>Explanation: </strong>(Recall that because \ characters are escaped, "\\/" refers to \/, and "/\\" refers to /\.)
The 2x2 grid is as follows:
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/15/3.png" style="width: 82px; height: 82px;">
</span></span></pre>


**Example 4:** 


<pre><strong>Input:
</strong><span id="example-input-4-1">[
  "/\\",
  "\\/"
]
<strong>Output: </strong><span id="example-output-4">5
<strong>Explanation: </strong>(Recall that because \ characters are escaped, "/\\" refers to /\, and "\\/" refers to \/.)
The 2x2 grid is as follows:
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/15/4.png" style="width: 82px; height: 82px;">
</span></span></pre>


**Example 5:** 


<pre><strong>Input:
</strong><span id="example-input-5-1">[
  "//",
  "/ "
]
<strong>Output: </strong><span id="example-output-5">3
<strong>Explanation: </strong>The 2x2 grid is as follows:
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/15/5.png" style="width: 82px; height: 82px;">
</span></span></pre>



**Note:** 

1.  *1 <= grid.length == grid[0].length <= 30*  
2.  *grid[i][j]*  is either  *'/'* ,  *'\'* , or  *' '* .












# [959. 由斜杠划分区域][cnTitle]

**中等**

在由 1 x 1 方格组成的 N x N 网格  *grid*  中，每个 1 x 1 方块由  */* 、 *\*  或空格构成。这些字符会将方块划分为一些共边的区域。

（请注意，反斜杠字符是转义的，因此  *\*  用  *"\\"*  表示。）。

返回区域的数目。





**示例 1：** 


<pre><strong>输入：
</strong>[
  " /",
  "/ "
]
<strong>输出：</strong>2
<strong>解释：</strong>2x2 网格如下：
<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/1.png" alt=""></pre>

**示例 2：** 


<pre><strong>输入：
</strong>[
  " /",
  "  "
]
<strong>输出：</strong>1
<strong>解释：</strong>2x2 网格如下：
<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/2.png" alt=""></pre>

**示例 3：** 


<pre><strong>输入：
</strong>[
  "\\/",
  "/\\"
]
<strong>输出：</strong>4
<strong>解释：</strong>（回想一下，因为 \ 字符是转义的，所以 "\\/" 表示 \/，而 "/\\" 表示 /\。）
2x2 网格如下：
<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/3.png" alt=""></pre>

**示例 4：** 


<pre><strong>输入：
</strong>[
  "/\\",
  "\\/"
]
<strong>输出：</strong>5
<strong>解释：</strong>（回想一下，因为 \ 字符是转义的，所以 "/\\" 表示 /\，而 "\\/" 表示 \/。）
2x2 网格如下：
<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/4.png" alt=""></pre>

**示例 5：** 


<pre><strong>输入：
</strong>[
  "//",
  "/ "
]
<strong>输出：</strong>3
<strong>解释：</strong>2x2 网格如下：
<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/5.png" alt="">
</pre>



**提示：** 

1.  *1 <= grid.length == grid[0].length <= 30*  
2.  *grid[i][j]*  是  *'/'* 、 *'\'* 、或  *' '* 。




# 算法思路

# 测试用例
```
959. Regions Cut By Slashes 959. 由斜杠划分区域 Medium
```

[enTitle]: https://leetcode.com/problems/regions-cut-by-slashes/
[cnTitle]: https://leetcode-cn.com/problems/regions-cut-by-slashes/
