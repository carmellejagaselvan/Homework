public class Conditionals {
    public static void main(String[] args) {
        Conditionals magic8Ball = new Conditionals();
    }

    public Conditionals(){
        String question;
        double randomInt = Math.random();
        System.out.println(randomInt);
        if (randomInt<.1){
            System.out.println("You bet!");
        }else if (randomInt>.1 && randomInt<.2){
            System.out.println("Absolutely not.");
        }else if (randomInt>.2 && randomInt<.3){
            System.out.println("Um...");
        }else if (randomInt>.3 && randomInt<.4){
            System.out.println("You're better off not knowing the answer");
        }else if (randomInt>.4 && randomInt<.5){
            System.out.println("Hopefully!");
        }else if (randomInt>.5 && randomInt<.6){
            System.out.println("Sorry-I've crashed.");
        }else if (randomInt>.6 && randomInt<.7){
            System.out.println("Absolutely");
        }else if (randomInt>.7 && randomInt<.8){
            System.out.println("Sure");
        }else if (randomInt>.8 && randomInt<.9){
            System.out.println("Yes and No");
        }else{
            System.out.println("Yup!");
        }
    }

}
