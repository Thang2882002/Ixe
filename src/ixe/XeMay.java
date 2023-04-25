/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ixe;

import java.util.Arrays;
import java.util.Scanner;


public abstract class XeMay implements Ixe{

    /**
     * @param args the command line arguments
     */
 private String bienso;
    private String loaixe;
    private String mauxe;
    private float giatien;

    public XeMay() {}

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }



    public void nhaphh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bien so: ");
        bienso = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaixe = sc.nextLine();
        System.out.print("Nhap mau xe: ");
        mauxe = sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giatien = sc.nextFloat();
    }
    

 
    public void hienthihh() {
         System.out.printf("%-30s%-30s%-30s%-30f\n",this.bienso,this.loaixe,this.mauxe,this.giatien);
    }




  
}
