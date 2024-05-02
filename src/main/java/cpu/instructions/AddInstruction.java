package cpu.instructions;

import cpu.CPU;

public class AddInstruction implements Instruction {
    private int destinationRegister;
    private int sourceRegister1;
    private int sourceRegister2;

    // Constructor to initialize the instruction with specific operands
    public AddInstruction(int destinationRegister, int sourceRegister1, int sourceRegister2) {
        this.destinationRegister = destinationRegister;
        this.sourceRegister1 = sourceRegister1;
        this.sourceRegister2 = sourceRegister2;
    }

    @Override
    public void execute(CPU cpu) {
        // Perform the addition operation: Rdest = Rsrc1 + Rsrc2
        int value1 = cpu.getRegister(sourceRegister1);
        int value2 = cpu.getRegister(sourceRegister2);
        int result = value1 + value2;

        // Store the result in the destination register
        cpu.setRegister(destinationRegister, result);

        // Increment the program counter to move to the next instruction
        cpu.incrementProgramCounter();
    }
}