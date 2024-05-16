package EjemploDecorator.Enemigos;

public class ArmaduraDecorador extends EnemigoDecorador{
    public ArmaduraDecorador( Enemigo enemigoDecorado) {
        super(enemigoDecorado);
    }

    @Override
    public void computaDanio(int daño) {
        if (daño> 40){
            super.computaDanio(daño-40);
        }
    }
}
