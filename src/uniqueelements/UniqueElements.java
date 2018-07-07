/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniqueelements;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int NumArray[] = new int [n];
        for(int i = 0; i < n; i++){
            int a = reader.nextInt();
            NumArray[i] = a;
        }
        int b = 1;
        for(int j = 0; j < n; j++){
            for(int l = 0; l < n; l++){
                if(j < l){
                    if(NumArray[j] != NumArray[l]){
                    b += 1;
                    }
                }
            }
        }
        b = b/2;
        System.out.print(b);
        
        
    }
}
