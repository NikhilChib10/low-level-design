package structural_design_patterns.decorator_pattern;

public interface DataSource {
    void writeData(String data);

    String readData();
}
