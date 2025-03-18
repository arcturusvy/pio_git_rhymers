package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int CountOut() {
        while (!callCheck())
            temp.CountIn(super.CountOut());

        int ret = temp.CountOut();

        while (!temp.callCheck())
            CountIn(temp.CountOut());

        return ret;
    }
}
