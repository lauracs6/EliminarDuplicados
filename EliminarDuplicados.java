import java.util.Arrays;

public class eliminarDuplicados {

    public static int[] distinct(int[] array) {
        // Crear un arreglo (índices j) para almacenar los valores únicos
        int[] resultado = new int[array.length];
        int indice = 0;

        // Recorrer el array original 
        for (int i = 0; i < array.length; i++) {
            boolean esDuplicado = false;

            // Recorrer el otro array para verificar si algún valor es duplicado
            for (int j = 0; j < indice; j++) {
                if (resultado[j] == array[i]) {
                    esDuplicado = true; 
                    break;
                }
            }

            // Si no es duplicado, añadirlo al arreglo resultado
            if (!esDuplicado) {
                resultado[indice++] = array[i]; // El siguiente índice de resultado pasa a ser el valor actual
            }
        }

        // Devolver un nuevo arreglo con los valores únicos
        return Arrays.copyOf(resultado, indice);
    }

    public static void main(String[] args) {
        // Ejemplo 1
        int[] numeros1 = {1, 1, 2};
        System.out.println(Arrays.toString(distinct(numeros1)));

        // Ejemplo 2
        int[] numeros2 = {1, 2, 1, 1, 3, 2};
        System.out.println(Arrays.toString(distinct(numeros2)));
    }
}
