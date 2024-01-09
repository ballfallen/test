/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu_Mon;

import Tester.CauHinh;

/**
 *
 * @author ACER
 */
public abstract class Mon {

    private static int dem;
    protected int maMon = ++dem;
    protected double gia;
    protected String tenMon;
    protected String thoiGianBan;

    public Mon(String tenMon, double gia, String thoiGianBan) {
        this.tenMon = tenMon;
        this.gia = gia;
        this.thoiGianBan = thoiGianBan;
    }

    void hienThi() {
        System.out.printf("-- Ma mon: %d\n", this.maMon);
        System.out.printf("Ten mon: %s\n", this.tenMon);
        System.out.printf("Gia: %.1f\n", this.gia);
        System.out.printf("Thoi gian ban: %s\n", this.thoiGianBan);
    }

    public void them() {
        System.out.printf("Ten Mon: ");
        this.tenMon = CauHinh.SC.nextLine();
        System.out.printf("Gia: ");
        this.gia = Double.parseDouble(CauHinh.SC.nextLine());
        System.out.printf("Thoi gian ban (sang/trua/toi/ca ngay) : ");
        this.thoiGianBan = CauHinh.SC.nextLine();
    }

    /**
     * @return the maMon
     */
    public int getMaMon() {
        return maMon;
    }

    /**
     * @param maMon the maMon to set
     */
    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the tenMon
     */
    public String getTenMon() {
        return tenMon;
    }

    /**
     * @param tenMon the tenMon to set
     */
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    /**
     * @return the thoiGianBan
     */
    public String getThoiGianBan() {
        return thoiGianBan;
    }

    /**
     * @param thoiGianBan the thoiGianBan to set
     */
    public void setThoiGianBan(String thoiGianBan) {
        this.thoiGianBan = thoiGianBan;
    }

}
