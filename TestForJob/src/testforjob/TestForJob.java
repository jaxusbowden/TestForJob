/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforjob;

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
        String stringToSplit = "str1-str2-str3";
        String[] tempArray;
 
        /* delimiter */
        String delimiter = "-";
 
        /* given string will be split by the argument delimiter provided. */
        tempArray = stringToSplit.split(delimiter);
 
         /* print substrings */
        for (int i = 0; i < tempArray.length; i++)
            System.out.println(tempArray[i]);
         
    }
    
}
