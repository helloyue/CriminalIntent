package database.CrimeDbSchema;

/**
 * Created by Administrator on 2018/1/17.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVE = "solve";
            public static final String SUSPECT = "suspect";
        }
    }




}
