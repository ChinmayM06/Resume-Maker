import java.io.FileOutputStream;
import java.sql.Date;

import javax.swing.JOptionPane;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class createPDF {

	createPDF(String name, String email, String gender, Date bday, String address, 
			String nationality, String profession, String sclName, int sclGrade,
			String jrcName, int jrcGrade, String colgName, int colgCgpa, String job1,
			String comapany1,String job2, String comapany2, String job3, String comapany3,
			String skill1, String skill2, String skill3, String skill4, byte[] imageData) {
		
		
		String desktopPath = System.getProperty("user.home") + "/Desktop/";
		String filePath = desktopPath + FileName.fileName;
		Document document = new Document();
		
	}

	public static void main(String[] args) {
		
	}

}
