package src;
public class Ejercicio4 {
    
    public static void main(String[] args){
        Ejercicio4 t = new Ejercicio4();
    }
    int[] elementos = new int[10];
    int n;
    int mayor = -1;
    int repet = 0;
    public Ejercicio4(){
        for(int i = 0 ; i<10; i++){
           numAleatorio(i);
        }
        System.out.println("\n");
  
        for(int i = 0 ; i<10; i++){
            mostrarDato(i); 
        }
        determMayor();
        System.out.println("\n");
        System.out.println("El numero Mayor es: "+mayor+".");
        System.out.println("\n");
        distanciaMayor();
    }
    public void numAleatorio(int num){ 
        n = (int) (Math.random()*10);
        elementos[num] = n;
    
        System.out.println("Posicion" + (num+1)+", Numero aleatorio generado: "+ n);
    }

    public void mostrarDato(int num){
        System.out.println("El vector ["+(num+1)+ "] el valor es: "+ elementos[num]);
    }    
    public void distanciaMayor(){
    int separacion;
    	for(int i=0;i<elementos.length;i++){
    		separacion=mayor-elementos[i];
    		System.out.println("La distancia de ["+mayor+"] con ["+elementos[i]+" es: "+separacion);
    	}
    }
    
    public void determMayor() {
        for(int i = 0 ; i<10; i++) {
            if (elementos[i] > mayor) {
                mayor = elementos[i];
            }
        }       
        for (int j = 0; j < 10; j++) {

        } 
    }
}
