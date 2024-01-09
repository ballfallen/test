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
public  class MonUong  extends Mon{
     protected boolean  is_da;

    public MonUong( String tenMon,double gia, String thoiGianBan, boolean is_da) {
        super( tenMon, gia,  thoiGianBan);
        this.is_da=is_da;
    }

    public MonUong() {
        super(null, 0, null);
    }
    /**
     * @return the is_da
     */
    public boolean isIs_da() {
        return is_da;
    }

    /**
     * @param is_da the is_da to set
     */
    public void setIs_da(boolean is_da) {
        this.is_da = is_da;
    }

    @Override
    public void hienThi() {
           super.hienThi();
        System.out.printf("Mon chay:  %s\n", this.is_da);
    }

    @Override
    public void them() {
      super. them();
        System.out.printf("Mon co da?(Co/Khong): ");
        String s=CauHinh.SC.nextLine();
        this.is_da = s.equalsIgnoreCase("Co");


    }
     
    
    
}
