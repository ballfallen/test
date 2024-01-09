/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ban;

import Tester.CauHinh;
import com.sun.source.tree.BreakTree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import Menu_Mon.DonDatMon;
import Menu_Mon.Mon;
import Menu_Mon.DonDatMon;
import Menu_Mon.QuanLyMenu;
import Menu_Mon.MonAn;
import Menu_Mon.MonUong;

/**
 *
 * @author ACER
 */
public class QuanLyBan {

    private List<Ban> ds = new ArrayList<>();
    private DonDatMon doDatMon = new DonDatMon();

    /*  public void Menu() {
//        int n;
//        String m;
//
//        do {
//            System.out.printf("--- Quan li ban ---\n\n");
//            System.out.printf("\n1) Hien thi danh sach cac ban trong quan.");
//            System.out.printf("\n2) Them mot ban trong vao trong quan li,");
//            System.out.printf("\n3) Xoa mot ban vao trong quan li,");
//            System.out.printf("\n4) Tim kiem mot ban theo lua chon.");
//            System.out.printf("\n5) Thoat");
//
//            System.out.printf("\nMoi ban chon yeu cau (1-5): ");
//            n = CauHinh.SC.nextInt();
//
//        } while (n < 1 || n > 5);
//        switch (n) {
//            case 1 -> {
//                System.out.println("1) Hien thi danh sach cac ban trong quan.");
//                this.hienThiDs();
//              }
//            case 2 -> {
//                System.out.println("2) Them mot ban trong vao trong quan li,");
//                this.them();
//              }
//            case 3 -> {
//                System.out.println("3) Xoa mot ban vao trong quan li,");
//                m= CauHinh.SC.nextLine();
//                this.xoa(m);
//              }
//            case 4 -> {
//                do {
//                    System.out.println("1)Tim kiem theo ban trong ");
//                    System.out.println("2)Tim kiem theo ban het ");
//                    System.out.println("3)Tim kiem theo suc chua ");
//                    System.out.println("4)Tim kiem theo ban trong va suc chua");
//                    System.out.printf("Moi ban chon yeu cau (1-4): ");
//                    n = CauHinh.SC.nextInt();
//                } while (n < 1 || n > 4);
//                switch (n) {
//                    case 1:
//                        System.out.println("1)Tim kiem theo ban trong");
//                        this.timKiem(true);
//                        break;
//                    case 2:
//                        System.out.println("2)Tim kiem theo ban het");
//                        this.timKiem(false);
//                    case 3:
//                        System.out.println("3)Tim kiem theo suc chua ");
//                        n = CauHinh.SC.nextInt();
//                        this.timKiem(n);
//                        break;
//                    case 4:
//                        System.out.println("3)Tim kiem theo ban trong va suc chua");
//                        System.out.println("Nhap suc chua:");
//                        n = CauHinh.SC.nextInt();
//                        this.timKiem(true, n);
//                }
//              }
//            case 5 -> {
//              }
//
//        }
//
//    }
     */
    public void them(Ban... b) {
        this.ds.addAll(Arrays.asList(b));
    }

    public void them() {
        Ban bb = new Ban();
        bb.them();
        this.ds.add(bb);
    }

    public void xoa(Ban... bb) {
        this.ds.removeAll(Arrays.asList(bb));
    }

    public void xoa(String maBancanXoa) {
        this.ds.removeIf(h -> h.getMaBan().equalsIgnoreCase(maBancanXoa));
    }

    public void timKiem(String b) {
        this.ds.forEach(h -> {
            if (h.getTinhTrang() == null ? b == null : h.getTinhTrang().equals(b)) {
                h.hienThi1Ban();
            }
        });

    }

    public void datBan(int sL, QuanLyMenu menu) {
            boolean timThayBan = false;
// if (Math.abs(soNguyen - x) < Math.abs(ganNhat - x)) {
//                ganNhat = soNguyen;
//            }



        for (Ban ban : ds) {
            if (ban.getSucChua() >= sL && "co".equals(ban.getTinhTrang())) {
                ban.setTinhTrang("khong");
                datMon(menu);
                System.out.printf("Dat thanh cong ban %s\n", ban.getMaBan());
                ban.hienThi1Ban();
                timThayBan=true;
                break;

            }
            
        }
        if ( !timThayBan)
            System.out.printf("XIN LOI CHUNG TOI DA HET BAN <><> XIN BAN THONG CAM CHO QUAN NHA!!");

    }

    public void datMon(QuanLyMenu menu) {
        int chon ;
        int sl ;
        menu.menu();

        System.out.printf("Nhan -1 de thoat !!!\n");
        while (true) {
            System.out.printf(" Nhap ma san pham (1-10): ");
            chon = CauHinh.SC.nextInt();
            if (chon == -1) {
                break;
            }
            System.out.printf("Nhap so luong: ");
            sl = CauHinh.SC.nextInt();
                if (sl == -1) {
                break;
            }
//            List<Mon> dsMonAn = menu.getDs();
//            this.doDatMon.them(dsMonAn.get(chon ), sl);
            if (chon >= 1 && chon <= 10 && sl >=0) {
                            this.doDatMon.them(chon, menu.getDs().get(chon-1), sl);

//                MonAn monAn = (MonAn) menu.getDs().get(chon - 1);
//                this.doDatMon.them(monAn, sl);
//                System.out.println("Đã thêm món: " + monAn.getTenMon() + " vào đơn đặt món.");
            } else {
                System.out.println("Ma sai ma san pham . VUI LONG NHAP LAI !!!!\n");
            }

        }
    }

    public void hienThiMon() {
        this.doDatMon.hienThi();
    }

    public void tinhTien() {
        if (this.doDatMon.tinhTien()>0)
        System.out.printf("Tong so tien can tra la: %.1f", this.doDatMon.tinhTien());
    }

    public void timKiem(int t) {
        this.ds.forEach(h -> {
            if (h.getSucChua() == t) {
                h.hienThi1Ban();
            }
        });
    }

    public void timKiem(String b, int n) {
        this.ds.forEach(h -> {
            if ((h.getTinhTrang() == null ? b == null : h.getTinhTrang().equals(b)) && h.getSucChua() >= n) {
                h.hienThi1Ban();
            }
        });
    }

    public void hienThiDs() {
        this.ds.forEach(h -> {
            h.hienThi1Ban();
        });

    }

    public void docFile() throws FileNotFoundException {
        String tapTin = "G:\\Database\\com.QuanLyCaPhe\\src\\File_import\\File_Ban.txt";
        File f = new File(tapTin);
        try (Scanner scf = new Scanner(f)) {
            while (scf.hasNext()) {
                this.ds.add(new Ban(scf.nextLine(), Integer.parseInt(scf.nextLine())));
            }
            scf.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Loi File Doc !!!!");
        }

    }

    /**
     * @return the b
     */
    public List<Ban> getB() {
        return ds;
    }

    /**
     * @param b the b to set
     */
    public void setB(List<Ban> b) {
        this.ds = b;
    }

}
