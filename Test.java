import java.io.*;
import java.util.*;

public class Test {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "temp.txt",s="hi";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

			Scanner r=new Scanner(System.in);
            // Note that write() does not automatically
            // append a newline character.
			do
			{
				s=r.nextLine();
				if(s.equals("nl"))
				{
					bufferedWriter.newLine();
				}
				else
					bufferedWriter.write(s);
            //bufferedWriter.write(" here is some text.");
            //bufferedWriter.newLine();
            //bufferedWriter.write("We are writing");
            //bufferedWriter.write(" the text to the file.");
			}while(!s.equals("exit"));
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
