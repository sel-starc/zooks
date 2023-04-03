import java.io.*;
import java.util.*;
public class DataOperation1 {
    public static void main (String[] args) throws Exception
    {
    String In;
    
    final String filename = "C:\\Users\\KIIT\\Downloads\\bezdekIris (1).csv";
    // List<Integer>[] [] data1=new ArrayList[] []<Integer>();  
    // ArrayList<Double>[][] data = new ArrayList[][]<Double>();
    List<Double>[][] data = new ArrayList[][]<Double>();
    // List<List<Double>> data = new ArrayList<>();
    File file = new File (filename);
    Scanner sc = new Scanner (file);
    while (sc.hasNextLine ())
    {
    In = sc.readLine ();
    String[] dl = In.split(",");
    data.add (Double.parseDouble (dl [0]),Double.parseDouble (dl[1]),Double.parseDouble (dl[2]),Double.parseDouble (dl[3]));
    }
    System.out.print ("att1 att2 att3 att4 ") ;
System.out.println();
    for (int i = 0; i < data.length(); ++i)
    {
        for (int j = 0; j < data[i].length; ++j)
{
    System.out.print (data.get (i)+" ") ;
}
System.out.println();
}
  

}
}