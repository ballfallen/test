/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu_Mon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Menu_Mon.Mon;

/**
 *
 * @author ACER
 */
public class DonDatMon {

    private List<Mon> ds_Mon;
    private List<Integer> soLuong;

    public DonDatMon() {
        this.ds_Mon = new ArrayList<>();
        this.soLuong = new ArrayList<>();
    }

    public void them(Mon m, Integer sl) {
        this.ds_Mon.add(m);
        this.soLuong.add(sl);
    }

    public void them(int ma, Mon m, int sl) {
        if (ma == m.maMon) {
            this.ds_Mon.add(m);
            this.soLuong.add(sl);
        }
    }

    public double tinhTien() {
        double tong = 0;
        for (int i = 0; i < ds_Mon.size(); i++) {
            Mon m = ds_Mon.get(i);
            int sl = soLuong.get(i);
            tong += m.getGia() * sl;
        }
        return tong;
    }

    public void hienThi() {
        System.out.printf("===== DANH SACH CAC MON DA DAT =====\n");

        //for ( int i=0; this.ds_Mon!= null && this.soLuong!= null; i++)
//        int i = 0;
//        while (this.ds_Mon[i] != null) {
//            System.out.printf("%s  ||  %.1f ", this.ds_Mon.get(i), this.soLuong.get(i));
//            i++:
//        }
//        
        for (int i = 0; i < this.ds_Mon.size(); i++) {
            System.out.printf("%s  ||  %d   ||  %.1f  \n", this.ds_Mon.get(i).getTenMon(), this.soLuong.get(i).intValue(), this.ds_Mon.get(i).gia);
        }
    }
//    public void hienThi() {
//        System.out.printf("Danh sach mon da dat: \n");
//        int i=0;
//        this.ds_Mon.forEach(h-> {
//            System.out.printf("%s   ||   %d     || %d", h.tenMon, h.gia,this.soLuong);
//        });
//    }

    /**
     * @return the ds_Mon
     */
    public List<Mon> getDs_Mon() {
        return ds_Mon;
    }

    /**
     * @param ds_Mon the ds_Mon to set
     */
    public void setDs_Mon(List<Mon> ds_Mon) {
        this.ds_Mon = ds_Mon;
    }

    /**
     * @return the soLuong
     */
    public List<Integer> getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(List<Integer> soLuong) {
        this.soLuong = soLuong;
    }

}
