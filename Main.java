
public class Main {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};

        //vamos a ordenr de menlr a mayor >:)
        for (int i = 0; i < arreglo.length - 1; i++) {  // 1er for es el bucle wxterno
            for (int j = 0; j < arreglo.length - 1 - i; j++) {  // 2do for es el bucle interni
                // aqui se comparan los indices 
                if (arreglo[j] < arreglo[j + 1]) {
                    // aqui se intercambian los elementos usando de q los indices 
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    //forma mas cotra de hacer todo
                }
            }
        }

        // Imprimir 
        System.out.print("Arreglo ordenado de mayor a menor: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
            //cuchau
        }
    }
}
//no me jalaba el codigo, no sabia que tenia poner ""Main"" por que si no no jala lol, le pregunye a chatgpt y rwuslta que se tiene que llamar igual que el archivo 