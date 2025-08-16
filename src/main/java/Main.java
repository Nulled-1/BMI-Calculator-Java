import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Height : ");


        double Height = input.nextDouble();
        System.out.println("Please Enter Your Weight : ");

        double Weight  = input.nextDouble();



        double result =  Weight / (Height * Height);
        if (result < 18.5){
            System.out.println("Your BMI Is " + result + " And Based On The Calculated BMI You Have (Underweight)");
        } else if (result  >= 18.5 && result <= 24.9) {
            System.out.println("Your BMI Is " + result + " And Based On The Calculated BMI You Have (Normal Weight)");
        }else if (result  >= 25.0 && result <= 29.9) {
            System.out.println("Your BMI Is " + result + " And Based On The Calculated BMI You Have (Overweight)");
        }else{
            System.out.println("Your BMI Is " + result + " And Based On The Calculated BMI You Have (Obese)");
        }



        // Your BMI Is 24.89 , And Based On The Calculated BMI You Have







    }
}
