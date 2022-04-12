package com.skillsoft.jsonparsing;

import org.json.JSONObject;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLSyntaxErrorException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

/*        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", JSONObject.NULL);
        employeeJson.put("title", "President");
        employeeJson.put("salary", 12280);

        System.out.println(employeeJson);

        try (FileWriter file = new FileWriter("employee.json")) {
            employeeJson.write(file);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


//PRETTY PRINT JSON

/*        Map<String,String> map = new HashMap<>();

        map.put("name","Peter");
        map.put("title","Vice President");
        map.put("department","Sales");

        JSONObject employeeJson = new JSONObject(map);

        System.out.println(employeeJson.toString(42));

        try (FileWriter file = new FileWriter("employee.json")) {
            employeeJson.write(file,2,0);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
//OTHER PRINT
/*        String employeeString="{"+
                "\"name\":\"Peter\","+
                "\"age\":42,"+
                "\"gender\":null,"+
                "\"title\":\"Vice President\","+
                "\"salary\":120000"+
                "}";

        JSONObject employeeJson = new JSONObject(employeeString);

        System.out.println(employeeJson.toString(2));

        try(FileWriter file = new FileWriter("employee.json")){
            employeeJson.write(file,2,0);

        }catch (IOException e){
            e.printStackTrace();
        }*/


/*
        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", JSONObject.NULL);
        employeeJson.put("title", "President");
        employeeJson.put("salary", 12280);

        JSONObject contactJson=new JSONObject();
        contactJson.put("phone","212.434.7685");
        contactJson.put("email","peter@gmail.com");

        employeeJson.put("contact",contactJson);

        System.out.println(employeeJson.toString(2));

        try(FileWriter file = new FileWriter("employee.json")){
            employeeJson.write(file,2,0);
        }catch (IOException e){
            e.printStackTrace();
        }*/

        String employeeString=new String(Files.readAllBytes(Paths.get("employee.json")));

        JSONObject employeeJson = new JSONObject(employeeString);

        String name = employeeJson.getString("name");
        double salary = employeeJson.getDouble("salary");

        JSONObject contactJSon=employeeJson.getJSONObject("contact");

        String phone = contactJSon.getString("phone");
        String email = contactJSon.getString("email");

        System.out.format("\n%s, %s, %s, %.1f\n", name,phone,email,salary);

    }
}
