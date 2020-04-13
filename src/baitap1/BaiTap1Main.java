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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.err.println("-----------Bài 1-----------");
        NhanVien Phap = new NhanVien("Phạm Văn Pháp",21,"Chicago",7000000,170);
        NhanVien Hoang = new NhanVien("Đỗ Minh Hoàng",21,"Nha Trang",5000000,90);
        System.out.println(Phap.GetTT());
        System.out.println(Hoang.GetTT());
    }
    //sualan2
}
