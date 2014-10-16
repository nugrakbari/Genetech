/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

/**
 *
 * @author gregjacobson
 */
public class PDFOutput {
    public static void main(String [] args) {
        Document document = new Document();
        try{ 
        PdfWriter.getInstance(document, new FileOutputStream("Receipt.pdf"));
        
        //title
        
        
        
        
        document.open();
        Paragraph patientDetails = new Paragraph();
        patientDetails.add("Patient Name");
        
        document.add(patientDetails);
        
        document.close();
        
        
        } catch (Exception e){
            e.printStackTrace();
        }
       
    }
}
