/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan54.koordinat;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         WarnaKoordinat warkod = new WarnaKoordinat();
        warkod.setNamaWarna("Jingga");
        System.out.println("Warna Koordinat :" + warkod.getNamaWarna());
       
        Koordinat koordinat = new Koordinat();
        koordinat.setX(10);
        koordinat.setY(4);
        System.out.println("Koordinat Sumbu x :" + koordinat.getX());
        System.out.println("Koordinat Sumbu y :" + koordinat.getY());
        
        
       
        
        
        
    }
    
}
