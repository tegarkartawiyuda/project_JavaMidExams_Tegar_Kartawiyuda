package data;

/**
 *
 * @author Tegar
 */
import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        String Nama, Brand, NamaProc, OS, Storage;
        int JmlCore, RAM, Stok;
        
        var input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Barang\t\t: ");
        Nama = input.nextLine();
        
        System.out.print("Masukkan Nama Brand\t\t: ");
        Brand = input.nextLine();
        
        System.out.print("Masukkan Nama Prosesor\t\t: ");
        NamaProc = input.nextLine();
        
        System.out.print("Masukkan Nama OS\t\t: ");
        OS = input.nextLine();
        
        System.out.print("Masukkan Jenis Storage\t\t: ");
        Storage = input.nextLine();
        
        System.out.print("Masukkan Jumlah Core\t\t: ");
        JmlCore = input.nextInt();
        
        System.out.print("Masukkan Jumlah RAM\t\t: ");
        RAM = input.nextInt();
        
        System.out.print("Masukkan Jumlah Stok\t\t: ");
        Stok = input.nextInt();
        
        System.out.println("------------------------");
        var laptop = new Laptop(Nama, Brand, NamaProc, OS, Storage, JmlCore, RAM, Stok);
        System.out.println("Nama Barang\t\t: " + laptop.getNama());
        System.out.println("Nama Brand\t\t: " + laptop.getBrand());
        System.out.println("Prosesor\t\t: " + laptop.getNamaProc());
        System.out.println("Jumlah Core\t\t: " + laptop.getJmlCore());
        System.out.println("Sistem Operasi\t\t: " + laptop.getOS());
        System.out.println("Ukuran RAM (GB)\t: " + laptop.getRAM());
        System.out.println("Jenis Storage\t\t: " + laptop.getStorage());
        System.out.println("Jumlah Stok\t\t: " + laptop.getStok());
    }
}
