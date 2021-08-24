package Clases;

import java.math.*;
import java.util.ArrayList;

public class Convertor {
    public ArrayList<String> fragmenter(String comand){
        ArrayList<String> fragmentedFixed = new ArrayList<String>();
        comand = comand.replace("AX,","AX");
        comand = comand.replace("BX,","BX");
        comand = comand.replace("CX,","CX");
        comand = comand.replace("DX,","DX");
        //System.out.println(comand);
        
        String [] fragmented = comand.split("\n");
        
        for (int i = 0; i < fragmented.length; i++) {
            fragmentedFixed.add(fragmented[i]);
        }
        
        return fragmentedFixed;
    }

    public String formater(String line) {
        String result = "";
        String[] comands = line.split(" ");
        int i = 2;
        //System.out.println("0 antiguo: " + comands[0] + "\n");
        switch (comands[0]) {
            case "LOAD": comands[0] = comands[0].replace("LOAD", "0001 "); break;
            case "STORE": comands[0] = comands[0].replace("STORE", "0010 "); break;
            case "MOV": comands[0] = comands[0].replace("MOV", "0011 "); break;
            case "SUB": comands[0] = comands[0].replace("SUB", "0100 "); break;
            case "ADD": comands[0] = comands[0].replace("ADD", "0101 "); break;
        }
        //System.out.println("0 nuevo: " + comands[0] + "\n");

        //System.out.println("1 antiguo: " + comands[1] + "\n");
        switch (comands[1]){
            case "AX": comands[1]= comands[1].replace("AX", "0001 "); break;
            case "BX": comands[1]= comands[1].replace("BX", "0010 "); break;
            case "CX": comands[1]= comands[1].replace("CX", "0011 "); break;
            case "DX": comands[1]= comands[1].replace("DX", "0100 "); break;
        }
        //System.out.println("1 nuevo: " + comands[1] + "\n");
        //System.out.println(comands.length);
        if(comands.length  == 2){
            result = "00000000";
        }
        else{
            //System.out.println("i: " + comands[i]);
            int a = Integer.parseInt(comands[i]);
            if(a < 0){
                result = "1";
            }
            else{
                result = "0";
            }
            a = Math.abs(a);
            String bin = Integer.toBinaryString(a);
            
            while(bin.length() < 7){
                bin = "0" + bin;
            }
            result = result + bin;
        }

        return comands[0] + comands[1] + result;
    }
}
