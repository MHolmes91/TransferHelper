package markholm.es.transferhelper.calculator;

import markholm.es.transferhelper.model.Allocation;
/*Todo Create*/
public class TransferCalculator {
    private Allocation start;
    private Allocation end;

    public TransferCalculator(Allocation start, Allocation end) throws ArithmeticException {
        if(start.getAllocationTotal() != end.getAllocationTotal()){
            throw new ArithmeticException("Start and End allocation totals must be equal");
        }

        this.start = start;
        this.end = end;
    }

    public void calculateTransfers(){
        int lol = 1+1;
    }

    public Allocation getStart() {
        return start;
    }

    public Allocation getEnd() {
        return end;
    }
}
