package exame;

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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;

public class FXMLDocumentController implements Initializable {
    @FXML private TableView<DadosDoTime> tabela;
    @FXML private TableColumn<DadosDoTime, String> times;
    @FXML private TableColumn<DadosDoTime, String> vitorias;
    @FXML private TableColumn<DadosDoTime, String> empates;
    @FXML private TableColumn<DadosDoTime, String> derrotas;
    @FXML private TableColumn<DadosDoTime, String> pontos;
    @FXML private HBox hbox = new HBox();
    @FXML private TextField addTime;
    @FXML private TextField addVitorias;
    @FXML private TextField addEmpates;
    @FXML private TextField addDerrotas;
    @FXML private TextField addPontos;
    @FXML private Button adicionar;
    @FXML private Button remover;
    
    
    private List<DadosDoTime> dadosDoCSV = new ArrayList();
    private ObservableList<DadosDoTime> listaDeTimes;
   
    @FXML
    private void clicouExit(ActionEvent event){
        Exit saindo = new Exit();
        saindo.sair();
    }
    
    @FXML
    private void clicouAbrir(ActionEvent event){
        Open abrir = new Open();
        abrir.abrir();
        dadosDoCSV = abrir.getTimes();
       
        if(listaDeTimes == null){
            listaDeTimes = FXCollections.observableArrayList();
        }
        for (int i = 1; i < dadosDoCSV.size(); i++) {
            listaDeTimes.add(dadosDoCSV.get(i));
        }
        
        
        tabela.setItems(listaDeTimes);
        
    }
    
    @FXML
    private void clicouAdicionar(ActionEvent event){
        DadosDoTime novoTime = new DadosDoTime();
        novoTime.setTime(addTime.getText());
        novoTime.setVitorias(addVitorias.getText());
        novoTime.setEmpates(addEmpates.getText());
        novoTime.setDerrotas(addDerrotas.getText());
        novoTime.setPontos(addPontos.getText());
        if(listaDeTimes == null){
            listaDeTimes = FXCollections.observableArrayList();
        }
        listaDeTimes.add(novoTime);
        tabela.setItems(listaDeTimes);
        addTime.clear();
        addVitorias.clear();
        addEmpates.clear();
        addDerrotas.clear();
        addPontos.clear();
    }
    
    @FXML
    private void clicouDeletar(ActionEvent event){
        ObservableList<DadosDoTime> timeSelecionado,todosOsTimes;
        todosOsTimes = tabela.getItems();
        timeSelecionado = tabela.getSelectionModel().getSelectedItems();
        timeSelecionado.forEach(todosOsTimes::remove);
    }
    
    @FXML
    public void editarTime(TableColumn.CellEditEvent<DadosDoTime, String> event){
        DadosDoTime atualizar = tabela.getSelectionModel().getSelectedItem();
        /*atualizar.setTime(event.getNewValue());*/
        for (int i = 0; i < listaDeTimes.size(); i++) {
            if(listaDeTimes.get(i).equals(atualizar)){
                listaDeTimes.get(i).setTime(event.getNewValue());
            }
        }
    }
    
    @FXML
    public void editarVitorias(TableColumn.CellEditEvent<DadosDoTime, String> event){
        DadosDoTime atualizar = tabela.getSelectionModel().getSelectedItem();
        for (int i = 0; i < listaDeTimes.size(); i++) {
            if(listaDeTimes.get(i).equals(atualizar)){
                listaDeTimes.get(i).setVitorias(event.getNewValue());
            }
        }
        
    }
    
    @FXML
    public void editarEmpates(TableColumn.CellEditEvent<DadosDoTime, String> event){
        DadosDoTime atualizar = tabela.getSelectionModel().getSelectedItem();
        for (int i = 0; i < listaDeTimes.size(); i++) {
            if(listaDeTimes.get(i).equals(atualizar)){
                listaDeTimes.get(i).setEmpates(event.getNewValue());
            }
        }
        
    }
    
    @FXML
    public void editarDerrotas(TableColumn.CellEditEvent<DadosDoTime, String> event){
        DadosDoTime atualizar = tabela.getSelectionModel().getSelectedItem();
        for (int i = 0; i < listaDeTimes.size(); i++) {
            if(listaDeTimes.get(i).equals(atualizar)){
                listaDeTimes.get(i).setDerrotas(event.getNewValue());
            }
        }
        
    }
    
    @FXML
    public void editarPontos(TableColumn.CellEditEvent<DadosDoTime, String> event){
        DadosDoTime atualizar = tabela.getSelectionModel().getSelectedItem();
        for (int i = 0; i < listaDeTimes.size(); i++) {
            if(listaDeTimes.get(i).equals(atualizar)){
                listaDeTimes.get(i).setPontos(event.getNewValue());
            }
        }
        
    }
    
    
    @FXML
    private void clicouSave(ActionEvent event){
        ArrayList<DadosDoTime> todosOsDados = new ArrayList();
        ObservableList<DadosDoTime> todosOsTimes;
        todosOsTimes = tabela.getItems();
        for (DadosDoTime time : todosOsTimes) {
            todosOsDados.add(time);
        }
        Save salvar = new Save(todosOsDados);
        try {
            salvar.armazenarDados();
        } catch (IOException ex) {
            System.out.println("nao foi possivel armazenar");
        }
        
         
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        times.setCellValueFactory(new PropertyValueFactory<>("time"));
        vitorias.setCellValueFactory(new PropertyValueFactory<>("vitorias"));
        empates.setCellValueFactory(new PropertyValueFactory<>("empates"));
        derrotas.setCellValueFactory(new PropertyValueFactory<>("derrotas"));
        pontos.setCellValueFactory(new PropertyValueFactory<>("pontos"));
        tabela.setEditable(true);
        times.setCellFactory(TextFieldTableCell.forTableColumn());
        vitorias.setCellFactory(TextFieldTableCell.forTableColumn());
        empates.setCellFactory(TextFieldTableCell.forTableColumn());
        derrotas.setCellFactory(TextFieldTableCell.forTableColumn());
        pontos.setCellFactory(TextFieldTableCell.forTableColumn());
    }
    
}
