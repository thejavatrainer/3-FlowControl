package com.javatrainer.module3.flowcontrol;

public class CondTestLogistic {
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


    public Boolean isInternalItem(String a) {
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == '7') {
//                return true;
//            }
//        }
//        return false;
        return a.contains("7");
    }
    public Boolean Packages(String a) {
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == '3') {
//                return true;
//            }
//        }
//        return false;
        return a.contains("3");
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
        CondTestLogistic postOffice = new CondTestLogistic();

        for (int i = 0; i < postOffice.input.length; i++) {
            String postalItem = postOffice.input[i];
            postOffice.Intenal = 0;
            postOffice.Packages = 0;

            //"738"
            for (int j = 0; j < postalItem.length(); j++) {
                if (postOffice.isInternalItem(postalItem) || (postOffice.Intenal == 7)) {
                    postOffice.Intenal = 7;

                    switch (postalItem.charAt(j)-'0') { // or one from the specified types as parameter
                        case 1: {
                            postOffice.InternalChecks++;
                            break;
                        }
                        case 2: {
                            if (postOffice.Packages(postalItem)) {
                                postOffice.InternalHeavy++;
                            }
                            break;
                        }
                        case 3: {
                            postOffice.InternalPackages++;
                            postOffice.Packages++;
                            break;
                        }
                        case 4: {
                            if (postOffice.Packages(postalItem)){
                                postOffice.InternalMedium++;
                            }
                            break;
                        }
                        case 5: {
                            postOffice.InternalPostcards++;
                            break;
                        }
                        case 8: {
                            if (postOffice.Packages(postalItem)) {
                                postOffice.InternalLite++;
                            }
                            break;
                        }
                    }
                } else {

                    switch (Character.getNumericValue(postalItem.charAt(j))) { // or one from the specified types as parameter
                        case 1: {
                            postOffice.ExternalChecks++;
                            break;
                        }
                        case 2: {
                            if (postOffice.Packages(postalItem)) {
                                postOffice.ExternalHeavy++;
                            }
                            break;
                        }
                        case 3: {
                            postOffice.ExternalPackages++;
                            break;
                        }
                        case 4: {
                            if (postOffice.Packages(postalItem)) {
                                postOffice.ExternalMedium++;
                            }
                            break;
                        }
                        case 5: {
                            postOffice.ExternalPostcards++;
                            break;
                        }
                        case 8: {
                            if (postOffice.Packages(postalItem)) {
                                postOffice.ExternalLite++;
                            }
                            break;
                        }
                    }
                }
            }
        }

        result.append("Received: ").append(postOffice.input.length).append(" items from which:").append(LINE_END);

        result.append("          Internal item: ").append(postOffice.InternalChecks + postOffice.InternalPackages + postOffice.InternalPostcards).append(LINE_END);
        result.append("                 Packages: ").append(postOffice.InternalPackages).append(LINE_END);
        result.append("                         Heavy: ").append(postOffice.InternalHeavy).append(LINE_END);
        result.append("                         Medium: ").append(postOffice.InternalMedium).append(LINE_END);
        result.append("                         Lite: ").append(postOffice.InternalLite).append(LINE_END);
        result.append("                 Checks: ").append(postOffice.InternalChecks).append(LINE_END);
        result.append("                 Postcards: ").append(postOffice.InternalPostcards).append(LINE_END);
        result.append("          External item: ").append(postOffice.ExternalChecks + postOffice.ExternalPackages + postOffice.ExternalPostcards).append(LINE_END);
        result.append("                 Packages: ").append(postOffice.ExternalPackages).append(LINE_END);
        result.append("                         Heavy: ").append(postOffice.ExternalHeavy).append(LINE_END);
        result.append("                         Medium: ").append(postOffice.ExternalMedium).append(LINE_END);
        result.append("                         Lite: ").append(postOffice.ExternalLite).append(LINE_END);
        result.append("                 Checks: ").append(postOffice.ExternalChecks).append(LINE_END);
        result.append("                 Postcards: ").append(postOffice.ExternalPostcards).append(LINE_END);
        result.append("PackagesTotal ").append(postOffice.ExternalPackages + postOffice.InternalPackages).append(LINE_END);
        result.append("ChecksTotal ").append(postOffice.ExternalChecks + postOffice.InternalChecks).append(LINE_END);
        result.append("PostcardsTotal ").append(postOffice.ExternalPostcards + postOffice.InternalPostcards).append(LINE_END);
        System.out.println(result);
        System.out.println(Character.getNumericValue('Z'));

    }

}
