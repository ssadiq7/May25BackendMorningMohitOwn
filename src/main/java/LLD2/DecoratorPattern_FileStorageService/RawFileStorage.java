package LLD2.DecoratorPattern_FileStorageService;

import LLD2.DecoratorPattern_FileStorageService.utils.StorageUtils;

/**
 * TODO: Task 2 - Implement the FileStorage interface to simply store and get the raw file content.
 * Methods you can use (Add link to StorageUtils#store and StorageUtils#read):
 * 1. {@link LLD2.DecoratorPattern_FileStorageService.utils.StorageUtils#read(String)}
 * 2. {@link LLD2.DecoratorPattern_FileStorageService.utils.StorageUtils#store(String, byte[])}
 */
public class RawFileStorage implements FileStorage {

    @Override
    public void storeFile(byte[] fileData, String fileName) {
        // Simply store the file
        StorageUtils.store(fileName, fileData);
    }

    @Override
    public byte[] getFile(String fileName) {
        // Simply fetch and return the file
        return StorageUtils.read(fileName);
    }

}
