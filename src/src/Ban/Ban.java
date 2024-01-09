/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ban;
import Tester.CauHinh;
/**
 * @author ACER
 */
public class Ban {
    
    private static int dem;
    private String maBan;
    private String tinhTrang;
    private int sucChua;

    {
        setMaBan(String.format("B%03d", ++dem));
    }

    
    

    public Ban(String tinhTrang, int sucChua) {
        this.tinhTrang = tinhTrang;
        this.sucChua = sucChua;
    }
    
    

    public Ban() {
    }

    public void hienThi1Ban() {
        System.out.printf("-Ma ban: %s\nTinh trang:%s\nSuc chua:%d\n", 
                this.maBan, this.tinhTrang, this.sucChua);
    }

    public void them() {
        System.out.printf("===== Them ban ======\n");
        System.out.printf("Ma ban: %s\n", this.maBan);
        System.out.printf("Tinh trang (co/khong): ");      
        this.setTinhTrang(CauHinh.SC.nextLine());
        System.out.printf("\nSuc chua:");
        this.setSucChua(CauHinh.SC.nextInt());

    }

    /**
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String  tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

}
