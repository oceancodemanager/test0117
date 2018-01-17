
package test;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ClassTest {

	public static void main(String[] args) {

		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream("d://ShowAccountReportAction.class");
			DataInputStream stream = new DataInputStream(inputStream);
			int head = stream.readInt();

			System.out.println("head:" + head);
			System.out.println(String.format("%X", head)); // magic:
															// CAFEBABE
			System.out.println(String.format("%X", stream.readUnsignedShort())); // minor_version:
																					// 0
			System.out.println(stream.readUnsignedShort()); // major_version: 51
			System.out.println(stream.readUnsignedShort()); // constant_pool_count:

			stream.close();
			// TEST 1536
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 53

	}
}
