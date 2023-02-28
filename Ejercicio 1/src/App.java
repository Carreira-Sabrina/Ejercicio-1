public class App {
    public static void main(String[] args) throws Exception {
        //Mostrar numeros en un cierto rango
        int numeroInicio = 5;
        int numeroFin = 14;
        while (numeroInicio>=numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio = numeroInicio + 1;            
        }
    }
}
