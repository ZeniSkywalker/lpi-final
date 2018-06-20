
import java.util.Date;

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

    private String cpf;
    private String rg;
    private String nome;
    private String sexo;
    private Date dataDeNascimento;
    private String grauAcademico;
    private String instituicao;
    private AreaDePesquisa areaDePesquisa;
    private Projeto projeto;

    public Pessoa(String cpf, String rg, String nome, String sexo, Date dataDeNascimento, String grauAcademico, String instituicao, AreaDePesquisa areaDePesquisa) {
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
}
