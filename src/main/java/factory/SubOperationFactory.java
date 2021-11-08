package factory;

/**
 * @author Lzs
 * @date 2021/10/31 21:01
 * @description
 */
public class SubOperationFactory implements OperationFactory {
    @Override
    public Operation getOperation() {
        return new SubOperation();
    }
}