package classes;

import classes.AreaDeConhecimento;
import java.sql.Date;
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
public class Pessoa {

    private int idPesquisador;
    private int idAvaliador;
    private String cpf;
    private String rg;
    private String nome;
    private String sexo;
    private Date dataDeNascimento;
    private String grauAcademico;
    private String instituicao;
    private int idArea;

    public Pessoa(int idPesquisador, int idAvaliador, String cpf, String rg, String nome, String sexo, Date dataDeNascimento, String grauAcademico, String instituicao, int idArea) {
        this.idPesquisador = idPesquisador;
        this.idAvaliador = idAvaliador;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.grauAcademico = grauAcademico;
        this.instituicao = instituicao;
        this.idArea = idArea;

    }

    public Pessoa() {
    }

    public int getIdAvaliador() {
        return idAvaliador;
    }

    public void setIdAvaliador(int idAvaliador) {
        this.idAvaliador = idAvaliador;
    }

    public int getIdPesquisador() {
        return idPesquisador;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getGrauAcademico() {
        return grauAcademico;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdPesquisador(int idPesquisador) {
        this.idPesquisador = idPesquisador;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public void incluirPesquisador(Connection conn) {
        String sqlInsert
                = "INSERT INTO pesquisador (id_pesquisador, cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao, idArea) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setInt(1, getIdPesquisador());
            stm.setString(2, getCpf());
            stm.setString(3, getRg());
            stm.setString(4, getNome());
            stm.setString(5, getSexo());
            stm.setDate(6, getDataDeNascimento());
            stm.setString(7, getGrauAcademico());
            stm.setString(8, getInstituicao());
            stm.setInt(9, getIdArea());
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

    public void incluirAvaliador(Connection conn) {
        String sqlInsert
                = "INSERT INTO avaliador (id_avaliador, cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao, idArea) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setInt(1, getIdPesquisador());
            stm.setString(2, getCpf());
            stm.setString(3, getRg());
            stm.setString(4, getNome());
            stm.setString(5, getSexo());
            stm.setDate(6, getDataDeNascimento());
            stm.setString(7, getGrauAcademico());
            stm.setString(8, getInstituicao());
            stm.setInt(9, getIdArea());
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

    public void excluirPesquisador(Connection conn) {
        String sqlDelete = "DELETE FROM pesquisador WHERE id_pesquisador = ?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlDelete);
            stm.setInt(1, getIdPesquisador());
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

    public void excluirAvaliador(Connection conn) {
        String sqlDelete = "DELETE FROM avaliador WHERE id_avaliador = ?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlDelete);
            stm.setInt(1, getIdAvaliador());
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

    public void atualizarPesquisador(Connection conn) {
        String sqlUpdate
                = "UPDATE pesquisador SET cpf = ?, rg = ?, nome = ?, sexo = ?, data_nascimento = ?, grau_academico = ?, instituicao = ?, idArea = ?, WHERE id_pesquisador = ?";
        PreparedStatement stm = null;
        try {
            stm.setInt(1, getIdPesquisador());
            stm.setString(2, getCpf());
            stm.setString(3, getRg());
            stm.setString(4, getNome());
            stm.setString(5, getSexo());
            stm.setDate(6, getDataDeNascimento());
            stm.setString(7, getGrauAcademico());
            stm.setString(8, getInstituicao());
            stm.setInt(9, getIdArea());
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

    public void atualizarAvaliador(Connection conn) {
        String sqlUpdate
                = "UPDATE avaliador SET cpf = ?, rg = ?, nome = ?, sexo = ?, data_nascimento = ?, grau_academico = ?, instituicao = ?, idArea = ?, WHERE id_avaliador = ?";
        PreparedStatement stm = null;
        try {
            stm.setInt(1, getIdAvaliador());
            stm.setString(2, getCpf());
            stm.setString(3, getRg());
            stm.setString(4, getNome());
            stm.setString(5, getSexo());
            stm.setDate(6, getDataDeNascimento());
            stm.setString(7, getGrauAcademico());
            stm.setString(8, getInstituicao());
            stm.setInt(9, getIdArea());
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

    
    public void carregarPesquisador(Connection conn) {
        String sqlSelect
                = "SELECT nome, Cpf FROM Pesquisador WHERE id_pesquisador = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlSelect);
            stm.setInt(1, getIdPesquisador());
            rs = stm.executeQuery();
            if (rs.next()) {
                this.setNome(rs.getString(1));
                this.setCpf(rs.getString(2));
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
    
     
    public void carregarAvaliador(Connection conn) {
        String sqlSelect
                = "SELECT nome, Cpf FROM avaliador WHERE id_avaliador = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlSelect);
            stm.setInt(1, getIdPesquisador());
            rs = stm.executeQuery();
            if (rs.next()) {
                this.setNome(rs.getString(1));
                this.setCpf(rs.getString(2));
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
