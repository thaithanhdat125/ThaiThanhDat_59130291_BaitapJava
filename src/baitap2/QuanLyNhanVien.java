/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;



/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy
{
     ArrayList<NhanVien> ds = new ArrayList<>();
     
    public QuanLyNhanVien() {
      
    }
     
    @Override
    public void themNhanVien(NhanVien nv) 
    {
        ds.add(nv);
    }

    @Override
    public void inDS() {
    for (NhanVien i : ds) {
        System.out.print(i.GetTT());
    }
    }
    
}
