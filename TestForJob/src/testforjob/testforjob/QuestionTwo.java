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
public class QuestionTwo {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* String to split. */
        String stringToSplit = "<InputDocument>\n" +
"<DeclarationList>\n" +
"<Declaration Command=\"DEFAULT\" Version=\"5.13\">\n" +
"<DeclarationHeader>\n" +
"<Jurisdiction>IE</Jurisdiction>\n" +
"<CWProcedure>IMPORT</CWProcedure>\n" +
"<DeclarationDestination>CUSTOMSWAREIE</DeclarationDestination>\n" +
"<DocumentRef>71Q0019681</DocumentRef>\n" +
"<SiteID>DUB</SiteID>\n" +
"<AccountCode>G0779837</AccountCode>\n" +
"<Reference RefCode=\"MWB\">\n" +
"<RefText>586133622</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"KEY\">\n" +
"<RefText>DUB16049</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"CAR\">\n" +
"<RefText>71Q0019681</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"COM\">\n" +
"<RefText>71Q0019681</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"SRC\">\n" +
"<RefText>ECUS</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"TRV\">\n" +
"<RefText>1</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"CAS\">\n" +
"<RefText>586133622</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"HWB\">\n" +
"<RefText>586133622</RefText>\n" +
"</Reference>\n" +
"<Reference RefCode=\"UCR\">\n" +
"<RefText>586133622</RefText>\n" +
"</Reference>\n" +
"<Country CodeType=\"NUM\" CountryType=\"Destination\">IE</Country>\n" +
"<Country CodeType=\"NUM\" CountryType=\"Dispatch\">CN</Country>\n" +
"\n" +
"</DeclarationHeader>\n" +
"</DeclarationList>\n" +
"</InputDocument>";
        
        String[] tempArray;
        String[] newTemp;
        String[] neoTemp;
        ArrayList<String> answer = new ArrayList<>();
 
        /* delimiter */
        String delimiter = "Reference";
        String split = "</RefText>";
        String divide = "Text>";
        
        //Values to find
        String findOne = "MWB";
        String findTwo = "TRV";
        String findThree = "CAR";
 
        /* given string will be split by the argument delimiter provided. */
        tempArray = stringToSplit.split(delimiter);
 
        /* print substrings */
        for (String tempArray1 : tempArray) {
            if(tempArray1.contains(findOne)||tempArray1.contains(findTwo)||tempArray1.contains(findThree)){
                
                newTemp = tempArray1.split(split);
                
                String use = newTemp[0];
                
                neoTemp = use.split(divide);
                String keep = neoTemp[1];
                System.out.println(keep);
                
            }
        }
        
        for (String read:answer){
            System.out.println(read);
        }
         
    }
    
}
