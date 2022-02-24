/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import org.javalite.activejdbc.Base;

/**
 *
 * @author Hamed-N
 */
public class DbConn {
    
    private static DbConn instance;
    
    private DbConn() {}
    
    public static DbConn getInstance() {
        if(instance == null)
            instance = new DbConn();
        
        return instance;
        
    }

   public void open() {
       Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost/lab1db?serverTimezone=UTC", "root", "Dator7711");
       //Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost/sportstats?serverTimezone=UTC", "awi", "awipwd");
       //Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://node81563-sql-prgvteknik-20.jls-sto1.elastx.net:11044/awi?useSSL=false", "awi", "awi_123_AWI");
    }
    
    public void close() {
        Base.close();
    }
    
    public static void _open() {
        Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost/lab1db?serverTimezone=UTC", "root", "Dator7711");

        //Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost/sportstats?serverTimezone=UTC", "awi", "awipwd");
    }
    
    public static void _close() {
        Base.close();
    }
}
