package pl.gpost.logo;

import java.util.concurrent.TimeUnit;

public class Helper {

    public static void sleep(long duration, TimeUnit unit) {
        try {
            Thread.sleep(TimeUnit.MILLISECONDS.convert(duration, unit));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
