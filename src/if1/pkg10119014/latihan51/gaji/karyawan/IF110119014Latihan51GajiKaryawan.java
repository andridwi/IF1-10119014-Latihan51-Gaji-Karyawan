/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan51.gaji.karyawan;

import java.util.Scanner;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Manager manager = new Manager();
    
    System.out.println("====Program Perhitungan Gaji Karyawwan===");
    System.out.print("Masukan NIK : ");
    manager.setNik(scanner.next());
    System.out.print("Masukan Nama : ");
    manager.setNama(scanner.next());
    System.out.print("Masukan Golongan (1/2/3) : ");
    manager.setGolongan(scanner.nextInt());
    System.out.print("Masukan Jabatan (Manager/Kabag");
    manager.setJabatan(scanner.next());
    System.out.print("Masukan Jumlah Kehadiran : ");
    manager.setKehadiran(scanner.nextInt());
    System.out.println();
    
    int golongan = manager.getGolongan();
    String jabatan = manager.getJabatan();
    int kehadiran = manager = manager.getKehadiran();
    System.out.println("===Hasil Perhitungan===");
    System.out.println("NIK\t : " + manager.getNik());
    System.out.println("NAMA\t : " + manager.getNama());
    System.out.println("GOLONGAN\t : " + manager.getGolongan());
    System.out.println("JABATAN\t : " + manager.getJabatan());
    System.out.println();
    
    System.out.println("TUNJANGAN GOLONGAN\t : " + manager.tunjanganGolongan(golongan));
    System.out.println("TUNJANGAN JABATAN : " + manager.tunjanganJabatan(jabatan));
    System.out.println("TUNJANGAN KEHADIRAN\t : " + manager.tunjanganKehadiran(kehadiran));
   
    System.out.println("Gaji Total\t\t: " + manager.gajiTotal());
}
}