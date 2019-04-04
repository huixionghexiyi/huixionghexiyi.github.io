package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test {

    public int partition(int nums[], int left, int right) {
        int pivot = right;
        System.out.println(nums[right]);
        int index = left;
        int t = 0;
        for (int i = left; i < right; i++) {

            if (nums[i] < nums[pivot]) {
                t = nums[i];
                nums[i] = nums[index];
                nums[index] = t;
                index++;// 自增
            }
            System.out.println(Arrays.toString(nums));
        }
        // swap(nums[index],nums[pivot]);
        t = nums[index];
        nums[index] = nums[pivot];
        nums[pivot] = t;
        return index;
    }

    void qSort(int nums[], int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            qSort(nums, left, pivot - 1);
            qSort(nums, pivot + 1, right);
        }

    }

    public static void main(String[] args) {
        int[] x = new int[] { 9, 4, 1, 6, 7, 2, 3, 5, 8 };
        test t = new test();
        // t.qSort(x, 0, x.length - 1);
        LinkedList<Integer> que = new LinkedList();
           
    }
}