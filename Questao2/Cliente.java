package Questao2;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class Cliente {
    private final int id;
    private final ArrayList<String> assuntos;
    private double debitoMensal;
    
    public Cliente(int id)
    {
        this.id=id;
        this.assuntos = new ArrayList<>();
        this.debitoMensal = 0;
    }
    
    public void adicionaAssunto(String assunto)
    {
        this.assuntos.add(assunto);
    }
    
    public void removeAssunto(String assunto)
    {
        this.assuntos.remove(assunto);
    }
    
    public void solicitaNoticia()
    {
        Noticia noticia = new NoticiaSimples();
        
        if(assuntos.contains("esporte")) noticia = new EsporteDecorator(noticia);
        if(assuntos.contains("politica")) noticia = new PoliticaDecorator(noticia);
        if(assuntos.contains("cultura")) noticia = new CulturaDecorator(noticia);
      
        this.debitoMensal+=noticia.getValorNoticia();
        noticia.mostraNoticia(); 
    }
    
    public void mostraCliente()
    {
        Locale localeBR = new Locale("pt","BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println("ID: "+this.id);
        System.out.println("Debito Mensal: "+real.format(this.debitoMensal));
        System.out.print("Assuntos: ");
        for(var assunto:this.assuntos) System.out.print(assunto+" ");
        System.out.println();
    }
    
    public int getId(){return this.id;}
}
