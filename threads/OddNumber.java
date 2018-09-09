package PlayGround.threads;

import java.util.concurrent.BlockingQueue;

public class OddNumber implements Runnable {

	BlockingQueue<Integer> queue = null;
	int i;

	OddNumber(BlockingQueue<Integer> queue, int i) {
		this.queue = queue;
		this.i = i;

	}

	@Override
	public void run() {
		while (true) {

			try {
				Thread.sleep(1000);
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = i + 2;

		}
	}

}
