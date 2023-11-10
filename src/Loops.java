public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }
    public Loops(){
        countUp();
        countByThrees();
        System.out.println();
        countDown();
    }
    public void countUp(){
        for(int x=1;x<=5;x=x+1){
            System.out.println(x);
        }
    }

    public void countByThrees(){
        for(int x=3;x<=15;x=x+3){
            System.out.print(x+" ");
        }
    }

    public void countDown(){
        for(int x=10;x>=1;x=x-1){
            if(x>1){
                System.out.print(x+ ", ");
            }else if(x<=1){
                System.out.print(x);
            }
        }
        System.out.println();
        System.out.println("Happy Loop Year!");

    }

}
