package com.tideUS.utilities;



	
	
	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.Scanner;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public class ReadExcel {
		
	public static void main(String[] args) throws IOException {
			
			Scanner sc =new Scanner(System.in);
			int row = sc.nextInt();
			int column= sc.nextInt();
			
			System.out.print("The data at (" + row +"," + column+") is "+excelData(row,column));
			
		}
		
		
		public static String excelData(int row , int column ) throws IOException {
			
			String result="" ;
			int rowindex=0;
			int columnindex;
			
			FileInputStream input = new FileInputStream("C:\\Users\\mindc1may256\\Documents\\TideUSExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			
			//System.out.println(workbook.getNumberOfSheets());
			//System.out.println(workbook.getSheetName(0));
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rows= sheet.iterator();
			
					
					
					Row currentrow;
					
					while(rows.hasNext()) {
						columnindex=0;
					currentrow = rows.next();
					Iterator<Cell> cells = currentrow.iterator();
				
					while(cells.hasNext()) {
						
					 //System.out.println(rowindex +"  ->"+columnindex);
					 
					 Cell current= cells.next();
					 if((rowindex==row) && (columnindex==column-1 )) {
						//System.out.print(current.getStringCellValue()+"  ");
						return current.getStringCellValue();}
						
						columnindex++;
						
					}
						
						//System.out.println();
					 
					 rowindex++;
						

					}
					
						System.out.println("Data doesn't exist");
					
				//	return result ;
				
			
			return result;
			
		}


	

}
