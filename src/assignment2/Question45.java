package assignment2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) throws IOException,NullPointerException {
       String filePath = "C:\\Users\\galgi\\Desktop\\q45.txt";
       File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("file created..");
        } else {
            System.out.println("file already exists..");
        }
        BufferedWriter bf = new BufferedWriter(new FileWriter(file));
        Scanner input = new Scanner(System.in);
        int i =0;
        while (i<4){
            System.out.println("Enter word");
            String word = input.nextLine();
            bf.write(word+ " ");
            i++;
        }
        bf.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = br.readLine();

        System.out.println(str);
        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));
        for(int j=0;j<split.length;j++){
            int cnt = 1;
            for(int k = 1;k<split.length;k++){
                if(split[j].equalsIgnoreCase(split[k])){
                    cnt++;
                    split[k]=null;
                }
            }
            if(cnt >1 && split[j] != null){
                System.out.println("Duplicate word in a file is: "+split[j]);
            }

        }

    }
}
