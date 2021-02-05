/**
 * new interface for credit card payments
 */
public interface ModernPayment{
    /**
     * new pay method
     * @param cardNo card no
     * @param amount amount
     * @param destination destination
     * @param installments installments
     * @return integer amount
     */
    int pay(String cardNo, float amount, String destination, String installments);
}