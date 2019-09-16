/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_laundry;

/**
 *
 * @author X550ZE
 */
public class ClassLaundry {
    public String namaPelanggan;
  public String jenisCucian;
  public String kategori;
  public String harga;


  @Override
  public String toString(){
    return namaPelanggan +"-"+ jenisCucian +"-"+ kategori +"-"+ harga ;
  }
    
}
