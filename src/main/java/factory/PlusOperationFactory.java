package factory;

/**
 * @author Lzs
 * @date 2021/10/31 20:59
 * @description
 */
public class PlusOperationFactory implements OperationFactory{
    @Override
    public Operation getOperation() {
        return new PlusOperation();
    }
}