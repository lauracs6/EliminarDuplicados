import java.util.HashMap;

public class eliminarDuplicadosHashmap {
   
    public static int [] eliminarDuplicados (int [] array) {

       HashMap <Integer, Integer> numeros = new HashMap <Integer, Integer> ();

       for (int i = 0; i < array.length; i++) {
           if (!numeros.containsKey(array[i])) { //Esto significa que no se ha encontrado el número en el hashmap
               numeros.put(array[i], 0); //Así que se añade al hashmap
           }
       }

       int[] resultado = new int[numeros.size()];
        int index = 0;
        
        // Recorrer las claves del hashmap porque las claves son los números únicos
        Object[] keys = numeros.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            resultado[index++] = (int) keys[i]; 
        }

        return resultado; // Retornar el array con los números únicos
    }

    public static void main (String [] args) {
        int [] array = {1, 1, 2};
        int [] resultado = eliminarDuplicados(array);

        for (int i = 0; i < resultado.length; i++) {
        System.out.println(resultado[i] + " ");         
        }
    }
}
