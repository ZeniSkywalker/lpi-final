package classes;


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
public class Projeto {

    private int idProjeto;
    private String titulo;
    private double orcamento;
    private int duracao;
    private String instituicao;
    private AreaDeConhecimento idArea;
    private Date dataEnvio;
    private Date dataResposta;
    private String resultado;

    public Projeto(int idProjeto, String titulo, double orcamento, int duracao, String instituicao, Date dataEnvio, AreaDeConhecimento idArea) {
        this.idProjeto = idProjeto;
        this.titulo = titulo;
        this.orcamento = orcamento;
        this.duracao = duracao;
        this.instituicao = instituicao;
        this.dataEnvio = dataEnvio;
        dataResposta = null;
        resultado = "Aguardando Analise";
        this.idArea = idArea;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public Date getDataResposta() {
        return dataResposta;
    }

    public String getResultado() {
        return resultado;
    }

    public AreaDeConhecimento getAreaDeConhecimento() {
        return idArea;
    }
   

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void setDataResposta(Date dataResposta) {
        this.dataResposta = dataResposta;
    }

    public void setAreaDeConhecimento(AreaDeConhecimento idArea) {
        this.idArea = idArea;
    }

    public void incluir(Connection conn) {
        String sqlInsert
                = "INSERT INTO projeto (idProjeto, titulo, orcamento, duracao, instituicao, idArea, data_envio, resutado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setInt(1, getIdProjeto());
            stm.setString(2, getTitulo());
            stm.setDouble(3, getOrcamento());
            stm.setInt(4, getDuracao());
            stm.setString(5, getInstituicao());
            stm.setInt(6, getIdArea());
            stm.setDate(7, getDataEnvio());
            stm.setString(8, getResultado());
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
        String sqlDelete = "DELETE FROM projeto WHERE idProjeto = ?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlDelete);
            stm.setInt(1, getIdProjeto());
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
                = "UPDATE projeto SET titulo = ?, orcamento = ?, duracao = ?, instituicao = ?, area_de_conhecimento = ?, data_envio= ?, resultado = ? WHERE IdProjeto = ?";
        PreparedStatement stm = null;
        try {
            stm.setInt(1, getIdProjeto());
            stm.setString(2, getTitulo());
            stm.setDouble(3, getOrcamento());
            stm.setInt(4, getDuracao());
            stm.setString(5, getInstituicao());
            stm.setInt(6, getIdArea());
            stm.setDate(7, getDataEnvio());
            stm.setString(8, getResultado());
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
                = "SELECT titulo FROM projeto WHERE idProjeto = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlSelect);
            stm.setInt(1, getIdProjeto());
            rs = stm.executeQuery();
            if (rs.next()) {
                this.setTitulo(rs.getString(1));
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

    private int getIdArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
