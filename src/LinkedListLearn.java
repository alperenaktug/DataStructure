
import java.util.LinkedList;

public class LinkedListLearn {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

         // Linkedlist is a stack
     //   linkedList.push("A");
     //   linkedList.push("B");
     //   linkedList.push("C");
     //   linkedList.push("D");
     //   linkedList.push("E");
     //   linkedList.pop();

        // Linkedlist is a queue

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
      //  linkedList.poll();

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("x");
        linkedList.addLast("z");
        linkedList.removeFirst();
        linkedList.removeLast();



        System.out.println(linkedList);
    }
    /*
    Dinamik Boyut: Elemanlar eklendikçe veya çıkarıldıkça LinkedList'in boyutu dinamik olarak artar veya azalır.
     Sabit bir boyutu yoktur.

    Bağlı Liste Yapısı: Elemanlar düğümler aracılığıyla birbirine bağlıdır. Bu, elemanların bellekte dağınık
     olarak bulunabileceği anlamına gelir.

    Hızlı Ekleme ve Çıkarma (Baş ve Son): Listenin başına veya sonuna eleman eklemek ve çıkarmak sabittir
    (O(1) karmaşıklıkta), çünkü sadece düğümlerin referansları güncellenir.

    Yavaş Rastgele Erişim: Belirli bir indeksteki elemana erişmek (örneğin, get(index)), listenin başından
    başlayarak istenen indekse kadar düğümleri takip etmeyi gerektirir. Bu nedenle, rastgele erişim
    ArrayList'e göre daha yavaştır (O(n) karmaşıklıkta).

    Çift Bağlı Liste: Java'daki LinkedList aslında çift bağlı bir listedir. Her düğüm hem bir sonraki hem de bir
     önceki düğüme olan referansı saklar. Bu, listede iki yönde de kolayca hareket etmeyi sağlar.
   */
    // // Bağlantılı Liste = Düğümler 2 bölümden oluşur (veri + adres)
    // Düğümler ardışık olmayan bellek konumlarındadır
    // Öğeler işaretçiler(pointers) kullanılarak bağlanır

    // avantajlar?
    //    1. Dinamik Veri Yapısı (çalışırken gerekli belleği ayırır)
    //    2. Düğümlerin yerleştirilmesi ve Silinmesi kolaydır. O(1)
    //    3. Hayır / Düşük bellek israfı

    // dezavantajları?
    //    1. Daha fazla bellek kullanımı (ek işaretçi)
    //    2. Öğelere rastgele erişim yok (dizin yok [i])
    //    3. Öğelere erişmek / aramak daha fazla zaman alır. O(n)

    // kullanır?
    //    1. yığınları / Kuyrukları Uygulama
    //    2. GPS navigasyon
    //    3. müzik çalma listesi
}
