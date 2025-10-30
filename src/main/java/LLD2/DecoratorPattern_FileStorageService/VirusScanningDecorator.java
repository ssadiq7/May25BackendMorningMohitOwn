package LLD2.DecoratorPattern_FileStorageService;

import LLD2.DecoratorPattern_FileStorageService.utils.StorageUtils;
import LLD2.DecoratorPattern_FileStorageService.utils.VirusDetectedException;

/**
 * TODO Task 4b - Extend the {@link BaseFileDecorator} interface to scan the file content for viruses before storing and reading the file content.
 * Remember
 * 1. When you inherit from the {@link BaseFileDecorator}, you will have to implement the store and read methods.
 * 2. You will also need to call the next layer in the chain while reading and writing the file content.
 * 3. Each decorator would also need a constructor that takes the next layer of type {@link FileStorage}.
 */

public class VirusScanningDecorator extends BaseFileDecorator {

    // For storing and fetching
    private final FileStorage fileStorage;

    public VirusScanningDecorator(FileStorage fileStorage) {
        // Send to super for further processing (if any)
        super(fileStorage);
        // Keep it here for compression processing
        this.fileStorage = fileStorage;
    }

    @Override
    public void storeFile(byte[] fileData, String fileName) {
        // Scan for virus and store
        boolean hasVirus = StorageUtils.scanForVirus(fileData);
        if (hasVirus) {
            throw new VirusDetectedException("Virus detected in file: " + fileName);
        }
        // Store the data
        fileStorage.storeFile(fileData,  fileName);
    }

    @Override
    public byte[] getFile(String fileName) {
        // Get the file, scan and return
        byte[] data = fileStorage.getFile(fileName);
        if (data == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        }

        // Scan the data for viruses
        boolean hasVirus = StorageUtils.scanForVirus(data);
        if (hasVirus) {
            throw new VirusDetectedException("Virus detected in file: " + fileName);
        }

        return data;
    }
}
