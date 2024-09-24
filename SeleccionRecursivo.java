public class SeleccionRecursivo{
    int iterador = 0;
    int posMinParcial = 0;
    public int [] seleccion(int [] numeros){
       if(iterador < numeros.length){
         posMinParcial = iterador;  
         int posDelMenor = posMenorDeLaLista(numeros, iterador);
         int aux = numeros[iterador];
         numeros[iterador] = numeros[posDelMenor];
         numeros[posDelMenor] = aux;
         iterador++;
         seleccion(numeros);
       }
       iterador = 0;
       posMinParcial = 0;
       return numeros;
    }
    private int posMenorDeLaLista(int [] numeros, int ite){ 
        if(ite < numeros.length){
          if(numeros [ite] < numeros [posMinParcial]){
              posMinParcial = ite;
              posMenorDeLaLista(numeros, ite+1);
            }
          posMinParcial = posMinParcial;
          posMenorDeLaLista(numeros, ite+1);
        }
        return posMinParcial; 
    }
}
