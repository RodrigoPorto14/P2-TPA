package Questao2;

public class PoliticaDecorator extends NoticiaDecorator{
    
    public PoliticaDecorator(Noticia noticia)
    {
        super(noticia);
    }
    
    @Override
    public void mostraNoticia()
    {
        super.mostraNoticia();
        System.out.println("politica");
    }
    
    @Override
    public double getValorNoticia(){return super.getValorNoticia()+1.1;}
}
