package definition;

import java.util.Arrays;

public class definitionClass {
    public static void bubbleSort(int[] a){
        for (int i = 0; i <a.length ; i++) {
            int temp;
            int flag=0;
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j]>a[j+1]){ //in case of strings a[j].compareTo(a[j+1])>0
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }


            }
            if(flag==0)
                break;

        }
        System.out.println(Arrays.toString(a));
    }
}
