
package Bentuk;

public class Persegi extends BangunDatar {
    
    protected double sisi;
    
    public Persegi (String Jenis, double sisi) {
        super(Jenis);
        this.sisi = sisi;
    }
    
    public double Luas(double sisi) {
        return sisi*sisi;
    }
    
    public double Keliling(double sisi) {
        return 4*sisi;
    }
    public void view() {
        System.out.println("Luasnya adalah " +Luas(sisi));
        System.out.println("Keliling adalah " +Keliling(sisi));
    }
}
