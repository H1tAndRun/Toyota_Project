package sales;

import people.Manager;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boss {
    private List<Manager> managers;

    public Boss(List<Manager> managers) throws IOException {
        this.managers = managers;
        GenerateAllReport();
    }

    public void GenerateAllReport() throws IOException {
        double allIncome = 0.0;
        double allExpenses = 0.0;
        double allProfit = 0.0;

        for (int i = 0; i < managers.size(); i++) {
            managers.get(i).generateReport();
        }
        FileWriter fileWriter = new FileWriter("D:\\Projekt JAVA\\Toyota_Project\\src\\sales\\report\\boss_report");
        File folder = new File("D:\\Projekt JAVA\\Toyota_Project\\src\\sales\\report");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            int count = 0;
            String str = "";
            FileReader fileReader = new FileReader(listOfFiles[i]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                if (count == 0) {
                    fileWriter.write(bufferedReader.readLine());
                    count++;

                } else {
                    str = bufferedReader.readLine();
                }
            }
            if (count == 0) {
                continue;
            }
            fileWriter.write(regular(str));

            String arr[] = regular(str).split("-");
            allIncome += Double.parseDouble(arr[1]);
            allExpenses += Double.parseDouble(arr[2]);
            allProfit += Double.parseDouble(arr[3]);
            bufferedReader.close();
        }
        fileWriter.write("Итого:" + allIncome + "," + allExpenses + "," + allProfit);
        fileWriter.close();
    }

    public String regular(String str) {
        String res = "";
        Pattern pattern = Pattern.compile("-\\d*.\\d");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            res += matcher.group(0);
        }
        return res + "\n";
    }
}
