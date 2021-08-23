package MiniPC;

import java.awt.*;

public class Memory {
    private String codAsm;
    private String codBin;
    private int AC;
    private int AX;
    private int BX;
    private int CX;
    private int DX;

    public Memory(String asm, String bin,int ac,  int a, int b, int c, int d){
        this.codAsm = asm;
        this.codBin = bin;
        this.AC = ac;
        this.AX = a;
        this.BX = b;
        this.CX = c;
        this.DX = d;
    }

    public String getCodAsm(){
        return codAsm;
    }

    public String getCodBin(){
        return codBin;
    }

    public int getAC(){
        return AC;
    }

    public int getAX(){
        return AX;
    }

    public int getBX(){
        return BX;
    }

    public int getCX(){
        return CX;
    }

    public int getDX(){
        return DX;
    }

    public int add(){
        return AC;
    }
}
