/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author satrio
 */
public class koneksi {
    private Statement data = null;
    private Connection koneksi = null;
    private String Url = "jdbc:mysql://localhost:3306/pert3_51421398";
    private String DBUser = "root";
    private String DBPassword="";
    
    public koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(Url,DBUser,DBPassword);
            data = this.koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(Throwable ex){
            System.out.println("error : "+ex);
            System.exit(1);
        }
    }
        public Connection getConnection(){
            return koneksi;
        }
        public Statement getStatement(){
            return data;
        }
    }
