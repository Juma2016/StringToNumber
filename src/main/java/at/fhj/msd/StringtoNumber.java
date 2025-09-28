package at.fhj.msd;

public class StringtoNumber {

    public static int checkAndTurnString(String number){
        if(number==null||number.isBlank())
            throw new IllegalArgumentException();

            return Integer.parseInt(number);
    }

}