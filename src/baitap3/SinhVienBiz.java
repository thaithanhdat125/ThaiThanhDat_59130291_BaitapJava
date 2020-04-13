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
public class SinhVienBiz extends SinhVienPoly
{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(String hotenSinhVien, String nganhSinhVien,double diemMarketing, double diemSales) {
        super(hotenSinhVien, nganhSinhVien);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    

   

    @Override
    public double getDiem() {
        return (2*diemMarketing+diemSales)/3;
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
