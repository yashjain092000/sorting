package Main;

import definition.definitionClass;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int j = 0; j <size ; j++) {
            arr[j]=sc.nextInt();
        }
        definitionClass.bubbleSort(arr);
    }
}
