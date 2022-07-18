package Questao3;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Transicao extends Thread{
    private final ArrayList<Compra> compras;
    private final Estado estadoAntes,estadoDepois;
    private final long tempo;
    
    public Transicao(ArrayList<Compra> compras,Estado estadoAntes,Estado estadoDepois, long tempo)
    {
        this.compras=compras;
        this.estadoAntes=estadoAntes;
        this.estadoDepois=estadoDepois;
        this.tempo=tempo;
    }
    
    @Override
    public void run()
    {
        while(!isInterrupted())
        {
            synchronized(compras)
            {
                for(var compra:compras)
                {
                    if(this.estadoAntes==compra.getEstado() && ChronoUnit.SECONDS.between(compra.getHorario(), LocalTime.now())>=this.tempo)
                    {
                        compra.setEstado(this.estadoDepois);
                        compra.setHorario();
                        compra.mostraCompra();
                    }
                }
            }  
        }
    }
}
