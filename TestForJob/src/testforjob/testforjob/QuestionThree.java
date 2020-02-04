/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforjob;

//Based on code from http://www.edankert.com/validate.html

import com.sun.xml.internal.txw2.Document;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;


/**
 *
 * @author jaxus
 */
public class QuestionThree {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setNamespaceAware(true);
            factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");

            int correctStructure = 1;
            int validCommand = 1;
            int validSite = 1;
            String text;

            String[] readCommand;
            String[] readSite;
            
            String commandTag = "<";
            String siteTag = "SiteID>";
            
            String filePath = "contacts.xml";
            File xmlFile = new File(filePath);
            
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.setErrorHandler(new SimpleErrorHandler());

//            builder.parse(xmlFile);
            Document document;
            document = builder.parse(new InputStreamReader(new FileInputStream(xmlFile), Charset.forName("UTF-8")));
            
            
            //answering part a
            correctStructure = 0;
            
            //answering part b
            text = xmlFile.toString();
            
            readCommand = text.split(commandTag);
            
            for(String commandCheck: readCommand){
                if(commandCheck.contains("Declaration Command")){
                    if(commandCheck.contains("DEFAULT")){
                        validCommand = -1;
                        break;
                    }
                }
            }
            
            //answering part c
            readSite = text.split(siteTag);
            
            for(String siteCheck: readSite){
                if(siteCheck.contains("DUB</")){
                    validSite=-2;
                    break;
                }
            }
            
            
            if(correctStructure==0 && validCommand==-1 && validSite==-2){
                System.out.println("Document is correctly stuctured, but an invalid command and an invalid site is included");
            }
        } catch (ParserConfigurationException e) {
            System.out.println("File improperly configured");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
