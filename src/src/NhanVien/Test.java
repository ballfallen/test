/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;
import java.io.FileNotFoundException;
import java.time.LocalDate;


/**
 *
 * @author ACER
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        
        NhanVien n1 = new NhanVien("Nguyen Huy Hoang", "Nam", "Binh Phuoc",
                LocalDate.of(2004, 1, 28), LocalDate.of(2017, 1, 28), "DT002");
        NhanVien n2 = new NhanVien("Nguyen Van Thanh", "Nam", "Binh Phuoc",
                LocalDate.of(2001, 10, 24), LocalDate.of(2018, 9, 15), "DH001");
        NhanVien n3 = new NhanVien("Nguyen Thi Binh", "Nu", "Ho Chinh Minh",
                LocalDate.of(2002, 8, 10), LocalDate.of(2019, 9, 5), "NT011");
        NhanVien n4 = new NhanVien("Nguyen Binh", "Nam", "Ho Chinh Minh",
                LocalDate.of(2009, 12, 20), LocalDate.of(2019, 12, 25), "DH001");
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.themNV(n1, n2,n3, n4);
       
      // ql. timKiem("Nguyen");
    ql.timKiem_ngay("20/10/2017","20/10/2018");
    ql.docFileNhanVien();
    ql.timKiem_ngay("15/08/2017", "15/08/2019");
    ql.hienThiDS();
       
    
        
    
    }
}
