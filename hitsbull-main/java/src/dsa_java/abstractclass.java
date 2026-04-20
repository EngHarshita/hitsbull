package dsa_java;
abstract class Account {
    String AccountHolder;
    int PrincipalAmt;

    Account(String AccountHolder, int PrincipalAmt) {
        this.AccountHolder = AccountHolder;
        this.PrincipalAmt = PrincipalAmt;
    }

    abstract double calculateInterest();
}

class FixDeposit extends Account {
    int RateOfInterest;
    int Duration;

    FixDeposit(String AccountHolder, int PrincipalAmt, int RateOfInterest, int Duration) {
        super(AccountHolder, PrincipalAmt);
        this.RateOfInterest = RateOfInterest;
        this.Duration = Duration;
    }

    double calculateInterest() {
        return (PrincipalAmt * RateOfInterest * Duration) / 100;
    }
}

class RecurringDeposit extends Account {
    int MaturityAmt;
    int Duration;
    int RateOfInterest;
    int MonthlyDeposit;

    RecurringDeposit(String AccountHolder, int PrincipalAmt, int Duration, int RateOfInterest, int MonthlyDeposit) {
        super(AccountHolder, PrincipalAmt);
        this.Duration = Duration;
        this.RateOfInterest = RateOfInterest;
        this.MonthlyDeposit = MonthlyDeposit;
        this.MaturityAmt = MonthlyDeposit * Duration;
    }

    double calculateInterest() {
        return (MaturityAmt * Duration * RateOfInterest) / 1200;
    }
}

class abstractclass {
    public static void main(String[] args) {
        FixDeposit cus1 = new FixDeposit("Vishal", 1000, 12, 12);
        System.out.println(cus1.calculateInterest());

        RecurringDeposit cus2 = new RecurringDeposit("Chaman", 1000, 12, 12, 100);
        System.out.println(cus2.calculateInterest());
    }
}


    //public class abstractclass
    //public static void main (String[] args){




//public class Studentclass {
//    public static class student{ //creating a new data type
//       String name;
//        int rollno;
//        double percentage;
//
//    }
//    public static void change(student s){
//        s.name="rohan";
//    }
//    public int getRollno(){ //getter
//        return rollno;
//    }
//    public void setRollno(int roll){//setter
//        rollno=roll;
//    }
//    public static void main(String[] args){
//        student s1=new student(); //declaration
//        s1.name="harshita";
//        // s1.rollno=2341561;
//        s1.percentage=8.9;
//        s1.setRollno(67);
//        System.out.println(s1.getRollno());
//    }
//}
