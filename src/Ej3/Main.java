package Ej3;

import java.util.ArrayList;
import java.util.List;

class StringListUtils{

    public static int metodo1 (List<String> param1, String param2){
        if (param1==null){return 0;}
        if (param1.size()==0){return 0;}
        int nVeces = 0;
        for (String s : param1) {
            if (s.equals(param2)) {
                nVeces++;
            }
        }
        return nVeces;
    }

    public static String metodo2(List<String> param1, String param2){
        if (param1==null){return "null";}
        if (param1.size()==0){return "";}
         return String.join(param2,param1);
    }
    public static List<String> metodo3(List<String> param1, List<String> param2){
        List<String> param3 = new ArrayList<>();
        param3.addAll(param1);
        param3.addAll(param2);
        return param3;
    }
    public static List<String> metodo4(List<String> param1, String param2){
        List<String> param3 = new ArrayList<>();
        for (String s : param1) {
            if (s.equals(param2)) {
                param3.add(s);
            }
        }
        return param3;
    }


}


public class Main {
    public static void main(String[] args) {


        List<String> lista = List.of("pepepe", "popopo","popopo", "popopo","popopo", "popopo","popopo", "popopo","popopo","papapa","pololo","pelele");



        System.out.println(StringListUtils.metodo1(lista,"popopo"));

    }

}
