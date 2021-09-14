import java.io.*;

class FileReaderDemo{
    public static void main(String[] args) throws FileNotFoundException{
        try(FileReader fr= new FileReader("/home/sumit/Cuelogic/Traning/Java_Full_Stack/Advance Java/abc.txt")){
            int c;
            while((c=fr.read())!= -1)
                System.out.print((char)c);
        }catch(IOException e){
            System.out.println("I/O Error : "+e);
        }
    }
}