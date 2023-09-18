import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Spusti.yt();

        }

        Spusti.panel();
        //Spusti.ShutDOwn();

    }


    //--------------------------------------
    public static class Spusti {

        public static void yt() {
            try {
                Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=4Yrl2UF2p9Y"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



        public static void panel() {
            while (true) {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }

                JOptionPane.showMessageDialog(null, "Critical error #564AF3000A:AA\n"
                        , "System Failure",
                        javax.swing.JOptionPane.ERROR_MESSAGE);


            }
        }


        private static void ShutDOwn(){
            int sekundy = 1;
            Timer casovac = new Timer();

            casovac.schedule(new TimerTask() {
                public void run() {

                        ProcessBuilder proces = new ProcessBuilder("shutdown", "/s");
                    try {
                        proces.start();
                    } catch (Exception e) {

                    }}},sekundy * 1000 * 20);


        }

    }

}

