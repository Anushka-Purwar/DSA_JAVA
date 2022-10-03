import java.util.Scanner;

public class selectionSort {
    public static void printArray(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int smallest, int i){
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    public static void selectionSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(arr[smallest]>arr[j]) smallest=j;
            }
            swap(arr,smallest,i);
        }
        printArray(arr,size);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) arr[i]=sc.nextInt();
        selectionSort(arr,size);


    }
}
