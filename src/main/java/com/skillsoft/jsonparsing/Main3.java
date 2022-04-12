package com.skillsoft.jsonparsing;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) throws IOException {

/*        JSONObject employeeJson1 = new JSONObject();

        employeeJson1.put("name","Peter");
        employeeJson1.put("age",42);
        employeeJson1.put("gender",JSONObject.NULL);
        employeeJson1.put("title","Vice President");
        employeeJson1.put("salary",122000);

        JSONObject employeeJson2=new JSONObject();

        employeeJson2.put("name","Donna");
        employeeJson2.put("title","Tech LEad");
        employeeJson2.put("salary",120900);

        JSONArray employeeArray = new JSONArray();
        employeeArray.put(employeeJson1);
        employeeArray.put(employeeJson2);

        System.out.println(employeeArray.toString(2));

        try(FileWriter file = new FileWriter("employees.json")){
            employeeArray.write(file,2,0);
        }catch (IOException e){
            e.printStackTrace();
        }*/

/*        String employeeString = new String(Files.readAllBytes(Paths.get("employees.json")));

        JSONArray employeesJson = new JSONArray(employeeString);

        for(int i=0;i<employeesJson.length();i++){

            JSONObject employeeJson= employeesJson.getJSONObject(i);
            String name=employeeJson.getString("name");
            String title=employeeJson.getString("title");
            double salary=employeeJson.getDouble("salary");

            System.out.format("\n***\n%s, %s, %.1f\n",name,title,salary);

            int age = employeeJson.optInt("age");
            String gender = employeeJson.optString("gender");

            System.out.format("%d, %s\n",age,gender);
        }*/

       /* JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", "Male");
        employeeJson.put("title", "President");
        employeeJson.put("salary", 12280);


        employeeJson.append("email", "peter@gov.pt");
        employeeJson.append("email", "peter@census.pt");

        System.out.println(employeeJson.toString(0b10));

        try (FileWriter file = new FileWriter("employees.json")) {
            employeeJson.write(file, 2, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        JSONTokener token = new JSONTokener("I solemnly swear than I am up to good");

        System.out.println(token.skipTo('w'));

    }
}
