/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
 
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import model.lamis.LamisDrugCoding;
import org.apache.commons.lang3.StringUtils;
 
/**
 *
 * @author The Bright
 */
public class Test {
    

    public static void main(String[] args) throws ParseException
    {
         //System.out.println(Converter.UnscrambleCharacters("S@U^!~U"));
         System.out.println(StringUtils.leftPad("23", 5,"0"));
    }
}
 

