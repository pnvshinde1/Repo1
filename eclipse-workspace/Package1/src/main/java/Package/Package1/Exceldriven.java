package Package.Package1;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

import com.google.common.collect.Table.Cell;

public class Exceldriven {

	    public static void main(String[] args) {
	        try {
	            // 1. Create a FileInputStream object to read the Excel file
	            FileInputStream fis = new FileInputStream("path/to/your/excel/file.xlsx");

	            // 2. Create a XSSFWorkbook object to access the workbook
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);

	            // 3. Get the first sheet
	            Sheet sheet = workbook.getSheetAt(0);

	            // 4. Iterate through rows
	            for (Row row : sheet) {                    // for each loop 
	                // 5. Iterate through cells in each row
	                for (Cell cell : row) {                     // inneer for each looop
	                    // 6. Get the cell value (assuming it's a String)
	                    String cellValue = cell.toString();
	                    System.out.println(cellValue);
	                }
	            }
	            // 7. Close the workbook and fis
	            fis.close();
	            workbook.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


