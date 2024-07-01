package com.problem.solving.educative;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ElectionResultToExcel {

    /*public static void main(String[] args) {
        String url = "https://results.eci.gov.in/PcResultGenJune2024/ConstituencywiseS1343.htm";
        try {
            // Fetch the HTML content from the URL
            Document doc = Jsoup.connect(url).get();
            // Extract the table containing the election results
            Element table = doc.select("table").get(0); // Adjust the index based on the correct table
            Elements rows = table.select("tr");
            // Create a new workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Election Results");
            // Iterate through the table rows and cells
            for (int i = 0; i < rows.size(); i++) {
                Row row = sheet.createRow(i);
                Elements cells = rows.get(i).select("td, th");
                for (int j = 0; j < cells.size(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(cells.get(j).text());
                }
            }
            // Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream("ElectionResults.xlsx")) {
                workbook.write(fileOut);
            }
            // Close the workbook
            workbook.close();
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://results.eci.gov.in/PcResultGenJune2024/ConstituencywiseS1344.htm",
                "https://results.eci.gov.in/PcResultGenJune2024/ConstituencywiseS1345.htm"
        );
        try (Workbook workbook = new XSSFWorkbook()) {
            int index = 0;
            for (String url : urls) {
                Document doc = Jsoup.connect(url).get();
                Element table = doc.select("table").get(0); // Adjust the index based on the correct table
                Elements rows = table.select("tr");
                String sheetName = "MS_" +  index++;
                Sheet sheet = workbook.createSheet(sheetName);
                for (int i = 0; i < rows.size(); i++) {
                    Row row = sheet.createRow(i);
                    Elements cells = rows.get(i).select("td, th");
                    for (int j = 0; j < cells.size(); j++) {
                        Cell cell = row.createCell(j);
                        cell.setCellValue(cells.get(j).text());
                    }
                }
            }
            try (FileOutputStream fileOut = new FileOutputStream("/Users/niteen/Desktop/loksabha-2024/ElectionResults.xlsx")) {
                workbook.write(fileOut);
            }
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}