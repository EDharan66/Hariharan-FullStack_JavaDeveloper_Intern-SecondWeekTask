package ChainOfResposibility;

public class Rs100Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 100){
            int num = cur.getAmount()/100;
            int remainder = cur.getAmount() % 100;
            System.out.println("Dispensing "+num+" Rs.100 note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}