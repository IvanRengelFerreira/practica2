package aplicacion;

import mates.Matematicas;

public class Principal{

    //En principal impriminos el valor de PI siendo calculado con el método de Montecarlo con 1000 de pasos, los pasos son el número de puntos generados y dara la cantidad de decimales que se quieren calcular
    //No use el args, ya que no es necesario y no me compilaba de esa manera
    //Solo se puede con 1000 porque al sewr recursivo, se desborda la pila de llamadas
    public static void main(String[] args){
      
        System.out.println("El numero PI es " +Matematicas.generarNumeroPiRecursivo(0, 0, 1000));
    }
}