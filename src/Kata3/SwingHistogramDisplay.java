package Kata3;

import Kata3.core.Histogram;
import Kata3.core.HistogramDisplay;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class SwingHistogramDisplay extends ChartPanel implements HistogramDisplay {

    public SwingHistogramDisplay() {
        super(null);
    }

    @Override
    public void display(Histogram histogram) {
        setChart(createChart(histogram));
    }

    private JFreeChart createChart(Histogram histogram) {
        return ChartFactory.createBarChart("","Region","casos",createDataset(histogram));

    }

     private CategoryDataset createDataset(Histogram histogram) {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         for (String key : histogram.getKeys()) {
             dataset.addValue(histogram.getCount(key),"",key);
         }
        return dataset;

    }
}