package Clases;

import java.awt.*;
import java.util.ArrayList;

public class Memory {

    private ArrayList<String> codAsm;
    private ArrayList<String> codBin;
    private int AC;
    private int AX;
    private int BX;
    private int CX;
    private int DX;

    public Memory(ArrayList<String> linesAsm, ArrayList<String> linesBin) {
        this.codAsm = linesAsm;
        this.codBin = linesBin;
        this.AC = 0;
        this.AX = 0;
        this.BX = 0;
        this.CX = 0;
        this.DX = 0;
    }

    public ArrayList<String> getCodAsm() {
        return codAsm;
    }

    public ArrayList<String> getCodBin() {
        return codBin;
    }

    public int getAC() {
        return AC;
    }

    public int getAX() {
        return AX;
    }

    public int getBX() {
        return BX;
    }

    public int getCX() {
        return CX;
    }

    public int getDX() {
        return DX;
    }
    
    public void clean(){
        AC = 0;
        AX = 0;
        BX = 0;
        CX = 0;
        DX = 0;
    }

    public void executeLine(int i) {
        String comand = codAsm.get(i);
        comand = comand.replace("AX,", "AX");
        comand = comand.replace("BX,", "BX");
        comand = comand.replace("CX,", "CX");
        comand = comand.replace("DX,", "DX");
        String[] comands = comand.split(" ");
        
        String instruction = comands[0];
        String dir = comands[1];
        int movValue = 0;
        
        if (comands.length>2) {
            movValue = Integer.parseInt(comands[2]);  
        }
        
        System.out.println("Line: " + instruction + " " + dir + " " + movValue);
        
        
        switch (instruction) {
            case "MOV":
                mov(movValue, dir);
                break;
            case "LOAD":
                load(dir);
                break;
            case "ADD":
                add(dir);
                break;
            case "SUB":
                sub(dir);
                break;
            case "STORE":
                store(dir);
                break;
        }
    }

    public void mov(int n, String x) {
        switch (x) {
            case "AX":
                AX = n;
                break;
            case "BX":
                BX = n;
                break;
            case "CX":
                CX = n;
                break;
            case "DX":
                DX = n;
                break;
        }
    }

    public void load(String x) {
        switch (x) {
            case "AX":
                AC = AX;
                break;
            case "BX":
                AC = BX;
                break;
            case "CX":
                AC = CX;
                break;
            case "DX":
                AC = DX;
                break;
        }
    }

    public void add(String x) {
        switch (x) {
            case "AX":
                AC = AC + AX;
                break;
            case "BX":
                AC = AC + BX;
                break;
            case "CX":
                AC = AC + CX;
                break;
            case "DX":
                AC = AC + DX;
                break;
        }
    }

    public void sub(String x) {
        switch (x) {
            case "AX":
                AC = AC - AX;
                break;
            case "BX":
                AC = AC - BX;
                break;
            case "CX":
                AC = AC - CX;
                break;
            case "DX":
                AC = AC - DX;
                break;
        }
    }

    public void store(String x) {
        switch (x) {
            case "AX":
                AX = AC;
                break;
            case "BX":
                BX = AC;
                break;
            case "CX":
                CX = AC;
                break;
            case "DX":
                DX = AC;
                break;
        }
    }   
    
}
