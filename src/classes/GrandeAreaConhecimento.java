package classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luiza
 */
public class GrandeAreaConhecimento {

    private int idGdArea;
    private String nome;

    public GrandeAreaConhecimento(int idGdArea, String nome) {
        this.idGdArea = idGdArea;
        this.nome = nome;
    }

    public int getIdGdArea() {
        return idGdArea;
    }

    public void setIdGdArea(int idGdArea) {
        this.idGdArea = idGdArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incluir(Connection conn) {
        String sqlInsert
                = "INSERT INTO grande_area_conhecimento (idGdArea, nome) VALUES (?, ?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setInt(1, getIdGdArea());
            stm.setString(2, getNome());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        }
    }

    public void excluir(Connection conn) {
        String sqlDelete = "DELETE FROM grande_area_conhecimento WHERE idGdArea = ?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlDelete);
            stm.setInt(1, getIdGdArea());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        }
        
        

    public void atualizar(Connection conn) {
        String sqlUpdate
                = "UPDATE grande_area_conhecimento SET nome = ? WHERE IdGdArea = ?";
        PreparedStatement stm = null;
        try {
            stm.setInt(1, getIdGdArea());
            stm.setString(2, getNome());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        }
    }

        public void carregar(Connection conn) {
        String sqlSelect
                = "SELECT nome FROM grande_area_conhecimento WHERE idGdArea = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlSelect);
            stm.setInt(1, getIdGdArea());
            rs = stm.executeQuery();
            if (rs.next()) {
                this.setNome(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        }

    }

}
