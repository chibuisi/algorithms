package cci;

public class ReplaceSpaces {
    public static void main(String[] args) {
        replaceSpaces("Mr John Smith    ",13);
    }

    public static void replaceSpaces(String str, int trueLength){
        int spaceCount = 0;
        char [] strChars = str.toCharArray();
        for(int i = 0; i < trueLength; i++){
            if(strChars[i] == ' ')
                spaceCount++;
        }
        int index = trueLength + spaceCount * 2;
        if (trueLength < strChars.length) strChars[trueLength] = '\0';
        for(int i = trueLength - 1; i >= 0; i--){
            if(strChars[i] == ' '){
                strChars[index - 1] = '0';
                strChars[index - 2] = '2';
                strChars[index - 3] = '%';
                index -= 3;
            }
            else {
                strChars[index - 1] = strChars[i];
                index -= 1;
            }
        }
        String newStr = new String(strChars);
        System.out.println(newStr);
    }
}
