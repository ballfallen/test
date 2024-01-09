/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;
import Tester.CauHinh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ACER
 */
public class NhanVien {
     private static int dem;
    private int maNV = ++dem;
    private String hoTenNV;
    private String gioiTinh;
    private String queQuan;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;
    private String idSSM;

    public NhanVien(String hoTenNV, String gioiTinh, String queQuan, LocalDate ngaySinh, LocalDate ngayVaoLam, String idSSM) {
        this.hoTenNV = hoTenNV;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.idSSM=idSSM;
    }

    // gọi contructor
    public NhanVien() {
    }
    public NhanVien(String hoTenNV, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam,String idSSM) {
        this (hoTenNV, gioiTinh, queQuan,  LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)),
                LocalDate.parse(ngayVaoLam, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)),idSSM);
    }

    public void nhap() {
        System.out.printf("-- MaNV: %s\n", this.maNV);
        System.out.print("Ho ten: ");
        this.setHoTenNV(CauHinh.SC.nextLine());
        System.out.print("Gioi tinh(Nam/Nu): ");
        this.setGioiTinh(CauHinh.SC.nextLine());
        System.out.print("Que qnan: ");
        this.setQueQuan(CauHinh.SC.nextLine());
        System.out.print("Ngay sinh (dd/mm/yyyy): " );
        this.setNgaySinh(LocalDate.parse(CauHinh.SC.nextLine(), DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)));
        System.out.print("Ngay vao lam (dd/mm/yyyy): ");
        this.setNgayVaoLam(LocalDate.parse(CauHinh.SC.nextLine(), DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)));
        System.out.print("Ma bo phan:");
        this.setIdSSM( CauHinh.SC.nextLine());
    }

    public void hienThi() {
        System.out.printf("""
                          
                          -- MaNV: %s 
                           Ten: %s 
                           Gioi tinh: %s
                           Que quan: %s 
                           Ngay sinh: %s 
                           Ngay vao lam: %s
                           Ma bo phan: %s
                          """,
                this.getMaNV(),this.getHoTenNV(), this.getGioiTinh(), this.getQueQuan(),
                this.getNgaySinh().format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)),
                this.getNgayVaoLam().format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)), this.getIdSSM());

    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the hoTenNV
     */
    public String getHoTenNV() {
        return hoTenNV;
    }

    /**
     * @param hoTenNV the hoTenNV to set
     */
    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the idSSM
     */
    public String getIdSSM() {
        return idSSM;
    }

    /**
     * @param idSSM the idSSM to set
     */
    public void setIdSSM(String idSSM) {
        this.idSSM = idSSM;
    }

    void hienthi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
