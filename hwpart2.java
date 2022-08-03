public class hwpart2 {
    class Customer{
        public int ID;
        private String name;
        private char gender;

        public Customer(int ID, String name, char gender) throws RuntimeException {
            if (gender!='m'&&gender!='f'){
                throw new RuntimeException("the gender is other than 'm' or 'f'");
            }
            this.ID = ID;
            this.name = name;
            this.gender = gender;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "ID=" + ID +
                    ", name=" + name +
                    '}';
        }
    }
    public void main(String[] args) {
        try {
            Customer customer1=new Customer(76786,"Ayed",'m');
            Customer customer2=new Customer(9888,"Khalid",'m');


            System.out.println("Customer1 name: "+customer1.getName()+" ,id: "+customer1.getID()+" ,gender: "+customer1.getGender());
            //Or
            System.out.println(customer1.toString());

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
