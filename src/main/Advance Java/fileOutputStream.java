import java.io.*;
class FileOutputStreamDemo{
    
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException{
        String source = "Now is the time for all good men\n"
        + " to come to the aid of their country\n"
        + " and pay their due taxes.";
        byte buff[]=source.getBytes();

        try(FileOutputStream f0= new FileOutputStream("file0.txt");
        FileOutputStream f1= new FileOutputStream("file1.txt");
        FileOutputStream f2= new FileOutputStream("file2.txt")){

            for(int i=0;i<buff.length;i+=2)
            f0.write(buff[i]);

            f1.write(buff);

            f2.write(buff, buff.length - buff.length/4,buff.length/4);
        }catch(IOException e){
            p("An IO Error occured : "+e);
        }
    }
}