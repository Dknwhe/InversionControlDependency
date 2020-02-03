package se.ecutb.cai.Input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public class ScannerInputService implements UserInputService{



    public Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.println("It Works...");
        return null;
    }

    @Override
    public int getInt() {
        System.out.println("Number..");
        return 0;
    }
}
