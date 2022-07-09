package org.sa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario4 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DurgaSarath\\Excel sheet\\Sarath.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("task");
		Row createRow = sheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Select Skills");
		
		
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue("Adobe Indesign");
		
		Row row2 = sheet.createRow(2);
		Cell cell2 = row2.createCell(0);
		cell2.setCellValue("Adobe Photoshop");
		
		Row row3 = sheet.createRow(3);
		Cell cell3 = row3.createCell(0);
		cell3.setCellValue("Analytics");
		
		Row row4 = sheet.createRow(4);
		Cell cell4 = row4.createCell(0);
		cell4.setCellValue("Android");
		
		Row row5 = sheet.createRow(5);
		Cell cell5 = row5.createCell(0);
		cell5.setCellValue("APIs");
		
		Row row6 = sheet.createRow(6);
		Cell cell6 = row6.createCell(0);
		cell6.setCellValue("Art Design");
		
		Row row7 = sheet.createRow(7);
		Cell cell7 = row7.createCell(0);
		cell7.setCellValue("Auto CAD");
		
		Row row8 = sheet.createRow(8);
		Cell cell8 = row8.createCell(0);
		cell8.setCellValue("Backup Management");
		
		Row row9 = sheet.createRow(9);
		Cell cell9 = row9.createCell(0);
		cell9.setCellValue("C");
		
		Row row10 = sheet.createRow(10);
		Cell cell10 = row10.createCell(0);
		cell10.setCellValue("C++");
		
		Row row11 = sheet.createRow(11);
		Cell cell11 = row11.createCell(0);
		cell11.setCellValue("Certifications");
		
		Row row12 = sheet.createRow(12);
		Cell cell12 = row12.createCell(0);
		cell12.setCellValue("Client Server");
		
		Row row13 = sheet.createRow(13);
		Cell cell13 = row13.createCell(0);
		cell13.setCellValue("Client Support");
		
		Row row14 = sheet.createRow(14);
		Cell cell14 = row14.createCell(0);
		cell14.setCellValue("Configurations");
		
		 Row row15 = sheet.createRow(15);
		 Cell cell15 = row15.createCell(0);
		 cell15.setCellValue("Content Management");
		
		Row row16 = sheet.createRow(16);
		Cell cell16 = row16.createCell(0);
		cell16.setCellValue("Content Management Systems (CMS)");
		
		Row row17 = sheet.createRow(17);
		Cell cell17 = row17.createCell(0);
		cell17.setCellValue("Corel Draw");
		
		Row row18 = sheet.createRow(18);
		Cell cell18 = row18.createCell(0);
		cell18.setCellValue("Corel Word Perfect");
		
		Row row19 = sheet.createRow(19);
		Cell cell19 = row19.createCell(0);
		cell19.setCellValue("CSS");
		
		Row row20 = sheet.createRow(20);
		Cell cell20 = row20.createCell(0);
		cell20.setCellValue("Date Analytics");
		
		Row row21 = sheet.createRow(21);
		Cell cell21 = row21.createCell(0);
		cell21.setCellValue("Desktop Publishing");
		
		Row row22 = sheet.createRow(22);
		Cell cell22 = row22.createCell(0);
		cell22.setCellValue("Design");
		
		Row row23 = sheet.createRow(23);
		Cell cell23 = row23.createCell(0);
		cell23.setCellValue("Diagnostics");
		
		Row row24 = sheet.createRow(24);
		Cell cell24 = row24.createCell(0);
		cell24.setCellValue("Documentation");
		
		Row row25 = sheet.createRow(25);
		Cell cell25 = row25.createCell(0);
		cell25.setCellValue("End User Support");
		
		Row row26 = sheet.createRow(26);
		Cell cell26 = row26.createCell(0);
		cell26.setCellValue("Email");
		
		Row row27 = sheet.createRow(27);
		Cell cell27 = row27.createCell(0);
		cell27.setCellValue("Engineering");
		
		Row row28 = sheet.createRow(28);
		Cell cell28 = row28.createCell(0);
		cell28.setCellValue("Excel");
		
		Row row29 = sheet.createRow(29);
		Cell cell29 = row29.createCell(0);
		cell29.setCellValue("FilmMaker Pro");
		
		Row row30 = sheet.createRow(30);
		Cell cell30 = row30.createCell(0);
		cell30.setCellValue("Fortan");
		
		Row row31 = sheet.createRow(31);
		Cell cell31 = row31.createCell(0);
		cell31.setCellValue("HTML");
		
		Row row32 = sheet.createRow(32);
		Cell cell32 = row32.createCell(0);
		cell32.setCellValue("Implementation");
		
		Row row33 = sheet.createRow(33);
		Cell cell33 = row33.createCell(0);
		cell33.setCellValue("Installation");
		
		Row row34 = sheet.createRow(34);
		Cell cell34 = row34.createCell(0);
		cell34.setCellValue("Internet");
		
		Row row35 = sheet.createRow(35);
		Cell cell35 = row35.createCell(0);
		cell35.setCellValue("iOS");
		
		Row row36 = sheet.createRow(36);
		Cell cell36 = row36.createCell(0);
		cell36.setCellValue("iPhone");
		
		Row row37 = sheet.createRow(37);
		Cell cell37 = row37.createCell(0);
		cell37.setCellValue("Linux");
		
		Row row38 = sheet.createRow(38);
		Cell cell38 = row38.createCell(0);
		cell38.setCellValue("JAVA");
		
		Row row39 = sheet.createRow(39);
		Cell cell39 = row39.createCell(0);
		cell39.setCellValue("JavaScript");
		
		Row row40 = sheet.createRow(40);
		Cell cell40 = row40.createCell(0);
		cell40.setCellValue("Mac");
		
		Row row41 = sheet.createRow(41);
		Cell cell41 = row41.createCell(0);
		cell41.setCellValue("Matlab");
		
		Row row42 = sheet.createRow(42);
		Cell cell42 = row42.createCell(0);
		cell42.setCellValue("Maya");
		
		Row row43 = sheet.createRow(43);
		Cell cell43 = row43.createCell(0);
		cell43.setCellValue("Microsoft Excel");
		
		Row row44 = sheet.createRow(44);
		Cell cell44 = row44.createCell(0);
		cell44.setCellValue("Microsoft Office");
		
		Row row45 = sheet.createRow(45);
		Cell cell45 = row45.createCell(0);
		cell45.setCellValue("Microsoft Outlook");
		
		Row row46 = sheet.createRow(46);
		Cell cell46 = row46.createCell(0);
		cell46.setCellValue("Microsoft Publisher");
		
		Row row47 = sheet.createRow(47);
		Cell cell47 = row47.createCell(0);
		cell47.setCellValue("Microsoft word");
		
		Row row48 = sheet.createRow(48);
		Cell cell48 = row48.createCell(0);
		cell48.setCellValue("Microsoft Visual");
		
		Row row49 = sheet.createRow(49);
		Cell cell49 = row49.createCell(0);
		cell49.setCellValue("Mobile");
		
		Row row50 = sheet.createRow(50);
		Cell cell50 = row50.createCell(0);
		cell50.setCellValue("MySQL");
		
		Row row51 = sheet.createRow(51);
		Cell cell51 = row51.createCell(0);
		cell51.setCellValue("Networks");
		
		Row row52 = sheet.createRow(52);
		Cell cell52 = row52.createCell(0);
		cell52.setCellValue("Open Source Software");
		
		Row row53 = sheet.createRow(53);
		Cell cell53 = row53.createCell(0);
		cell53.setCellValue("Oracle");
		
		Row row54 = sheet.createRow(54);
		Cell cell54 = row54.createCell(0);
		cell54.setCellValue("Perl");
		
		Row row55 = sheet.createRow(55);
		Cell cell55 = row55.createCell(0);
		cell55.setCellValue("PHP");
		
		Row row56 = sheet.createRow(56);
		Cell cell56 = row56.createCell(0);
		cell56.setCellValue("Presentations");
		
		Row row57 = sheet.createRow(57);
		Cell cell57 = row57.createCell(0);
		cell57.setCellValue("Processing");
		
		Row row58 = sheet.createRow(58);
		Cell cell58 = row58.createCell(0);
		cell58.setCellValue("Programming");
		
		Row row59 = sheet.createRow(59);
		Cell cell59 = row59.createCell(0);
		cell59.setCellValue("PT Modeler");
		
		Row row60 = sheet.createRow(60);
		Cell cell60 = row60.createCell(0);
		cell60.setCellValue("Python");
		
		Row row61 = sheet.createRow(61);
		Cell cell61 = row61.createCell(0);
		cell61.setCellValue("QuickBooks");
		
		Row row62 = sheet.createRow(62);
		Cell cell62 = row62.createCell(0);
		cell62.setCellValue("Ruby");
		
		Row row63 = sheet.createRow(63);
		Cell cell63 = row63.createCell(0);
		cell63.setCellValue("Shade");
		
		Row row64 = sheet.createRow(64);
		Cell cell64 = row64.createCell(0);
		cell64.setCellValue("Software");
		
		Row row65 = sheet.createRow(65);
		Cell cell65 = row65.createCell(0);
		cell65.setCellValue("SpreadSheet");
		
		Row row66 = sheet.createRow(66);
		Cell cell66 = row66.createCell(0);
		cell66.setCellValue("SQL");
		
		Row row67 = sheet.createRow(67);
		Cell cell67 = row67.createCell(0);
		cell67.setCellValue("Support");
		
		Row row68 = sheet.createRow(68);
		Cell cell68 = row68.createCell(0);
		cell68.setCellValue("System Administration");
		
		Row row69 = sheet.createRow(69);
		Cell cell69 = row69.createCell(0);
		cell69.setCellValue("Tech Support");
		
		Row row70 = sheet.createRow(70);
		Cell cell70 = row70.createCell(0);
		cell70.setCellValue("TroubleShooting");
		
		Row row71 = sheet.createRow(71);
		Cell cell71 = row71.createCell(0);
		cell71.setCellValue("Unix");
		
		Row row72 = sheet.createRow(72);
		Cell cell72 = row72.createCell(0);
		cell72.setCellValue("UI/UX");
		
		Row row73 = sheet.createRow(73);
		Cell cell73 = row73.createCell(0);
		cell73.setCellValue("Web Page Design");
		
		Row row74 = sheet.createRow(74);
		Cell cell74 = row74.createCell(0);
		cell74.setCellValue("Windows");
		
		Row row75 = sheet.createRow(75);
		Cell cell75 = row75.createCell(0);
		cell75.setCellValue("Word Proceessing");
		
		Row row76 = sheet.createRow(76);
		Cell cell76 = row76.createCell(0);
		cell76.setCellValue("XML");	
		
		Row row77 = sheet.createRow(77);
		Cell cell77 = row77.createCell(0);
		cell77.setCellValue("XHTML");
		
		FileOutputStream o = new FileOutputStream(file);
		
		workbook.write(o);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
