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
public class AreaDePesquisa {

    private int codigo;
    private String areaDeConhecimento;
    private String grandesAreas;

    public AreaDePesquisa(int codigo, String areaDeConhecimento, String grandesAreas) {
        this.codigo = codigo;
        this.areaDeConhecimento = areaDeConhecimento;
        this.grandesAreas = grandesAreas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAreaDeConhecimento() {
        return areaDeConhecimento;
    }

    public String getGrandesAreas() {
        return grandesAreas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAreaDeConhecimento(String areaDeConhecimento) {
        this.areaDeConhecimento = areaDeConhecimento;
    }

    public void setGrandesAreas(String grandesAreas) {
        this.grandesAreas = grandesAreas;
    }

}
