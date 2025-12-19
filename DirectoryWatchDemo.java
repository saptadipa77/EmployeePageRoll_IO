import java.io.IOException;
import java.nio.file.*;

public class DirectoryWatchDemo {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Java's WatchService (NO CASTING)
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Watch current directory
        Path path = Paths.get("./src");

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE
        );

        System.out.println("Watching directory for changes...");

        while (true) {
            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event: " + event.kind()
                        + " | File: " + event.context());
            }

            key.reset();
        }
    }
}
