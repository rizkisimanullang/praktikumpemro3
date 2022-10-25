/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;

import java.util.HashMap;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
    public class Negara {	    
    private HashMap<Integer, String> bulan=new HashMap<Integer, String>();
        private String nama;
	private String jenisKepemimpinan;
        private String namaPemimpin;
        private int tglMerdeka;
        private Integer blnMerdeka;
        private int thnMerdeka;
    public Negara(String nama,String jenisKepemimpinan,String namaPemimpin,int tglMerdeka,int blnMerdeka,int thnMerdeka){
	this.nama=nama;
	this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tglMerdeka=tglMerdeka;
        this.blnMerdeka=blnMerdeka;
        this.thnMerdeka=thnMerdeka;
        initialBulan();
	    }
    public Negara(String nama,String jenisKepemimpinan,String namaPemimpin){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        initialBulan();
	    }
    private void initialBulan(){
	        this.bulan.put(1, "Januari");
	        this.bulan.put(2, "Februari");
	        this.bulan.put(3, "Maret");
	        this.bulan.put(4, "April");
	        this.bulan.put(5, "Mei");
	        this.bulan.put(6, "Juni");
	        this.bulan.put(7, "Juli");
	        this.bulan.put(8, "Agustus");
	        this.bulan.put(9, "September");
	        this.bulan.put(10, "Oktober");
	        this.bulan.put(11, "November");
	        this.bulan.put(12, "Desember");
        }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setJenisKepemimpinan(String jenisKepemimpinan){
        this.jenisKepemimpinan=jenisKepemimpinan;
    }
    public void setNamaPemimpin(String namaPemimpin){
        this.namaPemimpin=namaPemimpin;
    }
    public void setTglMerdeka(int tglMerdeka){
        this.tglMerdeka=tglMerdeka;
    }
    public void setBlnMerdeka(int blnMerdeka){
        this.blnMerdeka=blnMerdeka;
    }
    public void setThnMerdeka(int thnMerdeka){
        this.thnMerdeka=thnMerdeka;
    }
    public String getNama(){
        return this.nama;
    }
    public String getJenisKepemimpinan(){
        return this.jenisKepemimpinan;
    }
    public String getNamaPemimpin(){
        return this.namaPemimpin;
    }
    public int getTglMerdeka(){
        return this.tglMerdeka;
    }
    public int getIntBlnMerdeka(){
        return this.blnMerdeka;
    }
    public String getStringBulanMerdeka(){
        return this.bulan.get(this.blnMerdeka);
    }
    public int getThnMerdeka(){
        return this.thnMerdeka;
    }
    public static boolean isMonarki(String jenisKepemimpinan){
        return jenisKepemimpinan.equalsIgnoreCase("monarki");
    }
    public void printDetail(){
        System.out.print("Negara ");
        System.out.print(this.nama);
        System.out.print(" mempunyai ");
        if(isMonarki(this.jenisKepemimpinan)){
            System.out.print("Raja");
        }else{
            System.out.print(this.jenisKepemimpinan);
        }
        System.out.print(" bernama ");
        System.out.print(namaPemimpin+"\n");
        if (isMonarki(this.jenisKepemimpinan)){
            System.out.print("\n");
            return;
        }
        System.out.print("Deklarasi Kemerdekaan pada Tanggal ");
        System.out.print(this.tglMerdeka+" ");
        System.out.print(this.getStringBulanMerdeka()+" ");
        System.out.print(this.thnMerdeka+"\n\n");
    }
}
