package factory;

import sun.awt.geom.AreaOp;

import javax.swing.*;

/**
 * @author Lzs
 * @date 2021/10/31 20:32
 * @description
 */
public class SimpleFactory {
    public static Operation createOperation(String type) {
        Operation operation;
        switch (type) {
            case "+":
                operation = new PlusOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            default:
                operation = null;
                break;
        }
        return operation;
    }
}