package excel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.google.common.collect.Table.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

public class ExcelUtils {

	private static HSSFWorkbook wb;
	private static HSSFSheet sheet;
	private static HSSFCell cell;
	public static int rowNumber;// Row Number
	public static int colNumber;// Column Number
	public static FileInputStream fis;
	public static FileOutputStream fos;

	// this method is used to get data from cells in Excel

	public static String getCellData(int rowNumber, int colNumber) throws Exception {
		try {
			fis = new FileInputStream("mockdata.xls");
			wb = new HSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
			cell = sheet.getRow(rowNumber).getCell(colNumber);

			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}

	}

	
}
