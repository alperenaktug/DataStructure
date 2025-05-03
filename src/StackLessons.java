import java.util.Stack;

public class StackLessons {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

     //   System.out.println(stack.empty());
     //   stack boş mu diye kontrol ettik .


        // stack e nesne ekledik .
        stack.push("Galatasaray");
        stack.push("Fenerbahçe");
        stack.push("Beşiktaş");
        stack.push("Trabzonspor");
        stack.push("Samsunspor");

        // Stack ten nesne çıkardık . Tabiki en son giren nesne çıktı .
     /*
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
                      */

        // peek() metodu yığının en üstündeki elemanı döndürür fakat
        // onu yığından çıkarmaz. pop() gibi silme işlemi yapmaz sadece bakar.
        System.out.println(stack.peek());

        //search() metodunun görevi parametre olarak verilen öğenin yığın içindeki
        // konumunu (pozisyonunu) bulmak ve onu döndürmektir ,Eğer "Samsunspor" stack
        // içinde yoksa, -1 döner.
        System.out.println(stack.search("Samsunspor"));

        System.out.println(stack);

        // Yığınlar Nerelerde kullanılır ?

        // 1- Metin düzenleyicilerinde geri alma ve yineleme özelliklerinde kullanılabilir
        // 2- Web tarayıcılarında tarayıcı geçmişinden ileri veya geri gidebiliriz .
        // 3- Fonksiyonları çağırırken kullanırız .


    }
}
