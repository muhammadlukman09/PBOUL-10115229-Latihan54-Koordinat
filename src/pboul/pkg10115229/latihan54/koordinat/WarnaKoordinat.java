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
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;

    public WarnaKoordinat(int x, int y) {
        super(x, y);
    }

    public WarnaKoordinat(String namaWarna, int x, int y) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    WarnaKoordinat() {
        
    }


    public String getNamaWarna() {
        return namaWarna;
        
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
       
    }
    
    
    
    
   
    
    
    
}
