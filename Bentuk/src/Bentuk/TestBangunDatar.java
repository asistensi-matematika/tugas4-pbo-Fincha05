
package Bentuk;

import java.util.Scanner;

public class TestBangunDatar {


    public static void main(String[] args) {
        Scanner Fincha = new Scanner(System.in);
        
        System.out.println("Pilih bangun datar yg diinginkan");
        
        System.out.println("1. Persegi\n2. Lingkaran\n3. Segitiga");
        
        System.out.print("Masukan pilihan anda : ");
        int pilihan = Fincha.nextInt();
        switch(pilihan) {
            case 1 :
                System.out.print("Masukan panjang sisi : ");
                double sisi = Fincha.nextDouble();
                Persegi kotak = new Persegi("Persegi",sisi);
                BangunDatar datar1 = new BangunDatar("Persegi");
                datar1.view();
                kotak.view();
                break;
            case 2 :
                System.out.print("Masukan jari-jari : ");
                double jarijari = Fincha.nextDouble();
                Lingkaran bulat = new Lingkaran("Lingkaran", jarijari);
                BangunDatar datar2 = new BangunDatar("Lingkaran");
                datar2.view();
                bulat.view();
                break;
            case 3 :
                System.out.println("Pilih Segitiga yg diinginkan");
                System.out.println("1. Segitiga siku-siku\n2. Segitiga sama sisi");
                System.out.print("Masukan pilihan anda : ");
                int choose = Fincha.nextInt();
                System.out.print("Masukan panjang alas : ");
                double alas = Fincha.nextDouble();
                System.out.print("Masukan panjang tinggi : ");
                double tinggi = Fincha.nextDouble();
                BangunDatar datar3 = new BangunDatar("Segitiga");
                datar3.view();
                Segitiga iluminati = new Segitiga("Segitiga", alas, tinggi);
                iluminati.view();
                switch(choose) {
                    case 1 :
                        JenisSegitiga piramid = new JenisSegitiga("Segitiga siku-siku", alas, tinggi);
                        System.out.println("Jenis Segitiga adalah Segitiga Siku Siku ");
                        piramid.view(alas, tinggi);
                        break;
                    case 2 : 
                      JenisSegitiga rantai = new JenisSegitiga("Segitiga sama sisi", alas, tinggi);
                        System.out.println("Jenis Segitiga adalah Segitiga Sama Sisi ");
                        rantai.view(alas);
                        break;      
                }
                
                
        }
        
    }
    
}
