package PlayGround.threads;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OddEvenThreadWithBlockinQueue {

	public static void main(String st[]) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
		Thread odd = new Thread(new OddNumber(queue, 1));
		Thread even = new Thread(new EvenNumber(queue));
		odd.start();
		even.start();
		System.out.println("Started");

	}

}
