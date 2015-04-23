package se.yabs.interview.codereview;

public class calculator {

    public static int main(String[] args) {

        int VALS = 0;
        int VALA = Integer.parseInt(args[1]);
        int VALB = Integer.valueOf(args[2]);

        String _op = args[3];

        switch (_op) {
            case "+":
                VALS=VALA+VALB;
            case "-":
                VALS = VALA - VALB;
            case "*":
                VALS = VALA * VALB;
            case "/":
            VALS = VALA / VALB;
            break;
        }

        /* return sum */
        return VALS;
    }
}
