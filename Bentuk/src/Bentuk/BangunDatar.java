
package Bentuk;

public class BangunDatar {
    
    protected String Jenis;
    
    public BangunDatar(String Jenis) {
        this.Jenis = Jenis;
    }
    public void view() {
        System.out.println("Nama bangun datar adalah " +this.Jenis);
    } 
}
