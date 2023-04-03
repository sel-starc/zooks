//package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataOperationScanner {
    public static void main(String[] args) throws IOException {
        String ln;

        final String filename = "C:\\Users\\KIIT\\OneDrive\\Desktop\\ZOOKS OFFICIAL\\iris.csv";
        List<List<Double>> data = new ArrayList<>();
        // List<List<Double>> data = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            ln = sc.nextLine();
            String[] dl = ln.split(",");
            ArrayList<Double> dr = new ArrayList<>();
            for (String element : dl) {
                dr.add(Double.parseDouble(element));
            }
            data.add(dr);
        }
        System.out.print("Att1  Att2  Att3  Att4 ");
        System.out.println();
        for (List<Double> datum : data) {
            for (int j = 0; j < data.get(j).size(); ++j) {
                System.out.print(datum.get(j) + "   ");
            }
            System.out.println();
        }
    }
}
