package t6;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class LerArquivoCSV {
    
    String caminho = new String();
    BufferedReader conteudoCSV = null;
    String textoDoArquivo = "";
    ArrayList<String> teste = new ArrayList<>();
    
    
        
     
    public void setCaminho (String caminho){
       this.caminho = caminho;
    }    
    
    public void pegarArquivo () throws IOException{
        File file = new File(caminho);
        Scanner inputStream = new Scanner(file);
        try{
            while(inputStream.hasNext()){
                String data = inputStream.nextLine();
                System.out.println(data);
                teste.add(data);
                System.out.println(data);
                System.out.println("***");
            }
            teste.remove(0);
            System.out.println("deu bom");
        }catch(Exception e){
            System.out.println("nao pegou o arquivo");
        } 
    }
    
    public ArrayList getArquivoCompleto (){
        return this.teste;
    }
    
    public void ImpremeiCSV(){
        System.out.println(teste);
    }
}
