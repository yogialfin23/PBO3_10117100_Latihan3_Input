/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117100_latihan3_input;

import java.util.Scanner;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class PBO3_10117100_Latihan3_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
