package cpu.instructions;

import cpu.CPU;

public interface Instruction {
    /**
     * Executes the instruction on the given CPU.
     *
     * @param cpu The CPU on which the instruction will be executed.
     */

    void execute(CPU cpu);
}