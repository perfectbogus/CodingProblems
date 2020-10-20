package dev.perfectbogus.arrays;

public class URLify {


    public static void main(String[] args) {
        char[] aux = {'a', ' ', 'b', 'c', ' ', ' ', ' '};
        replaceSpaces(aux, 4);
    }

    /**
     * Steps:
     * get the string
     * get the size string
     * create array char
     * look for spaces and replace with %20
     */

    public static char[] replaceSpaces(char[] str, int trueLength) {
        char[] myArray = new char[str.length];

        if (trueLength < str.length) str[trueLength] = '\0';
        int indexAux = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                myArray[indexAux] = '%';
                myArray[++indexAux] = '2';
                myArray[++indexAux] = '0';
            } else {
                myArray[indexAux] = str[i];
            }
            ++indexAux;
        }
        while(indexAux < myArray.length){
            myArray[indexAux] = ' ';
            ++indexAux;
        }
        return myArray;
    }

}