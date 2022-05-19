import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] number = inputLine.split(" ");
        if (number.length < 3) {
            System.out.println("Неверный формат ввода данных.Вводите через пробел,например : 1 + 1 ");
        }
        else if(number.length > 3){
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        else {
            try {
                int firstArabNumber = Integer.parseInt(number[0]);
                int secondArabNumber = Integer.parseInt(number[2]);
                int arabResult;
                if (((firstArabNumber > 0 && firstArabNumber < 11) && (secondArabNumber > 0 && secondArabNumber < 11)))
                    switch (number[1]) {
                        case "+" -> {
                            arabResult = firstArabNumber + secondArabNumber;
                            System.out.println("Ответ: " + arabResult);

                        }
                        case "-" -> {
                            arabResult = firstArabNumber - secondArabNumber;
                            System.out.println("Ответ: " + arabResult);
                        }
                        case "/" -> {
                            arabResult = firstArabNumber / secondArabNumber;
                            System.out.println("Ответ: " + arabResult);
                        }
                        case "*" -> {
                            arabResult = firstArabNumber * secondArabNumber;
                            System.out.println("Ответ: " + arabResult);
                        }
                    }
                else {
                    System.out.println("Значение арабских чисел может быть только от 1 до 10 включительно");
                }
            } catch (Exception e) {
                String firstRomanNumber1 = number[0];
                String secondRomanNumber2 = number[2];
                int romResult;
                int firstNumber = rom_convert(firstRomanNumber1);
                int secondNumber = rom_convert(secondRomanNumber2);
                if (firstNumber != 0 && secondNumber != 0) {
                    switch (number[1]) {
                        case "+" -> {
                            romResult = firstNumber + secondNumber;
                            System.out.println("Ответ: " + convert_to_romain(romResult));
                        }
                        case "-" -> {
                            romResult = firstNumber - secondNumber;
                            if (romResult <= 0) {
                                System.out.println("В римской системе нет отрицательных чисел и нуля!");
                            } else {
                                System.out.println("Ответ: " + convert_to_romain(romResult));
                            }
                        }
                        case "/" -> {
                            romResult = firstNumber / secondNumber;
                            System.out.println("Ответ: " + convert_to_romain(romResult));
                        }
                        case "*" -> {
                            romResult = firstNumber * secondNumber;
                            System.out.println("Ответ: " + convert_to_romain(romResult));
                        }
                    }
                } else {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления!");
                }

            }
        }

    }
         static int rom_convert (String RomConvert){
            return switch (RomConvert) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "IV" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
                default -> 0;
            };
        }


        static String convert_to_romain ( int result) {
            String[] roman_number = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                    "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                    "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
                    "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            return roman_number[result];

        }

    }

