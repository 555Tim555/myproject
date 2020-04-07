package com.zy;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        Report Finance = new FinanceReport();   //父類別可以放子類別的物件
        Report Health = new Health();
        List<Report> reports = new ArrayList<>();
        reports.add(Finance);
        reports.add(Health);

        for(Report report : reports){
            report.load();
            report.print();
        }
    }

}
