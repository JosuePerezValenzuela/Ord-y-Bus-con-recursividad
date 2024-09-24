import java.util.ArrayList;

public class ejer1
{
    ArrayList <Integer> respAct = new ArrayList <> ();
    ArrayList <Integer> respOff = new ArrayList <> ();
    public ArrayList <Integer> subSecuenciaLarga (ArrayList <Integer> secuencia){
     ArrayList <Integer> resp = new ArrayList <> ();
     respAct.clear();
     int iterador = 0;
     subSecuenciaLarga (resp, iterador, secuencia);
     return respOff;
    }
    private void subSecuenciaLarga (ArrayList <Integer> resp, int iterador, ArrayList <Integer> secuencia){  
      if (iterador < secuencia.size() - 1){
        if(respAct.isEmpty()){
        respAct.add(secuencia.get(iterador));
       } 
       if(EsMayorMenorEn1(respAct.get(respAct.size()-1),secuencia.get(iterador + 1))){
          respAct.add(secuencia.get(iterador + 1));
          subSecuenciaLarga (resp, iterador + 1, secuencia);
        }else{
         if(respAct.size() > resp.size()){
             respOff = (ArrayList<Integer>)respAct.clone();
             respAct.clear();
            } 
         respAct.clear();   
         subSecuenciaLarga (respOff, iterador + 1, secuencia);
       }
      }
    }
    private boolean EsMayorMenorEn1(int act, int sig){
      if (act + 1 == sig || act - 1 == sig){
          return true;
        }
      return false;  
    }
    public ArrayList <Integer> array (){
      ArrayList <Integer> resp = new ArrayList <> ();
      resp.add(-2);
      resp.add(-1);
      resp.add(1);
      resp.add(2);
      resp.add(3);
      resp.add(6);
      resp.add(7);
      resp.add(8);
      resp.add(7);
      resp.add(6);
      resp.add(5);
      resp.add(9);
      resp.add(1);
      resp.add(2);
      resp.add(3);
      return resp;
    }
}
