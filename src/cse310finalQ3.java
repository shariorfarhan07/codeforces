import java.io.*;
import java.util.Scanner;

public class cse310finalQ3 {
    public static BufferedReader br;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter path:");
        String path = sc.nextLine();
        File file = new File(path);
        if (path.endsWith(".txt")) {
            if (file.exists()) {
                readAndwriteFile( file);

            } else {
                System.out.println("no file exist in this path");
            }
        } else {
            System.out.println("The path you entered isnt a txt file");
        }


    }
    public static String removeUnwantedchar(String st){
        String st2="";
        for (int i = 0; i < st.length(); i++) {
            if ((st.charAt(i)>='A'&&st.charAt(i)<='Z')||
                    (st.charAt(i)>='a'&&st.charAt(i)<='z')||
                    (st.charAt(i)>='0'&&st.charAt(i)<='9'))
            {

                st2+=st.charAt(i);
            }
        }

        return st2;
    }
    public static final void readAndwriteFile( File file){
        try {
            br = new BufferedReader(new FileReader(file));
            String st="";
            while (br.ready()){
                st+=br.readLine();
            }
            String st2=removeUnwantedchar(st);
            File newfile = new File("output.txt");
            FileWriter writer = new FileWriter("output.txt");
            writer.write(st2);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
