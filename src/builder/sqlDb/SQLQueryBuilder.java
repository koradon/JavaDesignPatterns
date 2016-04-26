package builder.sqlDb;

import builder.queryBuilder.Query;
import builder.queryBuilder.QueryBuilder;

/**
 * Created by mics on 4/14/16.
 */
public class SQLQueryBuilder implements QueryBuilder {
    private SQLQuery sqlQuery = new SQLQuery();

    @Override
    public void from(String from) {
        sqlQuery.setFrom(from);
    }

    @Override
    public void where(String where) {
        sqlQuery.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return sqlQuery;
    }
}
