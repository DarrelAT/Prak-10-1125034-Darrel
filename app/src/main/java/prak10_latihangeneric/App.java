package prak10_latihangeneric;

import java.util.Arrays;
import java.util.List;

class Mahasiswa implements Printable, Comparable<Mahasiswa> {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public String getPrintDetail() {
        return "Mahasiswa [Nama: " + nama + ", Nilai: " + nilai + "]";
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return Integer.compare(this.nilai, o.nilai); // Sort berdasarkan nilai
    }

    @Override
    public String toString() {
        return nama + " (" + nilai + ")";
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("=== 1 & 2. TEST PRINT LIST & ARRAY BIASA ===");
        List<String> listNama = Arrays.asList("Darrel", "Budi", "Andi");
        PrintUtil.printList(listNama);

        String[] arrayNama = {"Zebra", "Ayam", "Kucing"};
        PrintUtil.printList(arrayNama);

        System.out.println("\n=== 3. TEST PRINT PRINTABLE LIST ===");
        List<Mahasiswa> listMhs = Arrays.asList(
            new Mahasiswa("Darrel", 85),
            new Mahasiswa("Asep", 90)
        );
        PrintUtil.printPrintableList(listMhs);

        System.out.println("\n=== 4 & 5. TEST PRINT LIST & ARRAY SORTED (Asli Tidak Berubah) ===");
        List<Integer> angkaList = Arrays.asList(5, 2, 9, 1);
        System.out.println("Hasil printListSorted:");
        PrintUtil.printListSorted(angkaList);
        System.out.println("Cek list asli (harus tetap urutan awal 5, 2, 9, 1): " + angkaList);
    }
}