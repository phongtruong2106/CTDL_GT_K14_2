package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class NhanvienTestDrive {
    public static void main(String[] args) {
        Nhanvien[] danhSachNv = new Nhanvien[3];
        
        Nhanvien nhanvien0 = new Nhanvien("lưu văn tèo", " 7.000.000đ", "TP Hồ Chí Minh", "tester", "23/6/2003");
        Nhanvien nhanvien1 = new Nhanvien("ngọc Trân", "10.000.000đ", "TP Hồ Chí Minh", "tư vấn khách hàng", "16/4/2002");
        Nhanvien nhanvien3 = new Nhanvien("Trương hoài Phong", "8.000.000đ", "Tiền Giang", "dev", "21/6/2002");
 
        danhSachNv[0] = nhanvien0;
        danhSachNv[1] = nhanvien1;
        danhSachNv[2] = nhanvien3;
 
        for(int i = 0; i < danhSachNv.length; i++ ){
            danhSachNv[i].inThongTin();
        }
         
     }
}
