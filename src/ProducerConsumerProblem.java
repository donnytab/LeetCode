import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Vector sharedQueue = new Vector();
		int size = 4;
		Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
		Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
		
		prodThread.start();
		consThread.start();
	}
}


class Producer implements Runnable {
	private final Vector sharedQueue;
	private final int pSize;
	
	public Producer(Vector sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.pSize = size;
	}
	
	private void producer(int i) throws InterruptedException {
		while(sharedQueue.size() == pSize) {
			synchronized(sharedQueue){
				System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		synchronized(sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
	}

	@Override
	public void run() {
		for(int i=0; i<7; i++) {
			System.out.println("Produced: " + i);
			try{
				producer(i);
			} catch(InterruptedException e) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e);
			}
		}
		
	}
	
}


class Consumer implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public Consumer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private int consume() throws InterruptedException {
        //wait if queue is empty
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                                    + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        //Otherwise consume element and notify waiting producer
        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}

