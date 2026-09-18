/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class LayananLaundry {
 
    private final String namaPelanggan;
    private final double beratKg;
    private final double hargaPerKg;
 
    public LayananLaundry(String namaPelanggan, double beratKg, double hargaPerKg) {
        this.namaPelanggan = namaPelanggan;
        this.beratKg = beratKg;
        this.hargaPerKg = hargaPerKg;
    }
 
    public double hitungTotalBayar() {
        return beratKg * hargaPerKg;
    }
 
    public String getJenisLayanan() {
        return "Layanan Laundry";
    }
 
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
 
    public double getBeratKg() {
        return beratKg;
    }
 
    public double getHargaPerKg() {
        return hargaPerKg;
    }
}
