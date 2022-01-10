package com.softlutions.clases;

import com.softlutions.context.Context;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);


    public static void main(String[] args) throws SQLException {

    }

    public static Connection getConnection(){
        String USER = "root";
        String PASSWORD = "rootpw";
        String PORT = "3306";
        String jurl = "jdbc:mysql://localhost:"+PORT+"/prueba";

        BasicConfigurator.configure();
        LOGGER.info("Iniciando conexion a Base de Datos");
        Connection con = null;

        try {
            con = DriverManager.getConnection(jurl, USER, PASSWORD);
            LOGGER.info("Conexion exitosa");
        } catch (SQLException e) {
            LOGGER.info("Error en conexion");
            e.printStackTrace();
        }

        return con;
    }
}
