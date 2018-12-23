import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class convert {

    public static void main(String[] args) throws IOException {

        String theFile = "drugs.csv";
        BufferedReader br = new BufferedReader(new FileReader(theFile));

        String line;

        while ((line = br.readLine()) != null) {

            String changed_line = ChangeLine(line);
            WriteFile(changed_line, line);
        }
        br.close();
    }


    public static String ChangeLine(String line){

        String blah = null;

        if ( Character.toString(line.charAt(4)).equals("-") )
            {
                String ndc_code = new String();
				ndc_code = ndc_code.concat("0");
				ndc_code = ndc_code.concat(Character.toString(line.charAt(0)));
				ndc_code = ndc_code.concat(Character.toString(line.charAt(1)));
				ndc_code = ndc_code.concat(Character.toString(line.charAt(2)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(3)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(5)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(6)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(7)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(8)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(10)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(11)));

                blah = ndc_code;

            }

        else if ( Character.toString(line.charAt(5)).equals("-") 
			&& Character.toString(line.charAt(9)).equals("-"))
            {
                String ndc_code = new String(Character.toString(line.charAt(0)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(1)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(2)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(3)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(4)));
                ndc_code = ndc_code.concat("0");
                ndc_code = ndc_code.concat(Character.toString(line.charAt(6)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(7)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(8)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(10)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(11)));

                blah = ndc_code;

            }

        else if ( Character.toString(line.charAt(5)).equals("-") && Character.toString(line.charAt(10)).equals("-"))
            {
                String ndc_code = new String(Character.toString(line.charAt(0)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(1)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(2)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(3)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(4)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(6)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(7)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(8)));
                ndc_code = ndc_code.concat(Character.toString(line.charAt(9)));
                ndc_code = ndc_code.concat("0");
                ndc_code = ndc_code.concat(Character.toString(line.charAt(11)));

                blah = ndc_code;

          }

        return blah;
    }

    public static void WriteFile(String line, String ndc_code) throws IOException {

        Writer wr = new FileWriter("drugs_new.csv", true);
        wr.write(line + "\n");
        wr.close();

    }
}