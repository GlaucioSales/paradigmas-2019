package t6;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    
    @FXML private TableView <Tabela> tableViewTabela;
    @FXML private TableColumn <Tabela, String> tableColumnAno;
    @FXML private TableColumn <Tabela, String> tableColumnProva;
    @FXML private TableColumn <Tabela, String> tableColumnTipoQuestao;
    @FXML private TableColumn <Tabela, String> tableColumnIDQuestao;
    @FXML private TableColumn <Tabela, String> tableColumnObjeto;
    @FXML private TableColumn <Tabela, String> tableColumnAcertosCurso;
    @FXML private TableColumn <Tabela, String> tableColumnAcertosRegiao;
    @FXML private TableColumn <Tabela, String> tableColumnAcertosBrasil;
    @FXML private TableColumn <Tabela, String> tableColumnDif;
    
    private final List<Tabela> listasDeLinhas = new ArrayList();
    private ObservableList<Tabela> oberservableListTabela;
    private Object FXColections;
    LerArquivoCSV arquivo = new LerArquivoCSV();
    
    
    @FXML
    private void clicouExit (ActionEvent event) {
       System.exit(0);
    }
    @FXML
    private void clicouHelp(ActionEvent event) {
        Text texto = new Text ("Glaucio Sales Santos \nEnadeUFSMExplorer.java");
        Stage stage2 = new Stage();
        StackPane grupoComponentes = new StackPane();
        grupoComponentes.getChildren().add(texto);
        Scene tela2 = new Scene (grupoComponentes, 720, 300);
        stage2.setScene(tela2);
        stage2.show();
    }
    
    
    @FXML
    private void clicouOpen (ActionEvent event) throws IOException {
       
        FileChooser caminhoDoBotaoOpen = new FileChooser();
        caminhoDoBotaoOpen.setInitialDirectory(new File ("C:"));
        caminhoDoBotaoOpen.getExtensionFilters().add(new ExtensionFilter("CSV Files", "*csv"));
        File arquivoSelecionado = caminhoDoBotaoOpen.showOpenDialog(null);
        if(arquivoSelecionado != null){
            arquivo.setCaminho(arquivoSelecionado.toString());
            listasDeLinhas.clear();
            oberservableListTabela.clear();
            carregarTableView();
        }
    }
    public void carregarTableView(){
        
        tableColumnAno.setCellValueFactory(new PropertyValueFactory<>("ano"));
        tableColumnProva.setCellValueFactory(new PropertyValueFactory<>("prova"));
        tableColumnTipoQuestao.setCellValueFactory(new PropertyValueFactory<>("tipoDeQuestao"));
        tableColumnIDQuestao.setCellValueFactory(new PropertyValueFactory<>("IDQuestao"));
        tableColumnObjeto.setCellValueFactory(new PropertyValueFactory<>("objeto"));
        tableColumnAcertosCurso.setCellValueFactory(new PropertyValueFactory<>("acertosCurso"));
        tableColumnAcertosRegiao.setCellValueFactory(new PropertyValueFactory<>("acertosRegiao"));
        tableColumnAcertosBrasil.setCellValueFactory(new PropertyValueFactory<>("acertosBrasil"));
        tableColumnDif.setCellValueFactory(new PropertyValueFactory<>("dif"));
        
        ArrayList<String> conteudo = new ArrayList<>();
        String linha;
        
        try {
            arquivo.pegarArquivo();
            conteudo = arquivo.getArquivoCompleto();
        } catch (IOException ex) {
            System.out.println("O Arquivo não pode ser lido");
        }
        
        if (conteudo != null) {
            for (int i = 0; i < conteudo.size(); i++) {
                linha = conteudo.get(i);
                System.out.println(linha);
                if (linha.startsWith("CC")||linha.startsWith("SI")) {
                    Tabela tabelaTeste = new Tabela();
                    String[] teste = linha.split(",");
                    try {
                        tabelaTeste.setAno(teste[1]);
                    } catch (Exception e) {
                        tabelaTeste.setAno("-");
                    }
                    try {
                        tabelaTeste.setProva(teste[2]);
                    } catch (Exception e) {
                        tabelaTeste.setProva("-");
                    }
                    try {
                        tabelaTeste.setTipoDeQuestao(teste[3]);
                    } catch (Exception e) {
                        tabelaTeste.setTipoDeQuestao("-");
                    }
                    try {
                         tabelaTeste.setIDQuestao(teste[4]);
                    } catch (Exception e) {
                         tabelaTeste.setIDQuestao("-");
                    }
                    try {
                        tabelaTeste.setObjeto(teste[5]);
                    } catch (Exception e) {
                        tabelaTeste.setObjeto("-");
                    }
                    try {
                        tabelaTeste.setAcertosCurso(teste[9]);
                    } catch (Exception e) {
                        tabelaTeste.setAcertosCurso("-");
                    }
                    try{
                        tabelaTeste.setAcertosRegiao(teste[10]);
                    }catch(Exception e){
                        tabelaTeste.setAcertosRegiao("-");
                    }
                    try{
                        tabelaTeste.setAcertosBrasil(teste[11]);
                    }catch(Exception e){
                        tabelaTeste.setAcertosBrasil("-");
                    }
                    try{
                        tabelaTeste.setDif(teste[12]);
                    }catch(Exception e){
                        tabelaTeste.setDif("-");
                    }
                    listasDeLinhas.add(tabelaTeste);
                }
            }
        }
        
        oberservableListTabela = FXCollections.observableArrayList(listasDeLinhas);
        tableViewTabela.setItems(oberservableListTabela);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarTableView();
    }    

    
}
