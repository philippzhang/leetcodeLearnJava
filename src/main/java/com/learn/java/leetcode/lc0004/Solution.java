package com.learn.java.leetcode.lc0004;

import java.util.LinkedList;

public class Solution {

	/**
	 * 时间复杂度O(log(min(m,n)))，
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1 != null ? nums1.length : 0;
		int n = nums2 != null ? nums2.length : 0;
		if (m > n) {
			//确保m<=n
			return findMedianSortedArrays(nums2, nums1);
		}
		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
		/**
		 * 停止条件一：
		 * nums1下标设为i在[0-m]范围搜索，nums2在下标为j j=halfLen -i
		 * 应为要保证搜索停止时i+j=m-i+n-j 或 i+j=m-i+n-j+1
		 *
		 * 停止条件条件二：
		 * nums2[j-1]<=nums1[i] && nums1[i-1]<=nums2[j]
		 */

		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halfLen - i;
			if (i < iMax && nums2[j - 1] > nums1[i]) {
				iMin = i + 1; //i is to small
			} else if (i > iMin && nums1[i - 1] > nums2[j]) {
				iMax = i - 1; //i is too big
			} else {
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = nums2[j - 1];
				} else if (j == 0) {
					maxLeft = nums1[i - 1];
				} else {
					maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
				}
				if ((m + n) % 2 == 1) {
					return maxLeft;
				}

				int minRight = 0;
				if (i == m) {
					minRight = nums2[j];
				} else if (j == n) {
					minRight = nums1[i];
				} else {
					minRight = Math.min(nums1[i], nums2[j]);
				}

