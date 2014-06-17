/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Main {

    public int iteraciones = 0;
    
    /*
    Devulve la longitud de los ciclos
    */
    public int iterar(int n){
        int contador = 1;

        while ( n != 1) {
            if(n%2 == 0){
                n = n/2;
                contador++;
            }else{
                n = n*3+1;
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int maximo = 0;
        int temporal;
        int numero = 0;
        Main main = new Main();
        
        for (int n = i; n <= j; n++) {
            temporal = main.iterar(n);
            if (temporal > maximo){
                numero = n;
                maximo = temporal;
            }
        }
        
        //System.out.println("Es numero es: " + numero);
        System.out.println(i + " " + j +" " + maximo);
        
    }
}
