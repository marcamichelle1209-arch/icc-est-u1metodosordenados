public class MetodoSeleccion {
    
    public void sort(int[] arr){
        int n = arr.length;
        for(int i= 0; i < n -1; i++){
            int indiceMenor = i;
            for (int j = i+1; j < n; j++){
                if(arr[indiceMenor]> arr[j]){
                    indiceMenor =j;  // Actuliza el indice

                }

            }
            if (i != indiceMenor){  //intercambia por el termino menor que se haya encontrado en el arreglo
                int aux = arr[i];
                arr[i]=arr[indiceMenor];
                arr[indiceMenor]=aux;
            }
        }
    }

    public void sortDes(int[] arr) {
        int n = arr.length;
        for(int i= 0; i < n -1; i++){
            int indiceMayor = i;
            for (int j = i+1; j < n; j++){
                if(arr[indiceMayor]<arr[j]){
                    indiceMayor =j;  // Actuliza el indice

                }

            }
            if (i != indiceMayor){  //intercambia por el termino menor que se haya encontrado en el arreglo
                int aux = arr[i];
                arr[i]=arr[indiceMayor];
                arr[indiceMayor]=aux;
            }
        }
    }
    public void printArreglo(int[] arr) {
        System.out.println("[");
        for(int num : arr){
            System.out.print(num + ",");
        }
        System.out.println("]");
    }
    


}
