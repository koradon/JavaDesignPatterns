package builder.sqlDb;

import builder.queryBuilder.Query;

/**
 * Created by mics on 4/14/16.
 */
public class SQLQuery implements Query {
    private String from;
    private String where;

    @Override
    public void execute() {
        System.out.println("Executing SQLQuery from: " + from + " where " + where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
