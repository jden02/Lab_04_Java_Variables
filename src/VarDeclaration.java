public class VarDeclaration {
    public static void main(String[] args){
        /*  the number of kids in your family:
            the answer to is it raining? :
            the price of a gallon of gas :
            your favorite number :
            your shoe size:
            your birth month:
            your full name:
        */
        int kidsInFamily = 0;
        boolean isRaining = false;
        double gasPrice = 3.31;
        double favNumber = 3.14159; // I chose a double because some may say pi or e like me
        double shoeSize = 8.5;
        int birthMonth = 10; // This could also be a string depending on what you are using it for.
        String fullName = "Jack Dengler";

        System.out.println("The number of kids in my family: " + kidsInFamily);
        System.out.println("Is it currently raining: " + isRaining);
        System.out.println("What is the current price of gas: " + gasPrice);
        System.out.println("My favourite number is: " + favNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
