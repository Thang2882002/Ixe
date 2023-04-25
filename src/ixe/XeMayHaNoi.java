/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ixe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class XeMayHaNoi extends XeMay  {
private int n; // so luong xe tai Ha Noi
private XeMay[] dsXe; // danh sach thong tin xe tai Ha Noi
public XeMayHaNoi() {}

public XeMayHaNoi(int n, XeMay[] dsXe) {
    this.n = n;
    this.dsXe = dsXe;
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
        dsXe[i] = new XeMayHaNoi();
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
     System.out.printf("%-30s%-30s%-30s%-30s\n","Bien so", "Loai xe","Mau xe","Gia tien");
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
