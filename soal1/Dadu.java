/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;

/**
 *
 * @author SDN BANUA ANYAR 3
 */

public class Dadu {
    private int inputUser;
    int total;
    
   //encap
   void setInput (int input){
   this.inputUser=input;}
   //instansiasi objek
   LinkedList<Integer> objDadu=new LinkedList<Integer>();
//method acak nilai
   void acakNilai(){
   for(int i=1; i<= this.inputUser; i++){
   int nilaiAcak = 1 +(int)(Math.random()*6);
 //collection untuk menyimpan objek dadu//
objDadu.add(nilaiAcak);
this.total =this.total + nilaiAcak;
   }}
   void cetakDadu(){
        for(int i=1; i<= this.inputUser; i++){
            System.out.println("Dadu Ke-"  + i + " Bernilai " + objDadu.get (i-1) );
        }
   System.out.println("Total Nilai Dadu Keseluruhan  " + this.total);
   }
}
