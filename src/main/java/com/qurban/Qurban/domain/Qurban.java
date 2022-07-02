/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qurban.Qurban.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Shabiq
 */
@Entity
public class Qurban {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String mudohi;
    private String jenis_qurban;
    private String tipe_qurban;
    private Long harga;
    private String jenis_pembayaran;

    public Qurban() {
    }

    public Qurban(Long id, String mudohi, String jenis_qurban, String tipe_qurban, Long harga, String jenis_pembayaran) {
        this.id = id;
        this.mudohi = mudohi;
        this.jenis_qurban = jenis_qurban;
        this.tipe_qurban = tipe_qurban;
        this.harga = harga;
        this.jenis_pembayaran = jenis_pembayaran;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMudohi() {
        return mudohi;
    }

    public void setMudohi(String mudohi) {
        this.mudohi = mudohi;
    }

    public String getJenis_qurban() {
        return jenis_qurban;
    }

    public void setJenis_qurban(String jenis_qurban) {
        this.jenis_qurban = jenis_qurban;
    }

    public String getTipe_qurban() {
        return tipe_qurban;
    }

    public void setTipe_qurban(String tipe_qurban) {
        this.tipe_qurban = tipe_qurban;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public String getJenis_pembayaran() {
        return jenis_pembayaran;
    }

    public void setJenis_pembayaran(String jenis_pembayaran) {
        this.jenis_pembayaran = jenis_pembayaran;
    }
}
