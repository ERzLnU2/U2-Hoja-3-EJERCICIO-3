/**
 * @author Daw120
 
3.- Implementa una clase Satélite con los atributos enteros privados: meridiano, 
    paralelo y distancia a la tierra. Haz los siguientes métodos:

  • Constructor por defecto que inicialice todos los parámetros a 0.

  • Constructor que inicialice los valores de los atributos según 
    tres valores pasados porparámetro.
  
  • Método printPosicion que imprima donde se encuentra localizado el satélite.

  • Método variarAltura que reciba por parámetro un desplazamiento 
    (positivo o negativo) que haga que el satélite varie su distancia a la Tierra.
  
  • Método variarPosicion que reciba dos parametros que permitan variar 
    los atributos de posicion (meridiano y paralelo).
  
  • Método enOrbita que devuelve un valor booleano que indique si el satélite 
    está en Tierra (flase) o en Orbita (true). (Entendemos que está en la Tierra 
    si la distancia es menor que 16000 metros).

    En el programa principal genera un objeto de tipo Satélite y prueba todos los métodos.
 */
package com.solomongo.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {       
    
// Entrada 
System.out.print("\nV v V v V v SATELITE V v V v V v \n");
System.out.print("\n\n\tPosicionamiento:\n");
 
Scanner meridiano = new Scanner(System.in);
System.out.print("\n >>> Distancia del meridiano: "); 
int meridianoCreado = meridiano.nextInt(); 

Scanner paralelo = new Scanner(System.in);
System.out.print("\n >>> Distancia del paralelo: "); 
int paraleloCreado = paralelo.nextInt(); 

Scanner elevacion = new Scanner(System.in);
System.out.print("\n >>> Distancia de elevacion: "); 
int elevacionCreada = elevacion.nextInt(); 

// Asignaciones con get
 Satelite s1=new Satelite(); 
 s1.setMeridiano(meridianoCreado);
 s1.setParalelo(paraleloCreado);
 s1.setDistanciAtierra(elevacionCreada);
 s1.setEnOrbita(true);
      
 System.out.println("\n______________________\n"); 
 System.out.print("COORDENADAS:  ");
 System.out.print("Latitud: "+s1.getMeridiano()+"\u00ba"+"; Longitud: "+s1.getParalelo()+"''.");
                                               //º
 // ORBITANDO
 int getDistanciAtierra=16000;
 System.out.print("\nDistancia de Tierra: ");
 System.out.print(s1.getDistanciAtierra());
 System.out.print(" metros.\n\n\t* Esta en orbita a ");
 System.out.print(elevacionCreada); System.out.println(" metros de altura?: \t");
 boolean EnOrbita = elevacionCreada > getDistanciAtierra; // ternario
 System.out.print("\t  "+EnOrbita); System.out.print(".. orbitando a partir de 16000 metros.");  
 System.out.println("\n");

    }
}
