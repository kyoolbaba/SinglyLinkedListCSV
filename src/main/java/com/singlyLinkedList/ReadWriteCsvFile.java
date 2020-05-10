package com.singlyLinkedList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCsvFile {
    final String PATH1 ="C:\\Users\\KYOOLBABAA\\Desktop\\New folder\\StateCode.csv";
    final String PATH2="C:\\Users\\KYOOLBABAA\\Desktop\\New folder\\SCode.csv";
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();

    public static void main(String[] args) throws Exception{
        ReadWriteCsvFile readWriteCsvFile =new ReadWriteCsvFile();
        readWriteCsvFile.readall();
        readWriteCsvFile.writeIntoCSV();
    }

    public List<String []> readall() throws Exception{
        Reader reader= Files.newBufferedReader(Paths.get(PATH1));
        List <String []> list =new ArrayList<>();
        CSVReader csvReader = new CSVReader(reader);
        String line[];
        while((line=csvReader.readNext())!=null){
            list.add(line);
        }
        reader.close();
        csvReader.close();
        this.CopytoCustomLinkedList(list);
        return list;
    }
    public void CopytoCustomLinkedList(List<String[]> list) throws SinglyLinkedListException {
        for(String [] string: list){
            String content="";
            for (String str:string){
                content+=str+"   ";
            }
            singlyLinkedList.add(content);
            System.out.println(content);
            System.out.println("++++++++++++++++++++++++++++");
        }
    }

    public void writeIntoCSV( )throws Exception{
        List<String[] > list= new ArrayList<String[]>();
        CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH2));
        for(int i=singlyLinkedList.size()-1;i>=0;i--){
            String content=(String)singlyLinkedList.getElement(i);
            String[] string=content.split("   ");
            list.add(string);
        }
        for(String[] str :list){
            csvWriter.writeNext(str);
        }
        csvWriter.close();
    }

}
