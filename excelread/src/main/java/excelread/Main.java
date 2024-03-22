package excelread;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		System.out.println(ExcelDatas.readIntegerData(1, 0));
		System.out.println(ExcelDatas.readStringData(0, 0));
	}

}
