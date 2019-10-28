/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

/**
 *
 * @author Denilson Argueta
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LA IMAGEN LA ENCONTRARAN EN LA CARPETA DE SU PROYECTO
        String arreglo[]= {"producto1","producto2","producto3","producto5"};
        String cadena="";
        for(int i=0;i<arreglo.length;i++){
            /*este es el ultimo elemento de el arreglo, ustedes tendrian que validar que sea el ultimo de su estructura
                y apuntar al ultimo con la cabeza y la cabeza con el ultimo
            */
            if(i==arreglo.length-1){
                cadena += arreglo[i]+"->"+arreglo[0]+"\n";
                cadena += arreglo[0]+"->"+arreglo[i]+"\n";
            }else{
                cadena += arreglo[i]+"->"+arreglo[i+1]+"\n";
                cadena += arreglo[i+1]+"->"+arreglo[i]+"\n";
            }
            
        }
        Graficar.Imagen(cadena, "reporte1");
    }
    
}
