package gdou.gdou_chb.util.Java;

import rx.Scheduler;

/**
 * Created by Z1shiki on 2016/11/25.
 */

public class BaseScheduler extends Scheduler {
    @Override
    public Worker createWorker() {
        return null;
    }
}
