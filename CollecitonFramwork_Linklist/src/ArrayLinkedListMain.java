
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLinkedListMain {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        
        zamanHesapla("Linkedlist", linkedList);
        //zamanHesapla("ArrayList", arrayList);
        
        
        
    }
    
    public static void zamanHesapla(String veri_tipi, List<Integer> list){
        
        
        long baslangic;
        long bitis;
        
        baslangic =System.currentTimeMillis();
        
        for(int i=0; i<10000000; i++){
            list.add(0,i);
        }
        bitis =System.currentTimeMillis();
        
        System.out.println(veri_tipi +":" + (bitis- baslangic) + "ms");

    }
}
