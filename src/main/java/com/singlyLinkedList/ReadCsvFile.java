package com.singlyLinkedList;

import com.opencsv.CSVReader;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile {
    final String PATH="C:\\Users\\KYOOLBABAA\\Desktop\\New folder\\Users.csv";
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();
    public static void main(String[] args) throws Exception{
    ReadCsvFile readCsvFile=new ReadCsvFile();
    ArrayList <String []> list= (ArrayList<String[]>) readCsvFile.readall();
        System.out.println(readCsvFile.readall());
    }
    public List<String []> readall() throws Exception{
        Reader reader= Files.newBufferedReader(Paths.get(PATH));
        List <String []> list =new ArrayList<>();
        CSVReader csvReader = new CSVReader(reader);
        String line[];
        while((line=csvReader.readNext())!=null){
        list.add(line);
        }
        reader.close();
        csvReader.close();
        this.CopytoMyLinkedList(list);
        return list;
    }

    public void CopytoMyLinkedList(List<String[]> list){
        for(String [] string: list){
            for (String str:string){
                System.out.println(str+" ");
                singlyLinkedList.add(str);
            }
            System.out.println("++++++++++++++++++++++++++++");
        }

    }
}
