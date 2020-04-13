/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly
{
    String hotenSinhVien;
    String nganhSinhVien;

    public SinhVienPoly(String hotenSinhVien, String nganhSinhVien) {
        this.hotenSinhVien = hotenSinhVien;
        this.nganhSinhVien = nganhSinhVien;
    }

    public String getHotenSinhVien() {
        return hotenSinhVien;
    }

    public void setHotenSinhVien(String hotenSinhVien) {
        this.hotenSinhVien = hotenSinhVien;
    }

    public String getNganhSinhVien() {
        return nganhSinhVien;
    }

    public void setNganhSinhVien(String nganhSinhVien) {
        this.nganhSinhVien = nganhSinhVien;
    }


    public double getDiem()
    {
        return 0;
    }
    public String getHocLuc()
    {
        String n="";
        if(getDiem()<5) n="Học Sinh Yếu";
        if(getDiem()>=5&&getDiem()<6.5) n="Học Sinh Trung Bình";
        if(getDiem()>=6.5&&getDiem()<7.5) n="Học Sinh Khá";
        if(getDiem()>=7.5&&getDiem()<9) n="Học Sinh Giỏi";
        if(getDiem()>=9&&getDiem()<10) n="Học Sinh Xuất Sắc";
        return n;
    }
    public void Xuat()
    {
        System.out.println("Họ Tên: "+ hotenSinhVien+
                 "\nNgành Học: "+nganhSinhVien);
    }//sualan2
}
