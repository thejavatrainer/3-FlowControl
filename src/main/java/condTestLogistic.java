public class condTestLogistic {
    private String input[] = new String[]{"734", "985", "785", "734", "734", "785", "738", "983", "781", "781", "923", "785"};
    //    private Integer PackagesTotal = 0;
//    private Integer ChecksTotal = 0;
//    private Integer PostcardsTotal = 0;
    private static String LINE_END = "\r\n";
    private Integer firstIntenal = 0;
    private Integer InternalPackages = 0;
    private Integer InternalChecks = 0;
    private Integer InternalPostcards = 0;
    private Integer InternalHeavy = 0;
    private Integer InternalMedium = 0;
    private Integer InternalLite = 0;
    private Integer ExternalPackages = 0;
    private Integer ExternalChecks = 0;
    private Integer ExternalPostcards = 0;
    private Integer ExternalHeavy = 0;
    private Integer ExternalMedium = 0;
    private Integer ExternalLite = 0;
    private Integer Intenal = 0;
    private Integer Packages = 0;


    public Boolean internal(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '7') {
                return true;
            }
        }
        return false;
    }
    public Boolean Packages(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '3') {
                return true;
            }
        }
        return false;
    }

//    public Boolean external(String a) {
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == '9') {
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String args[]) {
        StringBuilder result = new StringBuilder();
        condTestLogistic first = new condTestLogistic();

        for (int i = 0; i < first.input.length; i++) {
            first.Intenal = 0;
            first.Packages = 0;

            for (int j = 0; j < first.input[i].length(); j++) {
                if (first.internal(first.input[i]) || (first.Intenal == 8)) {
                    first.Intenal = 8;

                    switch (Character.getNumericValue(first.input[i].charAt(j))) { // or one from the specified types as parameter
                        case 1: {
                            first.InternalChecks++;
                            break;
                        }
                        case 2: {
                            if (first.Packages(first.input[i])) {
                                first.InternalHeavy++;
                            }
                            break;
                        }
                        case 3: {
                            first.InternalPackages++;
                            first.Packages++;
                            break;
                        }
                        case 4: {
                            if (first.Packages(first.input[i])){
                                first.InternalMedium++;
                            }
                            break;
                        }
                        case 5: {
                            first.InternalPostcards++;
                            break;
                        }
                        case 8: {
                            if (first.Packages(first.input[i])) {
                                first.InternalLite++;
                            }
                            break;
                        }
                    }
                } else {

                    switch (Character.getNumericValue(first.input[i].charAt(j))) { // or one from the specified types as parameter
                        case 1: {
                            first.ExternalChecks++;
                            break;
                        }
                        case 2: {
                            if (first.Packages(first.input[i])) {
                                first.ExternalHeavy++;
                            }
                            break;
                        }
                        case 3: {
                            first.ExternalPackages++;
                            break;
                        }
                        case 4: {
                            if (first.Packages(first.input[i])) {
                                first.ExternalMedium++;
                            }
                            break;
                        }
                        case 5: {
                            first.ExternalPostcards++;
                            break;
                        }
                        case 8: {
                            if (first.Packages(first.input[i])) {
                                first.ExternalLite++;
                            }
                            break;
                        }
                    }
                }
            }
        }

        result.append("Received: ").append(first.input.length).append(" items from which:").append(LINE_END);

        result.append("          Internal item: ").append(first.InternalChecks + first.InternalPackages + first.InternalPostcards).append(LINE_END);
        result.append("                 Packages: ").append(first.InternalPackages).append(LINE_END);
        result.append("                         Heavy: ").append(first.InternalHeavy).append(LINE_END);
        result.append("                         Medium: ").append(first.InternalMedium).append(LINE_END);
        result.append("                         Lite: ").append(first.InternalLite).append(LINE_END);
        result.append("                 Checks: ").append(first.InternalChecks).append(LINE_END);
        result.append("                 Postcards: ").append(first.InternalPostcards).append(LINE_END);
        result.append("          External item: ").append(first.ExternalChecks + first.ExternalPackages + first.ExternalPostcards).append(LINE_END);
        result.append("                 Packages: ").append(first.ExternalPackages).append(LINE_END);
        result.append("                         Heavy: ").append(first.ExternalHeavy).append(LINE_END);
        result.append("                         Medium: ").append(first.ExternalMedium).append(LINE_END);
        result.append("                         Lite: ").append(first.ExternalLite).append(LINE_END);
        result.append("                 Checks: ").append(first.ExternalChecks).append(LINE_END);
        result.append("                 Postcards: ").append(first.ExternalPostcards).append(LINE_END);
        result.append("PackagesTotal ").append(first.ExternalPackages + first.InternalPackages).append(LINE_END);
        result.append("ChecksTotal ").append(first.ExternalChecks + first.InternalChecks).append(LINE_END);
        result.append("PostcardsTotal ").append(first.ExternalPostcards + first.InternalPostcards).append(LINE_END);
        System.out.println(result);


    }

}
