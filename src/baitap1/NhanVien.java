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
    String Ten;
    int Tuoi;
    String DiaChi;
    double TienLuong;
    int TongGioLam;

    public NhanVien() {
    }

    public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongGioLam = TongGioLam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getTongGioLam() {
        return TongGioLam;
    }

    public void setTongGioLam(int TongGioLam) {
        this.TongGioLam = TongGioLam;
    }
//    Phương thức class cá nhân
    public double tinhThuong()
    {
        double n=0;
        if(TongGioLam>=200) n= TienLuong*0.2;
        if(TongGioLam<200&&TongGioLam>=100) n= TienLuong*0.1;
        if(TongGioLam<100) n= TienLuong*0;
        return n;
        
    }
//   Trả thông tin
    public String GetTT()
    {
           return "Họ Tên: " + Ten + "\n" +
                   "Tuổi: " + Tuoi + "\n" +
                   "Địa Chỉ: " + DiaChi + "\n" +
                   "Tiền Lương: " + TienLuong + "\n" +
                   "Tổng Số Giờ Làm: " + TongGioLam +"\n" +
                   "Tiền Thưởng: " + tinhThuong() +"\n" +
                   "-----------------------------"+"\n";
    }
    
}
