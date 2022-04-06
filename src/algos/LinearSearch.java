package algos;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array: ");
    	int size =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i =0; i<arr.length;i++) {
        	System.out.println("Enter "+(i+1)+" element: ");
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");//40
        int searchValue = sc.nextInt();
        int result = (int) linearing(arr,searchValue);
        if(result==-1){
            System.out.println("Element not in the array");
        } else {
            System.out.println("Element found at "+result+" and the search key is "+arr[result]);
        }
        sc.close();
    }
    public static int linearing(int arr[], int x) {
        int arrlength = arr.length;
        for (int i = 0; i < arrlength - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
