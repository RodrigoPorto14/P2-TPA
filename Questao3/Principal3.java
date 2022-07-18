package Questao3;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal3 {
    
    public static void main(String args[])
    {
        int id=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Compra> compras = new ArrayList<>();
        Transicao aprova = new Transicao(compras,Estado.ABERTA,Estado.APROVADA,3);
        Transicao despacha = new Transicao(compras,Estado.APROVADA,Estado.DESPACHADA,8);
        Transicao recebe = new Transicao(compras,Estado.DESPACHADA,Estado.RECEBIDA,15);
        
        aprova.start();
        despacha.start();
        recebe.start();
        
        System.out.println("Digite o ID da compra (-1 para sair):");
        while(id>=0)
        {
            id = sc.nextInt();
            synchronized(compras)
            {
                compras.add(new Compra(id));
            }
        }
     
        aprova.interrupt();
        despacha.interrupt();
        recebe.interrupt();
    }
}
