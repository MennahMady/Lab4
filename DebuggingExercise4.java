public class DebuggingExercise4{
public static void main(String[] args)
{
    Account a = new Account("manuna");
    a.deposit(100);
    System.out.println(a.getOwner() + " has $" + a.getBalance());
    try {
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }}
}