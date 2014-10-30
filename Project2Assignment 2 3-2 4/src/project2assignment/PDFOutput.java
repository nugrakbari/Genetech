
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

    private String patientName;
    private int visitID;
    private int receiptNumber;
    private String medicareNumber;
    private String streetAddress;
    private String suburb;
    private String postcode;
    private String state;
    private float billableSum;
    private float discountAmount;
    private float amountDue;

    private VisitQuery visitQuery;

    public PDFOutput(int visit) {
        setVisitID(visit);

        visitQuery = new VisitQuery();

        Invoice invoice = visitQuery.getInvoice(visit);

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Receipt.pdf"));
            document.open();

            //title
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 25, Font.BOLD);
            Font regularText = new Font(Font.FontFamily.HELVETICA, 16, Font.NORMAL);
            Font italicText = new Font(Font.FontFamily.HELVETICA, 14, Font.ITALIC);

            Paragraph receiptTitle = new Paragraph();
            receiptTitle.setFont(titleFont);
            receiptTitle.add("Patient Treatment Receipt");
            document.add(receiptTitle);

            Paragraph receiptNumberObject = new Paragraph();
            receiptNumberObject.add("Receipt Number: " + invoice.getReceiptNumber());
            receiptNumberObject.setFont(regularText);
            document.add(receiptNumberObject);

            Paragraph patientNameObject = new Paragraph();
            patientNameObject.add("Patient Name:" + invoice.getPatientName());
            patientNameObject.setFont(regularText);
            document.add(patientNameObject);

            Paragraph medicareNumberObject = new Paragraph();
            medicareNumberObject.add("Medicare number: " + invoice.getMedicareNumber());
            medicareNumberObject.setFont(regularText);
            document.add(medicareNumberObject);

            Paragraph patientAddress = new Paragraph();
            patientAddress.add("Address:" + invoice.getStreetAddress() + ", "
                    + invoice.getSuburb() + " " + invoice.getState() + " " + invoice.getPostcode());
            patientAddress.setFont(regularText);
            document.add(patientAddress);

            Paragraph billableSumObject = new Paragraph();
            billableSumObject.add("Billable sum: $" + billableSum);
            billableSumObject.setFont(regularText);
            document.add(billableSumObject);

            Paragraph discountAmountObject = new Paragraph();
            discountAmountObject.add("Discount amount: $" + discountAmount);
            discountAmountObject.setFont(regularText);
            document.add(discountAmountObject);

            Paragraph payableAmountObject = new Paragraph();
            payableAmountObject.add("Amount Due: $" + amountDue);
            payableAmountObject.setFont(regularText);
            document.add(payableAmountObject);

            Paragraph paymentDisclaimer = new Paragraph();
            paymentDisclaimer.setFont(italicText);
            paymentDisclaimer.add("All accounts are to please be paid in full on the"
                    + " same day as consultation. Thank you!");
            paymentDisclaimer.setFont(italicText);
            document.add(paymentDisclaimer);

            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @param patientFirstName the patientFirstName to set
     */
    public void setPatientFirstName(String patientFirstName) {
        this.patientName = patientFirstName;
    }

    /**
     * @param receiptNumber the receiptNumber to set
     */
    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    /**
     * @param medicareNumber the medicareNumber to set
     */
    public void setMedicareNumber(String medicareNumber) {
        this.medicareNumber = medicareNumber;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * @param suburb the suburb to set
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     * @param postcode the postcode to set
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @param billableSum the billableSum to set
     */
    public void setBillableSum(float billableSum) {
        this.billableSum = billableSum;
    }

    /**
     * @param discountAmount the discountAmount to set
     */
    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * @param amountDue the amountDue to set
     */
    public void setAmountDue(float amountDue) {
        this.amountDue = amountDue;
    }

    public void setVisitID(int visitID) {
        this.visitID = visitID;
        System.out.println("(Billing) visitID is " + visitID);
    }
}
