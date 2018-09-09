package PlayGround.threads;

import java.util.concurrent.BlockingQueue;

public class EvenNumber implements Runnable{

	BlockingQueue<Integer> queue = null;
	
	EvenNumber(BlockingQueue<Integer> queue) {
		this.queue = queue;
		
		
	}

	@Override
	public void run(){
		
	while(true)	{
		int i = 0;
		try {
			i = queue.take();
			System.out.println(i);
			System.out.println(i+1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
