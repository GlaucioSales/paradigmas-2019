package exame;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.stage.FileChooser;

class Open {
    private ArrayList<DadosDoTime> times = new ArrayList<>();
    private String[] dadosDaLinha;
    private String nomeDoTime;
    private String vitorias;
    private String empates;
    private String derrotas;
    private String pontos;
    
    public void abrir(){
        FileChooser caminhoDoBotaoOpen = new FileChooser();
        caminhoDoBotaoOpen.setInitialDirectory(new File ("C:"));
        caminhoDoBotaoOpen.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*csv"));
        File arquivoSelecionado = caminhoDoBotaoOpen.showOpenDialog(null);
        if(arquivoSelecionado != null){           
            try{
                Scanner lido = new Scanner(arquivoSelecionado);
                while(lido.hasNext()){
                    String proximaLinha = lido.nextLine();
                    dadosDaLinha = proximaLinha.split(";");
                    nomeDoTime = dadosDaLinha[0];
                    vitorias = dadosDaLinha[1];
                    empates = dadosDaLinha[2];
                    derrotas = dadosDaLinha[3];
                    pontos = dadosDaLinha[4];
                    DadosDoTime novoTime = new DadosDoTime(nomeDoTime, vitorias, empates, derrotas,pontos);
                    times.add(novoTime);
                }
            }catch(Exception e){
                System.out.println("nao pegou o arquivo");
            }
        }
    }
    public ArrayList<DadosDoTime> getTimes() {
        return times; 
    }
}
