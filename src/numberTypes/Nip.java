package numberTypes;


public class Nip extends Number {

    public Nip(String number) {
        super(number);
    }

    protected boolean checkIsNumberCorrect() {
        return numberArr[9] == calcControlSum();
    }

    protected int calcControlSum() {
        int controlSum;

        controlSum = 6*numberArr[0] + 5*numberArr[1] + 7*numberArr[2] + 2*numberArr[3] + 3*numberArr[4]
                + 4*numberArr[5] + 5* numberArr[6] + 6*numberArr[7] + 7*numberArr[8];

        controlSum = controlSum%11;

        return controlSum;
    }

}

