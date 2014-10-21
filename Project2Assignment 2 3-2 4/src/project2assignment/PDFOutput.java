/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;

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
        document.open();
        
        //title
        Font titleFont = new Font(Font.FontFamily. HELVETICA, 25, Font.BOLD);
        Font regularText = new Font(Font.FontFamily. HELVETICA, 16, Font.NORMAL);
        Font italicText = new Font(Font.FontFamily. HELVETICA, 14, Font.ITALIC);
        
        Paragraph receiptTitle = new Paragraph();
        receiptTitle.setFont(titleFont);
        receiptTitle.add("Patient Treatment Receipt");
        document.add(receiptTitle);
        
        Paragraph receiptNumber = new Paragraph();
        receiptNumber.add("Receipt Number:");
        receiptNumber.setFont(regularText);
        document.add(receiptNumber);
        
        Paragraph patientName = new Paragraph();
        patientName.add("Patient Name:");
        patientName.setFont(regularText);
        document.add(patientName);
        
        Paragraph medicareNumber = new Paragraph();
        medicareNumber.add("Medicare number:");
        medicareNumber.setFont(regularText);
        document.add(medicareNumber);
        
        Paragraph patientAddress = new Paragraph();
        patientAddress.add("Address:");
        patientAddress.setFont(regularText);
        document.add(patientAddress);
        
        Paragraph billableSum = new Paragraph();
        billableSum.add("Billable sum:");
        billableSum.setFont(regularText);
        document.add(billableSum);
        
        Paragraph discountAmount = new Paragraph();
        discountAmount.add("Discount amount:");
        discountAmount.setFont(regularText);
        document.add(discountAmount);
        
        Paragraph payableAmount = new Paragraph();
        payableAmount.add("Amount Due:");
        payableAmount.setFont(regularText);
        document.add(payableAmount);
        
        Paragraph paymentDisclaimer = new Paragraph();
        paymentDisclaimer.setFont(italicText);
        paymentDisclaimer.add("All accounts are to please be paid in full on the"
                + " same day as consultation. Thank you!");
        paymentDisclaimer.setFont(italicText);
        document.add(paymentDisclaimer);
        
        
        
        document.close();
        
        
        } catch (Exception e){
            e.printStackTrace();
        }
       
    }
}
