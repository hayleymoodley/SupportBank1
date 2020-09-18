package training.supportbank;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        String input1 = "";
        printinput(input1);
        String line = " ";
        String input2 ="";


         //reading the CSV file
        FileInputStream fis = new FileInputStream("2014 transactions.csv");
        Scanner sc = new Scanner(fis);
        String name = sc.nextLine();



        // converting the CSV file into a string
        String transactionfile = "/Users/hmoodley/Desktop/bootcamp/Challenge3/SupportBank/2014 transactions.csv";
        //using buffered reader to read the CSV string file
            BufferedReader br = new BufferedReader(new FileReader(transactionfile));
            br.readLine();
            while ((line = br.readLine()) !=null){
                //Split Accountdata by a comma
                String [] Accountdata = line.split(",");
                System.out.println(Accountdata);
            }




            while (sc.hasNextLine()) {
                if(sc.nextLine().contains("Jon A")) {
                System.out.println("Adding to Jon's file ...");
                }

                if ((sc.nextLine().equals("01/01/2014,Jon A,Sarah T,Pokemon Training,7.8"))) {
                    System.out.println("Test");
                    System.out.println(sc.nextLine());

            }

        }


    }
    // public static void transactionlist1 (String args[]) throws IOException {
    // ArrayList<String> transactions = (ArrayList<String>) Files.readAllLines(Paths.get("/Users/hmoodley/Desktop/bootcamp/Challenge3/SupportBank/2014 transactions.csv"));
    //for (String transaction : transactions) {
    //  if
    //System.out.println(transaction);



    //input statement for List All and for accounts of each person
    public static void printinput(String input1) {
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ListAll to output the account of each person : ");
        input1 = input.next();
        System.out.println("You entered " + input1);


        System.out.print("List account to print transactions for that account : ");
        String input2 = input.next();
        System.out.println("You entered " + input2);
        input.close();
    }

}

