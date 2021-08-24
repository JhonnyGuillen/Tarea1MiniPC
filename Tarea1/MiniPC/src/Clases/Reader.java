package Clases;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    
    private ArrayList<String> fileLines = new ArrayList<String>();

    public String loadFile(String asmr){
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;

        try{
            file = new File(asmr);
            fr = new FileReader(file);
            br = new BufferedReader(fr);


            String comand = "", line;
            while((line = br.readLine()) != null){
                //System.out.println(line);
                comand = comand + line + "\n";
                fileLines.add(line);
            }
            return comand;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if ((fr != null)){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return null;
    }

    public ArrayList<String> getFileLines() {
        return fileLines;
    }
    
    
}
