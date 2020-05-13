/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String MaHD;
    Date ngayban;
    String tenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHD, Date ngayban, String tenKH) {
        this.MaHD = MaHD;
        this.ngayban = ngayban;
        this.tenKH = tenKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public Date getNgayBan() {
        return ngayban;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayBan(Date ngayban) {
        this.ngayban = ngayban;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", ngayban=" + ngayban + ", tenKH=" + tenKH + '}';
    }
}
