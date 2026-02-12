    private static int readPositiveInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                int n = Integer.parseInt(line.trim());
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("输入错误：请输入大于0的整数。");
                }
            } catch (NumberFormatException e) {
                System.out.println("输入错误：请输入有效的整数。");
            }
        }
    }
}
