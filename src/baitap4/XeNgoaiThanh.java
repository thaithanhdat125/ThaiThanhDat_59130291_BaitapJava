/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Admin
 */
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;

    public XeNgoaiThanh( String masoChuyen, String hotenTaiXe, String soXe,String noiDen, int soNgay,double doanhThu) {
        super(masoChuyen, hotenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
   
    @Override
    public String Xuat() {
        return super.Xuat()+
                 "\nNơi Đến: "+noiDen+
                 "\nSố Ngày: "+soNgay+
                 "\nDoanh Thu: "+doanhThu+
                 "\n------------------------\n"; //To change body of generated methods, choose Tools | Templates.
    }//sualan2
}
