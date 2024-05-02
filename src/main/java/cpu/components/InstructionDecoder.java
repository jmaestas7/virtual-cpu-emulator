package cpu.components;

import cpu.instructions.AddInstruction;
import cpu.instructions.Instruction;
import cpu.instructions.LoadInstruction;

public class InstructionDecoder {
    public Instruction decode(int opcode, int[] operands) {
        switch (opcode) {
            case 0x00:
                // Decode ADD instruction
                return new AddInstruction(operands[0], operands[1], operands[2]);
            case 0x01:
                // Decode LOAD instruction
                return new LoadInstruction(operands[0], operands[1]);
            // Add cases for other opcodes and instructions
            default:
                throw new IllegalArgumentException("Unsupported opcode: " + opcode);
        }
    }
}
