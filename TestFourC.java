/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfourc;

import java.io.*;
import java.util.*;

/**
 *
 * @author complab
 */
public class TestFourC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner textfile = new Scanner (System.in);
        BufferedReader bf = null;
        String line = null;
        List<String> strong = new ArrayList<>();
        List<String> weak = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
   
        String txt = "passwords.txt";
        bf = new BufferedReader (new FileReader(txt));
        while ((line = bf.readLine()) != null)   {
            if (line.matches(".*[a-zA-Z]+.*") && line.matches(".*\\d+.*") && line.length() > 8) {
                String str = line.substring(0, 2) + "********";
                strong.add(line);
                passwords.add(str);
            }
            else {
                String str = line.substring(0, 2) + "********";
                weak.add(line);
                passwords.add(str);
            }
            
        }
        System.out.println("Strong Passwords");
        System.out.println("---------------------------");
        System.out.println(strong);
        System.out.println("");
        System.out.println("Weak Passwords");
        System.out.println("---------------------------");
        System.out.println(weak);
        System.out.println("");
        System.out.println("Passwords");
        System.out.println("---------------------------");
        System.out.println(passwords);
    }
    
}
