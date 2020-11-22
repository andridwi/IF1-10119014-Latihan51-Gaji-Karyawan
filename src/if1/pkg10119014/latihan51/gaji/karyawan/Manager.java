/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan51.gaji.karyawan;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
class Manager extends Karyawan{
private int kehadiarn;
private float tunjanganGolongan, tunjanganJabatan, tunjangankehadiarn;

public int getkehadiran(){
    return this.kehadiran;
}
public void setkehadiran(int kehadiran){
    this.kehadiran = kehadiran;
}
public float tunjangankehadiran(int hadir){
    tunjangan = hadir * 10000;
    return tunjangankehadiran;
}
public float tunjanganJabatan(String jabatan){
    String kapital = jabatan.toUpperCase();
    if (kapital.equals("MANAGER")){
        tunjanganJabatan = 2000000;
    }else if (kapital.equals("KABAG")){
        tunjanganJabatan = 1000000;
    }else{
        tunjanganJabatan = 0;
    }
    return tunjanganJabatan;
}
 public float tunjanganGolongan(int golongan){
        tunjanganGolongan = switch (golongan) {
            case 1 :return 500000;
            case 2 :return 1000000;
            case 3 :return 1500000;
            default:return 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
} 