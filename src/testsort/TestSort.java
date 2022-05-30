package testsort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestSort {

    public static void main(String[] args) {
        String filename;
        String fileout;
        ArrayList <String> list=new ArrayList<>();
        if (args.length==0) {
            System.out.println("Не введены параметры запуска ");
            System.exit(0);
        } 
        if (args.length!=4){
            System.out.println("Неверно указаны параметры");
            System.exit(0);
        }
             
        filename= args[0];
        fileout = args[1];
        try{
        FileReader fr =new FileReader(filename); 
        BufferedReader br=new BufferedReader(fr);
        String str;
        
        while((str=br.readLine()) != null) {
            list.add(str);
           }
        } catch (IOException e) {
            System.out.println("Указанный файл не обнаружен "+e);
        } 
       
       if(args[2].equals("-s")||args[3].equals("-s")) // строка?
            if(args[2].equals("-a")||args[3].equals("-a")) Sort.sortstrup(list); // по возрастанию
            else if(args[2].equals("-d")||args[3].equals("-d")) Sort.sortstrdown(list); //по убыванию
                  else {System.out.println("Указан недопустимый аргумент"); System.exit(0);}
       else if(args[2].equals("-i")||args[3].equals("-i")) // числа?
            if(args[2].equals("-a")||args[3].equals("-a")) Sort.sortintup(list); //по возрастанию
            else if(args[2].equals("-d")||args[3].equals("-d")) Sort.sortintdown(list); //по убыванию
                  else {System.out.println("Указан недопустимый аргумент"); System.exit(0);}
            else {System.out.println("Указан недопустимый аргумент"); System.exit(0);}
        //for(String i:list) System.out.println(i);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileout))){
            for(String i:list) {bw.write(i);bw.newLine();}
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("файл " +fileout+" успешно создан");
    }
    
}
