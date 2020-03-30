
public class Main {
    public static void main(String[] args){
      ProducerConsumer pc=new ProducerConsumer();
      
      Thread procedure=new Thread(new Runnable(){
          @Override
          public void run() {
             pc.procedure();
          }
      
      });
      
      Thread consumer=new Thread(new Runnable(){
          @Override
          public void run() {
              pc.consumer();
          }
          
      });
      
      procedure.start();;
      consumer.start();
    }
}
