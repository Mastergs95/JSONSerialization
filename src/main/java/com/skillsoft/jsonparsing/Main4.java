package com.skillsoft.jsonparsing;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String []args){
        EmployeeBean employeeBean = new EmployeeBean(
            BigInteger.valueOf(1234567), "John","Business Analyst",56000,2);


        EmployeeBean employeeBean2 = new EmployeeBean();
        employeeBean2.setId(BigInteger.valueOf(12332));
        employeeBean2.setName("Julia");
        employeeBean2.setTitle("President");
        employeeBean2.setAge(35);
        employeeBean2.setActive(true);
        employeeBean2.setCommittee(
                new CommitteeBean("Salary",5),
                new CommitteeBean("Promotions",4));


        EmployeeBean employeeBean3 = new EmployeeBean();
        employeeBean3.setId(BigInteger.valueOf(454754));
        employeeBean3.setName("Doris");
        employeeBean3.setCommittee(new CommitteeBean("Food",10));
        employeeBean3.setActive(true);

        List<EmployeeBean> list = new ArrayList<>();
        list.add(employeeBean);
        list.add(employeeBean2);
        list.add(employeeBean3);


        JSONArray jsonArray = new JSONArray(list);

        System.out.println(jsonArray.toString(2));

        try(FileWriter file = new FileWriter("employees.json")){
            jsonArray.write(file,2,0);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
