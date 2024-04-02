package algoTrade.sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProcessingJava {
    public static void main(String[] args) {
        String url = "https://margincalculator.angelbroking.com/OpenAPI_File/files/OpenAPIScripMaster.json"; // Replace this with the URL you want to request data from
        String excelFile = "data_output.xlsx"; // Replace this with the desired file name

        try {
            long startTime = System.currentTimeMillis(); // Record the start time

            // Make the HTTP GET request
            String jsonResponse = sendGetRequest(url);

            // Process the JSON response and convert it to a DataFrame equivalent
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);

            // Get the field names (headers) as an Iterator<String>
            Iterator<String> headerNames = jsonNode.get(0).fieldNames();
            
            List<String> headersList = new ArrayList<>();
            while (headerNames.hasNext()) {
                headersList.add(headerNames.next());
            }

            // Determine the number of rows and columns
            int rows = jsonNode.size();
            int cols =  jsonNode.get(0).size();

            // Create the Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");

            // Create the header row
            Row headerRow = sheet.createRow(0);
            int columnIndex = 0;
            while (headerNames.hasNext()) {
                String headerName = headerNames.next();
                Cell cell = headerRow.createCell(columnIndex);
                cell.setCellValue(headerName);
                columnIndex++;
            }

            // Populate the data rows
            int rowIndex = 1;
            for (JsonNode data : jsonNode) {
                Row dataRow = sheet.createRow(rowIndex);
                columnIndex = 0;
                for (String headerName : headersList) {
                    Cell cell = dataRow.createCell(columnIndex);
                    cell.setCellValue(data.get(headerName).asText());
                    columnIndex++;
                }
                rowIndex++;
            }

            // Write the workbook to an Excel file
            try (FileOutputStream fileOut = new FileOutputStream(excelFile)) {
                workbook.write(fileOut);
            }

            workbook.close();

            long endTime = System.currentTimeMillis(); // Record the end time
            long totalTime = endTime - startTime;

            System.out.println("DataFrame converted to Excel successfully.");
            System.out.println("Total time taken: " + totalTime + " milliseconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sendGetRequest(String url) throws IOException {
        URL apiUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) apiUrl.openConnection();
        conn.setRequestMethod("GET");

        // Read the response data
        try (InputStream inputStream = conn.getInputStream()) {
            byte[] data = inputStream.readAllBytes();
            return new String(data);
        }
    }
}