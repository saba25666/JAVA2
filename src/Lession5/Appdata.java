package Lession5;

import java.io.Serializable;

public class Appdata implements Serializable {
        private String[] header;

        private int[][] data;

        public Appdata() {}

        public Appdata(String[] header, int[][] data)
        {

                this.header = header;

                this.data = data;
        }

        public String[] getHeader() { return header; }

        public int[][] getData() { return data; }

        public void setHeader(String[] header) { this.header = header; }

        public void setData(int[][] data) { this.data = data; }
}
