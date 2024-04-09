import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {
    // public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    // }
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
