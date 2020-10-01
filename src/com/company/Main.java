package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int contador;

        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvendio a la actividad 7");
        System.out.println("Generador de series numericas de numeros primos y fibonacci");
        System.out.println("Por favor ingresa cuantos numeros deseas generar");
        contador=leer.nextInt();
        primos serie=new primos();
        fibonacci serie2 = new fibonacci();

       int[] seriePrimos=serie.generar(contador);
       int[] serieFibonacci=serie2.generar(contador);
        System.out.println("La serie de numeros primos es:");
        for(int i =0;i<=contador;i++){
            System.out.println(seriePrimos[i]);
        }
        System.out.println("La serie fibonacci es:");
        for(int i =0;i<=contador;i++){
            System.out.println(serieFibonacci[i]);
        }
    }
}
class primos{
    int tope;
    int[] seriePrimos = new int[100];
    int indice=0;

    public int[] generar(int tope){

    for (int i=1;i<tope;i++){
        int contador=0;
        for(int j=1;j<=i;j++){

            if (i%j==0){
                contador++;
            }}
            if(contador==2){
                //System.out.println(i);
                seriePrimos[indice++]=i;
            }



    }
    return seriePrimos;

    }
}
class fibonacci{
    int[] serieFibonacci = new int[100];
    public int[] generar(int tope){
        int f=0;
        int aux1=1;
        int aux2;


        for (int i=0;i<=tope;i++){
            aux2=f;
            f=aux1 + f;
            aux1=aux2;
            serieFibonacci[i]=aux1;
        }


        return serieFibonacci;
    }

}

