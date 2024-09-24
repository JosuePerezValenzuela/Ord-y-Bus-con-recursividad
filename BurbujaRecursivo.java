public class BurbujaRecursivo{
    int iterador = 0;
    int aux = 0;
    public int [] burbuja(int[] numeros){
        if(estaOrdenado(numeros) == true){
            String texto = "Leon";
            texto.
            return numeros;
        }else{
           if(iterador < numeros.length - 1 && numeros[iterador] > numeros [iterador + 1]){
              int aux1 = numeros [iterador];
              numeros [iterador] = numeros [iterador + 1];
              numeros [iterador + 1] = aux1;
            }
           iterador++; 
           if(iterador == numeros.length - 1)
               iterador = 0; 
           burbuja(numeros); 
        }
        iterador = 0;
        return numeros;
    }
    private boolean estaOrdenado(int [] numeros){
      boolean resp = false;
      if (aux < numeros.length - 1 && numeros[aux] <= numeros [aux+1]){
          aux++;
          resp = estaOrdenado(numeros); 
        }else if (aux < numeros.length - 1 && numeros[aux] > numeros [aux+1]){
          return false;
        }else{
         resp = true;
        }
      aux = 0;
      return resp;  
    }
}
