package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int pro = -1;
        ArrayList<Integer> list = new ArrayList<>();
        while(!set.contains(pro)){
            list = ex(n);
            for(int i =0;i<list.size();i++){
                n = n+list.get(i)*list.get(i);
            }
            if(n == 1)
                return true;
            set.add(n);
            n = 0;
            list.clear();
        }
        return false;
    }
    ArrayList<Integer> ex(int n){
        ArrayList<Integer> res= new ArrayList<>();
        int temp =0;
        while(n>0){
            temp = n%10;
            res.add(temp);
            n = n/10;
        }
        return res;
    }
    public boolean wordPattern(String pattern, String str) {
        String[] ss = str.split(" ");
        char[] cs = pattern.toCharArray();
        // if(ss.length!=cs.length) return false;
        String[] save = new String[26];
        for(int i = 0 ;i<ss.length;i++){
            if(save[cs[i]-'a']==null)
                save[cs[i]-'a'] = ss[i];
            else{
                if(save[cs[i]-'a'].equals(ss[i])){
                    return false;
                }
            }
        }
        return true;
    }


//////

//////
class Student {
    public String name;
    public Student(String n){
        name = n;
    }
}
    public static void main(String[] args) {
        test test = new test();
        // System.out.println(test.isHappy(19));
        // int[] res= new int[0];
        HashMap<Character,Character> map = new HashMap();
         String str = new String();
        // StringBuilder strb = new StringBuilder();
        // List<String> list= new ArrayList();
        // list.clear();
        // int max= Integer.MAX_VALUE;
        // Integer i = (int)'f';
        // int[] m = new  int['c'];
        // String s = new String();
        // s.split(" ");
        // Set<Integer> set = new HashSet();
        // char[] cs = str.toCharArray();
        // for (char var : cs) {
            
        // }
        Student s =test.new Student("王老五");
        f(s);
        System.out.println(s.name);

    }

    static void f(Student stu){
        stu.name = "小周";
        System.out.println(stu.name); 
    }

    
}

