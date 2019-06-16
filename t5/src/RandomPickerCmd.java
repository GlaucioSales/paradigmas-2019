
import java.util.Scanner;

public class RandomPickerCmd{
    public static void main(String[] args) {
        String retornada;
        Arquivo arquivoDeTexto;
        Scanner scanner = new Scanner(System.in);
        arquivoDeTexto = new Arquivo();
        arquivoDeTexto.setArquivo("C:\\Users\\Usuário\\Documents\\textoTeste.txt");
        System.out.print("Printando o Arquivo:");
        System.out.println(arquivoDeTexto.getArquivo());
        arquivoDeTexto.embaralharArquivoOffiline();
        System.out.print("Printado o Arquivo enbaralhado Offiline:");
        System.out.println(arquivoDeTexto.getArquivo());
        arquivoDeTexto.embaralharArquivoOnline();
        System.out.print("Printado o Arquivo enbaralhado Online:");
        System.out.println(arquivoDeTexto.getArquivo());
        while(!arquivoDeTexto.estaVazia()){
            scanner.nextLine();
            retornada = arquivoDeTexto.retornarUmElemento();
            System.out.println(retornada);
            arquivoDeTexto.embaralharArquivoOffiline();   
        }
        
    }    
}
