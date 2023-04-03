import java.io.*;
import java.util.*;

public class DataOperation
{
	public static void main(String[] args) throws IOException
	{
		String ln;
		double[][] data = new double[150][4];
		final String filename = "E:\\KIIT Web Technology (IT 2004)\\codes\\iris.csv";
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		for(int i = 0; i < 150; ++i)
		{
			ln = br.readLine();
			String[] dl = ln.split(",");
			for(int j = 0; j < 4; ++j)
			{
				data[i][j] = Double.parseDouble(dl[j]);
			}
		}
		for(int i = 0; i < data.length; ++i)
		{
			for(int j = 0; j < data[i].length; ++j)
			{
				System.out.print(data[i][j]+"   ");
			}
			System.out.println();
		}
	}
}


			