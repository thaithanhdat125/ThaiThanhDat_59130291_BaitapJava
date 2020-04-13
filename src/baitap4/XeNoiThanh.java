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
public class XeNoiThanh extends ChuyenXe{
    int soTuyen;
    int soKm;

    public XeNoiThanh(String MaSoChuyen, String HoTenTX, String SoXe,int SoTuyen, int SoKm,  double DoanhThu) {
        super(MaSoChuyen, HoTenTX, SoXe, DoanhThu);
        this.soTuyen = SoTuyen;
        this.soKm = SoKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.soTuyen = SoTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int SoKm) {
        this.soKm = SoKm;
    }

    @Override
    public String Xuat() {
        return super.Xuat()+
                 "\nSố Tuyến: "+soTuyen+
                 "\nSố Km đi được: "+soKm+
                 "\nDoanh Thu: "+doanhThu+
                 "\n------------------------\n"; //To change body of generated methods, choose Tools | Templates.
    }
    //sualan2
    
}
