package testNGdemo_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class ddtdemo2 {
		@Test(dataProvider="DP")
		public void login(HashMap<String,String> map)
		{
			System.out.println("user loggin traying + US :"
		+"name:- "+map.get("name")+"pwd:- "+map.get("pwd")+"age:- "+map.get("age") );
		}
		@DataProvider(name="DP")
		public Object[] getdata() throws IOException 
{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
					"\\src\\test\\java\\testNGdemo_1\\Book1.xlsx");
			
			String sheetname = "playerinfo";
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			int row = sheet.getLastRowNum();
			System.out.println(row);
			//System.exit(row);
			Object[] data = new Object[row]; // 4 rows
			String header1 = sheet.getRow(0).getCell(0).getStringCellValue();
			String header2 = sheet.getRow(0).getCell(1).getStringCellValue();
			String header3 = sheet.getRow(0).getCell(2).getStringCellValue();
			
			Map<String,String> m1;
			for (int i=0; i<row; i++)
			{
				m1=new HashMap<>();
				String value1 = sheet.getRow(i+1).getCell(0).getStringCellValue();
				String value2 = sheet.getRow(i+1).getCell(1).getStringCellValue();
				String value3 = sheet.getRow(i+1).getCell(2).getStringCellValue();
				
				m1.put(header1, value1);
				m1.put(header2, value2);
				m1.put(header3, value3);
				data[i]=m1;
			}				
			return data;		
}
}

