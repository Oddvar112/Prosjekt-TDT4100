package Prosjekt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;



public class TestForArtikellPredicate {


    @Test
public void Test1() throws IOException {

    ArtikkelPredicate AP = new ArtikkelPredicate();

    File ForsideNRK = new File("C:\\Users\\hanev\\OneDrive\\Desktop\\TDT4100-prosjekt-oddvarhf-main\\TDT4100-prosjekt-oddvarhf-main\\src\\test\\java\\Prosjekt\\Testsider\\ForsideNRK.html");

    Document doc2 = Jsoup.parse(ForsideNRK, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());


   
    assertFalse(AP.test(doc2));

}



@Test
public void Test2() throws IOException {

    ArtikkelPredicate AP = new ArtikkelPredicate();

    File ForsideNRK = new File("C:\\Users\\hanev\\OneDrive\\Desktop\\TDT4100-prosjekt-oddvarhf-main\\TDT4100-prosjekt-oddvarhf-main\\src\\test\\java\\Prosjekt\\Testsider\\NrkNettside.html");

    Document doc2 = Jsoup.parse(ForsideNRK, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());


   
    assertTrue(AP.test(doc2));

}


}
