package hakancemgercek.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    private static Scanner keyboard = new Scanner(System.in);
    private static int[] A = new int[6];
    
    public BubbleSort(){
        System.out.println("### BUBBLE SORT ALGORİTMASI ###");
    }
    
    private void inputArray(){
        System.out.println("==================================");
        System.out.println("Lütfen 6 elemanlı bir dizi giriniz");
        for(int i=0; i<A.length; i++){
            System.out.print((i+1)+". eleman : ");
            A[i]=keyboard.nextInt();
        }
        System.out.println("==================================");
    }
    public void getInputArray(){
        inputArray();
    }
    
    private void BubbleSort(){
        int i,j,temp;
        boolean swap;
        for (i=0; i<A.length-1; i++){
            swap=false;
            for(j=0; j<A.length-i-1; j++){
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
    
    public void getBubbleSort(){
        BubbleSort();
    }
    private void printBubbleSort(){
        System.out.println("Girilen dizinin sıralanmış şekli: ");
        for(int array:A){
            System.out.print(array);
        }
        System.out.println("\n==================================");
    }
    
    public void getPrintBubbleSort(){
        printBubbleSort();
    }
}
