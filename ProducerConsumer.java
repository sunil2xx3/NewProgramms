import java.util.Queue;
import java.util.LinkedList;
public class ProducerConsumer implements Runnable{

        Queue<Integer> produce = new LinkedList<>();
        Queue<Integer> consume = new LinkedList<>();
        String methodName="";
        // public Main(String methodName){
        //   this.methodName=methodName;
        // }
        public void run() {
            producer();
            while(produce.size()>0){
                consumer();
            }
        }

        public void producer() {
            for (int i = 1; i < 51; i++) {
                produce.add(i);
            }
        }

        public void consumer() {
            if (consume.size() == 0 && produce.size()!=0) {
                for (int i = 0; i <10; i++) {
                    consume.add(i);
                    produce.remove();
                    System.out.println("Producer is producing");
                }
                System.out.println();
            }
            if(consume.size() == 10)
                for (int j = 0; j < 10; j++) {
                    consume.remove();
                    System.out.println("Consumer is consuming");
                }
            System.out.println();
        }


        public static void main(String[] args) {
            // Main obj = new Main("consuming");
            ProducerConsumer obj1 = new ProducerConsumer();
            // obj.producer();
            // obj.consumer();
            // Thread t = new Thread(obj);
            Thread t1 = new Thread(obj1);
            // t.start();
            t1.start();
        }
    }
