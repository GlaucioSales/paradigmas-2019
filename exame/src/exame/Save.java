package exame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.stage.FileChooser;

class Save {
    private ArrayList<DadosDoTime> dadosParaSalvar;
    List<String[]> linhas = new ArrayList<>();
    
    
    public Save(){
        dadosParaSalvar = new ArrayList();
    }

    public Save(ArrayList<DadosDoTime> todosOsDados) {
        this.dadosParaSalvar = todosOsDados;
    }
    
    public void armazenarDados() throws IOException{
        
        FileChooser caminhoDoSave = new FileChooser();
        caminhoDoSave.setInitialDirectory(new File ("C:"));
        caminhoDoSave.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*csv"));
        File file = caminhoDoSave.showSaveDialog(null);
        
        if (file != null&& !file.exists()) {
            String[] cabecalho = {"Times",";","Vitorias",";","Empates",";","Derrotas",";","Pontos","\n"};
            linhas.add(cabecalho);
            for (int i = 0; i < dadosParaSalvar.size(); i++) {
                String[] novo = {
                    dadosParaSalvar.get(i).getTime(),";",
                    dadosParaSalvar.get(i).getVitorias(),";",
                    dadosParaSalvar.get(i).getEmpates(),";",
                    dadosParaSalvar.get(i).getDerrotas(),";",
                    dadosParaSalvar.get(i).getPontos(),"\n"
                };
                linhas.add(novo); 
            }
            try (FileWriter salvando = new FileWriter(file + ".csv")) {
                for (int i = 0; i < linhas.size(); i++) {
                    for (int j = 0; j < linhas.get(i).length; j++) {
                        salvando.write(linhas.get(i)[j]);
                    }
                }
                salvando.close();
            }
        }
    }
}
