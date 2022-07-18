package Questao1;

public class Data implements Comparable<Data>{
    private int dia,mes,ano;
    
    public Data(String dia, String mes, String ano) throws DadosIncorretosException, DataInvalidaException
    {
        if(!ehInteiro(dia) || !ehInteiro(mes) || !ehInteiro(ano)) throw new DadosIncorretosException(dia,mes,ano);
        if(!ehData(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano))) throw new DataInvalidaException(dia,mes,ano);
        
        this.dia = Integer.parseInt(dia);
        this.mes = Integer.parseInt(mes);
        this.ano = Integer.parseInt(ano);   
    }
    
    private boolean ehInteiro(String str)
    {
        try
        {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e) {return false;}
    }
    
    private boolean ehData(int dia, int mes, int ano)
    {
        int diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        return dia>=1 && mes>=1 && ano>=1 && mes<=12 && dia <= diasMes[mes-1];
    }
    
    @Override
    public int compareTo(Data outraData)
    {
        if(this.ano != outraData.ano) return Integer.compare(this.ano, outraData.ano);
        else if(this.mes != outraData.mes) return Integer.compare(this.mes, outraData.mes);
        return Integer.compare(this.dia, outraData.dia);
    }
    
    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAno(){return this.ano;}
}
