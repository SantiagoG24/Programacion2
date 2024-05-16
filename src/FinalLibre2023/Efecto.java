package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

public class Efecto {
    private EstadoSalud atributo;
    private Entrenamiento entrenamiento;
    private Usuario usaurio;
    private int efecto;

    public Efecto(EstadoSalud atributo, Entrenamiento entrenamiento,Usuario usuario,int efecto) {
        this.atributo = atributo;
        this.entrenamiento = entrenamiento;
        this.usaurio= usuario;
        this.efecto=efecto;
    }
    public void cumple(Filtro filtro){
        if(filtro.cumple(entrenamiento)){
            aplicarEfecto(usaurio);
        }
    }
    public void aplicarEfecto(Usuario usurio){
        usaurio.set(atributo,efecto);
    }
}
