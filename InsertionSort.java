/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ajay C J
 */
import java.util.*;

public class Insertion_Sort {
    public static int i;    
    public static void Insertionsort(int[] A){
        int key;
        i = 0;
        for(int j = 1; j < A.length; j++){
            key = A[j];
            i = j-1;
            while (( i >= 0) && (A[i] > key)){
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = key;
        }
        for(i = 0; i < A.length; i++){
            System.out.println("Element : " +A[i]);
            //A[i] = sc.nextInt() ;
        }
        
    }
     
    public static void main(String arg[]){
        //System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
       // int length = sc.nextInt();*/
        //int lenght = 5;
        int[] A = new int[5];
        for(i = 0; i < A.length; i++){
            //System.out.println("Start");
            A[i] = sc.nextInt() ;
        }
        Insertionsort(A);
    }
    
      
}
