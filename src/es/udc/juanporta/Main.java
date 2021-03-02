package es.udc.juanporta;

import java.util.Scanner;

public class Main {

    private static final String[] OPERATIONS = new String[]{"1. Suma"};

    public static void main(String[] args) {

        System.out.println("Selecciona una operación");
        for (String operation : OPERATIONS) {
            System.out.println("\t" + operation);
        }
        Scanner sc = new Scanner(System.in);
        String operationId = sc.nextLine();
        switch (operationId) {
            case "1":
                System.out.println("Inserte primer sumando");
                String a = sc.nextLine();
                System.out.println("Inserte segundo sumando");
                String b = sc.nextLine();
                try {
                    System.out.println("Resultado: " + new AddOperation().add(Float.parseFloat(a), Float.parseFloat(b)));
                } catch (NumberFormatException e) {
                    System.out.println("Ains... mete un número porfi... ఠ_ఠ");
                }
                break;
            default:
                System.out.println("Operación no encontrada ¯\\_(ツ)_/¯");
        }

    }
}
