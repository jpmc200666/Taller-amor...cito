package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Maquina {

    private String material;
    private List<Juegos> juegos = new ArrayList<>(); 
    private Persona comprador;

    public Maquina(){
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void anadirJuegos(Juegos juego){
        juegos.add(juego);
    }

    public void reiniciarListaDeJuegos(){
        juegos.clear();
    }
    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public List<Juegos> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juegos> juegos) {
        this.juegos = juegos;
    }
    
}
