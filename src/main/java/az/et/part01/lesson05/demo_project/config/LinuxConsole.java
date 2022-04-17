package az.et.part01.lesson05.demo_project.config;

import java.util.Scanner;

public class LinuxConsole implements Console {
    private final Scanner scanner;

    public LinuxConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void print(String message) {
        System.out.print(message);
    }

    @Override
    public void printLn(String line) {
        System.out.println(line);
    }

    @Override
    public String readLn() {
        return scanner.nextLine();
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }
}
