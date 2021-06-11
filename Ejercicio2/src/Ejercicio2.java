package src;
public class Ejercicio2 {
    
    public static void main(String[] args){
        Ejercicio2 t = new Ejercicio2();
    }
    int[] elementos = new int[10];
    int n;
    int mayor = -1;
    int repet = 4;
    public Ejercicio2(){
        for(int i = 0 ; i<10; i++){
           numAleatorio(i);
        }
        System.out.println("\n");
        determMayor();
        System.out.println("\n");
        System.out.println("El numero Mayor es: "+mayor+".");
        System.out.println("\n");
        System.out.println("se repite:"+repet);
   
    }
    
        public void numAleatorio(int num){ 
        n = (int) (Math.random()*91);
        elementos[num] = n;
    
        System.out.println("¨[" + (num+1)+"], Numero aleatorio : "+ n);
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