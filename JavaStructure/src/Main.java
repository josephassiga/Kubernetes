import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Arrays.asList("Bonjour".toCharArray()).stream().sorted().forEach(System.out::print);


System.out.println(permute("Dieu"));
    }


    public static boolean isUniqueChars(String str){

        if(str.length() > 128){
            return false;
        }

        boolean[] chart_set = new boolean[256];


        for(int i = 0 ; i < str.length(); i++){
            int val = str.charAt(i);
            if (chart_set[val]) {
                return false;
            }

            chart_set[val] = true;
        }

        return true;
    }


    public static String permute(String string){

        if(string == null || string.equals(""))
        {
            return string;
        }

        System.out.println(string.length());
        char[] reverse = new char[string.length()];
        for(int i = string.length() -1; i >= 0 ; i --){
            reverse[string.length() - i - 1] = string.charAt(i);
        }

        return new String(reverse);
    }


    public static String sort(String str){
     char[] content = str.toCharArray();
     Arrays.sort(content);

     return new String(content);
    }

    public  static boolean permutation(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        return sort(s).equals(sort(t));
    }
}
