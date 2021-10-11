package com.phongth2004110017.tuan05.baitaplamthem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class danhsachSV {
    //khai báo đối tượng Arraylist
    private ArrayList<SVDV> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    //phương thức nhập
    public void nhap(){
        System.out.println("nhập sinh viên: ");
        //dùng biến i kiểm tra và hiển thị
        int i = 1;
        //dùng vòng lặp do while
        do{
            System.out.printf("nhập họ và tên sinh viên thứ %d : ", i);
            String st = scanner.nextLine();//nhập chuỗi từ bàn phím
             
            if(st == null || st.equals(""))//tập rỗng
            {
                 break;
            }
        System.out.println("điểm trung bình: ");
        double diemTB = scanner.nextDouble();
        //danh sách 2 tham số( tên , điểm trung bình)
        list.add(new SVDV(st, diemTB));
        //sử dụng kỹ thuật loại bỏ 2 kí tự
        scanner.nextLine();//loại bỏ kí tuej enter trong bộ đệm
        i++;

        } while(true);
    }
    //phương thức hiển thị
    public void hienthi() {
        //dùng vòng lặp for each để hiển thị sv
        System.out.println("danh sách sinh viên");
        for(SVDV svdv : list){
            System.out.printf(" họ và tên: %.2s  , điểm TB:  %.2f \n", svdv.getten(), svdv.getdiemTB());
        }
        
    }
    //phương thứ sắp xếp sinh viên theo khoảng điểm
    public void sapxep(){
        System.out.println("danh sách sau khi sắp xếp");
        //theo tiêu chí điểm trung bình từ thấp tới cao
        Collections.sort(list, (a ,b) -> (int)(a.getdiemTB() - b.getdiemTB()));
        //hiển thị danh sách sau khi sắp xếp
        hienthi();
    }
    //phương thức tìm kiếm
    public void timkiem(){
        System.out.println("nhập tên sinh viên cần tìm: ");
        String ten = scanner.nextLine();
        String a[] = new String[100];
        int n = scanner.nextInt();
        scanner.nextLine();
        
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLine();

		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
      
        System.out.println("----Danh sach sinh vien can tim kiem la: ---");
		for (int i = 0; i < a.length; i++) {
		
			if (a[i].equalsIgnoreCase(ten)) {
				System.out.println("" + a[i]);
			}
    }
    }
    //phương thức tìm và xóa họ tên
    public void timxoa(){
        System.out.println("nhập tên cần tìm và xóa: ");
        String ten = scanner.nextLine();
        SVDV found = null;
        //dùng vòng lặp for each
        for(SVDV svdv : list){
            if(svdv.getten().equals(ten)){
                found = svdv;//không tìm thấy 
            }//lưu vào trong biến found
        }
        if(found != null){
            list.remove(found);
            System.out.println("họ và tên sinh viên vừa chọn đã được xóa");
        }else{
            System.out.println("họ và tên vừa ghi không cóa trên danh sách! thử lại??");
            
        }
    } 
        //phương thức tìm và sửa
        public void timsua() {
            System.out.println("nhập tên cần tìm và sửa: ");
            String ten = scanner.nextLine();
            SVDV found = null;
             
            for(SVDV svdv : list){
                if(svdv.getten().equals(ten)){
                    found =svdv;
                }
            }
     if(found != null){
    
    }
   
    }
    //phương thức menu
    public void menu(){
        System.out.println("=============MENU============");
        do{
            System.out.println("1> nhập danh sách sinh viên");
            System.out.println("2> xuất danh sách sinh viên");
            System.out.println("2> tìm kiếm sinh viên");
            System.out.println("4> tìm và xóa sinh viên");
            System.out.println("5> tìm và sửa họ tên ");
            System.out.println("6> xuất danh sách sinh viên theo khoảng điểm");
            System.out.println("7> thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                     nhap();
                     break;
                case 2:
                     hienthi();
                     break;
                case 3:
                     timkiem();
                     break;
                case 4:
                     timxoa();
                     break;
                case 5:
                     
                     break;
                case 6:
                     sapxep();
                     break;
                case 7:
                     System.exit(0);
            default:
                 System.out.println("nhập không đúng !!! đừng nhập lại:))): ");
                 
            }

        }while(true); //vòng lặp
    }
}
