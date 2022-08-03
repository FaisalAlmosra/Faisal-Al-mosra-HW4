public class hwpart1 {

        public static void main(String[] args)  {
            int arr[]={10,9,5,2,6};
            try{
                int i= getSmallPositive(arr);
                System.out.println(i);
            } catch (Exception e){
                System.out.println("wrong");
            }
        }
        public static int getSmallPositive (int arr[] ) throws Exception {
            int total=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<0){
                    throw new Exception("it is negative number");
                }else if (arr[i]<total){
                    total=arr[i];
                }

            }

            return total;

        }
    }