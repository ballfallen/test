/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tester;

import Ban.Ban;
import Ban.QuanLyBan;
import Menu_Mon.Mon;
import Menu_Mon.MonAn;
import Menu_Mon.MonUong;
import Menu_Mon.QuanLyMenu;
import NhanVien.NhanVien;
import NhanVien.QuanLyNhanVien;
import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
//        Mon m1 = new MonAn("Banh my",10000, "Ca ngay", true);
//        Mon m2 = new MonAn( "Com tam",20000, "Sang", false);
//        Mon m3 = new MonAn("Xoi",15000,  "Sang", true);
//
//        Mon m4 = new MonUong(10000, "Sting", "Ca ngay", true);
//        Mon m5 = new MonUong(20000, "Cafe", "Ca ngay", true);
//        Mon m6 = new MonUong(25000, "Sinh to", "Ca ngay", false);
//        
//        QuanLyMenu qlm= new QuanLyMenu();
//        qlm.themMon("MonAn");
//        qlm.hienThids();
        
//        Ban b1 = new Ban(true, 2);
//        Ban b2 = new Ban(false, 4);
//        Ban b3 = new Ban(true, 7);
//        Ban b4 = new Ban(false, 10);
//        Ban b5 = new Ban(true, 8);
////
//        QuanLyBan qlb = new QuanLyBan();
//        qlb.them(b1, b2,b3, b4, b5);   
//        qlb.timKiem(true, 5);
//        qlb.docFile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Ban.txt");
//  qlb.docFile("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Ban.txt");

        NhanVien n1 = new NhanVien("Nguyen Huy Hoang", "Nam", "Binh Phuoc",
                LocalDate.of(2004, 1, 28), LocalDate.of(2003, 1, 28), "DT002");
        NhanVien n2 = new NhanVien("Nguyen Van Thanh", "Nam", "Binh Phuoc",
                LocalDate.of(2001, 10, 24), LocalDate.of(2018, 9, 15), "DH001");
        NhanVien n3 = new NhanVien("Nguyen Thi Binh", "Nu", "Ho Chinh Minh",
                LocalDate.of(2002, 8, 10), LocalDate.of(2019, 9, 5), "NT011");
        NhanVien n4 = new NhanVien("Nguyen Binh", "Nam", "Ho Chinh Minh",
                LocalDate.of(2009, 12, 20), LocalDate.of(2019, 9, 25), "DH001");
        QuanLyNhanVien ql_nv = new QuanLyNhanVien();
       
        ql_nv.themNV(n1, n2, n3, n4);
//        ql_nv.docFileNhanVien("G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_NhanVien.txt");
        ql_nv.hienThiDS();

//        ql_nv.timKiem("Binh");
//        QuanLyMenu ql_menu = new QuanLyMenu();
//        ql_menu.themMon(m1, m2, m3, m4, m5, m6);
//        ql_menu.hienThids();
//        ql.themMon("MonAn");
//        ql.xoaMon(6);
//                ql.themMon("MonUong");
//ql.hienThi();
    }

}
