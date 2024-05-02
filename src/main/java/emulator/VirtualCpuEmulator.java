package emulator;

import cpu.CPU;

public class VirtualCpuEmulator {
    public static void main(String[] args) {
        CPU cpu = new CPU();

        // Example machine code: ADD R1, R2, R3 (opcode: 0x00, operands: [1, 2, 3])
        int opcode = 0x00;
        int[] operands = {1, 2, 3};

        cpu.executeInstruction(opcode, operands);

        // After execution, check register values or other CPU state
        System.out.println("Value in R1: " + cpu.getRegister(1)); // Expected result: R1 = R2 + R3
    }
}
