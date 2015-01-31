package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {7, 1, 17, 50,5,9,11};
        //System.out.println("hello");
        sortMyArray(myArray);
    }   // 1,7,17,50,
// כתוב מתודה סטטית שתקרא סורט ותקבל מערך של מספרים ותמיין אותו בצורה יעילה מהקטן לגדול
    public static void sortMyArray(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            if(min>arr[i+1]){
                min=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=min;
                System.out.println("min: "+min);
            }
        }
        System.out.println("new arr: "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "
                +arr[4]+", "+arr[5]+", "+arr[6]);
    }
}
