public class InsercionRecursivo{
    int iterador = 1;
    int ultimaPos = 1;
    public int [] insercion (int [] numeros){ 
       if(ultimaPos < numeros.length){
          if(iterador > 0 && numeros [iterador - 1] > numeros [iterador]){
              ordenarALaIzquierda (numeros, iterador);
              iterador--;
              insercion(numeros);
          }
          ultimaPos++;
          iterador = ultimaPos;
          insercion(numeros);  
        }
       iterador = 1;
       ultimaPos = 1;
       return numeros; 
    }
    private void ordenarALaIzquierda (int [] numeros, int ite){
       int aux = numeros[ite - 1];
       numeros [ite - 1] = numeros [ite];
       numeros [ite] = aux;
    }
}
