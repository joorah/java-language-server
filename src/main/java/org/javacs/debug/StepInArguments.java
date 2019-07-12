package org.javacs.debug;

/** Arguments for 'stepIn' request. */
public class StepInArguments {
    /** Execute 'stepIn' for this thread. */
    public int threadId;
    /** Optional id of the target to step into. */
    public Integer targetId;
}