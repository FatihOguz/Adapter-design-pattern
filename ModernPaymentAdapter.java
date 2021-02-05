/**
 * this class adapt turbo  payout to modern payout.
 * This class includes the modernPayment and applies the turbo interface.
 * The two interfaces have methods with the same signature and duties.
 *
 */

public class ModernPaymentAdapter implements TurboPayment{
    /**
     * this field is ModernPayment interface
     */
    private ModernPayment modernPayment;

    /**
     * constructor do adapt turbo to modern
     * @param modernPayment is modernPayment interface
     */
    public ModernPaymentAdapter(ModernPayment modernPayment){
        this.modernPayment=modernPayment;
    }

    /**
     * this method calls pay method
     * pay method belongs to the modern interface
     * @param turboCardNo turbo card no
     * @param turboAmount turbo amount
     * @param destinationTurboOfCourse destination Turbo of course
     * @param installmentsButInTurbo installments But In Turbo
     * @return integer amount
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("MODERN PAYMENT ADAPTER");
        return modernPayment.pay(turboCardNo, turboAmount,destinationTurboOfCourse,installmentsButInTurbo);
    }
}
