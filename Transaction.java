public class Transaction implements Bank{


    @Override
    public int debit(int bal, int amt) {
        return bal - amt;
    }

    @Override
    public int credit(int bal, int amt) {
        return bal + amt;
    }
}
