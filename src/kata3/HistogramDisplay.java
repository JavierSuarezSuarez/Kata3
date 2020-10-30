
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
         ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
         chartPanel.setPreferredSize(new Dimension(500,400));
         return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", "Nº de emails", dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1,"","ulpgc.es");
        dataset.addValue(1,"","ull.es");
        dataset.addValue(1,"","gmail.com");
        dataset.addValue(1,"","hotmail.com");
        dataset.addValue(2,"","ulpgc.es");
        dataset.addValue(2,"","ull.es");
        dataset.addValue(3,"","ulpgc.es");
        dataset.addValue(2,"","gmail.com");
        dataset.addValue(3,"","gmail.com");
        dataset.addValue(4,"","gmail.com");
        return dataset;
    }
}
