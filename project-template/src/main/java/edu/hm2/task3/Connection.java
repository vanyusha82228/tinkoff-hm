package edu.hm2.task3;

public interface Connection extends AutoCloseable {
    void execute(String command);

    @Override
    void close();

}
