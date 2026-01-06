

import java.nio.file.*;

 class WatchServiceDemo {

    public static void main(String[] args) throws Exception {

        Path path = Paths.get("PayrollDirectory");
        WatchService watchService = FileSystems.getDefault().newWatchService();

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        System.out.println("Watching directory...");

        WatchKey key = watchService.take();
        for (WatchEvent<?> event : key.pollEvents()) {
            System.out.println("Event: " + event.kind() + " -> " + event.context());
        }
        key.reset();
    }
}
