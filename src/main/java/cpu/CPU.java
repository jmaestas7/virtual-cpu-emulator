package cpu;

import cpu.components.InstructionDecoder;
import cpu.instructions.Instruction;

public class CPU {
    private int[] registers = new int[8]; // General-purpose registers
    private int programCounter = 0;
    // Add memory and other CPU state variables as needed

    public void executeInstruction(int opcode, int[] operands) {
        InstructionDecoder decoder = new InstructionDecoder();
        Instruction instruction = decoder.decode(opcode, operands);
        instruction.execute(this); // Execute the decoded instruction
    }

    // Methods to access and modify CPU state (registers, memory, program counter, etc.)
    public int getRegister(int reg) {
        return registers[reg];
    }

    public void setRegister(int reg, int value) {
        registers[reg] = value;
    }

    public void incrementProgramCounter() {
        programCounter++;
    }
}