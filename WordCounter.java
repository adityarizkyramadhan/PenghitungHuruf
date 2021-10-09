package com.programku.wordcounter;

import javax.print.DocFlavor;
import java.io.*;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.print("Masukkan kalimat yang akan dihitung hurufnya : ");
        String count = br.readLine();
        int countWord = 0;
        char[]word = count.toCharArray();
        for (int i = 0; i < word.length; i++){
            System.out.printf("Huruf ke-%d = %c\n",(i+1),word[i]);
            countWord=i;
        }
        System.out.println("Total Huruf = "+(countWord+1));


    }

}
