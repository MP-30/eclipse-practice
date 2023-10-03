public class Enhanced_for_loop {
    public static void main(String... dgd){
        String[] name = {"aditya" , "singh" , "Rahul" , "Vivek","Bhadauriya"};

        for (int i=0; i< name.length;i++){
            if(name[i].length()>5){
                System.out.println(name[i]+" is greater then 5");

            }
            else{
                System.out.println(name[i]+" is not greater then 5");
                break;
            }

        }

            }
}
