package data;

/**
 *
 * @author Tegar
 */
import java.util.Scanner;

public final class Asus extends Laptop{
    Scanner input = new Scanner(System.in);
     String Nama, Brand, NamaProc, OS, Storage;
     int JmlCore, RAM, Stok;
    
    public Asus(String Nama, String Brand, String NamaProc, String OS, String Storage, 
            int JmlCore, int RAM, int Stok) {
        super(Nama, Brand, NamaProc, OS, Storage, JmlCore, RAM, Stok);
    }
    
    String Warna, Storefront_Position;
    float Screen;
    
    @Override
    public void setRAM(int RAM){
        if(RAM < 0){
            System.out.println("Ukuran RAM tidak bisa negatif!");
            System.out.println("Ukuran RAM harus positif (minimum 2)");
            super.setRAM(5);
        }
    }

    public void getWarna() {
        System.out.println("Warna\t\t\t: Putih");
    }
    
    public void getScreen() {
        System.out.println("Lebar Layar\t\t: 14");
    }
    
    public String getStorefront_Position(){
        String Storage = super.getStorage();
        switch(Storage) {
            case "SSD M.2" -> {
                return "Best";
            }
            case "SSD SATA" -> {
                return "Good";
            }
            case "HDD" -> {
                return "Middle";
            }
            default -> {
                    return "unidentified";
            }
        }
    }
}
