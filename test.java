//import java.io.*;

public class test {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--; 
            }
            arr[j + 1] = key;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
