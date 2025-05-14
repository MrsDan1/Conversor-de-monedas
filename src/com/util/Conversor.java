package com.util;

import com.exception.ConversorException;
import com.model.Money;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Conversor {

    public static void ejecute()  {
        List<Money> historial = new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        boolean salida=false;
        System.out.println("\nBienvenido al conversor de Monedas");

        while (!salida) {

            System.out.println("\n1) Ver todas las monedas disponibles");
            System.out.println("\n2) Convertir tu moneda");
            System.out.println("\n3) Salir");
            try {
                System.out.print("\nElige una opción: ");
                int eleccion = lectura.nextInt();
                lectura.nextLine();

                switch (eleccion) {
                    case 1:
                        System.out.println("Monedas disponibles");
                        Bussineslogic.mostrarMap();
                        break;
                    case 2:

                        try {
                            System.out.println("Nombre de la moneda base ");
                            String money_base = lectura.nextLine().trim().toUpperCase(); // limpio y uniforme

                            System.out.println("Convertir a");
                            String money_conversor = lectura.nextLine().trim().toUpperCase();

                            System.out.println("Monto");
                            int valor_join = Integer.parseInt(lectura.nextLine()); // ← mejor que usar nextInt directamente

                            // Validaciones básicas
                            if (valor_join <= 0) {
                                throw new ConversorException("El monto debe ser mayor que cero.\n");
                            }

                            Money result = Bussineslogic.conversor_money(money_base, money_conversor, valor_join);
                            if (result == null) {
                                System.out.println("Moneda mal escrita, porfavor intenta nuevamente\n");
                            } else {
                                System.out.println(result);
                                historial.add(result);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ingresa un monto válido.\n");
                        } catch (Exception e) {
                            System.out.println(" Error inesperado: " + e.getMessage());
                        }
                        break;
                        //CASO 3
                    case 3:
                        System.out.println("Hasta pronto ");
                        salida = true;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número válido.\n");
                lectura.nextLine(); // limpiar entrada inválida
            }
        }
    }
}
