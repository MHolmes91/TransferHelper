package markholm.es.transferhelper.model;

import java.util.SortedSet;

public class Allocation {
    private SortedSet<AllocationPart> allocationParts;
    private double allocationTotal;

    public Allocation(SortedSet<AllocationPart> allocationParts){
        this.allocationParts = allocationParts;
    }

    private void setAllocationTotal(){
        this.allocationTotal = this.allocationParts.stream()
                .mapToDouble(AllocationPart::getAllocationPartShare)
                .sum();
    }

    public SortedSet<AllocationPart> getAllocationParts() {
        return allocationParts;
    }

    public void setAllocationParts(SortedSet<AllocationPart> allocationParts) {
        this.allocationParts = allocationParts;
        setAllocationTotal();
    }

    public void addAllocationPart(AllocationPart allocationPart){
        this.allocationParts.add(allocationPart);
        this.allocationTotal += allocationPart.getAllocationPartShare();
    }

    public double getAllocationTotal() {
        return allocationTotal;
    }

    public void setAllocationTotal(double allocationTotal) {
        this.allocationTotal = allocationTotal;
    }
}
