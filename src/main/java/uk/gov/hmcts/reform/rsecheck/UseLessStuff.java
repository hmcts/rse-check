package uk.gov.hmcts.reform.rsecheck;

public class UseLessStuff {

    static String aNAME = "For testing";

    public String addName(String prefix) {
        return prefix.concat(aNAME);
    }

    public Boolean checkName(String prefix) {
        return prefix.contains(prefix);
    }

    public String noName(String prefix) {
        return "NoName";
    }

}
