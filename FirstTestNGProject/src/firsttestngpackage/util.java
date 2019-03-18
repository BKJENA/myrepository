package firsttestngpackage;
import java.io.File;
//Needed to make Selenium work with Excel
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class util {
	
 // You can change the information of your data file here
 public static final String filepath = "I:\\selenium project\\testData.xls"; // File Path
 public static final String sheetname = "Data"; // Sheet name
 public static final String tablename = "teestData"; // Name of data table
 public static final String username= "mngr179737";
 public static final String password = "bUseqEh";
 public static final String baseurl = "http://www.demo.guru99.com/";

 // Expected output
 public static final String expecttitle = "Guru99 Bank Manager HomePage";
 public static final String expectalertboxtitle = "User or Password is not valid";

 /* You can change the Path of FireFox base on your environment here */
 public static final String firefoxpath = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";


 
 public static String[][] getDataFromExcel(String filepath,
			String sheetname, String tablename) throws Exception {
		// Declare a 2 dimensions array to store all the test data read from
		// excel
		String[][] Array = null;

		// get the workbook file. Provide the path of excel file
		Workbook workbook = Workbook.getWorkbook(new File(filepath));
		// get the sheet
		Sheet sheet = workbook.getSheet(sheetname);

		int startRow, startCol, endRow, endCol, ci, cj;

		// find cell position which contain first appear table name
		Cell tableStart = sheet.findCell(tablename);
		// Row position of FIRST appear table name
		startRow = tableStart.getRow();
		// Col position of FIRST appear table name
		startCol = tableStart.getColumn();

		// find cell position which contain last appear table name
		Cell tableEnd = sheet.findCell(tablename, startCol + 1, startRow + 1,
				100, 64000, false);
		// Row position of LAST appear table name
		endRow = tableEnd.getRow();
		// Col position of LAST appear table name
		endCol = tableEnd.getColumn();

		Array = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		// Store all data in an array
		for (int i = startRow + 1; i < endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				//Get content of each cell and store to each array element.
				Array[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}

		return (Array);
	}


}
