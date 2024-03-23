package poo.ejercicioCLase;

public class Vehiculo {
    private String marca;
    private int cantRuedas;
    protected boolean esDeCompetencia;
    protected boolean estaLaAlarmaEncendida;
    private String kmMaximo;
    private String kmMinimo;

    Vehiculo(){}

    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, boolean estaLaAlarmaEncendida, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getCantRuedas(){
        return this.cantRuedas;
    }
    public boolean getEsDeCompetencia(){
        return this.esDeCompetencia;
    }
    public boolean getEstaLaAlarmaEncendida(){
        return this.estaLaAlarmaEncendida;
    }
    public String getKmMaximo(){
        return this.kmMaximo;
    }
    public String getKmMinimo(){
        return this.kmMinimo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCantRuedas(int cantRuedas){
        this.cantRuedas = cantRuedas;
    }
    public void setEsDeCompetencia(boolean esDeCompetencia){
        this.esDeCompetencia = esDeCompetencia;
    }
    public void setLaAlarmaEstaEncendida(boolean estaLaAlarmaEncendida){
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
    }
    public void setKmMaximo(String kmMaximo){
        this.kmMaximo = kmMaximo;
    }
    public void setKmMinimo(String kmMinimo){
        this.kmMinimo=kmMinimo;
    }


    public void arrancarVehiculo(){
        if(estaLaAlarmaEncendida){
            System.out.println("Ruido de alarma");

        }else{
            System.out.println("Arranca el vehiculo");
        }

    }

}
