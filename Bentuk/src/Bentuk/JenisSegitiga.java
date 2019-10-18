
package Bentuk;


public class JenisSegitiga extends Segitiga{ 
    
    public JenisSegitiga(String Jenis, double Alas, double Tinggi) {
        super(Jenis, Alas, Tinggi);
    }
    
    public double SisiMiring(double Alas, double Tinggi) {
        return Math.sqrt(Alas*Alas + Tinggi*Tinggi); 
    }
    
    public double Keliling(double Alas) {
        return 3*Alas;
    }
    
    public double Keliling(double Alas, double Tinggi) {
        return Alas + Tinggi + SisiMiring(Alas, Tinggi);
    }
    
    public void view(double Alas) {
        System.out.println("Keliling Segitiga adalah " +Keliling(Alas));
    }
    
    public void view(double Alas, double Tinggi) {
        System.out.println("Keliling Segitiga adalah " +Keliling(Alas, Tinggi));
    }
    
}
