import java.util.Scanner;


public class Main {
    

    public static void zipGetter() {
        //to get zipcode
        Scanner scan = new Scanner(System.in);
        String zipcode;
        String first;
        String second;
        String third;
        String fourth;
        String fifth;

        System.out.println("Enter your zipcode here: ");
        zipcode = scan.nextLine();

        if(zipcode.length() != 5) {
            System.exit(0);
        }

        first = zipcode.substring(0, 1);
        second = zipcode.substring(1, 2);
        third = zipcode.substring(2, 3);
        fourth = zipcode.substring(3, 4);
        fifth = zipcode.substring(4, 5);


        //error detection
        int cDigit = 0;
        int threshold = 10;
        int digit1 = Integer.parseInt(first);
        int digit2 = Integer.parseInt(second);
        int digit3 = Integer.parseInt(third);
        int digit4 = Integer.parseInt(fourth);
        int digit5 = Integer.parseInt(fifth);
        int total = digit1 + digit2 + digit3 + digit4 + digit5;

        while (total > threshold) {
            threshold = threshold + 10;
        }

         cDigit = threshold - total;


        String correction = Integer.toString(cDigit);

        switch(correction) {
            case "0":
                correction = "11000";
                break;
            case "1":
                correction = "00011";
                break;
            case "2":
                correction = "00101";
                break;
            case "3":
                correction = "00110";
                break;
            case "4":
                correction = "01001";
                break;
            case "5":
                correction = "01010";
                break;
            case "6":
                correction = "01100";
                break;
            case "7":
                correction = "10001";
                break;
            case "8":
                correction = "10010";
                break;
            case "9":
                correction = "10100";
                break;

        }

        switch(correction) {
            case "11000":
                correction = "||:::";
                break;
            case "00011":
                correction = ":::||";
                break;
            case "00101":
                correction = "::|:|";
                break;
            case "00110":
                correction = "::||:";
                break;
            case "01001":
                correction = ":|::|";
                break;
            case "01010":
                correction = ":|:|:";
                break;
            case "01100":
                correction = ":||::";
                break;
            case "10001":
                correction = "|:::|";
                break;
            case "10010":
                correction = "|::|:";
                break;
            case "10100":
                correction = "|:|::";
                break;

        }

        //transfer to binary
        switch(first) {
            case "0":
                first = "11000";
                break;
            case "1":
                first = "00011";
                break;
            case "2":
                first = "00101";
                break;
            case "3":
                first = "00110";
                break;
            case "4":
                first = "01001";
                break;
            case "5":
                first = "01010";
                break;
            case "6":
                first = "01100";
                break;
            case "7":
                first = "10001";
                break;
            case "8":
                first = "10010";
                break;
            case "9":
                first = "10100";
                break;

        }

        switch(second) {
            case "0":
                second = "11000";
                break;
            case "1":
                second = "00011";
                break;
            case "2":
                second = "00101";
                break;
            case "3":
                second = "00110";
                break;
            case "4":
                second = "01001";
                break;
            case "5":
                second = "01010";
                break;
            case "6":
                second = "01100";
                break;
            case "7":
                second = "10001";
                break;
            case "8":
                second = "10010";
                break;
            case "9":
                second = "10100";
                break;

        }

        switch(third) {
            case "0":
                third = "11000";
                break;
            case "1":
                third = "00011";
                break;
            case "2":
                third = "00101";
                break;
            case "3":
                third = "00110";
                break;
            case "4":
                third = "01001";
                break;
            case "5":
                third = "01010";
                break;
            case "6":
                third = "01100";
                break;
            case "7":
                third = "10001";
                break;
            case "8":
                third = "10010";
                break;
            case "9":
                third = "10100";
                break;

        }

        switch(fourth) {
            case "0":
                fourth = "11000";
                break;
            case "1":
                fourth = "00011";
                break;
            case "2":
                fourth = "00101";
                break;
            case "3":
                fourth = "00110";
                break;
            case "4":
                fourth = "01001";
                break;
            case "5":
                fourth = "01010";
                break;
            case "6":
                fourth = "01100";
                break;
            case "7":
                fourth = "10001";
                break;
            case "8":
                fourth = "10010";
                break;
            case "9":
                fourth = "10100";
                break;

        }

        switch(fifth) {
            case "0":
                fifth = "11000";
                break;
            case "1":
                fifth = "00011";
                break;
            case "2":
                fifth = "00101";
                break;
            case "3":
                fifth = "00110";
                break;
            case "4":
                fifth = "01001";
                break;
            case "5":
                fifth = "01010";
                break;
            case "6":
                fifth = "01100";
                break;
            case "7":
                fifth = "10001";
                break;
            case "8":
                fifth = "10010";
                break;
            case "9":
                fifth = "10100";
                break;

        }

        //transfer to barcode | = 1 : = 0

        switch(first) {
            case "11000":
                first = "||:::";
                break;
            case "00011":
                first = ":::||";
                break;
            case "00101":
                first = "::|:|";
                break;
            case "00110":
                first = "::||:";
                break;
            case "01001":
                first = ":|::|";
                break;
            case "01010":
                first = ":|:|:";
                break;
            case "01100":
                first = ":||::";
                break;
            case "10001":
                first = "|:::|";
                break;
            case "10010":
                first = "|::|:";
                break;
            case "10100":
                first = "|:|::";
                break;

        }

        switch(second) {
            case "11000":
                second = "||:::";
                break;
            case "00011":
                second = ":::||";
                break;
            case "00101":
                second = "::|:|";
                break;
            case "00110":
                second = "::||:";
                break;
            case "01001":
                second = ":|::|";
                break;
            case "01010":
                second = ":|:|:";
                break;
            case "01100":
                second = ":||::";
                break;
            case "10001":
                second = "|:::|";
                break;
            case "10010":
                second = "|::|:";
                break;
            case "10100":
                second = "|:|::";
                break;

        }

        switch(third) {
            case "11000":
                third = "||:::";
                break;
            case "00011":
                third = ":::||";
                break;
            case "00101":
                third = "::|:|";
                break;
            case "00110":
                third = "::||:";
                break;
            case "01001":
                third = ":|::|";
                break;
            case "01010":
                third = ":|:|:";
                break;
            case "01100":
                third = ":||::";
                break;
            case "10001":
                third = "|:::|";
                break;
            case "10010":
                third = "|::|:";
                break;
            case "10100":
                third = "|:|::";
                break;

        }

        switch(fourth) {
            case "11000":
                fourth = "||:::";
                break;
            case "00011":
                fourth = ":::||";
                break;
            case "00101":
                fourth = "::|:|";
                break;
            case "00110":
                fourth = "::||:";
                break;
            case "01001":
                fourth = ":|::|";
                break;
            case "01010":
                fourth = ":|:|:";
                break;
            case "01100":
                fourth = ":||::";
                break;
            case "10001":
                fourth = "|:::|";
                break;
            case "10010":
                fourth = "|::|:";
                break;
            case "10100":
                fourth = "|:|::";
                break;

        }

        switch(fifth) {
            case "11000":
                fifth = "||:::";
                break;
            case "00011":
                fifth = ":::||";
                break;
            case "00101":
                fifth = "::|:|";
                break;
            case "00110":
                fifth = "::||:";
                break;
            case "01001":
                fifth = ":|::|";
                break;
            case "01010":
                fifth = ":|:|:";
                break;
            case "01100":
                fifth = ":||::";
                break;
            case "10001":
                fifth = "|:::|";
                break;
            case "10010":
                fifth = "|::|:";
                break;
            case "10100":
                fifth = "|:|::";
                break;

        }


        System.out.println("|" + first + " " + second + " " + third + " " + fourth + " " + fifth + " " + correction + "|");





    }

    
    public static void main(String[] args) {
        zipGetter();

    }
}



