package numberTypes;

public abstract class Number {

    int[] numberArr;
    private String numberType;
    public boolean isNumberCorrect;

    Number(String number) {
        numberArr = new int[number.length()];
        parseNumberToArr(number);
        this.isNumberCorrect = checkIsNumberCorrect();
    }

    protected boolean checkIsNumberCorrect() {
        return false;
    }

    protected int calcControlSum() {
        return 0;
    }

    private void parseNumberToArr(String number) {
        for (int i = 0; i < number.length(); ++i) {
            this.numberArr[i] = Character.getNumericValue(number.charAt(i));
        }
    }

    void setNumberType(String type){
        this.numberType = type;
    }

    public String getNumberType(){
        return numberType;
    }

}
