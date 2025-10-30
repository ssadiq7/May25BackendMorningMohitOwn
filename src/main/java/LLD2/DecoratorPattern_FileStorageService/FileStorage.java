package LLD2.DecoratorPattern_FileStorageService;

public interface FileStorage {
    // Task 1a - Add a method storeFile that takes a String fileName and a byte[] content as arguments with no return value
    public void storeFile(byte[] fileData, String fileName);

    // Task 1b - Add a method getFile that takes a String fileName as argument and returns a byte[]
    public byte[] getFile(String fileName);
}
