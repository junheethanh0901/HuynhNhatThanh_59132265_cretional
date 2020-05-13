/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Admin
 */
public class CTHD {
    
    String maSanPham;
    String tenSanPham;
    int soluong;
    double dongia;
    float chietkhau;

    public CTHD() {
    }

    public CTHD(String maSanPham, String tenSanPham, int soluong, double dongia, float chietkhau) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soluong;
    }

    public double getDonGia() {
        return dongia;
    }

    public float getChietKhau() {
        return chietkhau;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soluong) {
        this.soluong = soluong;
    }

    public void setDonGia(double dongia) {
        this.dongia = dongia;
    }

    public void setChietKhau(float chietkhau) {
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "maSanPham=" + maSanPham + ", "
                + "tenSanPham=" + tenSanPham + ", soluong=" + soluong + ", "
                + "dongia=" + dongia + " VND" +", chietkhau=" + chietkhau * 100 + "%" + '}';
    }
     
}
