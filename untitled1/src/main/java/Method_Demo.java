public class Method_Demo {
    public static void main(String... dad){
//     Method_Demo print = new Method_Demo();
    String Name = getData();
     System.out.println(Name);

     Mathod_demo_child d = new Mathod_demo_child();
     String Name2 = d.getUserdata();

    }
    public static String getData(){
        System.out.println("Hello World");
        return"Aditya";
    }
}
