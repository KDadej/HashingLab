
public class Ceasar {

    private static int pivot;

    public void ceasar(){
        this.pivot = 3;
    }

    public void ceasar(int pivot){
        this.pivot = pivot;
    }

    public static String encrypt(String w){

        char[] word = (w.toCharArray());
        int length = word.length;

        for(int i = 0; i < length; i++){
            if(word[i] <= 90){
                if(word[i] + pivot < 90) word[i] += pivot;
                else {
                    int tym = word[i];
                    word[i] = (char) (tym + pivot - 90 + 41);
                }
            }
            else if(word[i] <= 122){
                if(word[i] + pivot < 122) word[i] += pivot;
                else {
                    int tym = word[i];
                    word[i] = (char) (tym + pivot - 122 + 61);
                }
            }
        }


        String result = word.toString();
        return result;
    }

}
