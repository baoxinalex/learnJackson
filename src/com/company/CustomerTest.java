package com.company;

/**
 * Created by BaoX on 23/10/2017.
 */
//import com.fasterxml.jackson.databind.*;
//import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        File jsonFile = new File("all_customer.json");
        URL jsonUrl = new URL("https://gist.githubusercontent.com/baoxinalex/13419c82361a5638988fe380a50b118f/raw/bfb9ac89615681765bdafc0312a98c55ed70fe9d/all_customer.json");
        String jsonStr = "{\"Id\":\"ALFKI\",\"CompanyName\":\"Alfreds Futterkiste\",\"ContactName\":\"Maria Anders\",\"ContactTitle\":\"Sales Representative\",\"Address\":\"Obere Str. 57\",\"City\":\"Berlin\",\"PostalCode\":\"12209\",\"Country\":\"Germany\",\"Phone\":\"030-0074321\",\"Fax\":\"030-0076545\"}";
        ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally

//        String jsonArray = mapper.writeValueAsString(customer);
        // IMPORTANT
        // without this option set adding new fields breaks old code
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

//        customer = mapper.readValue(jsonFile, Customer.class);
//        System.out.println(customer.getCompanyName());

         //Customer[] cust = mapper.readValue(jsonUrl, Customer[].class);
        //System.out.println(mapper.writeValueAsString(customer[0]));

//        customer = mapper.readValue(jsonStr, Customer.class);
//        System.out.println(customer.getCountry());

//        Customer customer = mapper.readValue(jsonUrl, Customer.class);
        //Customer customer = mapper.readValue(jsonUrl, Customer.class);

        List<Customer> customerList = mapper.readValue(jsonUrl, TypeFactory.defaultInstance().constructCollectionType(List.class, Customer.class));
        System.out.println(customerList.get(0));

//        TypeReference<List<Customer>> mapType = new TypeReference<List<Customer>>() {};
//        List<Customer> jsonToPersonList = mapper.readValue(arrayToJson, mapType);
//        System.out.println();

}
}