/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */

public class CuciKering extends LayananLaundry {
 
    private static final double TARIF_PER_KG = 6000;
 
    public CuciKering(String namaPelanggan, double beratKg) {
        super(namaPelanggan, beratKg, TARIF_PER_KG);
    }
 
    @Override
    public String getJenisLayanan() {
        return "Cuci Kering";
    }
}
