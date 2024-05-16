package EjemploDecorator.Enemigos;

public abstract class EnemigoDecorador extends Enemigo{
    private Enemigo enemigoDecorado;
    public EnemigoDecorador( Enemigo enemigoDecorado) {
        this.enemigoDecorado = enemigoDecorado;
    }

    @Override
    public void computaDanio(int danio) {
        enemigoDecorado.computaDanio(danio);
    }
}
