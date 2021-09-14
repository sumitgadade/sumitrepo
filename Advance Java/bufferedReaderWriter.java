import java.io.*;

class BufferedReaderWriterDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Name : ");
        String name=br.readLine();

        BufferedWriter bw=new BufferedWriter(new FileWriter("/home/sumit/Cuelogic/Traning/Java_Full_Stack/Advance Java/BufferedWriterDemo.txt"));
        bw.write(name);
        bw.close();
    }
}