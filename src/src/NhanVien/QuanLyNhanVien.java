/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import NhanVien.NhanVien;
import Tester.CauHinh;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author ACER
 */
public class QuanLyNhanVien {

    private List<NhanVien> ds = new ArrayList<>();

    public void themNV(NhanVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themNV() {
        NhanVien h = new NhanVien();
        h.nhap();
        this.ds.add(h);
    }

    public void xoa(NhanVien... a) {
        this.ds.removeAll(Arrays.asList(a));
    }

    public void xoa() {
        System.out.print("Nhap ma nhan vien can xoa: ");
        int maCanXoa = CauHinh.SC.nextInt();
        this.ds.removeIf(h -> h.getMaNV() == maCanXoa);
    }

    public void timKiem(String kw) // tìm  theo Key
    {
        this.ds.forEach(h -> {
            if (h.getHoTenNV().contains(kw) || h.getQueQuan().contains(kw) || h.getIdSSM().contains(kw)) {
                h.hienThi();
            }
        });

    }

    public void timKiem_ngay(String day1, String day2) {   // tìm theo ngày vào làm
        LocalDate start = LocalDate.parse(day1, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT));
        LocalDate end = LocalDate.parse(day1, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT));
        this.ds.forEach(h -> {
            if (h.getNgayVaoLam().isBefore(start) && h.getNgayVaoLam().isAfter(end)) {
                h.hienThi();
            }
        });
    }

//     this.ds.forEach(h -> {
//            if (
//                    ) {
//                h.hienThi();
//            }
//     public void timKiem ( int n){
//     
//         System.out.println("Sinh nhat cac nhan vien thang "+n +"\n");
//         this.ds.sort(c-> c.
//     }
    //        this.ds.removeIf(h -> h.getMaNV().equalsIgnoreCase(maCanXoa));-> xoa kiểu string
//   public List<NhanVien> timKiem(String tenKw)
//   {
//      return this.ds.stream ().filter(h -> h.getHoTenNV().contains(tenKw).) ;
//   }
//  
    //   public List<NhanVien>  timKiem ( String tenkw)
    public void docFileNhanVien() throws FileNotFoundException {
        String tapTin = "G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_NhanVien.txt";
        File f = new File(tapTin);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new NhanVien(sc.nextLine(), sc.nextLine(),
                        sc.nextLine(), sc.nextLine(),
                        sc.nextLine(), sc.nextLine()));
            }
        }

    }

    public void hienThiDS() {
        this.ds.forEach(h -> h.hienThi());
    }

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

}
