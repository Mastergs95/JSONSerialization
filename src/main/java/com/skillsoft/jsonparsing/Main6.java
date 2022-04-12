package com.skillsoft.jsonparsing;

import org.json.CDL;
import org.json.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main6 {

    public static void main(String [] args) throws IOException {

        /*JSONArray headerArray = new JSONArray();

        headerArray.put("ID");
        headerArray.put("LoanStatus");
        headerArray.put("LoanAmount");
        headerArray.put("Term");
        headerArray.put("AnnualIncome");
        headerArray.put("Home");
        headerArray.put("CreditBalance");

        String commaDelimitedLoans= new String(Files.readAllBytes(Paths.get("loans.csv")));

        JSONArray loansArray = CDL.toJSONArray(headerArray,commaDelimitedLoans);
        System.out.println(loansArray.toString(2));

        try(FileWriter file = new FileWriter("loans.json")){
            loansArray.write(file,2,0);

        }catch (IOException e){
            e.printStackTrace();
        }*/

        String commaDelimitedLoans = new String(Files.readAllBytes(Paths.get("loans_with_header.csv")));

        JSONArray loansArray = CDL.toJSONArray(commaDelimitedLoans);

        System.out.println(loansArray.toString(2));

        try(FileWriter file = new FileWriter("loans_with_header.json")){
            loansArray.write(file,2,0);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
