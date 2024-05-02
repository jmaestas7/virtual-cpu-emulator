package cpu.instructions;

import cpu.CPU;

public class LoadInstruction implements Instruction {
    private int destinationRegister; // Destination register
    private int memoryAddress;       // Memory address to load from

    // Constructor to initialize the load instruction with destination register and memory address
    public LoadInstruction(int destinationRegister, int memoryAddress) {
        this.destinationRegister = destinationRegister;
        this.memoryAddress = memoryAddress;
    }

    @Override
    public void execute(CPU cpu) {
        // Retrieve the value from memory at the specified address
        int loadedValue = cpu.getMemory().read(memoryAddress);

        // Store the loaded value into the destination register
        cpu.getRegisters()[destinationRegister] = loadedValue;

        // Increment the program counter to move to the next instruction
        cpu.incrementProgramCounter();
    }
}
