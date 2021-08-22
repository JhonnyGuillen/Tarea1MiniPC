package MiniPC;

import java.awt.*;

public class Memory {

    static int reserve = 20;
    int[] memory = new int[100];

    void insertBiteToMemory(int pos, int bite){
        memory[reserve + pos] = bite;
    }
}
