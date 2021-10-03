package com.truonghoaiphong2004110017.tuan01.baitaplamthem;

public class TaikhoanTestDrive {
    public static void main(String[] args) {
        Taikhoan taikhoan;
        taikhoan = new Taikhoan();
        taikhoan.tenChuTaiKhoan = "Trương Hoài Phong";
        taikhoan.soTaiKhoan = "12356488";
        taikhoan.soDuTaiKhoang = "200000đ";

        taikhoan.inThongTinTK();
    }
}
