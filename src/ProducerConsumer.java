import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	Random random = new Random();
	
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public void produce() {
	
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			try {		
		
				Integer value = random.nextInt(100);
				queue.put(value);
				
				System.out.println("Producer is producing..." + value);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
	}
	
	public void consume() {
		
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Integer value;
			try {
				value = queue.take();
				System.out.println("Consumer is consuming..." + value);
				System.out.println("Queue size = " + queue.size());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		
	}
	
	
	
	
	
	

}
