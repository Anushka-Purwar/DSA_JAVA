import java.util.Scanner;

public class bubbleSort {

    public static void printArray(int ar[],int size){
        for(int i=0;i<size;i++) System.out.print(ar[i]+" ");
        System.out.println();
    }
    public static void swap(int ar[],int j){
        int temp=ar[j];
        ar[j]=ar[j+1];
        ar[j+1]=temp;
    }
    public static void bubbleSort(int ar[],int size){

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(ar[j]>ar[j+1]) swap(ar,j );
            }
        }
        printArray(ar,size);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        bubbleSort(ar,size);
    }
}
