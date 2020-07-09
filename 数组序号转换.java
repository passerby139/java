package 力扣;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。
 *
 * 序号代表了一个元素有多大。序号编号的规则如下：
 *
 * 序号从 1 开始编号。
 * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 * 每个数字的序号都应该尽可能地小。
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [40,10,20,30]
 * 输出：[4,1,2,3]
 * 解释：40 是最大的元素。 10 是最小的元素。 20 是第二小的数字。 30 是第三小的数字。
 * 示例 2：
 *
 * 输入：arr = [100,100,100]
 * 输出：[1,1,1]
 * 解释：所有元素有相同的序号。
 * 示例 3：
 *
 * 输入：arr = [37,12,28,9,100,56,80,5,12]
 * 输出：[5,3,4,2,8,6,7,1,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rank-transform-of-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 数组序号转换 {
    public static void main(String[] args) {
        int[] arr = {2,-11,24,15,26,-31,-48,-49,22,37,-36};
        arrayRankTransform(arr);
    }
    public static int[] arrayRankTransform(int[] arr) {
        ArrayList list = new ArrayList();
        int s = arr.length;
        //1.用于过滤重复数组元素
        for (int i = 0; i < s; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int temp = list.size();
        //2.转为数组之后进行排序
        Object[] brr = list.toArray();
        Arrays.sort(brr);
        //3.对于原数组遍历寻找在排序位置的值然后标记
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < temp; j++) {
                if (arr[i] == (int)brr[j]){
                    arr[i] = j+1;
                    break;
                }
            }
        }
        //4.输出相应的值
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]+",");
        }
        return arr;
    }
}