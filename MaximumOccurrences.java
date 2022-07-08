package com.basic.programm;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number Do you want to Enter into Array : ");
        int number = sc.nextInt();
        
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the number :");
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        int maxCount=0;
        for (int i = 0; i < number; i++) {
            int count=0;
            for (int j = i+1; j < number; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>maxCount){
                    maxCount=count;
                }

            }
        }

        for (int i = 0; i < number; i++) {
            int count=0;
            for (int j = i+1; j < number; j++) {
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(maxCount>1 && count==maxCount ){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty())
            System.out.println(-1);
        else
            System.out.println(list);
    }
}
