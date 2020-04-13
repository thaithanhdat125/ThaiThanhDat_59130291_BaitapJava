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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly Nhac = new SinhVienIT("Phạm Vương Lam Nhạc","Công Nghệ Thông Tin",8,7, 7.5);
        SinhVienPoly Long= new SinhVienBiz("Nguyễn Hoàng Long","Quản Trị Kinh Doanh",6,7);
        SinhVienPoly Hoang= new SinhVienBiz("Đỗ Minh Hoàng","Quản Trị Kinh Doanh",9,9.5);
        System.err.println("---Thông Tin Sinh Viên---");
        Nhac.Xuat();
        Long.Xuat();
        Hoang.Xuat();
    }//sualan2
    
}
