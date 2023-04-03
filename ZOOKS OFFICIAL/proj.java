import java.io.*;
public class proj
{
public static void main (String[] args) throws IOException
{
String ln;
double [] [] data = new double [150] [4];
final String filename = "C:\\Users\\KIIT\\Downloads\\bezdekIris (1).csv";
FileReader fr = new FileReader (filename);
try (BufferedReader br = new BufferedReader (fr)) {
    for (int i = 0; i < 150; ++i)
    {
     ln = br.readLine () ;
    String[] dl = ln.split (",");
    for (int j = 0; j < 4; ++j)
    {
    data[i] [j] = Double.parseDouble (dl[j]);
    }
    }
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
System.out.print ("att1 att2 att3 att4 ") ;
System.out.println();
for (int i= 0; i < data.length; ++i)
{
for (int j = 0; j < data[i].length; ++j)
{
System.out.print (data[i][j]+"  ") ;
}
System.out.println();
}
float[] result = new float[data.length];
float[] result1 = new float[data.length];
float sum = 0, average = 0;
for (int i= 0; i < data.length; ++i)
{
    float min = (float) data[0][i];
    float max = (float) data[0][i];
for (int j = 0; j < data[i].length; ++j)
{
    if (data[j][i] < min) {
        min = (int) data[j][i];
    }
    result[j] =min;
    if (data[j][i] > max) {
        max = (float) data[j][i];
    }
    result1[j] = max;
    sum = (float) (sum + data[i][j]);
    

System.out.println("min="+min);
System.out.println("max="+max);
average = sum / data[i].length;
        sum = 0;
        System.out.println("average="+average);
       
        }      
}
System.out.println("The Data Set after Normalization: ");
for (int i= 0; i < data.length; ++i)
{
for (int j = 0; j < data[i].length; ++j)
{
    
float v = (float) ((data[i][j] - result[j]/(result1[j] - result[j])));
System.out.println(v);
// System.out.print (data[i][j]+"  ") ;
}
}
System.out.println();
}

}


