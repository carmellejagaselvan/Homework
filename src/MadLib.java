public class MadLib {

    public String classmate = "Sasha";
    public String city = "New York";
    public String noun = "laptop";
    public String adjective = "sad";
    public String pluralNoun = "hot air balloons";
    public String pluralAnimal = "grasshoppers";
    public boolean trueOrFalse = true;
    public double decimalBiggerThan1 = 1.5;
    public int number1 = 5;
    public int number2 = 6;
    public int wholeNumberBetween1And4 = 2;
    public String miltonTeacher = "Dr. Diaz";
    public String miltonDean = "Mr. Ruiz";
    public String letterGrade = "A";
    public String season = "spring";

    public static void main(String[] args){
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }

    public MadLib(){
        System.out.println("hello world");


        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "+ in Math class.";

//now print story to the dos window
        System.out.println(story);

    }
}
