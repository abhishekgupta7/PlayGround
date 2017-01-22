package PlayGround.threads;
import java.util.List;

class Even implements Runnable {

	int i = 2;
	

	List<String> synch ;

	Even(List<String> synch) {
		this.synch = synch;
	}

	public void run() {

		while (true) {

			synchronized (synch) {

				while (synch.size() == 0) {
					try {
						synch.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				i = i + 2;
				
				synch.remove(0);
				synch.notify();
			}
		}
	}

}