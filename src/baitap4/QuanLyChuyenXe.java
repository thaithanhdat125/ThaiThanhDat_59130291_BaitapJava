/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe{
     ArrayList<ChuyenXe> ds = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    public void themChuyenXe(ChuyenXe cx) 
    {
        ds.add(cx);
    }
    
    public void inDS()
    {
        for (ChuyenXe i : ds)
        {
            if(i instanceof XeNoiThanh)
                {
                    System.out.println("Mã Số Chuyến: "+((XeNoiThanh) i).masoChuyen);
                    System.out.println("Họ Tên Tài Xế: "+((XeNoiThanh) i).hotenTaiXe);
                    System.out.println("Số Xe: "+((XeNoiThanh) i).soXe);
                    System.out.println("Số Tuyến Xe: "+((XeNoiThanh) i).soTuyen);
                    System.out.println("Số Km: "+((XeNoiThanh) i).soKm);
                    System.out.println("Doanh Thu: "+((XeNoiThanh) i).doanhThu);
                    System.out.println("---------------------------");
                }
             if(i instanceof XeNgoaiThanh)
                {
                    System.out.println("Mã Số Chuyến: "+((XeNgoaiThanh) i).masoChuyen);
                    System.out.println("Họ Tên Tài Xế: "+((XeNgoaiThanh) i).hotenTaiXe);
                    System.out.println("Số Xe: "+((XeNgoaiThanh) i).soXe);
                    System.out.println("Nơi Đến: "+((XeNgoaiThanh) i).noiDen);
                    System.out.println("Số Ngày: "+((XeNgoaiThanh) i).soNgay);
                    System.out.println("Doanh Thu: "+((XeNgoaiThanh) i).doanhThu);
                    System.out.println("---------------------------");
                }
        }
    }
    
    public double tinhDoanhThuXeNoiThanh()
    {
        double noi=0;
        for (ChuyenXe i : ds) 
         {
          if(i instanceof XeNoiThanh) noi=noi+((XeNoiThanh) i).doanhThu;        
         }
        return noi;
    }
    
    
    public double tinhDoanhThuXeNgoaiThanh()
    {
        double ngoai=0;
        for (ChuyenXe i : ds) 
         {
          if(i instanceof XeNgoaiThanh) ngoai=ngoai+((XeNgoaiThanh) i).doanhThu;        
         }
        return ngoai;
    }
    
    
    public double TongDoanhThu()
    {
        return tinhDoanhThuXeNoiThanh()+tinhDoanhThuXeNgoaiThanh();
    }//sualan2
}
