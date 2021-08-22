package MiniPC;

public class Convertor {
    String [] fragmenter(String comand){
        String [] fragmented = comand.split(" ");
        return fragmented;
    }

    String formater(String [] comands){
        String result = "";
        int size = comands.length;
        int i = 0;
        while(comands[i] != null){
            switch (comands[i]){
                case "LOAD":
                    result = result + "0001 ";
                    break;
                case "STORE":
                    result = result + "0010 ";
                    break;
                case "MOV":
                    result = result + "0011 ";
                    break;
                case "SUB":
                    result = result + "0100 ";
                    break;
                case "ADD":
                    result = result + "0101 ";
                    break;
            }
            switch (comands[i+1]){
                case "AX":
                case "AX,":
                    result = result + "0001 ";
                    break;
                case "BX":
                case "BX,":
                    result = result + "0010 ";
                    break;
                case "CX":
                case "CX,":
                    result = result + "0011 ";
                    break;
                case "DX":
                case "DX,":
                    result = result + "0100 ";
                    break;
            }
            switch (comands[i+2]){
                case "1":
                    result = result + "00000001 ";
                    break;
                case "-1":
                    result = result + "10000001 ";
                    break;
                case "2":
                    result = result + "00000010 ";
                    break;
                case "-2":
                    result = result + "10000010 ";
                    break;
                case "3":
                    result = result + "00000011 ";
                    break;
                case "-3":
                    result = result + "10000011 ";
                    break;
                case "4":
                    result = result + "00000100 ";
                    break;
                case "-4":
                    result = result + "10000100 ";
                    break;
                case "5":
                    result = result + "00000101 ";
                    break;
                case "-5":
                    result = result + "10000101 ";
                    break;
                case "6":
                    result = result + "00001000 ";
                    break;
                case "-6":
                    result = result + "10001000 ";
                    break;
                case "7":
                    result = result + "00001001 ";
                    break;
                case "-7":
                    result = result + "10001001 ";
                    break;
                case "8":
                    result = result + "00001010 ";
                    break;
                case "-8":
                    result = result + "10001010 ";
                    break;
                case "9":
                    result = result + "00001011 ";
                    break;
                case "-9":
                    result = result + "10001011 ";
                    break;
            }
            if(comands[i+3] == "\n"){
                result = result + "\n";
                i = i+3;
            }
        }
        return result;
    }
}
