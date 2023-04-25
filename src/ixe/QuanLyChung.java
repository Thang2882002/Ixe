/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ixe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Phi Hung
 */
public class QuanLyChung {
    

    public final static Scanner sc = new Scanner(System.in);
 public static void KK(){
       System.out.printf("%-30s%-30s%-30s%-30s\n","Bien so", "Loai xe","Mau xe","Gia Tien");
 }
 public static void menu() {
        System.out.println("\n______________MENU______________");
        System.out.println("1. Nhap thong tin xe o Hoa Binh");
        System.out.println("2. Nhap thong tin xe o Ha Noi");
        System.out.println("3. Sap xep danh sach theo bien so");
        System.out.println("4. Tim kiem thong tin theo bien so xe");
        System.out.println("5. Thong ke so luong xe quan ly");
        System.out.println("6. Thoat");
    }
    public static void main(String[] args) {
        XeMay xemay[] = null;
        XeMayHaNoi xehn = new XeMayHaNoi();
        XeMayHoaBinh xehb = new XeMayHoaBinh();


        int luachon = 0;

        do {
            menu();
            boolean check1 = false;
            do {

                try {
                    System.out.println("Moi ban nhap lua chon cua ban: ");
                    luachon = Integer.parseInt(sc.nextLine());
                    check1 = true;

                } catch (Exception e) {
                    System.out.println("Lỗi => " + e.getLocalizedMessage());
                    check1 = false;
                }

            } while (check1 ==false);

            switch (luachon) {
                case 1: {
                    System.out.println("Nhap thong tin xe co xe Hoa Binh");
                    xehb.nhap();

                    break;
                }
                case 2: {
                    System.out.println("Nhap thong tin xe co xe Ha Noi");
                    xehn.nhap();
                    break;
                }
                case 3: {
                
                        System.out.println("Theo Ha Noi");
                        xehn.sapXepDanhSachXe();
                        KK();
                        xehn.hienthi();
                  
                        System.out.println("Theo Hoa Binh");
                        xehb.sapXepDanhSachXe();
                        KK();
                        xehb.hienthi();
                   

                    break;
                }
                case 4: {
               System.out.println("Tim kiem thong tin xe cua Ha Noi");
                           xehn.timKiemThongTinXe();
               System.out.println("Tim kiem thong tin xe cua Hoa Binh");
                        xehb.timKiemThongTinXe();
                           
            
                 

                    break;
                }

                case 5:{
                
                        System.out.println("So luong xe Hoa Binh: "+xehb.getN() );

                    
                        System.out.println("So luong xe Ha Noi: "+xehn.getN() );

                    break;

                }
            }


        } while (luachon != 6 );


    }


    
  }

