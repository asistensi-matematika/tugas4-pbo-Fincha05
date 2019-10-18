
package Bentuk;


public class Segitiga extends BangunDatar {
    
    protected double Alas, Tinggi;
    
    public Segitiga (String Jenis, double Alas, double Tinggi) {
        super(Jenis);
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    
    public double Luas(double Alas, double Tinggi) {
        return Alas*Tinggi*0.5;
    }
    
    public void view() {
        System.out.println("Luas segitiga adalah " +Luas(Alas, Tinggi));
        
    } 
    
}
