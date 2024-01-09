/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu_Mon;

import java.io.FileNotFoundException;

/**
 *
 * @author ACER
 */
public class test {

    public static void main(String[] args) throws FileNotFoundException {
        Mon m1 = new MonAn("Banh my", 10000, "Ca ngay", true);
        Mon m2 = new MonAn("Com tam", 20000, "Sang", false);
        Mon m3 = new MonAn("Xoi", 15000, "Sang", true);

        Mon m4 = new MonUong("Sting", 10000, "Ca ngay", true);
        Mon m5 = new MonUong("Cafe", 20000, "Ca ngay", true);
        Mon m6 = new MonUong("Sinh to", 25000, "Ca ngay", false);
//  G:\Database\com.QuanLyCaPhe\src\File_import\File_Menu_GiaBan_MonAn.txt
//G:\Database\com.QuanLyCaPhe\src\File_import\File_Menu_GiaBan_MonUong.txt

        Mon m7 = new MonAn("Banh Da", 13000, "sang", false);
        
//m1.hienThi();
//m2.hienThi();
//m3.hienThi();
//m4.hienThi();
//m5.hienThi();
//m6.hienThi();
//
//m7.hienThi();

        QuanLyMenu ql = new QuanLyMenu();
        ql.themMon(m1, m2, m3, m4, m5, m6, m7);
        
        QuanLyMenu qlm= new QuanLyMenu();
         
//        ql.docfile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Menu_GiaBan_MonAn.txt", CauHinh_Menu.Mon_An);
//        ql.docfile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Menu_GiaBan_MonUong.txt", CauHinh_Menu.Mon_An);

//ql.themMon(CauHinh_Menu.Mon_An);
//        QuanLyMenu ql_An = new QuanLyMenu();
//        QuanLyMenu ql_Uong = new QuanLyMenu();
//        ql_An.docfile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Menu_GiaBan_MonAn.txt", CauHinh_Menu.Mon_An);
//        ql_Uong.docfile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Menu_GiaBan_MonUong.txt", CauHinh_Menu.Mon_An);
//
//        ql_An.menu();

//        QuanLyMenu qlm = new QuanLyMenu();
//        qlm. themMon(m1,m2,m3,m4,m5,m6);
//        
//        
//        
//        
//        qlm.hienThids();
//        qlm.docfile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Menu_GiaBan_MonAn.txt", CauHinh.Mon_An);
    }

}
