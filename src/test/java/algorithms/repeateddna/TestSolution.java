package algorithms.repeateddna;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestSolution {

    @Test
    void test1() {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Solution solution = new Solution();
        var res = solution.findRepeatedDnaSequences(input);
        assert res.containsAll(List.of("AAAAACCCCC", "CCCCCAAAAA"));
        assert res.size() == 2;
    }

    @Test
    void test2() {
        String input = "AAAAAAAAAAAAA";
        Solution solution = new Solution();
        var res = solution.findRepeatedDnaSequences(input);
        assert res.contains("AAAAAAAAAA");
        assert res.size() == 1;
    }

    @Test
    void test3() {
        String input = "AAAAAAAAAAA";
        Solution solution = new Solution();
        var res = solution.findRepeatedDnaSequences(input);
        assert res.contains("AAAAAAAAAA");
        assert res.size() == 1;
    }

    @Test
    void test4() throws IOException {
        String input = Files.readString(
                Path.of(getPathFromTestResources("algorithms/repeateddna/hugeinput.txt")));

        Solution solution = new Solution();
        var res = solution.findRepeatedDnaSequences(input);
        assert res.size() != 0;
    }

    private String getPathFromTestResources(String fileName) {
        Path resourceDirectory = Paths.get("src", "test", "resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        return absolutePath.concat(File.separator).concat(fileName);
    }
}
