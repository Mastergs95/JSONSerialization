package com.skillsoft.jsonparsing;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Main5 {

    public static void main(String [] args){

        /*JSONObject studentsJson = new JSONObject();

        JSONArray namesArray = CDL.rowToJSONArray(new JSONTokener("Peter, Jane, Bob, Nora, Hannah"));

        studentsJson.put("names",namesArray);

        System.out.println(studentsJson.toString(2));*/

        JSONArray fieldsArray = CDL.rowToJSONArray(new JSONTokener("ID,LoanStatus,LoanAmount,Term,CreditScore,AnnualIncome,Home,CreditBalance"));

        System.out.println(fieldsArray);

        JSONObject loanJson1 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
                "c89d323,Fully Paid, 314212,Short term, 716.0, Home, Mortgage, 1522"));

        JSONObject loanJson2 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
                "d43g3743,Fully Paid, 314212,Short term, 716.0, Home, Own, 767"));

        JSONObject loanJson3 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
                "pl909g33,Fully Paid, 314212,Short term, 716.0, Home, Rent, 1522"));

        JSONObject loansJson= new JSONObject();
        loansJson.append("loans",loanJson1);
        loansJson.append("loans",loanJson2);
        loansJson.append("loans",loanJson3);

        System.out.println(loansJson.toString(2));
    }
}
