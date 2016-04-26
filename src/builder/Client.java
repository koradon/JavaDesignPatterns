package builder;

import builder.queryBuilder.Query;
import builder.queryBuilder.QueryBuildDirector;
import builder.queryBuilder.QueryBuilder;
import builder.mongoDb.MongoDbQueryBuilder;
import builder.sqlDb.SQLQueryBuilder;

/**
 * Created by mics on 4/14/16.
 */
public class Client {
    public static void main(String[] args) {
        QueryBuildDirector director = new QueryBuildDirector();
        String from = "client table";
        String where = "client name = ...";

        //start building using a sql query
        QueryBuilder builder = new SQLQueryBuilder();
        Query query = director.buildQuery(from, where, builder);
        query.execute();

        builder = new MongoDbQueryBuilder();
        query = director.buildQuery(from, where, builder);
        query.execute();

    }
}
