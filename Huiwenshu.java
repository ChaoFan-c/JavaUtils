private static boolean isHuiwenshu(String result) {
        int length = result.length();

        for(int i = 0; i < length / 2; i++){
            if(result.charAt(i) != result.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
