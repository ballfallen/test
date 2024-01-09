/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu_Mon;

import Tester.CauHinh;

//G:\Database\com.QuanLyCaPhe\src\Tester
/**
 *
 * @author ACER
 */
public class MonAn extends Mon {

    protected boolean is_chay;
    

    public MonAn() {
        super(null, 0, null);
    }

    
    public MonAn( String tenMon, double gia, String thoiGianBan,boolean is_chay) {
        super(tenMon, gia, thoiGianBan);
        this.is_chay = is_chay;
    }
    /**
     * @return the is_chay
     */
    
    
    public boolean isIs_chay() {
        return is_chay;
    }

    /**
     * @param is_chay the is_chay to set
     */
    public void setIs_chay(boolean is_chay) {
        this.is_chay = is_chay;
    }

    @Override
    public void hienThi() {
       super.hienThi();
        System.out.printf("Mon chay:  %s\n", this.isIs_chay());
    }

    @Override
    public void them() {
       
        super.them();
        System.out.printf("Mon chay ?(Co/Khong): ");
        String s=CauHinh.SC.nextLine();
        this.setIs_chay(s.equalsIgnoreCase("Co"));

        

    }


}
