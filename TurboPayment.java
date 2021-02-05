/**
 * old interface for credit card payments
 */
public interface TurboPayment{
    /**
     * old pay method (turbo)
     * @param turboCardNo turbo card no
     * @param turboAmount turbo amount
     * @param destinationTurboOfCourse destination Turbo of course
     * @param installmentsButInTurbo installments But In Turbo
     * @return integer amount
     */
    int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}


