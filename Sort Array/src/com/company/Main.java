package com.company;

public class Main {
    public static void main(String[] args) {
        //int[] myArray = {7, 1, 17, 50,9,5,11};
        int[] myArray = {31, 25, 17, 50,9,5,51,90};
        sortMyArray(myArray);
        //System.out.println(printArray(myArray));
    }
// כתוב מתודה סטטית שתקרא סורט ותקבל מערך של מספרים ותמיין אותו בצורה יעילה מהקטן לגדול
    public static void sortMyArray(int arr[]) {
        int counter= 0;
        System.out.println("Original Array: " + printArray(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            if (min > arr[i + 1]) { // flip two numbers: [i], [i+1] and get the minimum
                min = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = min;
            }
            while (i>0 && min <= arr[i - 1]) { // while minimum smaller than previous number: [i-1] - flip previous and minimum
                arr[i] = arr[i - 1];
                arr[i - 1] = min;
                i--;
            }
            counter++;
        }
        System.out.println("Sorted Array: "+printArray(arr)+"  and counter = "+counter);
    }

    public static String printArray(int []arr){
        String string="";
        for (int i=0;i<arr.length;i++)
            if(i==arr.length-1) string+=arr[i];
        else string+=arr[i]+", ";
        return string;
    }
}
