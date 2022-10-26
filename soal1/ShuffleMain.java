/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;

import java.util.Scanner;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class ShuffleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        //inisiasi
        Dadu dadu =new Dadu();
        //user input untuk dadu
        int inputUser = input.nextInt();
        dadu.setInput(inputUser);
        dadu.acakNilai();
        dadu.cetakDadu();
    }
    
}
