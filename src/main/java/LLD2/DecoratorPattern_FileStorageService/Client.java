package LLD2.DecoratorPattern_FileStorageService;

public class Client {

    public static void main(String[] args) {
        // This demonstrates the use of Decorator Pattern

        // To store a file just like that
        FileStorage fileStorage = new RawFileStorage();

        // To compress and store
        FileStorage compressedFileStorage = new CompressionDecorator(fileStorage);
        // To virus scan the compressed file (actually, we should first scan and then compress)
        FileStorage virusScannedCompressedFileStorage = new VirusScanningDecorator(compressedFileStorage);
        /**************************************Or**************************************/
        FileStorage compressedVirusScannedFileStorage = new CompressionDecorator(new VirusScanningDecorator(fileStorage));

    }

}
