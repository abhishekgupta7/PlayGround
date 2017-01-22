package PlayGround.threads;
import java.util.ArrayList;
import java.util.List;

public class OddEvenThread {

	public static void main(String st[]) {

		List<String> synch = new ArrayList<>();
		Thread odd = new Thread(new Odd(synch));
		Thread even = new Thread(new Even(synch));
		odd.start();
		even.start();

	}

}