				return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}

	/**
	 * 参考https://www.cnblogs.com/lupx/p/lupeixin.html
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int length1 = nums1 != null ? nums1.length : 0;
		int length2 = nums2 != null ? nums2.length : 0;
		int length = length1 + length2;
		if (length % 2 == 0) {
			return (findKth(nums1, nums2, 0, 0, length / 2) + findKth(nums1, nums2, 0, 0, length / 2 + 1)) / 2.0;
		} else {
			return findKth(nums1, nums2, 0, 0, length / 2 + 1);
		}

	}

	/**
	 * 找出2个数组的第k个元素，nums1从starta开始，nums2从startb开始
	 * <p>
	 * (1) M+N个元素的中位数，位于两数组merge后的(M+N)/2+1位置。我们把这个位置记为K。又由于merge后数组中找位置K的元素，等同于找第K小元素：find the Kth minimum element!
	 * (2) 我们对两个数组各自二分，取一半，弃一半，在剩下的元素中继续找？但是注意，这里的一半不能取数组长度的一半。 因为我们现在要找Kth，所以二分的实际尺度应该取决于K的大小。在去掉K/2后，由于前K个元素中的K/2已经被舍弃，所以在剩余数组中查找：Jth = K - K/2。(倘若取了数组的一半，那么弃掉的元素个数和K无关，那就无法确定 J 的位置。)
	 * (3) 同时，应当注意，由于已经去掉了某个数组的前k/2个元素，那么这个数组参与查找J的范围起始点应当从当前start点往前移动k/2个位置，所以，start = start + k/2。
	 * (4) 每次在两个数组中找前K/2元素，有如下一些情况需要考虑：
	 * (4.1) 如果在数组A中找K/2的时候，K/2 >= A.length，此时可以直接丢弃B中前K/2
	 * (4.2) 如果4.1情况未出现，也即我们找到了在A/B中各自的前k/2个元素，我们记为其最后一个元素为A[mid]和B[mid]，显然mid=k/2 - 1（因为mid为位置，而k/2是个数，所以需-1）。那么剩下的问题就是确定下一步该如何舍弃元素缩小下一步检索范围。有如下结论：
	 * 如果A[mid]>=B[mid]，那么B的前k/2个元素可以直接舍弃。如果A[mid]<B[mid]，那么A的前k/2个元素可以直接舍弃。
	 * 4.3) 此外，基准条件需要考虑。由于每一步查找第J小得时候，J = k - k/2，那么J=1的时候，程序如何处理。显然，根据定义来看，J=1说明只需要在A/B两个数组中找第1小即可。那实际就是直接返回当前位置元素即可。但是，A/B各存在一个起始当前元素，如何取舍？可以这么考虑，merge后的数组是从小到大的，从上面分析来看，我们实际上要找的是第k小。也就是说，如果在前面各步，我们已经丢弃了全部 (k-1) 个元素，剩下要选的元素就是第k小。很显然，应该选两者中小的那个，大的那个元素在merge后实际是第k+1小。所以：
	 * return  Math.min(A[starta], B[startb]);
	 *
	 * @param nums1
	 * @param nums2
	 * @param starta
	 * @param startb
	 * @param k
	 * @return
	 */
	public static double findKth(int[] nums1, int[] nums2, int starta, int startb, int k) {
		int length1 = nums1 != null ? nums1.length : 0;
		int length2 = nums2 != null ? nums2.length : 0;
		if (starta >= length1) {
			//抛弃nums1
			return nums2[startb + k - 1];
		}
		if (startb >= length2) {
			//抛弃num2
			return nums1[starta + k - 1];
		}
		if (k == 1) {
			return Math.min(nums1[starta], nums2[startb]);
		}

		int mid = k / 2 - 1;//index starts from 0, so the mid of K is K/2 - 1
		int midValue1 = starta + mid >= length1 ? Integer.MAX_VALUE : nums1[starta + mid];
		int midValue2 = startb + mid >= length2 ? Integer.MAX_VALUE : nums2[startb + mid];

		if (midValue1 > midValue2) {
			return findKth(nums1, nums2, starta, startb + k / 2, k - k / 2);
		} else {
			return findKth(nums1, nums2, starta + k / 2, startb, k - k / 2);
		}
	}


	/**
	 * 队列用的LinkedList，因为只需要末尾添加元素同时末尾取元素，所以LinkedList的效率更加优秀。从oj的时间反馈也可以看出来，因为ArrayLIst中间会有扩容的操作，所以LinkedList更加合适
	 * 利用而外存储实现比较简单
	 **/

	public double findMedianSortedArrays3(int[] nums1, int[] nums2) {
		//获取总长度
		int sumLen = nums1.length + nums2.length;
		//判断总数是奇数还是偶数
		boolean isSingle = (sumLen & 1) == 1;
		if (sumLen == 0) {
			return 0;
		}
		//nums1为空
		if (nums1.length == 0) {
			return getSingleArrayMidle(nums2, isSingle);
		}
		//nums2为空
		if (nums2.length == 0) {
			return getSingleArrayMidle(nums1, isSingle);
		}

		LinkedList<Integer> linkedList = new LinkedList<>();
		int curPos1 = 0;
		int curPos2 = 0;
		while (linkedList.size() <= (sumLen >> 1)) {
			if (curPos1 >= nums1.length) {
				linkedList.add(nums2[curPos2]);
				curPos2++;
				continue;
			}
			if (curPos2 >= nums2.length) {
				linkedList.add(nums1[curPos1]);
				curPos1++;
				continue;
			}
			if (nums1[curPos1] > nums2[curPos2]) {
				linkedList.add(nums2[curPos2]);
				curPos2++;
			} else {
				linkedList.add(nums1[curPos1]);
				curPos1++;
			}
		}
		//奇数长度
		if ((sumLen & 1) == 1) {
			return linkedList.getLast();
		}

		//偶数长度
		int m = linkedList.getLast();
		linkedList.removeLast();
		int n = linkedList.getLast();
		return (m + n) / 2.0;
	}

	private double getSingleArrayMidle(int[] nums2, boolean isSingle) {
		if (isSingle) {
			return nums2[nums2.length >> 1];
		} else {
			int m = nums2[nums2.length >> 1];
			int n = nums2[(nums2.length >> 1) - 1];
			return (m + n) / 2.0;
		}
	}

}
