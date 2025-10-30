package LLD2.DecoratorPattern_FileStorageService;

import LLD2.DecoratorPattern_FileStorageService.utils.StorageUtils;

/**
 * TODO Task 4a - Extend the {@link LLD2.DecoratorPattern_FileStorageService.BaseFileDecorator} interface to compress and decompress the file content.
 * Remember
 * 1. When you inherit from the {@link LLD2.DecoratorPattern_FileStorageService.BaseFileDecorator}, you will have to implement the store and read methods.
 * 2. You will also need to call the next layer in the chain while reading and writing the file content.
 * 3. Each decorator would also need a constructor that takes the next layer of type {@link LLD2.DecoratorPattern_FileStorageService.FileStorage}.
 */

public class CompressionDecorator extends BaseFileDecorator {

    private final FileStorage fileStorage;

    public CompressionDecorator(FileStorage fileStorage) {
        // Send to super for further processing (if any)
        super(fileStorage);
        // Keep it here for compression processing
        this.fileStorage = fileStorage;
    }

    @Override
    public void storeFile(byte[] fileData, String fileName) {
        // Compress the file and store
        byte[] compressedFileData = StorageUtils.compress(fileData);
        fileStorage.storeFile(compressedFileData, fileName);
    }

    @Override
    public byte[] getFile(String fileName) {
        // Fetch the file, uncompress and return
        byte[] compressedFileData = fileStorage.getFile(fileName);
        return StorageUtils.decompress(compressedFileData);
    }

}
