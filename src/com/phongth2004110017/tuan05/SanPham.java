package com.phongth2004110017.tuan05;

public class SanPham {
    private String ten; // trường
    private double gia;  // 

        //tạo hàm dựng 
        public SanPham(){
              this.ten = null;
              this.gia = 0;
        }
        //hàm dựng khởi tạo giá trị cho tên và giá
        public SanPham(String ten, double gia) {
            this.ten = ten;
            this.gia = gia;
            
        }

    public double  getgia() {
        return gia;
        
    }
    public void setgia(double gia){
        this.gia = gia;
    }
    public void setten(String ten){
        this.ten = ten; // phương thức setter 
    }
    public String getten(){
        return this.ten; // phương thức getter
    }
}
