public class Strings {
    //String is a object
    public static void main(String... dsa) {
        String s = "Aditya singh Bhadauriya";
        String s1 = new String("Aditya");

        String [] splited =  s.split("singh");
        System.out.println(splited[0].trim());
        System.out.println(splited[1].trim());
        for(int i = s.length()-1; i>=0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
