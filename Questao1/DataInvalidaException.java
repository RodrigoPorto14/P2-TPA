package Questao1;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DataInvalidaException extends Exception{
    private final String dia,mes,ano;
    
    public DataInvalidaException(String dia, String mes, String ano)
    {
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    
    public void adicionaLog()
    {
        try(PrintWriter pw = new PrintWriter(new FileWriter("Exceções.txt",true)))
        {
            pw.println("Data Invalida: "+dia+"/"+mes+"/"+ano);
        }
        catch(IOException e){System.out.println(e.getMessage());}
    }
    
}