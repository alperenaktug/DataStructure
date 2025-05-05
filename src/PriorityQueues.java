import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

  //   PriorityQueue'daki elemanlar önceliklerine göre sıralı tutulur.
  //   Kuyruktan bir eleman çekildiğinde (örneğin, poll() metodu ile), her zaman en yüksek önceliğe
  //   sahip eleman (en küçük veya en büyük, sıralama kriterine bağlı olarak) elde edilir.
    // Öncelik Sırası = Öğelere hizmet eden FIFO veri yapısı
    // önce en yüksek önceliklerle
    // daha düşük önceliğe sahip öğelerden önce

    public static void main(String[] args) {


        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(2.3);
        queue.offer(2.0);
        queue.offer(3.3);
        queue.offer(4.0);
        queue.offer(1.3);


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }




    }
}
