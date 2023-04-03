import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void lengthMaxMin() {
        List<String> str = List.of("bbb", "a", "dddd", "ff");

        int minLength = str.get(0).length();
        assertEquals(minLength,str.get(0).length());
        int maxLength = str.get(0).length();
        assertEquals(maxLength,str.get(0).length());
        int indexMin = str.indexOf(str.get(0));
        assertEquals(indexMin,str.indexOf(str.get(0)));
        int indexMax = str.indexOf(str.get(0));
        assertEquals(indexMax,str.indexOf(str.get(0)));

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

    }
}