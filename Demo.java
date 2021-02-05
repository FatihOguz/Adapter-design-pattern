/**
 * Show the operation of the adapter class and method calls of classes that depend on 2 interfaces separately
 */
public class Demo {
    /**
     * static main method
     * @param args args
     */
    public static void main(String[] args){
        /**
         * Modern class implements modernPayment interface
         */
        Modern modern = new Modern();
        /**
         * Turbo class implements TurboPayment interface
         */
        Turbo turbo = new Turbo();
        /**
         * modernPaymentAdapter class implements TurboPayment interface
         */
        TurboPayment modernPaymentAdapter = new ModernPaymentAdapter(modern);
        System.out.println("*************************************************************************************");
        modern.pay("cardNo",123,"destination" ,"instalments");
        System.out.println("*************************************************************************************");
        turbo.payInTurbo("cardNo",895,"destination" ,"instalments");
        System.out.println("*************************************************************************************");
        modernPaymentAdapter.payInTurbo("cardNo",139,"destination" ,"instalments");
        System.out.println("*************************************************************************************");

    }
}
