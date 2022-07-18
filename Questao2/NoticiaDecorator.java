package Questao2;

public abstract class NoticiaDecorator implements Noticia {
    private final Noticia noticia;
    
    public NoticiaDecorator(Noticia noticia)
    {
        this.noticia = noticia;
    }
    
    @Override
    public void mostraNoticia()
    {
        noticia.mostraNoticia();
    }
    
    @Override
    public double getValorNoticia(){return noticia.getValorNoticia();}
}
