/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ixe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



  public class XeMayHoaBinh extends XeMay {
    private int n;
    private XeMay[] dsXe;

    public XeMayHoaBinh() {}

    public XeMayHoaBinh(int n) {
        this.n = n;
        dsXe = new XeMay[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getDsXe() {
        return dsXe;
    }

    public void setDsXe(XeMay[] dsXe) {
        this.dsXe = dsXe;
    }


public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong xe: ");
    n = scanner.nextInt();
    dsXe = new XeMay[n];
    for (int i = 0; i < n; i++) {
        dsXe[i] = new XeMayHaNoi() {};
        System.out.println("Nhap thong tin xe thu " + (i+1) + ":");
        dsXe[i].nhaphh();
    }
}

public void hienthi() {
    for (int i = 0; i < n; i++) {
      
        dsXe[i].hienthihh();
   
    }
}
      
        public void sapXepDanhSachXe() {
            Arrays.sort(dsXe, new Comparator<XeMay>() {
         @Override
        public int compare(XeMay xe1, XeMay xe2) {
            return xe1.getBienso().compareTo(xe2.getBienso());
        }
    });
    System.out.println("Da sap xep danh sach theo bien so.");
        }

public void timKiemThongTinXe() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so xe can tim kiem: ");
    String bienSo = scanner.nextLine();
    boolean timThay = false;
     
      for (int i = 0; i < n; i++) {
        if (dsXe[i].getBienso().equals(bienSo)) {
            dsXe[i].hienthihh();
            timThay = true;
            break;
        }
    }
    if (!timThay) {
        System.out.println("Khong tim thay bien so " + bienSo);
    }  
}
  }
