/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktiviti5.pkg1;

/**
 *
 * @author pc 07
 */
import java.util.Scanner;
public class soalan1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Nama kelas anda: " );
    String namakelas = input.next();
    System.out.print("Bilangan Pelajar: " );
    int bilpelajar = input.nextInt();
    System.out.print("Nama guru kelas anda: " );
    String namaguru = input.next();
    
    System.out.println("--------------------------");
    System.out.println("Nama Kelas : "+namakelas);
    System.out.println("Bilangan Pelajar : "+bilpelajar);
    System.out.println("Nama Guru Kelas : "+namaguru);
    }
    
}
