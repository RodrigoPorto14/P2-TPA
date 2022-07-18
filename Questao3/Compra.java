package Questao3;
import java.time.LocalTime;

public class Compra {
    private final int id;
    private Estado estado;
    private LocalTime horario;
    
    public Compra(int id)
    {
        this.id=id;
        this.estado=Estado.ABERTA;
        this.horario = LocalTime.now();
    }
    
    public void mostraCompra()
    {
        System.out.printf("Compra %d %s\n",this.id,this.estado);
    }
    
    public int getId(){return this.id;}
    public Estado getEstado(){return this.estado;}
    public LocalTime getHorario(){return this.horario;}
    public void setEstado(Estado estado){this.estado=estado;}
    public void setHorario(){this.horario=LocalTime.now();}
}
