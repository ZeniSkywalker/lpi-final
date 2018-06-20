
import java.util.*;

class GrandeArea {

    private final String grandesAreas[];
    private final ArrayList<String> areas[];

    public GrandeArea() {
        grandesAreas = new String[7];
        grandesAreas[0] = "Ciências Exatas e da Terra";
        grandesAreas[1] = "Ciências Biológicas";
        grandesAreas[2] = "Engenharias";
        grandesAreas[3] = "Ciências da Saúde";
        grandesAreas[4] = "Ciências Agrárias";
        grandesAreas[5] = "Ciências Sociais e Aplicadas";
        grandesAreas[6] = "Ciências Humanas";
        areas = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            areas[i] = new ArrayList<String>();
        }
        areas[0].add("Matemática");
        areas[0].add("Probabilidade e Estatística");
        areas[0].add("Ciência da Computação");
        areas[0].add("Astronomia");
        areas[0].add("Física");
        areas[0].add("Química");
        areas[0].add("Geociências");
        areas[0].add("Oceanografia");
        areas[1].add("Biologia Geral");
        areas[1].add("Genética");
        areas[1].add("Botânica");
        areas[1].add("Zoologia");
        areas[1].add("Ecologia");
        areas[1].add("Morfologia");
        areas[1].add("Fisiologia");
        areas[1].add("Bioquímica");
        areas[1].add("Biofísica");
        areas[1].add("Farmacologia");
        areas[1].add("Imunologia");
        areas[1].add("Microbiologia");
        areas[1].add("Parasitologia");
        areas[2].add("Engenharia Civil");
        areas[3].add("Medicina");
        areas[4].add("Agronomia");
        areas[5].add("Direito");
        areas[6].add("Filosofia");
    }

    public ArrayList<String> getAreas(int indice) {
        return areas[indice];
    }

    public String getGrandeArea(int indice) {
        return grandesAreas[indice];
    }
}

public class TesteGrandeArea {

    public static void main(String args[]) {
        GrandeArea ga = new GrandeArea();
        for (int i = 0; i < 7; i++) {
            System.out.println("Grande Área: "
                    + ga.getGrandeArea(i));
            System.out.println("Áreas: "
                    + ga.getAreas(i));
        }
    }
}
