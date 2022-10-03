import java.util.Scanner;
public class insertionSort {
    public static void printArray(int arr[], int size){
        for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
    }

    public static void insertionSort(int arr[],int size){
        //firs loop to acess unsorted array
        for(int i=1;i<size;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr,size);
    }

    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr,size);
    }
}
