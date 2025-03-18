package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int CountOut() {
        while (!CallCheck())
            temp.CountIn(super.CountOut());

        int ret = temp.CountOut();

        while (!temp.CallCheck())
            CountIn(temp.CountOut());

        return ret;
    }
}
