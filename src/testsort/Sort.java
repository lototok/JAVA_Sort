package testsort;

import java.util.ArrayList;


public class Sort {
    // Сортировка строк по возрастанию
    public static void sortstrup(ArrayList <String> a){
        for(int i=1; i<a.size();i++){
            String key= a.get(i);
            int j=i-1;
            while(j>=0&&(a.get(j).compareTo(key))>0){
                a.set(j+1, a.get(j));
                j=j-1;
            }
            a.set(j+1,key);
        } 
    }
    
    // Сортировка строк по убыванию
    public static void sortstrdown(ArrayList <String> a){
          for(int i=1; i<a.size();i++){
            String key= a.get(i);
            int j=i-1;
            while(j>=0&&(a.get(j).compareTo(key))<0){
                a.set(j+1, a.get(j));
                j=j-1;
            }
            a.set(j+1,key);
        } 
    } 
    
    // Сортировка чисел по возрастанию
    public static void sortintup (ArrayList <String> a){
        for(int i=1; i<a.size();i++){
            String key= a.get(i);
            int j=i-1;
            try {
            while(j>=0&&(Integer.parseInt(a.get(j))>Integer.parseInt(key))){
                a.set(j+1, a.get(j));
                j=j-1;}
                } catch (NumberFormatException e){
                System.out.println("Ошибка: файл содержит не только числа");
                System.exit(0);
                } 
            a.set(j+1, key);
        }
    }
    
    //Сортирова чисел по убыванию
    public static void sortintdown(ArrayList <String> a){
        for(int i=1; i<a.size();i++){
            String key= a.get(i);
            int j=i-1;
            try {
            while(j>=0&&(Integer.parseInt(a.get(j))<Integer.parseInt(key))){
                a.set(j+1, a.get(j));
                j=j-1;
            }
            } catch (NumberFormatException e){
                System.out.println("Ошибка: файл содержит не только числа");
                System.exit(0);
                } 
            a.set(j+1, key);
        }
    }
    

}
