package excelRead;

import java.io.IOException;

public class ExcelReadCall {

	public static void main(String[] args) throws IOException {
		String s=ExcelRead.readStringData(1, 0);
		System.out.println(s);
		String a=ExcelRead.readStringData(1, 1);
		System.out.println(a);
//		String s1=ExcelRead.integerData(1, 1);
//		System.out.println(s1);

	}

}
