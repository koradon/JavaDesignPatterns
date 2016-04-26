package builder.mongoDb;

import builder.queryBuilder.Query;
import builder.queryBuilder.QueryBuilder;

/**
 * Created by mics on 4/14/16.
 */
public class MongoDbQueryBuilder implements QueryBuilder {
    private MongoDbQuery query = new MongoDbQuery();

    @Override
    public void from(String from) {
        query.setFrom(from);
    }

    @Override
    public void where(String where) {
        query.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return query;
    }
}
