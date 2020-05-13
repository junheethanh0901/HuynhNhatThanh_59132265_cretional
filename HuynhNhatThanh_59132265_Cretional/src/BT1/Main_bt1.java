/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import BT1.CTHD;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Main_bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
                                                   
        CTHD cthd1 = new CTHD("SP01", "OPPO A31", 1, 5000000, 0.10f);
        CTHD ctdh2 = new CTHD("SP02", "Realme Q", 2, 4200000, 0.12f);
        CTHD cthd3 = new CTHD("SP03", "Xiaomi Mi 8 SE", 2, 3800000, 0.13f);
        
        HoaDon hd = new HoaDon.Builder()
                .setHoadonheader(new HoaDonHeader("HD0000", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2020"), "Yết Kêu"))
                .addCTHD(cthd1)
                .addCTHD(ctdh2)
                .addCTHD(cthd3)
                .build();
        System.out.println(hd.toString());
        
    }
    
    
}
