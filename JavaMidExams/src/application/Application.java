package application;

/**
 *
 * @author Tegar
 */
import data.*;
import java.util.Scanner;

public class Application {
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
        
        if ("Asus".equals(Brand)){
            var asus = new Asus(Nama, Brand, NamaProc, OS, Storage, JmlCore, RAM, Stok);
        
            System.out.println("----------------------------");
            System.out.println("Nama Barang\t\t: " + asus.getNama());
        System.out.println("Nama Brand\t\t: " + asus.getBrand());
        System.out.println("Prosesor\t\t: " + asus.getNamaProc());
        System.out.println("Jumlah Core\t\t: " + asus.getJmlCore());
        System.out.println("Sistem Operasi\t\t: " + asus.getOS());
        System.out.println("Ukuran RAM (GB)\t: " + asus.getRAM());
        System.out.println("Jenis Storage\t\t: " + asus.getStorage());
        System.out.println("Storefront\t\t: " + asus.getStorefront_Position());
        System.out.println("Jumlah Stok\t\t: " + asus.getStok());
        asus.getWarna();
        asus.getScreen();
        } else if ("Lenovo".equals(Brand)){
            var lenovo = new Lenovo(Nama, Brand, NamaProc, OS, Storage, JmlCore, RAM, Stok);
        
            System.out.println("----------------------------");
            System.out.println("Nama Barang\t\t: " + lenovo.getNama());
        System.out.println("Nama Brand\t\t: " + lenovo.getBrand());
        System.out.println("Prosesor\t\t: " + lenovo.getNamaProc());
        System.out.println("Jumlah Core\t\t: " + lenovo.getJmlCore());
        System.out.println("Sistem Operasi\t\t: " + lenovo.getOS());
        System.out.println("Ukuran RAM (GB)\t: " + lenovo.getRAM());
        System.out.println("Jenis Storage\t\t: " + lenovo.getStorage());
        System.out.println("Jumlah Stok\t\t: " + lenovo.getStok());
        System.out.println("Warna\t\t\t: " + lenovo.getWarna());
        System.out.println("Layar\t\t\t: " + lenovo.getScreen());
        } else {
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
}
