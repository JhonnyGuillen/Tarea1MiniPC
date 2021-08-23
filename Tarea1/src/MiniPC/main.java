package MiniPC;

import MiniPC.Reader.*;
import MiniPC.Convertor.*;

import java.io.IOException;

public class main {
    public static void main(String [] arg) throws IOException {
        String test = "/home/jhonny/Documentos/TEC/2021/Semestre II/Sistemas operativos/Tareas/Tarea1MiniPC/Tarea1/src/MiniPC/file.asm", comando = "";
        int i = 2;
        Reader r = new Reader();
        Convertor c = new Convertor();

        comando = r.loadFile(test);

        String [] fragmentos = c.fragmenter(comando);
        System.out.println(fragmentos[i]);

        String codBinario = c.formater(fragmentos[i]);
        System.out.println(codBinario);
    }
}
