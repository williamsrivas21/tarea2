
package tarea_modulo1;


public class paises {
   static String[]arreglo  = {"1.Peru","\n\n2.Mongolia","\n\n3.Iran","\n\n4.Libia","\n\n5.Sudan","\n\n6.Indonesia","\n\n7.Mexico","\n\n8.Arabia Saudita","\n\n9.Groenlandia","\n\n10.Republica Democratica del Congo","\n\n11.Argelia","\n\n12.Kazajistan","\n\n13.Argentina","\n\n14.India","\n\n15.Australia","\n\n16.Brasil","\n\n17.China","\n\n18.Estados Unidos","\n\n19.Canadad","\n\n20.Rusia",};
   static String acumulador = "";
   
 public static void main(String[] args) {
        
       for (int i= 0; i<arreglo.length; i++)
       {
           acumulador+=arreglo[i]+" ";
       }
       
       System.out.println(acumulador);
    }
    
}
