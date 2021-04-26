/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curclerestclient;

import java.io.StringReader;
import java.util.Scanner;
import javax.xml.bind.JAXB;
import model.Result;
import util.CurcleClient;

/**
 *
 * @author pp
 */
public class CurcleRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert input => ");
        String rad = sc.nextLine();
        CurcleClient client = new CurcleClient();
        String xml = client.getXml(rad);
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Area = " + res.getArea());
        System.out.println("Circumference = " + res.getCir());
    }
    
}
