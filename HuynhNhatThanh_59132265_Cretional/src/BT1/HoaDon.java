/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import BT1.CTHD;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader hoadonheader;
    
    ArrayList<CTHD> ds;

    public HoaDon() {
    }
    
    protected HoaDon(Builder builder){
        this.hoadonheader = builder.hoadonheader;
        this.ds = builder.ds;
    }
    
    
    public static class Builder{
        HoaDonHeader hoadonheader;
        ArrayList<CTHD> ds;

        public Builder() {
            this.ds = new ArrayList<>();
        }

        public Builder setHoadonheader(HoaDonHeader hoadonheader) {
            this.hoadonheader = hoadonheader;
            return this;
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hoadonheader){
            this.hoadonheader = hoadonheader;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.ds.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        
        String s = hoadonheader.toString();
        for (int i = 0; i < ds.size(); i++) {
            CTHD get = ds.get(i);
            s = s + "\n" + get.toString();
        }
        return s;
    }
   
}