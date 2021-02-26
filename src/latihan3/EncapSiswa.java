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
public class EncapSiswa {
    //deklrasi
    private String name;
    private String address;
    private int absen;
    
    //method non-void
    //memanggil absen
    public int getAbsen(){
        return absen;
    }
    //memanggil nama
    public String getName(){
        return name;
    }
    //memanggil alamat
    public String getAddress(){
        return address;
    }
    //set absen
    public void setAbsen(int newAbsen){
        absen = newAbsen;
    }
    //set nama
    public void setName(String newName){
        name = newName;
    }
    //set alamat
    public void setAddress(String newAddress){
        address = newAddress;
    }
}


