
package exame;

import javafx.scene.control.TableColumn;

public class DadosDoTime {
    private String time;
    private String vitorias;
    private String empates;
    private String derrotas;
    private String pontos;
    
    public DadosDoTime(String time, String vitorias, String empates, String derroras, String pontos){
        this.time = time;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derroras;
        this.pontos = pontos;
    }
    public DadosDoTime(){
        this.time = "Time Sem Nome";
        this.vitorias = "0";
        this.empates = "0";
        this.derrotas = "0";
        this.pontos = "0";
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVitorias() {
        return vitorias;
    }

    public void setVitorias(String vitorias) {
        this.vitorias = vitorias;
    }

    public String getEmpates() {
        return empates;
    }

    public void setEmpates(String empates) {
        this.empates = empates;
    }

    public String getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(String derrotas) {
        this.derrotas = derrotas;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    void setTime(TableColumn.CellDataFeatures<DadosDoTime, String> dadosDoTimeStringCellEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
