package LLD2.DecoratorPattern_FileStorageService;

public abstract class BaseFileDecorator implements FileStorage {

    /**
     * TODO Task 3b - Each decorator will have to call the next decorator in the chain and finally call the raw file storage.
     * To achieve this, you will need to store a reference to the next layer. Add a field that stores the next layer of
     * type {@link LLD2.DecoratorPattern_FileStorageService.FileStorage}.
     */

    protected FileStorage fileStorage;

    public BaseFileDecorator(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

}
