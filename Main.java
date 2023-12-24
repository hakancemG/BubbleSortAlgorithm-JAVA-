/**
 *  Project: Bubble Sort Algorithm 
 *  Project author: Hakan Cem GERÇEK.
 **/
package hakancemgercek.bubblesort;

import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) {
        BubbleSort bubble_sort = new BubbleSort();
        try{
            bubble_sort.getInputArray();
            bubble_sort.getBubbleSort();
            bubble_sort.getPrintBubbleSort();
        }
        catch(InputMismatchException e){
            System.out.println("Geçersiz giriş!");
        }
    }
}
