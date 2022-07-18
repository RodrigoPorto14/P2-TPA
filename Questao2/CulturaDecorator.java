package Questao2;

public class CulturaDecorator extends NoticiaDecorator{
    
    public CulturaDecorator(Noticia noticia)
    {
        super(noticia);
    }
    
    @Override
    public void mostraNoticia()
    {
        super.mostraNoticia();
        System.out.println("cultura");
    }
    
    @Override
    public double getValorNoticia(){return super.getValorNoticia()+1.5;}
    
}
