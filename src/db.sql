/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Amalia
 * Created: Jul 8, 2021
 */


CREATE DATABASE dbkasir;
USE dbkasir;

CREATE TABLE karyawan(
    namaPegawai VARCHAR(50),
    idPegawai VARCHAR(10)
); 

CREATE TABLE menu(
    produk VARCHAR(30),
    harga INT,
    gambar BLOB
);

CREATE TABLE pemesanan(
    transaksi INT,
    tanggal DATE,
    jam TIME,
    nomor VARCHAR(5),
    nama VARCHAR(30),
    jml INT,
    harga INT,
    total INT
);

CREATE TABLE laporan (
    berapa INT,
    tanggal DATE,
    namaKasir VARCHAR(50),
    pendapatan INT
);