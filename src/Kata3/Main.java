package Kata3;

import Kata3.core.HistogramDisplay;
import Kata3.core.Histogram;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    private HistogramDisplay histogramDisplay;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main() {
        setTitle("Histogram");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rootPane.setLayout(new BorderLayout());
        rootPane.add(createHistogramDisplay(), BorderLayout.CENTER);
    }

    private void execute() {
        Histogram histogram = new InternalHistogramLoader().load();
        histogramDisplay.display(histogram);
        setVisible(true);
    }

    private SwingHistogramDisplay createHistogramDisplay() {
        SwingHistogramDisplay display = new SwingHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }
}