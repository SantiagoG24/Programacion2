package Practico9;
import java.util.Comparator;

public class ComparatorNombre implements Comparator<Socio>{
    public int compare(Socio so1 ,Socio so2){
        return so1.getNombre().compareTo(so2.getNombre());
    }

    public static class ComparatorCantidadCanchas implements Comparator<Socio>{
        private int canchaId;

        public ComparatorCantidadCanchas(int canchaId) {
            this.canchaId = canchaId;
        }

        public int compare(Socio so1, Socio so2){
            int cantidadS1=0;
            int cantidadS2=0;
            for (Registro  registro: so1.getHistorial()){
                if (registro.getId_cancha()== canchaId){
                    cantidadS1++;
                }
            }
            for (Registro  registro: so2.getHistorial()){
                if (registro.getId_cancha()== canchaId){
                    cantidadS2++;
                }
            }
            return cantidadS1 - cantidadS2;
        }
    }
}
