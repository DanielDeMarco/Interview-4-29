import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
 
@SuppressWarnings({"unchecked", "rawtypes"})

class API {
  private JSONArray data;
  private String response = "{\"data\":[{\"email\":\"etweddell0@timesonline.co.uk\",\"skills\":[\"node\",\"react\",\"java\",\"kubernetes\"]},{\"email\":\"kgrinin1@army.mil\",\"skills\":[\"java\",\"cloudfoundry\",\"git\",\"github\"]},{\"email\":\"rromaine2@reference.com\",\"skills\":[\"php\",\"html\",\"node\"]},{\"email\":\"gruller3@php.net\",\"skills\":[\"php\",\"mysql\",\"databases\"]},{\"email\":\"dcorradini4@prweb.com\",\"skills\":[\"docker\",\"sass\",\"css\"]},{\"email\":\"etweddell0@timesonline.co.uk\",\"skills\":[\"node\",\"react\",\"databases\"]},{\"email\":\"kgrinin1@army.mil\",\"skills\":[\"scm\",\"git\",\"github\"]},{\"email\":\"rromaine2@reference.com\",\"skills\":[\"kubernetes\",\"css\",\"html\"]},{\"email\":\"gruller3@php.net\",\"skills\":[\"angular\",\"mongodb\"]},{\"email\":\"dcorradini4@prweb.com\",\"skills\":[\"cloudfoundry\",\"containerd\",\"webpack\"]}]}";
  
  public JSONObject fetchData() {
    JSONParser parser = new JSONParser();
    JSONObject response = new JSONObject();
    
     try {
        response = (JSONObject) parser.parse(this.response);
     } catch(Exception e) {
      System.out.println(e);
     }
      
    return response; 
  }
  
}

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    API api = new API();
    JSONObject response = api.fetchData();
    System.out.println(response);
  } 
}

