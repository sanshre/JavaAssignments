package assignment2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question44Student {
    String name;
    String address;

    public Question44Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) throws IOException{

        try {
            File file = new File("C:\\Users\\galgi\\Desktop\\q44.txt");
            BufferedWriter b = new BufferedWriter(new FileWriter(file));
            if (file.createNewFile())
                System.out.println("File created!");
            else
                System.out.println("File already exists.");

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("Enter name of student: ");
                String name = sc.nextLine();
                System.out.println("Enter address of student: ");
                String address = sc.nextLine();
                String a ="";
                a+= name+ ":" + address;
                b.write(a);
                b.newLine();
                a="";


            }
            b.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();

            System.out.println("Enter the name of the student whose address you want to print: ");
            String stdname = sc.nextLine();

            while(line != null){
                String[] parts = line.split(":");
                if(stdname.equalsIgnoreCase(parts[0]))
                    System.out.println("The address of "+ parts[0].toString() + " is: "+ parts[1].toString());
                line = br.readLine();
            }
            br.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

