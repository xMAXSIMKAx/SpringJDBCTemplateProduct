package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductCreateView {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String title = "Input name: ";
        System.out.print(title);
        String name = scanner.nextLine().trim();

        String quota = "";
        while (true) {
            title = "Input quota format {0-9}: ";
            System.out.print(title);
            quota = scanner.nextLine().trim();
            if (quota.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid quota format. Please enter a valid number.");
            }
        }

        String price = "";
        while (true) {
            title = "Input price format {0-9} or {0-9,0-9}: ";
            System.out.print(title);
            price = scanner.nextLine().trim();
            if (price.matches("\\d+([,\\.]\\d+)?")) {
                price = price.replace(",", ".");
                break;
            } else {
                System.out.println("Invalid price format. Please enter a valid number (e.g., 10 or 10.0).");
            }
        }

        return new String[]{name, quota, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
