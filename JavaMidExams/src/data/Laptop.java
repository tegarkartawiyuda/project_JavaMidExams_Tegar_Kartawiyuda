package data;

/**
 *
 * @author Tegar
 */
public class Laptop {
    private String Nama, Brand, NamaProc, OS, Storage;
    private int JmlCore, RAM, Stok;
    
    public Laptop(String Nama, int Stok){
        this.setNama(Nama);
        this.setStok(Stok);
    }
    
    public Laptop(String Nama, String Brand, String NamaProc, String OS,
            String Storage, int JmlCore, int RAM, int Stok){
        this(Nama, Stok);
        this.setBrand(Brand);
        this.setNamaProc(NamaProc);
        this.setOS(OS);
        this.setStorage(Storage);
        this.setJmlCore(JmlCore);
        this.setRAM(RAM);
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getNamaProc() {
        return NamaProc;
    }

    public void setNamaProc(String NamaProc) {
        this.NamaProc = NamaProc;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public int getJmlCore() {
        return JmlCore;
    }

    public void setJmlCore(int JmlCore) {
        this.JmlCore = JmlCore;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }
}
