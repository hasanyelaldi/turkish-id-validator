package com.github.hasanyelaldi.executer;

public class Validator {
    private int oddSum, evenSum;
    private int WRONG_FIRST_DIGIT = 0;
    private int IDENTITY_NUMBER_LENGTH = 11;


    public boolean checkIdentityNumber(String id){
        oddSum = 0; evenSum = 0;
        int tenthDigit = Character.getNumericValue(id.charAt(9));
        int eleventhDigit = Character.getNumericValue(id.charAt(10));

        if (id.length() != IDENTITY_NUMBER_LENGTH)
            return false;
        if (Character.getNumericValue(id.charAt(0)) == WRONG_FIRST_DIGIT)
            return false;

        findOddSumAndEvenSum(id);

        if (calculateEleventhValue() != eleventhDigit)
            return false;
        if (calculateEleventhValueSecondEqu() != eleventhDigit)
            return false;

        evenSum -= tenthDigit;
        if (calculateTenthValue() != tenthDigit)
            return false;
        if (calculateTenthValueSecondEqu() != tenthDigit)
            return false;

        return true;
    }


    private void findOddSumAndEvenSum(String id) {
        for (int index = 0; index < id.length()-1 ; index++){
            if(index % 2 == 0)
                oddSum += Character.getNumericValue(id.charAt(index));
            else
                evenSum += Character.getNumericValue(id.charAt(index));
        }
    }

    private int calculateTenthValue() {
        return ((oddSum*7) - evenSum) % 10;
    }

    private int calculateEleventhValue() {
        return (oddSum + evenSum) % 10;
    }

    private int calculateEleventhValueSecondEqu() {
        return (oddSum*8) % 10;
    }

    private int calculateTenthValueSecondEqu() {
        return ((oddSum*7) + (evenSum*9)) % 10;
    }

}
