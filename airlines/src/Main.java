import java.util.*;
public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        createCu();

        System.out.println(customers.get(0).getName());




    }


    public static void createCu(){
        /*
        String name;
        int age;
        String email;
        String password;
        String number;
        String country;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("input ur name");
        String name = sc.nextLine();

        System.out.println("input ur age");
        int age = sc.nextInt();

        System.out.println("input ur email");
        String email = sc.nextLine();

        System.out.println("input ur password");
        String password = sc.nextLine();

        System.out.println("input ur number");
        String number = sc.nextLine();

        System.out.println("input ur country");
        String country = sc.nextLine();

        Customer newCustomer = new Customer(name, age, email, password, number, country);
        customers.add(newCustomer);
    }

}