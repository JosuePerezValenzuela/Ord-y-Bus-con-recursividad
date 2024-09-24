public class BinariaRecursiva{
    int sup,inf,mitad;
    public int binaria (int [] numeros, int dato){
      return binaria (numeros, dato, numeros.length, 0, (numeros.length)/2);
    }
    private int binaria(int [] numeros, int dato, int sup, int inf, int mitad){
      int resp = -1;
      if(mitad == inf){
         return resp;
        }else if(inf < sup){
          if(numeros[mitad] == dato)
          return mitad;
          else if (numeros[mitad] < dato){
          inf = mitad;
          mitad = (sup + inf)/2;
          }else if (numeros[mitad] > dato){
            sup = mitad;
            mitad = (sup + inf)/2;
          }
          resp = binaria(numeros, dato, sup, inf, mitad);
        }
      return resp;  
    }
}
