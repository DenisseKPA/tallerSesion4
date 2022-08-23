package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Report {

    public static void main(String[]args){
        String ruta= new File("").getAbsolutePath()+"/build/reports/cucumber/";
        File reportFolder= new File(ruta+"GROUP3");

        List<String> jsonList= new ArrayList<>();
        //el archivo json tiene que existir antes de generar el reporte
        jsonList.add(ruta+"report.json");

        Configuration configuration= new Configuration(reportFolder,"TallerFinalJB");
        configuration.setBuildNumber("5555");
        configuration.addClassifications("owner","Appium");
        configuration.addClassifications("OS","Android");

        ReportBuilder reportBuilder = new ReportBuilder(jsonList,configuration);
        reportBuilder.generateReports();
    }
}
