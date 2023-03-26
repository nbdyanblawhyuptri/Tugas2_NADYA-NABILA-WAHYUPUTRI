/*NIM :13020210127
  Nama:Nadya Nabila Wahyuputri
  Hari/Tanggal : Kamis, 23 Maret 2023
  Waktu pengerjaan :10.00
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {
    
    /**
    * @param args
    * @throws IOException
    */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
        
    }
    
}