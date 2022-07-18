package Questao2;

public class EsporteDecorator extends NoticiaDecorator{
    
    public EsporteDecorator(Noticia noticia)
    {
        super(noticia);
    }
    
    @Override
    public void mostraNoticia()
    {
        super.mostraNoticia();
        System.out.println("esporte");
    }
    
    @Override
    public double getValorNoticia(){return super.getValorNoticia()+1.2;}
}
