package algorithms.containerwithmostwater;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class InputData {
    public int[] getHugeInput() throws IOException {
        int[] str = Arrays.stream(
                Files.readString(
                    Path.of(getPathFromTestResources("algorithms/containerwithmostwater/huge_ebala.txt")))
                .replaceAll("[\\[\\]]", "")
                .split(","))
                .mapToInt(Integer::valueOf)
                .toArray();

        return str;
    }

    private String getPathFromTestResources(String fileName) {
        Path resourceDirectory = Paths.get("resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        return absolutePath.concat(File.separator).concat(fileName);
    }
}
