/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu_Mon;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Tester.CauHinh;

/**
 *
 * @author ACER
 */
public class QuanLyMenu {

    private List<Mon> ds = new ArrayList<>();

    public void hienThids() {
        this.ds.forEach(h -> h.hienThi());
    }

    public void themMon(Mon... m) {
        this.ds.addAll(Arrays.asList(m));
    }

    public void themMon(CauHinh_Menu c) {
        if (c == CauHinh_Menu.Mon_An) {
            MonAn m = new MonAn();
            m.them();
            this.ds.add(m);
        } else if (c == CauHinh_Menu.Mon_Uong) {
            Mon m = new MonUong();
            m.them();
            this.ds.add(m);
        }
    }

    public void xoaMon(int maXoa) {
        this.ds.removeIf(h -> h.maMon == maXoa);
    }

    public void xoaMon(String tenMon) {
        this.ds.removeIf(h -> h.tenMon.equalsIgnoreCase(tenMon));
    }

    public void timKiem(int ma) {
        this.ds.forEach(h -> {
            if (h.getMaMon() == ma) {
                h.hienThi();
            }
        });
    }

    public void timKiem(String kw) {
        this.ds.forEach((var h) -> {
            if (!h.tenMon.contains(kw)) {
            } else {
                h.hienThi();
            }
        });
    }

    public void menu() {
        System.out.println("+++++   MENU  +++++++\n");
        this.ds.forEach(h -> {
            System.out.printf("%s- %s ||  %.1f\n", h.maMon, h.tenMon, h.gia);
        });
    }

    public void docfile(String tapTin, CauHinh_Menu c) throws FileNotFoundException {
        File f = new File(tapTin);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                if (c == CauHinh_Menu.Mon_An) {
//                    Mon m = new MonAn;
//                    m.setTenMon(sc.nextLine());
//                    m.setGia(Double.parseDouble(sc.nextLine()));
//                    m.setThoiGianBan(sc.nextLine());
//                    m.se

                    this.ds.add(new MonAn(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Boolean.parseBoolean(sc.nextLine())));
                    //this.ds.add(new MonAn( sc.nextLine(), Integer.parseInt(sc.nextInt()), sc.nextLine(), sc.))
                } else if (c == CauHinh_Menu.Mon_Uong) {
//                    Mon mm = new MonUong();
//                    mm.setTenMon(sc.nextLine());
//                    mm.setGia(Double.parseDouble(sc.nextLine()));
//                    mm.setThoiGianBan(sc.nextLine());
//                    this.ds.add(mm);
                    this.ds.add(new MonUong(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Boolean.parseBoolean(sc.nextLine())));

                }

            }
        }

    }

    public double tinhTien(Mon m, int sl) {
        return m.getGia() * sl;
    }

    public void datMon(QuanLyMenu ql_Mon, QuanLyMenu ql_Uong) {
        int chon=0;
        int sl;
        double tong=0;
        ql_Mon.menu();
        QuanLyMenu ds_dat= new QuanLyMenu();
        while (chon != -1) {
            System.out.printf("Moi nhap ma mon va so luong :  ");
            chon = CauHinh.SC.nextInt();
            sl = CauHinh.SC.nextInt();
             ds_dat.themMon(CauHinh_Menu.Mon_An);

        }

    }

    /**
     * @return the ds
     */
    public List<Mon> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Mon> ds) {
        this.ds = ds;
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
