package org.sa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PersonalInfo {

	public static void main(String[] args) throws IOException {
		// Path of excel
		File file = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\DurgaSarath\\Excel sheet\\New Microsoft Excel Worksheet.xlsx");

		// get the object
		FileInputStream stream = new FileInputStream(file);

		// Create workbook
		Workbook workbook = new XSSFWorkbook(stream);

		// Get the sheet
		Sheet sheet = workbook.getSheet("Sheet1");

		// iterate all rows
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);

			// iterate each row
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {

				Cell cell = row2.getCell(j);
				//System.out.println(cell);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String s = cell.getStringCellValue();
					System.out.println(s);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date cellValue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("DD-MMM-YY");
						String format = dateformat.format(cellValue);
						System.out.println(format);

					} else {
						double numericCellValue = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
						String string = valueOf.toString();
						System.out.println(string);

						break;
						

				}
				

			}

		}

	}

}
}