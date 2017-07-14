import numberTypes.*;
import numberTypes.Number;

class Validator {
    private Number number;
    private String numberWithoutDashes = "";

    Validator(String _number) {
        int length = transNumberToJustDigits(_number);

        if (length == 10) {
            this.number = new Nip(numberWithoutDashes);
        } else if (length == 11) {
            this.number = new Pesel(numberWithoutDashes);
        } else if (length == 9 || length == 14) {
            this.number = new Regon(numberWithoutDashes);
        } else {
            this.number = new BadNumber(numberWithoutDashes);
        }

        check();
    }

    private void check() {
        if (number.isNumberCorrect) {
            System.out.println("Poprawny");
        } else {
            System.out.println("Niepoprawny");
        }
    }

    //method to elminate dashes form number
    private int transNumberToJustDigits(String number) {
        int length = 0;
        String[] justDigits = number.split("-");

        for (String justDigit : justDigits) {
            length += justDigit.length();
            numberWithoutDashes += justDigit;
        }

        return length;
    }
}
