package single.service;

import single.entity.ArrayCreator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArrayFillingService {
    public void fillRandomArray(ArrayCreator array, int size){
        for(int i = 0; i < size; i++){
            array.setElement (i, (int) (Math.random() * size));
        }
    }

    public void fillFileArray(ArrayCreator array, int size, String fileAddress){
        try {
            FileReader fr = new FileReader(fileAddress);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            String[] numbersStrings = line.split(",");

            for (int i = 0; i < size; i++)
            {
                array.setElement(i, Integer.parseInt(numbersStrings[i]));
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void fillConsoleArray(ArrayCreator array, int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array.setElement(i, input.nextInt());
        }
    }
}

