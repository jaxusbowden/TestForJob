/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforjob;

import java.util.ArrayList;

/**
 *
 * @author jaxus
 */
public class TestForJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* String to split. */
        String stringToSplit = "UNA:+.? '\n" +
"UNB+UNOC:3+2021000969+4441963198+180525:1225+3VAL2MJV6EH9IX+KMSV7HMD+CUSDECU-IE++1++1'\n" +
"UNH+EDIFACT+CUSDEC:D:96B:UN:145050'\n" +
"BGM+ZEM:::EX+09SEE7JPUV5HC06IC6+Z'\n" +
"LOC+17+IT044100'\n" +
"LOC+18+SOL'\n" +
"LOC+35+SE'\n" +
"LOC+36+TZ'\n" +
"LOC+116+SE003033'\n" +
"DTM+9:20090527:102'\n" +
"DTM+268:20090626:102'\n" +
"DTM+182:20090527:102'";
        String[] tempArray;
        String[] newTemp;
        ArrayList<String> answer = new ArrayList<>();
 
        /* delimiter */
        String delimiter = "'";
        String split = "\\+";
 
        /* given string will be split by the argument delimiter provided. */
        tempArray = stringToSplit.split(delimiter);
 
        /* print substrings */
        for (String tempArray1 : tempArray) {
            if(tempArray1.contains("LOC")){
                System.out.println(tempArray1);
                newTemp = tempArray1.split(split);
                
                for (String tempArray2:newTemp){
                    if(!tempArray2.contains("LOC")){
                        if(tempArray2.contains("'\n")){
                            tempArray2 = tempArray2.substring(0, tempArray2.length()-3);
                        }
                        answer.add(tempArray2);
                    }
                }
            }
        }
        
        for (String read:answer){
            System.out.println(read);
        }
         
    }
    
}
