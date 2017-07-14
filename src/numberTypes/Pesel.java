package numberTypes;


public class Pesel extends Number {

    public Pesel(String number) {
        super(number);
    }

    //calculate contrlSum by pattern 1×a + 3×b + 7×c + 9×d + 1×e + 3×f + 7×g + 9×h + 1×i + 3×j + 1×k and checkIsNumberCorrect if %10 equals 0
    protected boolean checkIsNumberCorrect() {
        return calcControlSum() % 10 == 0;
    }

    protected int calcControlSum() {
        int controlSum = 0;

        for (int i = 0; i < numberArr.length; ++i) {
            if (i % 4 == 0 || i == 10) {
                controlSum += numberArr[i];
            } else if (i % 4 == 1) {
                controlSum += 3 * numberArr[i];
            } else if (i % 4 == 2) {
                controlSum += 7 * numberArr[i];
            } else {
                controlSum += 9 * numberArr[i];
            }
        }

        return controlSum;
    }

}
