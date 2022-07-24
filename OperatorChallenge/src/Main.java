public class Main {
    public static void main(String[] args) {
        double dVar1 = 20.00d;
        double dVar2 = 80.00d;
        double dVarT = (dVar1 + dVar2) * 100.00d;

        System.out.println("Double Var Total = " + dVarT);

        double dVarM = dVarT % 40.00d;

        System.out.println("Double Var Modulus = " + dVarM);

        boolean isZero = (dVarM == 0) ? true : false;

        System.out.println(isZero);

        if (!isZero) System.out.println("Got some remainder..");
    }
}