/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author USER
 */
public class koneksi {
     private Connection connect; //untuk koneksi ke database
    private String username = "root"; //username localhost
    private String password = ""; //password localhost
    private String jdbc = "jdbc:mysql://localhost:3306/konversi"; //link untuk memnyambungkan ke database

    public Connection getKoneksi(){
        if(connect == null){
            try{
                connect = DriverManager.getConnection(jdbc, username, password); //koneksi ke database menggunakan driver manager
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }
        return connect;
    }

    public static void main(String[] args) {
        koneksi k = new koneksi();
        Connection c = k.getKoneksi();
    }
}
    

