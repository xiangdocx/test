package util;

import java.util.Arrays;

/**
 * @author xiang
 * @date 2021/11/3-15:35
 */
public class Test {
    public static void main(String[] args) {
        int[] a ={2,3,1,5,6,4,7,8,9};
            int c;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if(a[j] > a[j + 1]){
                        c = a[j];
                        a[j] =a[j + 1];
                        a[j + 1] = c;
                    }
                }

            }
        System.out.println(Arrays.toString(a));
    }

}
