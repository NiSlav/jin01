package com.nislav;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StationParser {
    public static void Reader(String filename){
        Scanner scnr = null;
        try {
            scnr = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scnr.hasNext()) {
            String str = scnr.nextLine();
            String[] s = str.split(":");
            new Station(s[0], s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]),Double.parseDouble(s[4]),Double.parseDouble(s[5]),s[6],s[7], s[8], null);
        }
    }
}
