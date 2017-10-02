/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama="Matt Robin";
        char index5=nama.charAt(5);
        System.out.println(index5); //Menampilkan index ke 5,termasuk spasi, yaitu huruf R
        
        //Menampilkan nilai index ke 5 yaitu R dengan unicode adalah 82, angka 82 adalah unicode
        int uni5=nama.codePointAt(5);
        System.out.println(uni5);       //Saat di run muncul angka 82,adalah unicode
        
        //Character itu diwakili bilangan dari angka 0 sampai 100
        //Jadi saat penulisan seperti:
        int a='c';  //-->Tidak error
        //Atau juga bisa sebaliknya
        char d=10009;   //Ini tidak merah/error karena char dan int memang mempunyai korelasi
       
        //Kode untuk mendapatkan nilai numericValue dari huruf b
        System.out.println(Character.getNumericValue('b'));
        // Saat di print hasilnya 11, 11 ini adalah kode ascii
        
        
        //Menggunakan replace
        //Berfungsi untuk mengganti huruf t pada Matt Robin dengan huruf z
        String jeneng="Matt Robinson";
        jeneng=jeneng.replace('t','z');
        System.out.println(jeneng);
        
        //Mengganti semua huruf vokal dengan underScore(_)
        String aran="Matt Robinson";
        System.out.println(aran.indexOf('o'));//Mengecek index huruf o ada pada index berapa
        System.out.println(aran.indexOf('0'));//Sebagai pembanding dengan index o pada index o sebelumnya
        
        //aran=aran.replace('i','_');
        //System.out.println(aran);
        
        //lalu buatkan array huruf vokal
        char[]vokal={'a','i','u','e','o'};
        for(int i=0;i<vokal.length;i++)
        {
            aran=aran.replace(vokal[i],'_');
        }
        System.out.println(aran);
    }
    
}
