package _5_modifikatori;

public class MyRunnable  implements Runnable {
    private volatile boolean active;

    public void run() {
        active = true;
        while (active) {   // линия 1
            // здесь какой-нибудь код
        }
    }
    public void stop(){
        active = false; // линия 2
    }

}
