package com.skillsoft.jsonparsing;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[]args){
        System.out.println("*** Creating JSONObject");

        JSONObject dinnerListObject = new JSONObject();

        JSONArray dinnerList = new JSONArray();

        JSONObject dinner1 = new JSONObject();
        dinner1.put("name","Jane Stark");
        dinner1.put("age",22);
        dinner1.put("gender", null);
        dinner1.put("isAllergic", false);
        dinner1.put("amountSpent", 153.27);

        JSONArray contactList= new JSONArray();
        JSONObject contact1=new JSONObject();

        contact1.put("type","home");
        contact1.put("number","212-555-1234");


        JSONObject contact2 = new JSONObject();
        contact2.put("type","mobile");
        contact2.put("number","646-555-4567");

        contactList.add(contact1);
        contactList.add(contact2);

        dinner1.put("contact",contactList);

        dinnerList.add(dinner1);

        dinnerListObject.put("diners",dinnerList);

        System.out.println(dinnerListObject);


        try(FileWriter file = new FileWriter("diners.json")){
            dinnerListObject.writeJSONString(file);

        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("\n*** Writing out JSONArray of JSONObjects");

//Reading
/*
        System.out.println("*** Reading JSON");
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader= new FileReader("src/employees.json")){
            Object obj = jsonParser.parse(reader);

            ParsingHandler parsingHandler = new ParsingHandler();

            JSONArray jsonObject=(JSONArray) obj;
            System.out.println(jsonObject);

            jsonParser.parse(obj.toString(),parsingHandler,true);

            //JSONArray dinnerList = (JSONArray) JSONValue.parse(reader);
            */
/*JSONObject dinnerListObject = (JSONObject) jsonParser.parse(reader);
            System.out.println(dinnerListObject);

            JSONArray dinnerList = (JSONArray) dinnerListObject.get("diners");

            for(Object object: dinnerList) {

                JSONObject dinner = (JSONObject) object;
                System.out.println("\nDiner");

                for(Object key : dinner.keySet()){

                    if(key.equals("contact")){

                        JSONArray contactList = (JSONArray) dinner.get(key);
                        System.out.println("Contacts: ");
                        for(Object contact:contactList){

                            JSONObject contactJSON = (JSONObject) contact;

                            System.out.format("{Number: %s, Type: %s**}\n",
                                    contactJSON.get("number"),contactJSON.get("type"));
                        }
                    }
                }*//*

                */
/*String name = (String) dinner.get("name");
                System.out.println("\ndinner name: " + name);

                String gender = (String) dinner.get("gender");
                System.out.println("dinner gender: " + gender);

                long age = (long) dinner.get("age");
                System.out.println("dinner age: " + age);

                double amountSpent = (double) dinner.get("amountSpent");
                System.out.println("dinner spending: " + amountSpent);

                Boolean isAllergic = (Boolean) dinner.get("isAllergic");
                System.out.println("dinner is Allergic: " + isAllergic);*//*


            //}
        }catch (IOException | ParseException e){
            e.printStackTrace();
        }
        System.out.println("*** Completed reading JSON");
*/
    }
}
