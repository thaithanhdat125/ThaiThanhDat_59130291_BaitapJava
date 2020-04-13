/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String tenNhanVien;
    int tuoiNhanVien;
    String diachiNhanVien;
    double luongNhanVien;
    int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, int tuoiNhanVien, String diachiNhanVien, double luongNhanVien, int tongSoGioLam) {
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.diachiNhanVien = diachiNhanVien;
        this.luongNhanVien = luongNhanVien;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getDiachiNhanVien() {
        return diachiNhanVien;
    }

    public void setDiachiNhanVien(String diachiNhanVien) {
        this.diachiNhanVien = diachiNhanVien;
    }

    public double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    


//    Phương thức class cá nhân
    public double tinhThuong()
    {
        double n=0;
        if(tongSoGioLam>=200) n= luongNhanVien*0.2;
        if(tongSoGioLam<200&&tongSoGioLam>=100) n= luongNhanVien*0.1;
        if(tongSoGioLam<100) n= luongNhanVien*0;
        return n;
        
    }
//   Trả thông tin
    public String GetTT()
    {
           return "Họ Tên: " + tenNhanVien + "\n" +
                   "Tuổi: " + tuoiNhanVien + "\n" +
                   "Địa Chỉ: " + diachiNhanVien + "\n" +
                   "Tiền Lương: " + luongNhanVien + "\n" +
                   "Tổng Số Giờ Làm: " + tongSoGioLam +"\n" +
                   "Tiền Thưởng: " + tinhThuong() +"\n" +
                   "-----------------------------"+"\n";
    }
    //sualan2
}
