package producerconsumer;

/**
 * Created by qxing on 2019/2/7.
 */
public class Resource {

    private boolean flag = false;

    public void produce() {
        synchronized (this) {
            try {
                while (flag) {
                    this.wait();
                }
                System.out.println(Thread.currentThread().getName() + " produce: hello world");
                flag = true;
                this.notify();
            } catch (InterruptedException e) {

            }
        }
    }

    public void consume() {
        synchronized (this) {
            try {
                while (!flag) {
                    this.wait();
                }
                System.out.println(Thread.currentThread().getName() + " consume: hello world");
                flag = false;
                this.notify();
            } catch (InterruptedException e) {

            }
        }
    }
}
