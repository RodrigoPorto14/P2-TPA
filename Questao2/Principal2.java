package Questao2;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    
    public static void main(String args[])
    {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int op=0,id=0;
        String assunto;
 
        while(op!=6)
        {
            mostraOperacoes();
            op = getOp();
            if(op>=1 && op<=5)id = getId();
            switch(op)
            {
                case 1 -> {clientes.add(new Cliente(id));}
                
                case 2 ->
                {
                    assunto = getAssunto();
                    if(getCliente(clientes,id)!=null) getCliente(clientes,id).adicionaAssunto(assunto);
                }
                case 3 ->
                {
                    assunto = getAssunto();
                    if(getCliente(clientes,id)!=null) getCliente(clientes,id).removeAssunto(assunto);
                }
                
                case 4 -> {if(getCliente(clientes,id)!=null) getCliente(clientes,id).solicitaNoticia();}

                case 5 -> {if(getCliente(clientes,id)!=null) getCliente(clientes,id).mostraCliente();}
                    
                default -> {op=6;}                   
            }
        }
    }
    
    public static int getOp()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public static int getId()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do cliente: ");
        return sc.nextInt();
    }
    
    public static String getAssunto()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o assunto (esporte,politica,cultura): ");
        return sc.next();
    }
    
    public static Cliente getCliente(ArrayList<Cliente> clientes, int id)
    {
        for(var cliente:clientes) if(cliente.getId()==id) return cliente;
        return null;
    }
    
    public static void mostraOperacoes()
    {
        System.out.println("=======================================================================================");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Adicionar Assunto");
        System.out.println("3 - Remover Assunto");
        System.out.println("4 - Solicitar Noticia");
        System.out.println("5 - Mostrar Cliente");
        System.out.println("6 - Sair");
        System.out.println("=======================================================================================");
    }
}
