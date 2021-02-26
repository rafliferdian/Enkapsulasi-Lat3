/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author WINDOWS 10
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek baru
        EncapSiswa Siswa = new EncapSiswa();
        //set nama, absen, alamat
        Siswa.setName("Rafli");
        Siswa.setAbsen(25);
        Siswa.setAddress("Malang");
        //output
        System.out.println("Name : "+ Siswa.getName()
        + "     Absen : "+ Siswa.getAbsen()
        + "     Address : " + Siswa.getAddress());
    }
}

