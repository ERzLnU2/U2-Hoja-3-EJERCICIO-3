/**
 * @author Daw120
 */
package com.solomongo.ejercicio3;
public class Satelite {

    private int meridiano;
    private int paralelo;
    private int distanciAtierra;
    private boolean enOrbita;
            String posicion;
    
   public Satelite(){} // Constructor por defecto que inicialice todos los parámetros a 0.

   //  Constructor que inicialice los valores de los atributos según tres valores pasados porparámetro.
   public Satelite( int merid, int paral,int distanciAt, boolean enOrb){  
     this.meridiano=merid;  
     this.paralelo=paral; 
     this.distanciAtierra=distanciAt; 
     this.enOrbita=enOrb;
     this.enOrbita=distanciAtierra<16000;
     }   
  
  // metodos get retorna, obtiene: asi que public.
     public int getMeridiano(){return meridiano;}
     public int getParalelo(){return paralelo;}
     public int getDistanciAtierra(){return distanciAtierra;}
     public boolean getEnOrbita(){return enOrbita;}
     
  //metodos set, no retornan: mete los datos, modifica atributos de Clase Satelite 
     public void setMeridiano(int merid){  this.meridiano=merid;} //dice que el atributo merid: se almacena en el primero: meridiano.
     public void setParalelo(int paral){ //dice que el atributo paral es:
     this.paralelo=paral;}  //se almacena en el primero: paralelo.
     public void setDistanciAtierra(int distanciAt){  this.distanciAtierra=distanciAt; } 
     public void setEnOrbita(boolean enOrb){  this.enOrbita=enOrb; }
     public void printPosicion(int meridiano, int paralelo){  this.meridiano=merid;    this.paralelo=paral;}
 
  int merid, paral;
  public String getPosicion(){return posicion;}
  public void setPosicion(String posicion){ this.meridiano=merid;  this.paralelo=paral;} 
  public void variarAltura(int distanciAt){ this.distanciAtierra=distanciAt;  }
  
}
