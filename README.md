# Adapter-design-pattern

QUESTION:

After long hours at work you have finally completed the new java
interface for credit card payments:
public interface ModernPayment{
int pay(String cardNo, float amount, String destination, String installments);
}
However your company is still using extensively an old binary library from the 1990s called
“TurboPayment” for card payments that it cannot afford to replace. “TurboPayment”’s
interface looks like this:
public interface TurboPayment{
int payInTurbo(String turboCardNo, float turboAmount,
String destinationTurboOfCourse, String installmentsButInTurbo);
}
Where all the method parameters have the same meaning and role as in ModernPayment.
Implement in Java a design pattern so that you can continue using all the classes
implementing the TurboPayment interface with your new ModernPayment interface. Don’t
forget that the old library is binary, so you cannot modify the interface TurboPayment or the
classes that implement it.




REPORT:


I use adapter pattern. ModernPayment and TurboPayment interfaces have
method same signature and duties. The adapter class is required for the classes
derived from the previously prepared turboPayment interface and come from our
new interface to be stored in the same data structures.
