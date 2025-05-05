import java.util.LinkedList;
import java.util.Queue;

public class QueueLessons {

    // Kuyruk = FIFO veri yapısı. İlk Giren İlk Çıkar
    // İşlenmeden önce elemanları tutmak için tasarlanmış bir koleksiyon
    // Doğrusal veri yapısı


    // // Yararlı kuyruklar var mı?

    // 1. Klavye Arabelleği (harfler ekranda basıldıkları sırada görünmelidir)
    // 2. Yazıcı Sırası (Yazdırma işleri sırayla tamamlanmalıdır)
    // 3. Bağlantılı Listelerde, Öncelik Sıralarında, İlk Genişlikte aramada kullanılır
    // 4. Mesaj Kuyrukları: Uygulamalar arasında asenkron iletişim sağlamak.
    // 5. Görev Yönetimi: İşlenecek görevleri sırayla tutmak (örneğin, bir thread havuzunda).

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String >();


        queue.offer("Muslera"); // Elemanı kuyruğun sonuna ekler.
        queue.offer("Sanchez");
        queue.offer("Barış Alper");
        queue.offer("Icardi");
        queue.offer("Sallai");


        // queue.poll();              // Kuyruğun başındaki elemanı siler.
        // queue.poll();
        // queue.poll();

        System.out.println(queue.size());              // Kuyruğun boyutunu döndürür.
        System.out.println(queue.isEmpty());           // Kuyruk boş mu diye bilgi verir.
        System.out.println(queue.contains("Muslera")); // Kuyruk bu öğeyi içerir miye cevap döndürür.
        System.out.println(queue.peek());              // Kuyruğun başındaki elemanı döndürür.
        System.out.println(queue);





    }
}
