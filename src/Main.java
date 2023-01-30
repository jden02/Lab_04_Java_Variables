public class Main {
    public static void main(String[] args) {
        int intOperandA = 2;
        int intOperandB = 3;
        int intSum = 5;
        int intProduct = 7;
        int intDifference = 11;
        int intQuotient = 13;
        int intModulo = 17;

        double doubleOperandA = 6.75;
        double doubleOperandB = 7.18;
        double doubleSum = 2.49;
        double doubleProduct = 5.012;
        double doubleDifference = 9.61;
        double doubleQuotient = 4.33;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of "  + intOperandA + " " + intOperandB +  "  is " + intSum);
        System.out.println("The difference using ints of "  + intOperandA + " " + intOperandB +  "  is " + intDifference);
        System.out.println("The product using ints of "  + intOperandA + " " + intOperandB +  "  is " + intProduct);
        System.out.println("The quotient using ints of "  + intOperandA + " " + intOperandB +  "  is " + intQuotient);
        System.out.println("The modulo using ints of "  + intOperandA + " " + intOperandB +  "  is " + intModulo);

    }
}