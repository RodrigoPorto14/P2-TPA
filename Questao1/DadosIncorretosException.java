package Questao1;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DadosIncorretosException extends Exception{
    private final String dia,mes,ano;
    public DadosIncorretosException(String dia, String mes, String ano)
    {
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    
    public void adicionaLog()
    {
        try(PrintWriter pw = new PrintWriter(new FileWriter("Exceções.txt",true)))
        {
            pw.println("Dados Incorretos: "+this.dia+"/"+this.mes+"/"+this.ano);
        }
        catch(IOException e){System.out.println(e.getMessage());}
    }
}