package PlayGround.threads;

import java.util.concurrent.BlockingQueue;

abstract public class GenericWithBlockingQueue<T> implements Runnable{
	
	int i;
	BlockingQueue<T> queue;
	
	GenericWithBlockingQueue(BlockingQueue<T> queue, int i){
		this.queue = queue;
		this.i = i;
	}
	@Override
	public void run() {
	
		while (true) {
			synchronized (queue) {
				
				try {
					exceute();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(i++);
			}
		}
	}
	
	abstract void exceute() throws InterruptedException;
	

}
