public class GenericList<T> implements IGenericList<T> {

    private GenericNode<T> root;

    public GenericList(T value) {
        root = new GenericNode();
        root.setValue(value);
        root.setNext(null);
    }

    public void insert(T element) {
        IGenericNode<T> crtNode = root;

        while (crtNode.getNext() != null) {
            crtNode=crtNode.getNext();
        }

        IGenericNode<T> newNode = new GenericNode<T>();
        newNode.setNext(null);
        newNode.setValue(element);
        crtNode.setNext(newNode);

    }

    @Override
    public void println() {
        IGenericNode<T> crtNode = new GenericNode<T>();
        crtNode.setValue(root.getValue());
        crtNode.setNext(root.getNext());
        while (crtNode != null)
        {
            System.out.print(crtNode.getValue() + " ");
            crtNode=crtNode.getNext();
        }
        System.out.println();
    }
}
