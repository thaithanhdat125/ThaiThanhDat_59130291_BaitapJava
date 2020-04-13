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
public class SinhVienIT extends SinhVienPoly
{
    double diemJava;
    double diemHTML;
    double diemCSS;

    public SinhVienIT(String hotenSinhVien, String nganhSinhVien,double diemJava, double diemHTML, double diemCSS) {
        super(hotenSinhVien, nganhSinhVien);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

   

    @Override
    public double getDiem() {
        return (2*diemJava+diemCSS+diemHTML)/4;
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

@Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Điểm Tổng Kết: "+getDiem()
        +"\nHọc lực: "+getHocLuc()+ "\n-----------------------------"); //To change body of generated methods, choose Tools | Templates.
    }//sualan2
    
    
    
}
