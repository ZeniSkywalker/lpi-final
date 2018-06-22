package classes;


import classes.AreaDePesquisa;
import java.util.Date;
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
    private String cpf;
    private String rg;
    private String nome;
    private String sexo;
    private Date dataDeNascimento;
    private String grauAcademico;
    private String instituicao;
    private AreaDePesquisa areaDePesquisa;
    private Projeto projeto;

    public Pessoa(int idPesquisador, String cpf, String rg, String nome, String sexo, Date dataDeNascimento, String grauAcademico, String instituicao, AreaDePesquisa areaDePesquisa) {
        this.idPesquisador = idPesquisador;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.grauAcademico = grauAcademico;
        this.instituicao = instituicao;
        this.areaDePesquisa = areaDePesquisa;
        this.projeto = projeto;
    }

    public Pessoa() {
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

    public AreaDePesquisa getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public Projeto getProjeto() {
        return projeto;
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

    public void setAreaDePesquisa(AreaDePesquisa areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void incluirPesquisador(Connection conn) {
        String sqlInsert
                = "INSERT INTO pesquisador (id_pesquisador, cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao, area_de_pesquisa, projeto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            stm.setString(9, getAreaDePesquisa());
            stm.setString(10, getProjeto());
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
                = "INSERT INTO avaliador (id_avaliador, cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao, area_de_pesquisa, projeto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            stm.setString(9, getAreaDePesquisa());
            stm.setString(10, getProjeto());
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
        String sqlDelete = "DELETE FROM pesquisador WHERE idPesquisador = ?";
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

    public void atualizar(Connection conn) {
        String sqlUpdate
                = "UPDATE Pesquisador SET cpf = ?, rg = ?, nome = ?, sexo = ?, data_nascimento = ?, grau_academico = ?, instituicao = ?, area_de_pesquisa = ?, projeto = ?   WHERE IdPesquisador = ?";
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
            stm.setString(9, getAreaDePesquisa());
            stm.setString(10, getProjeto());
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
                = "SELECT nome, Cpf FROM Pesquisador WHERE idPesquisador = ?";
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
