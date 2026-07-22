package com.ontariotechu.sofe3980U;

public class BinaryAPIResult {

    private int operand1;
    private String operator;
    private int operand2;
    private int result;

    public BinaryAPIResult(Binary operand1,
            String operator,
            Binary operand2,
            Binary result) {

        this.operand1 = Integer.parseInt(operand1.getValue());
        this.operator = operator;
        this.operand2 = Integer.parseInt(operand2.getValue());

        this.result = Integer.parseInt(result.getValue());

    }

    public int getOperand1() {
        return operand1;
    }

    public String getOperator() {
        return operator;
    }

    public int getOperand2() {
        return operand2;
    }

    public int getResult() {
        return result;
    }
}