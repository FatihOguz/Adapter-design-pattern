/**
 * this class implements ModernPayment interface
 */
public class Modern implements ModernPayment {
    /**
     * new pay method
     * @param cardNo card no
     * @param amount amount
     * @param destination destination
     * @param installments installments
     * @return integer amount
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("MODERN PAYMENT");
        return (int) amount;
    }
}
