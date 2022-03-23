package data;

/**
 *
 * @author Tegar
 */
import java.util.Scanner;

public class Lenovo extends Laptop{
    Scanner input = new Scanner(System.in);
    private String Nama, Brand, NamaProc, OS, Storage;
    private int JmlCore, RAM, Stok;
    
    public Lenovo(String Nama, String Brand, String NamaProc, String OS, String Storage, 
            int JmlCore, int RAM, int Stok) {
        super(Nama, Brand, NamaProc, OS, Storage, JmlCore, RAM, Stok);
    }
    
    String Warna, Storefront_Position;
    float Screen;
    
    public void Stok(){
        if (Stok<=0){
            Stok = 0;
        }
    }

    public String getWarna() {
        System.out.println("Warna\t\t: Hitam");
        return getWarna();
    }
    
    public float getScreen() {
        System.out.println("Lebar Layar\t: 15.6");
        return getScreen();
    }
    
    public String getStorefront_Position(){
        if ("SSD M.2".equals(Storage)){
            Storefront_Position = "Best";
        } else if ("SSD SATA".equals(Storage)){
            Storefront_Position = "Good";
        } else if ("HDD".equals(Storage)){
            Storefront_Position = "Middle";
        } else {
            Storefront_Position = "unknown";
        }
        return Storefront_Position;
    }
}
