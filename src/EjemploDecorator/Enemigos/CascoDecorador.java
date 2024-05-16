package EjemploDecorator.Enemigos;

public class CascoDecorador extends EnemigoDecorador{
    public CascoDecorador( Enemigo enemigoDecorado) {
        super(enemigoDecorado);
    }

    @Override
    public void computaDanio(int daño) {
        if (daño > 20){
            super.computaDanio(daño-20);
        }
    }
}
