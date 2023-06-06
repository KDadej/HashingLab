
public class Ceasar {

    private int pivot;

    public Ceasar(){
        this.pivot = 3;
    }

    public Ceasar(int pivot){
        this.pivot = pivot;
    }

    public String encrypt(String w){

        char[] word = (w.toCharArray());
        int length = word.length;

        for(int i = 0; i < length; i++){
            if(word[i] <= 90){
                if(word[i] + pivot <= 90) word[i] += pivot;
                else {
                    int tym = word[i];
                    int o = (tym + pivot) - 90;
                    word[i] = (char) (o + 64);
                }
            }
            else if(word[i] <= 122){
                if(word[i] + pivot <= 122) word[i] += pivot;
                else {
                    int tym = word[i];
                    int o = (tym + pivot) - 122;
                    word[i] = (char) (o + 96);
                }
            }
        }

        String result = new String(word);
        // String result = word.toString();
        return result;
    }

}

