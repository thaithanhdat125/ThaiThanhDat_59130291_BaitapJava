/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 *
 * @author Admin
 */ 
public abstract class ChuyenXe {
    String masoChuyen;
    String hotenTaiXe;
    String soXe;
    double doanhThu;

    public ChuyenXe(String masoChuyen, String hotenTaiXe, String soXe, double doanhThu) {
        this.masoChuyen = masoChuyen;
        this.hotenTaiXe = hotenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMasoChuyen() {
        return masoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        this.masoChuyen = masoChuyen;
    }

    public String getHotenTaiXe() {
        return hotenTaiXe;
    }

    public void setHotenTaiXe(String hotenTaiXe) {
        this.hotenTaiXe = hotenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

   
    public String Xuat()
    {
        return "Mã Số Chuyến Xe: "+masoChuyen +
                 "\nHọ Tên Tài Xế: " + hotenTaiXe +
                 "\nSố xe: " + soXe;
    }
    //sualan2
}
