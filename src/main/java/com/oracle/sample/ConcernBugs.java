package com.oracle.sample;

public class ConcernBugs {

    /** The place holder. */
    private String placeHolder = null;

    /**
     * The Constructor.
     */
    public ConcernBugs() {
        this.placeHolder = "Test String";
    }

    /**
     * Gets the place holder.
     *
     * @return the place holder
     */
    private String getPlaceHolder(){
        return this.placeHolder;
    }

    @Override
    public boolean equals(Object obj) {
        ConcernBugs object = (ConcernBugs) obj;
        return this.getPlaceHolder().equals(object.getPlaceHolder());
    }
}