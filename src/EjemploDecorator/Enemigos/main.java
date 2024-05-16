package EjemploDecorator.Enemigos;

public class main {
    public static void main(String[] args) {
        EnemigoConcreto enemigoDesnudo= new EnemigoConcreto(100);

        ArmaduraDecorador enemigoArmadura = new ArmaduraDecorador(enemigoDesnudo);
        CascoDecorador enemigoArmadurayCasco = new CascoDecorador(enemigoArmadura);

        enemigoArmadurayCasco.computaDanio(100);
        System.out.println(enemigoDesnudo);
    }
}
