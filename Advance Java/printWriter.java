import java.io.*;

class PrintWriterDemo{

    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pr =new PrintWriter(System.out);
        pr.write("Hey!! My name is Sumit.");
        pr.flush();
        pr.close();
        //Writing in to file

        PrintWriter pr1=new PrintWriter(new File("/home/sumit/Cuelogic/Traning/Java_Full_Stack/Advance Java/printWriterdemo.txt"));
        pr1.write("Hey!! My name is Sumit!!");
        pr1.flush();
        pr1.close();
    }
}