import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Declaring a Final Variable

    public static final int DIRECTION = 3000;

    static Scanner scanner = new Scanner(System.in);
    static int age = 10;
    static int accountBalance = 500000;


    public static int Deposit() {
        System.out.println("How much do you want to withdraw?");

        int balance = 0;
        int amount = scanner.nextInt();

        balance = amount + accountBalance;

        return balance;
    }

    public static int WithDraw() {
        System.out.println("How much do you want to withdraw?");
        int amount = scanner.nextInt();

        int balance = 0;
        if (amount > accountBalance) {
            System.out.println("Insufficient balance");
        } else {
            balance = accountBalance - amount;
            return balance;
        }
        ;
        return balance;
    }

    public static void main(String[] args) {

        Serialize sv = new Serialize();
        sv.serializeObject();
        sv.deserializeObject();

        RequestFunc rf = new RequestFunc();
        rf.getDetails();


        FileFunc file = new FileFunc();
        String x = file.ReadFile("src/demo.txt");
        System.out.println(x);

       /* Car carOne = new Car();
        carOne.setCarName("Toyota");
        System.out.println(carOne.getCarName());*/
        /*        DIRECTION = 3000;      */

        String name = "john";
        String addedName = name.concat(" Ossai");

        // System.out.println(addedName);

        // Java Strings are immutable
        // System.out.println(name);
        Person p = new Person("John", 34);
        Student s = new Student("Ossai", 123, "12345");

        s.getDetails();
        String nameValue = s.getName();

        System.out.println(nameValue);

        System.out.println(p.name + ' ' + p.age);


        // Check the instance of an object

        //

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Enter your operations");
        System.out.println("\t1. Withdraw \n\t2. Deposit\n\t3. Check Current Balance");

        int choice = scanner.nextInt();*/

        // Understanding the Array List in Java
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);


        list.add("John");

        // Reading a File


        try {
            FileReader fileReader = new FileReader("src/demo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            if(bufferedReader.readLine()!==null){
//
//            }
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println(list);


    }

}