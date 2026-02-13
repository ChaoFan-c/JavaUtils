private static int readPositiveInt(Scanner sc, String prompt) {
    while (true) {
        System.out.println(prompt);
        String line = sc.nextLine();

        try {
            int n = Integer.parseInt(line.replaceAll(" ", ""));
            if (n > 0) {
                return n;
            }
            else {
                System.out.println("输入的数字必须大于0，请重新输入");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("输入的数字必须为正整数，请重新输入");
        }
    }
}
