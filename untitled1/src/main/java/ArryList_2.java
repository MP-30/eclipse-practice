import java.lang.reflect.Array;
import java.util.*;
public class ArryList_2 {
    public static void main(String...stf){
        ArrayList<String> ar =  new ArrayList<String>();
        ar.add("aditya");
        ar.add("Hello");
        ar.add("78n");
        ar.add("kdjw8s");
        ar.add("dus6");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        for(String val:ar ){
            System.out.println(val);
        }
        System.out.println(ar.contains("Selenium"));

        Arrays.asList();
     }
}
