package Questao1;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DataAnteriorException extends Exception{
    private final Data nasc,cas,obito;
    
    public DataAnteriorException(Data nascimento, Data casamento, Data obito)
    {
        this.nasc=nascimento;
        this.cas=casamento;
        this.obito=obito;
    }
    public void adicionaLog()
    {
        try(PrintWriter pw = new PrintWriter(new FileWriter("Exceções.txt",true)))
        {
            pw.print("Datas fora de ordem: ");
            pw.print(nasc.getDia()+"/"+nasc.getMes()+"/"+nasc.getAno()+" ");
            pw.print(cas.getDia()+"/"+cas.getMes()+"/"+cas.getAno()+" ");
            pw.println(obito.getDia()+"/"+obito.getMes()+"/"+obito.getAno());
        }
        catch(IOException e){System.out.println(e.getMessage());}
    }
    
}