package demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class IsolationTest {

    @Test
    void forbiddenFolderIsHidden() {
        assertFalse(Files.exists(Path.of("secrets/cle.txt")), "secrets/cle.txt est lisible : pas d'isolation");
    }

    @Test
    void hostPasswordFileIsNotVisible() {
        assertFalse(Files.exists(Path.of("/etc/passwd")), "/etc/passwd est visible : pas d'isolation");
    }

    @Test
    void hostProjectFolderIsNotVisible() {
        assertFalse(Files.exists(Path.of("/home/popat/reviewbot")), "le projet ReviewBot de l'hôte est visible");
    }

    @Test
    void cannotWriteOutsideTheWorkDirectory() {
        assertThrows(IOException.class, () -> Files.writeString(Path.of("/etc/pirate.txt"), "x"));
    }
}