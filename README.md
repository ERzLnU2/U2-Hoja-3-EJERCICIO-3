# U2-Hoja-3-EJERCICIO-3
Satelite en JAVA con constructores varía coordenadas: altura, longitud y latitud con constructores..


    3.- Implementa una clase Satélite con los atributos enteros privados: meridiano, 
        paralelo y distancia a la tierra. Haz los siguientes métodos:

      📌 Constructor por defecto que inicialice todos los parámetros a 0.

      📌 Constructor que inicialice los valores de los atributos según 
        tres valores pasados porparámetro.
  
      📌 Método printPosicion que imprima donde se encuentra localizado el satélite.

      📌 Método variarAltura que reciba por parámetro un desplazamiento 
        (positivo o negativo) que haga que el satélite varie su distancia a la Tierra.
  
      📌 Método variarPosicion que reciba dos parametros que permitan variar 
        los atributos de posicion (meridiano y paralelo).
  
      📌 Método enOrbita que devuelve un valor booleano que indique si el satélite 
        está en Tierra (flase) o en Orbita (true). (Entendemos que está en la Tierra 
        si la distancia es menor que 16000 metros).

        En el programa principal genera un objeto de tipo Satélite y prueba todos los métodos.
    
![31](https://user-images.githubusercontent.com/80227002/194773536-880a8857-d94f-418f-a4ea-72ef4cbdff04.png)

```java
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {       
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
 Satelite s1=new Satelite(); 
 s1.setMeridiano(meridianoCreado);
 s1.setParalelo(paraleloCreado);
 s1.setDistanciAtierra(elevacionCreada);
 s1.setEnOrbita(true);     
 System.out.print("COORDENADAS:  ");
 System.out.print("Latitud: "+s1.getMeridiano()+"\u00ba"+"; Longitud: "+s1.getParalelo()+"''.");
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
```

![32](https://user-images.githubusercontent.com/80227002/194773542-e7393c6a-cf72-4434-9694-122f8402e5ab.png)

```java
public class Satelite {
    private int meridiano;
    private int paralelo;
    private int distanciAtierra;
    private boolean enOrbita;
    String posicion;
   public Satelite(){}
   public Satelite( int merid, int paral,int distanciAt, boolean enOrb){  
     this.meridiano=merid;  
     this.paralelo=paral; 
     this.distanciAtierra=distanciAt; 
     this.enOrbita=enOrb;
     this.enOrbita=distanciAtierra<16000; }  
     public int getMeridiano(){return meridiano;}
     public int getParalelo(){return paralelo;}
     public int getDistanciAtierra(){return distanciAtierra;}
     public boolean getEnOrbita(){return enOrbita;}
 public void setMeridiano(int merid){ this.meridiano=merid;} 
 public void setParalelo(int paral){ this.paralelo=paral;} 
 public void setDistanciAtierra(int distanciAt){ this.distanciAtierra=distanciAt; }
 public void setEnOrbita(boolean enOrb){ this.enOrbita=enOrb; }
 public void printPosicion(int meridiano, int paralelo){ this.meridiano=merid; this.paralelo=paral;}
 int merid, paral;
 public String getPosicion(){return posicion;}
 public void setPosicion(String posicion){ this.meridiano=merid; this.paralelo=paral;}
 public void variarAltura(int distanciAt){ this.distanciAtierra=distanciAt;}   
}
```
