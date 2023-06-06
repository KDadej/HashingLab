public class Mors {
    public String szyfr(String słowo){
        if(słowo.length()<1)
            return słowo;

        char znak;
        String zaszyfrowane = "";
        String odp = "";

        for(int i = 0; i< słowo.length();i++) {
            switch(słowo.charAt(i)) {
                case 'A':
                case 'a':
                    zaszyfrowane = zaszyfrowane + "._ ";
                    break;
                case 'B':
                case 'b':
                    zaszyfrowane = zaszyfrowane + "_... ";
                    break;
                case 'C':
                case 'c':
                    zaszyfrowane = zaszyfrowane + "_._. ";
                    break;
                case 'D':
                case 'd':
                    zaszyfrowane = zaszyfrowane + "_.. ";
                    break;
                case 'E':
                case 'e':
                    zaszyfrowane = zaszyfrowane + ". ";
                    break;
                case 'F':
                case 'f':
                    zaszyfrowane = zaszyfrowane + ".._. ";
                    break;
                case 'G':
                case 'g':
                    zaszyfrowane = zaszyfrowane + "__. ";
                    break;
                case 'H':
                case 'h':
                    zaszyfrowane = zaszyfrowane + ".... ";
                    break;
                case 'I':
                case 'i':
                    zaszyfrowane = zaszyfrowane + ".. ";
                    break;
                case 'J':
                case 'j':
                    zaszyfrowane = zaszyfrowane + ".___ ";
                    break;
                case 'K':
                case 'k':
                    zaszyfrowane = zaszyfrowane + "_._ ";
                    break;
                case 'L':
                case 'l':
                    zaszyfrowane = zaszyfrowane + "._.. ";
                    break;
                case 'M':
                case 'm':
                    zaszyfrowane = zaszyfrowane + "__ ";
                    break;
                case 'N':
                case 'n':
                    zaszyfrowane = zaszyfrowane + "_. ";
                    break;
                case 'O':
                case 'o':
                    zaszyfrowane = zaszyfrowane + "___ ";
                    break;
                case 'P':
                case 'p':
                    zaszyfrowane = zaszyfrowane + ".__. ";
                    break;
                case 'Q':
                case 'q':
                    zaszyfrowane = zaszyfrowane + "__._ ";
                    break;
                case 'R':
                case 'r':
                    zaszyfrowane = zaszyfrowane + "._. ";
                    break;
                case 'S':
                case 's':
                    zaszyfrowane = zaszyfrowane + "... ";
                    break;
                case 'T':
                case 't':
                    zaszyfrowane = zaszyfrowane + "_ ";
                    break;
                case 'U':
                case 'u':
                    zaszyfrowane = zaszyfrowane + ".._ ";
                    break;
                case 'V':
                case 'v':
                    zaszyfrowane = zaszyfrowane + "..._ ";
                    break;
                case 'W':
                case 'w':
                    zaszyfrowane = zaszyfrowane + ".__ ";
                    break;
                case 'X':
                case 'x':
                    zaszyfrowane = zaszyfrowane + "_.._ ";
                    break;
                case 'Y':
                case 'y':
                    zaszyfrowane = zaszyfrowane + "_.__";
                    break;
                case 'Z':
                case 'z':
                    zaszyfrowane = zaszyfrowane + "__.. ";
                    break;
                default:
                    zaszyfrowane = zaszyfrowane + "$ZŁY_ZNAK$ ";
            }
        }

        //Kasuje ostatni znak (spację) ze słowa
        for(int i = 0; i < zaszyfrowane.length() - 1; i++) {
            odp = odp + zaszyfrowane.charAt(i);
        }

        return odp;
    }
}

