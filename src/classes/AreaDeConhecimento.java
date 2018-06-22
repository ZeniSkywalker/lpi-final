package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiza
 */
public class AreaDeConhecimento {

    private int idArea;
    private String nome;

    public AreaDeConhecimento(int idArea, String nome, GrandeAreaConhecimento idGdArea) {
        this.idArea = idArea;
        this.nome = nome;
        this.idGdArea = idGdArea;
    }
    private GrandeAreaConhecimento idGdArea;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrandeAreaConhecimento getIdGdArea() {
        return idGdArea;
    }

    public void setIdGdArea(GrandeAreaConhecimento idGdArea) {
        this.idGdArea = idGdArea;
    }
    
    

}