public class SecuencialRecursivo{
    int posDato = -1;
    int iterador = 0;
    public int secuencial(int dato, int [] numeros){
     if(iterador < numeros.length){  
      if(numeros [iterador] == dato){
         posDato = iterador;
        }else{
         iterador++;   
         secuencial(dato, numeros);
        }
     }
     return posDato;  
    }
}
