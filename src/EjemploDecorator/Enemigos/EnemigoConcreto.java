package EjemploDecorator.Enemigos;

public class EnemigoConcreto extends  Enemigo{
    private int vida;
    public EnemigoConcreto(int vida) {
        this.vida=vida;
    }
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void computaDanio(int daño){
        setVida(getVida()-daño);
    }

    @Override
    public String toString() {
        return  "vida:" +vida;
    }
}
