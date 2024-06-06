import javax.swing.*;

public class app {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                rockGUI rockGUI = new rockGUI();

                rockGUI.setVisible(true);
            }
        });
    }
}
