/**
 * this class implements TurboPayment
 */
public class Turbo implements TurboPayment {
    /**
     * old pay method (turbo )
     * @param turboCardNo turbo card no
     * @param turboAmount turbo amount
     * @param destinationTurboOfCourse destination Turbo of course
     * @param installmentsButInTurbo installments But In Turbo
     * @return integer turbo amount
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("TURBO PAYMENT");
        return (int) turboAmount;
    }
}
