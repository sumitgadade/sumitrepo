import java.io.*;
class FileInputStreamDemo{
    
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException{
        int size;
        try(FileInputStream f=new FileInputStream("/home/sumit/Cuelogic/Traning/Java_Full_Stack/Advance Java/abc.txt")){
            p("Total available bytes: "+ (size=f.available()));
            int n= size/4;
            p("First "+ n + "bytes of the file one read() at a time");
            for(int i=0;i<n;i++){
                System.out.println((char)f.read());
            }                  
            p("Still available: "+(size=f.available()));
            p("Reading the next "+n+" with one read(b[])");
            byte b[]= new byte[n];
            if(f.read(b)!=n){
                p("Couldn't read "+n+" bytes.");
            }
            p(new String(b,0,n));
            p("Still available: "+(size=f.available()));
            p("skipping half of remaining bytes with skip() "+f.skip(size/2));
            p("Still available: "+f.available());
            p("reading "+n/2+" into the end of array");
            if(f.read(b,n/2,n/2)!=n/2){
                System.err.println("couldn't read "+n/2+" bytes");
            }
            p(new String(b,0,b.length));
            p("Still available: "+f.available());
        }catch(IOException e){
            p("I/O Error : "+e);
        }
    }
}