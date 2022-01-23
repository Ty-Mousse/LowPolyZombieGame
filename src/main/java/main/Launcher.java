package main;

import engine.EngineManager;
import engine.WindowManager;

public class Launcher {

    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String args[]) {
        window = new WindowManager("Loading...", 1080, 720, false);
        engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }
}
