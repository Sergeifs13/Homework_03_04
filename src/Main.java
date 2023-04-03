import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<String> str1 = new ArrayList<>();
        str1.add("bb");
        str1.add("a");
        str1.add("ff");
        str1.add("dddd");
        String max = Collections.max(str1, Comparator.comparing(s -> s.length()));
        String min = Collections.min(str1, Comparator.comparing(s -> s.length()));
        System.out.println("long - "+max);
        System.out.println("short - "+min);

        lengthMaxMin();

    }
    public static void lengthMaxMin(){
        List<String> str = List.of("bbb", "a", "dddd", "ff");

        int minLength = str.get(0).length();
        int maxLength = str.get(0).length();
        int indexMin = str.indexOf(str.get(0));
        int indexMax = str.indexOf(str.get(0));



        for (int i = 0; i<str.size(); i++){
            if (str.get(i).length() <= minLength){
                minLength = str.get(i).length();
                indexMin = str.indexOf(str.get(i));
            }
            if (str.get(i).length() >= maxLength){
                maxLength = str.get(i).length();
                indexMax = str.indexOf(str.get(i));
            }
        }
        if (indexMax>indexMin){
            System.out.println("Самая короткая строка встречается раньше - "+str.get(indexMin));
        }
        else if (indexMax<indexMin){
            System.out.println("Самая длинная строка встречается раньше - "+str.get(indexMax));
        }

    }
    }

/*
Самая короткая строка встречается раньше - a
Самая длинная строка встречается раньше - bbbb



long - dddd
short - a
 */
