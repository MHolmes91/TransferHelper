package markholm.es.transferhelper.model;

import java.util.Comparator;

public class AllocationPart implements Comparator<AllocationPart>, Comparable<AllocationPart> {
    private final String allocationPartName;
    private final double allocationPartShare;

    public AllocationPart(String allocationPartName, double allocationPartShare) {
        this.allocationPartName = allocationPartName;
        this.allocationPartShare = allocationPartShare;
    }

    @Override
    public String toString() {
        return allocationPartName + " - " + allocationPartShare;
    }

    public int compareTo(AllocationPart that){
        if(this.equals(that))
            return 0;
        else if(this.allocationPartShare != that.allocationPartShare)
            return  this.allocationPartShare > that.allocationPartShare ? 1 : -1;
        else
            return this.allocationPartName.compareTo(that.allocationPartName);
    }

    public int compare(AllocationPart foo, AllocationPart bar){
        return foo.compareTo(bar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllocationPart that = (AllocationPart) o;

        if (Double.compare(that.allocationPartShare, allocationPartShare) != 0) return false;
        return allocationPartName.equals(that.allocationPartName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = allocationPartName.hashCode();
        temp = Double.doubleToLongBits(allocationPartShare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getAllocationPartName() {
        return allocationPartName;
    }

    public double getAllocationPartShare() {
        return allocationPartShare;
    }
}
