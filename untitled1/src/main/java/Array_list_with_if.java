public class Array_list_with_if {
    public static void main(String ... fdf){
        int[] arr2 = {1,2,3,4,5,6,7,8,9,12};

        for(int i=0; i<arr2.length; i++){

           if(arr2[i]%2 == 0){
                System.out.println(arr2[i]+ " is even");
            }
           else if(arr2[i] == 9){
               break;
           }
           else{
                System.out.println(arr2[i]+" is odd");
            }

           }
        }
    }

