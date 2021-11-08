package com.phongth2004110017.tuan07;

public class Sach {
       // nội dung
       int soluong;
       String theloai;
       int gia;

       // liên kết đến nút tiếp theo
       // tham chiếu
       Sach next;// biến tham chiếu kiểu node

       Sach() {
       }// hàm tạo

       Sach(int s, String t, int g) {
              s = soluong;
              t = theloai;
              g = gia;

       }

       public void inThongTin() {
              System.out.println("====================");
              System.out.println("số lượng: " + soluong);
              System.out.println("thể loại: " + theloai);
              System.out.println("giá: " + gia);
       }
}
