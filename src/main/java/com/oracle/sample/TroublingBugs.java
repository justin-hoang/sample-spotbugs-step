package com.oracle.sample;

public class TroublingBugs {

    /**
     * Empty synchronized.
     */
    private void emptySynchronized() {
        synchronized (this) {
            // Forgot implementation
        }
    }

    /**
     * Sleep in synchronized.
     *
     * @throws InterruptedException
     *             the interrupted exception
     */
    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TroublingBugs instance = new TroublingBugs();
        instance.emptySynchronized();
        instance.sleepInSynchronized();
    }
}
