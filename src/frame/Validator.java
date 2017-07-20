package frame;

import numberTypes.*;
import numberTypes.Number;

class Validator {
    private Number number;
    private String numberWithoutDashes = "";

    Validator(String _number) {
        transNumberToJustDigits(_number);

        if (numberWithoutDashes.length() == 10) {
            this.number = new Nip(numberWithoutDashes);
        } else if (numberWithoutDashes.length() == 11) {
            this.number = new Pesel(numberWithoutDashes);
        } else if (numberWithoutDashes.length() == 9 || numberWithoutDashes.length() == 14) {
            this.number = new Regon(numberWithoutDashes);
        } else {
            this.number = new BadNumber(numberWithoutDashes);
        }

    }

    boolean check() {
        return number.isNumberCorrect;
    }

    //method to elminate dashes form number
    private void transNumberToJustDigits(String number) {
        String[] justDigits = number.split("-");

        for (String justDigit : justDigits) {
            numberWithoutDashes += justDigit;
        }

    }

    String getNumberType(){
        return number.getNumberType();
    }
}
