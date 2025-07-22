class Letter CombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        int n = digits.length();
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> result = toList(dict.get(digits.charAt(0)));

        for (int i = 1; i < n; i++) {
            result = toComb(result, toList(dict.get(digits.charAt(i))));
        }

        return result;
    }

    private List<String> toList(String s) {
        List<String> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            list.add(String.valueOf(ch));
        }
        return list;
    }

    private List<String> toComb(List<String> a, List<String> b) {
        List<String> res = new ArrayList<>();
        for (String s1 : a) {
            for (String s2 : b) {
                res.add(s1 + s2);
            }
        }
        return res;
    }
}


            
