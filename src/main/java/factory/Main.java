package factory;

import java.text.SimpleDateFormat;

/**
 * @author Lzs
 * @date 2021/10/31 20:37
 * @description
 */
public class Main {
    public static void main(String[] args) {
        OperationFactory operationFactory = new PlusOperationFactory();
        Operation plusOperation = operationFactory.getOperation();

        System.out.println(plusOperation.getResult(1, 1));
    }
}