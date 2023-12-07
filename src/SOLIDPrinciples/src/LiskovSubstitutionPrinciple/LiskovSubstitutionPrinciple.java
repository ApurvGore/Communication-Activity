package LiskovSubstitutionPrinciple;

// Bad Example
class Pen {
    public void write() {
        System.out.println("A LiskovSubstitutionPrinciple.Pen can write");
    }
    public boolean isSafeForAirTravel() {
        return true;
    }
}

class FountainPen extends Pen{
    @Override
    public void write() {
        System.out.println("A LiskovSubstitutionPrinciple.FountainPen can also write");
    }

    @Override
    public boolean isSafeForAirTravel() {
        return false;
    }
}

class BallPointPen extends Pen {
    @Override
    public void write() {
        System.out.println("A LiskovSubstitutionPrinciple.BallPointPen can also write");
    }
    public boolean isSafeForAirTravel() {
        return true;
    }
}

// Good example
//class Pen {
//    public void write() {
//        System.out.println("A LiskovSubstitutionPrinciple.Pen can write");
//    }
//}
//
//interface AirTravel {
//    public boolean isSafeForAirTravel();
//}
//
//class FountainPen extends Pen /* implements LiskovSubstitutionPrinciple.AirTravel */{
//    @Override
//    public void write() {
//        System.out.println("A LiskovSubstitutionPrinciple.FountainPen can also write");
//    }
//}
//
//class BallPointPen extends Pen implements AirTravel{
//    @Override
//    public void write() {
//        System.out.println("A LiskovSubstitutionPrinciple.BallPointPen can also write");
//    }
//
//    @Override
//    public boolean isSafeForAirTravel() {
//        return true;
//    }
//}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {

    }
}

