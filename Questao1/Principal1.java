package Questao1;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Principal1 {
    
    public static void main(String args[])
    {
        Data nascimento,casamento,obito;
        try(Scanner sc = new Scanner(new File("datas.txt")); FileWriter fw = new FileWriter("Exceções.txt"))
        {
            while(sc.hasNext())
            {
                try
                {
                    String[] datas = sc.nextLine().split(" ");
                    nascimento = new Data(datas[0],datas[1],datas[2]);
                    casamento = new Data(datas[3],datas[4],datas[5]);
                    obito = new Data(datas[6],datas[7],datas[8]);
                    if(casamento.compareTo(nascimento)<0 || obito.compareTo(casamento)<0) throw new DataAnteriorException(nascimento,casamento,obito);
                }
                catch(DadosIncorretosException e){e.adicionaLog();}
                catch(DataInvalidaException e){e.adicionaLog();}
                catch(DataAnteriorException e){e.adicionaLog();}
            }
        }
        catch(IOException e){System.out.println(e.getMessage());} 
    }
}
