import java.io.*;
  public class ass1wt
   {
        public static double newvi(double vi, double min, double max, double new_min, double new_max)
         { 
             return ((vi - min) / (max - min)) * (new_max - new_min) + new_min;
             }
             public static void main(String[] args) throws IOException 
             { 
                 String ln;
                 
                 double[][] data = new double[150][4];
                  final String filename = "iris.csv"; 
                  FileReader fr = new FileReader(filename); 
                  BufferedReader br = new BufferedReader(fr); 
                  for (int i = 0; i < 150; ++i)
                   { 
                       ln = br.readLine();
                        String[] dl = ln.split(","); 
                        for (int j = 0; j < 4; ++j) 
                        { 
                            data[i][j] = Double.parseDouble(dl[j]);
                         } 
                        }
                        double[][] store_max_min = new double[4][2];
                         //0 -> min, 1 -> max 
                         double min = data[0][0]; 
                         double max = data[0][0]; 
                         double avg = 0; 
                         for (int i = 0; i < 150; i++) 
                         {
                              if (data[i][0] < min) 
                              min = data[i][0];
                               if (data[i][0] > max)
                                max = data[i][0];
                                 avg = avg + data[i][0]; 
                                }
                                avg = avg / 150.0;
                                 System.out.println("Minimum for 1st feature is:- " + min);
                                  System.out.println("Maximum for 1st feature is:- " + max);
                                   System.out.println("Average of 1st feature is:- " + avg); 
                                   store_max_min[0][0] = min; 
                                   store_max_min[0][1] = max;
                                    min = data[0][1]; 
                                    max = data[0][1]; 
                                    double vi = 0; 
                                    avg = 0; 
                                    for (int i = 0; i < 150; i++)
                                     { 
                                         if (data[i][1] < min) 
                                         min = data[i][1]; 
                                         if (data[i][1] > max) 
                                         max = data[i][1];
                                          avg = avg + data[i][1]; 
                                        }
                                        avg/=150.0; 
                                        System.out.println(); 
                                        System.out.println("Minimum for 2nd feature is:- " + min); 
                                        System.out.println("Maximum for 2nd feature is:- " + max);
                                         System.out.println("Average of 2nd feature is:- " + avg); 
                                         store_max_min[1][0] = min; 
                                         store_max_min[1][1] = max;
                                          min = data[0][2]; max = data[0][2];
                                           avg = 0;
                                            for (int i = 0; i < 150; i++) 
                                            {
                                                 if (data[i][2] < min) min = data[i][2];

    if (data[i][2] > max)
     max = data[i][2];
      avg = avg + data[i][2];
     }
     avg /= 150.0;
      System.out.println(); 
      System.out.println("Minimum for 3rd feature is:- " + min); 
      System.out.println("Maximum for 3rd feature is:- " + max); 
      System.out.println("Average of 3rd feature is:- " + avg); 
      store_max_min[2][0] = min;
       store_max_min[2][1] = max; 
       min = data[0][3]; 
       max = data[0][3]; 
       avg = 0; 
       for (int i = 0; i < 150; i++) 
       { 
           if (data[i][3] < min)
            min = data[i][3]; 
            if (data[i][3] > max) 
            max = data[i][3];
             avg = avg + data[i][3];
             }
             avg /= 150.0; 
             System.out.println(); 
             System.out.println("Minimum for 4th feature is:- " + min); 
             System.out.println("Maximum for 4th feature is:- " + max); 
             System.out.println("Average of 4th feature is:- " + avg); 
             store_max_min[3][0] = min;
              store_max_min[3][1] = max; 
              vi = 0;
               double[][] new_data = new double[150][4]; 
               for (int i = 0; i < 150; ++i) 
               {
                    for (int j = 0; j < 4; ++j)
                     { 
                         new_data[i][j] = newvi(data[i][j], store_max_min[j][0], store_max_min[j][1], 0, 1); 
                        } 
                    }
                    System.out.println("\nNew VIs");
                     for (int i = 0; i < 150; ++i) 
                     {
                          for (int j = 0; j < 4; ++j)
                           { 
                               System.out.printf("%.3f ", +new_data[i][j]); 
                            }
                            System.out.println(""); 
                        } 
                    }
                 }
