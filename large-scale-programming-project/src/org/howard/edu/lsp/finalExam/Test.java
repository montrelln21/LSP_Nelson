package org.howard.edu.lsp.finalExam;
import java.util.HashMap;


public class Test {
	  public static void main(String art[])
	  {
	    HashMap<String, String> map1 = new HashMap<>();
	    map1.put("Alice","Healthy");
	    map1.put("Mary","Ecastic");
	    map1.put("Bob","Happy");
	    map1.put("Chuck","Fine");
	    map1.put("Felix","Sick");

	    HashMap<String, String> map2 = new HashMap<>();

	    map2.put("Mary","Ecastic");
	    map2.put("Bob","Happy");
	    map2.put("Tam","Fine");
	    map2.put("Felix","Healthy");
	    map2.put("Ricardo","Subperb");

	    MapUtilities mp = new MapUtilities();
	    System.out.println("Output : "+MapUtilities.commonKeyValuePairs(map1,map2));

	  }

	}

