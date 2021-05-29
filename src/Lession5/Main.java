package Lession5;

import java.io.*;
import java.util.ArrayList;


public class Main


{
    public static void writeFile(Appdata appdata, File file) {
        try (PrintWriter out = new PrintWriter(file)) {
            int k = 0;
            String[] header = appdata.getHeader();
            for (String v : header) {
                out.print(v);
                if (k < header.length - 1) out.print(";");
                k++;
            }
            out.println();

            int[][] data = appdata.getData();
            for (int[] datum : data) {
                for (int j = 0; j < datum.length; j++) {
                    out.print(datum[j]);
                    if (j < header.length - 1) out.print(";");
                }

                out.println();
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Appdata readFile(File file) {
        Appdata appdata = new Appdata();
        ArrayList<int[]> dataList = new ArrayList<int[]>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String[] header = in.readLine().split(";");
            appdata.setHeader(header);

            String readLine = null;
            while ((readLine = in.readLine()) != null) {
                String[] strLine = readLine.split(";");

                int[] intLine = new int[strLine.length];
                for (int i = 0; i < strLine.length; i++) {
                    intLine[i] = Integer.parseInt(strLine[i]);
                }
                dataList.add(intLine);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] data = new int[dataList.size()][];
        for (int i = 0; i < dataList.size(); i++) {
            data[i] = dataList.get(i);
        }
        appdata.setData(data);
        return appdata;
    }

    public static void main(String args[]) {
        File file = new File("./file.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] header = {"Value1", "Value2", "Value3"};
        int n = 5;
        int[][] data = new int[n][3];
        for (int i = 0; i < n; i++) {
            data[i][0] = 100 + i;
            data[i][1] = 200 + i;
            data[i][2] = 300 + i;
        }

        Appdata appdata = new Appdata(header, data);
        writeFile(appdata, file);
        Appdata readAppData = readFile(file);
        writeFile(readAppData, new File("result.txt"));

    }
}
