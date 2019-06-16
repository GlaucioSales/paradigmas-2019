import java.io.*; 
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class Arquivo{
    private ArrayList<String> texto = new ArrayList<>();
    
    public void setArquivo(String endereço){
        try{
            try (BufferedReader br = new BufferedReader(new FileReader(endereço))) {
                ArrayList<String> linha = new ArrayList<>(10);
                while(br.ready()){
                    linha.add(br.readLine()); 
                }
                this.texto = linha;
            }
        }catch(IOException ioe){
            System.out.println("O arquivo encontrou um erro");
        }
    }
    
    public ArrayList<String> getArquivo(){
        return this.texto;
    }

    public void releituraDoArquivo(ArrayList<String> novo){
        this.texto = novo;
    }
    
    public void embaralharArquivoOffiline(){
        Collections.shuffle(this.texto);
    }
    
    public void embaralharArquivoOnline(){
        try {
            String urlstr = "https://www.random.org/lists/?mode=advanced";
            URL url = new URL(urlstr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setDoOutput(true);
            // colocar minhas strings aqui exemplo "list=Fulano%0D%0ABeltrano%0D%0ASicrano&format=plain&rnd=new
         
            String data = "list=";
            for (String texto1 : texto) {
                data = data + texto1 + "%0D%0A";
            }
            data = data + "&format=plain&rnd=new";
            
            con.getOutputStream().write(data.getBytes("UTF-8"));
            try (BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()))) {
                String responseLine;
                StringBuffer response = new StringBuffer();
                this.texto.clear();
                while ((responseLine = in.readLine()) != null) {
                    this.texto.add(responseLine);
                }
            }
            
          } catch (IOException e) {
          }
  }
    
    public String retornarUmElemento(){
       String nada = this.texto.get(0);
       this.texto.remove(0);
       return nada;
    }
    public boolean estaVazia(){
        return this.texto.isEmpty();
    }
}