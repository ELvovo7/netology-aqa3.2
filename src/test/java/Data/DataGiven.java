package Data;

public class DataGiven {
    private static final String testUser = "vasya";
    private static final String secondTestUser = "petya";
    private static final String testUserPass = "qwerty123";
    private static final String dbUser = "app";
    private static final String dbPass = "pass";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/app";
    private static final String testSite = "http://localhost:9999";

    public DataGiven() {
    }

    public static String getTestUser() {
        return testUser;
    }

    public static String getSecondTestUser() {return secondTestUser;}

    public static String getDbUrl() {
        return dbUrl;
    }

    public static String getDbUser() {
        return dbUser;
    }

    public static String getDbPass() {
        return dbPass;
    }

    public static String getTestSite() {
        return testSite;
    }

    public static String getTestUserPass() {
        return testUserPass;
    }
}