
package Bentuk;


public class Lingkaran extends BangunDatar{
    
    protected double jarijari;
    
    public Lingkaran(String Jenis, double jarijari) {
        super(Jenis);
        this.jarijari = jarijari;
    }
    
    public double Luas(double jarijari) {
        return 3.14*jarijari*jarijari;
    }
    
    public double Keliling(double jarijari) {
        return 3.14*2*jarijari;
    }
    
    public void view() {
        System.out.println("Luas lingkaran adalah " +Luas(jarijari));
        System.out.println("keliling lingkaran adalah " +Keliling(jarijari));
    } 
}
