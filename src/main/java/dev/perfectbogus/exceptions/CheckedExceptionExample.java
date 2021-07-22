package dev.perfectbogus.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) throws IOException {
        uncheckedExceptionExample();
    }

    public static void checkedExceptionExample() throws IOException {
        File file = new File("");
        FileReader fileReader = new FileReader(file);
        System.out.println("Exito");
    }

    public static void uncheckedExceptionExample() throws ArrayIndexOutOfBoundsException {
        int[] array = {1, 2, 3,4};
        System.out.println(array[5]);
    }
}
